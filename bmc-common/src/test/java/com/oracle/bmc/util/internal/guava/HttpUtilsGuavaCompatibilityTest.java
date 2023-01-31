/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.util.internal.guava;

/*
 * Copyright (C) 2009 The Guava Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import javax.annotation.CheckForNull;

import static com.oracle.bmc.util.internal.guava.EscaperAsserts.assertEscaping;
import static com.oracle.bmc.util.internal.guava.EscaperAsserts.assertUnescaped;
import static com.oracle.bmc.util.internal.guava.EscaperAsserts.assertUnicodeEscaping;

import com.google.common /*Guava will be removed soon*/.escape.UnicodeEscaper;
import com.google.common /*Guava will be removed soon*/.net.UrlEscapers;
import com.oracle.bmc.util.internal.HttpUtils;
import junit.framework.TestCase;
import org.junit.Test;

/**
 * Test to make sure {@link HttpUtils#urlPathSegmentEscape(String)} is compatible to Guava's urlPathSegmentEscaper().
 *
 * Adapted from tests for the {@link UrlEscapers} class. This will be removed once we have migrated away from Guava.
 *
 * @author David Beaumont
 */
public class HttpUtilsGuavaCompatibilityTest extends TestCase {
    /**
     * Helper to assert common expected behaviour of uri escapers. You should call
     * assertBasicUrlEscaper() unless the escaper explicitly does not escape '%'.
     */
    static void assertBasicUrlEscaperExceptPercent(UnicodeEscaper e) {
        // URL escapers should throw null pointer exceptions for null input
        try {
            e.escape((String) null);
            fail("Escaping null string should throw exception");
        } catch (NullPointerException x) {
            // pass
        }

        // All URL escapers should leave 0-9, A-Z, a-z unescaped
        assertUnescaped(e, 'a');
        assertUnescaped(e, 'z');
        assertUnescaped(e, 'A');
        assertUnescaped(e, 'Z');
        assertUnescaped(e, '0');
        assertUnescaped(e, '9');

        // Unreserved characters used in java.net.URLEncoder
        assertUnescaped(e, '-');
        assertUnescaped(e, '_');
        assertUnescaped(e, '.');
        assertUnescaped(e, '*');

        assertEscaping(e, "%00", '\u0000'); // nul
        assertEscaping(e, "%7F", '\u007f'); // del
        assertEscaping(e, "%C2%80", '\u0080'); // xx-00010,x-000000
        assertEscaping(e, "%DF%BF", '\u07ff'); // xx-11111,x-111111
        assertEscaping(e, "%E0%A0%80", '\u0800'); // xxx-0000,x-100000,x-00,0000
        assertEscaping(e, "%EF%BF%BF", '\uffff'); // xxx-1111,x-111111,x-11,1111
        assertUnicodeEscaping(e, "%F0%90%80%80", '\uD800', '\uDC00');
        assertUnicodeEscaping(e, "%F4%8F%BF%BF", '\uDBFF', '\uDFFF');

        assertEquals("", e.escape(""));
        assertEquals("safestring", e.escape("safestring"));
        assertEquals("embedded%00null", e.escape("embedded\0null"));
        assertEquals("max%EF%BF%BFchar", e.escape("max\uffffchar"));
    }

    // Helper to assert common expected behaviour of uri escapers.
    static void assertBasicUrlEscaper(UnicodeEscaper e) {
        assertBasicUrlEscaperExceptPercent(e);
        // The escape character must always be escaped
        assertEscaping(e, "%25", '%');
    }

    @Test
    public void testHttpUtilsEscaper() {
        UnicodeEscaper e = new HttpUtilsUnicodeEscaper();
        assertPathEscaper(e);
        assertUnescaped(e, '+');
    }

    static void assertPathEscaper(UnicodeEscaper e) {
        assertBasicUrlEscaper(e);

        assertUnescaped(e, '!');
        assertUnescaped(e, '\'');
        assertUnescaped(e, '(');
        assertUnescaped(e, ')');
        assertUnescaped(e, '~');
        assertUnescaped(e, ':');
        assertUnescaped(e, '@');

        // Don't use plus for spaces
        assertEscaping(e, "%20", ' ');

        assertEquals("safe%20with%20spaces", e.escape("safe with spaces"));
        assertEquals("foo@bar.com", e.escape("foo@bar.com"));
    }

    private static class HttpUtilsUnicodeEscaper extends UnicodeEscaper {
        @CheckForNull
        @Override
        protected char[] escape(int cp) {
            String s = codepointToString(cp);
            String escaped = HttpUtils.urlPathSegmentEscape(s);
            if (s.equals(escaped)) {
                return null;
            }
            return escaped.toCharArray();
        }

        @Override
        public String escape(String string) {
            return HttpUtils.urlPathSegmentEscape(string);
        }
    }

    public static String codepointToString(int cp) {
        StringBuilder sb = new StringBuilder();
        if (Character.isBmpCodePoint(cp)) {
            sb.append((char) cp);
        } else if (Character.isValidCodePoint(cp)) {
            sb.append(Character.highSurrogate(cp));
            sb.append(Character.lowSurrogate(cp));
        } else {
            sb.append('?');
        }
        return sb.toString();
    }
}