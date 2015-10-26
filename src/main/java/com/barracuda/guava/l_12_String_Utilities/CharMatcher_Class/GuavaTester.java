package com.barracuda.guava.l_12_String_Utilities.CharMatcher_Class;

import com.google.common.base.CharMatcher;

/**
 *
 * @author RT
 */
public class GuavaTester {

    public static void main(String args[]) {
        GuavaTester tester = new GuavaTester();
        tester.testCharMatcher();
    }

    private void testCharMatcher() {
        System.out.println(CharMatcher.DIGIT.retainFrom("mahesh123")); // only the digits
        System.out.println(CharMatcher.WHITESPACE.trimAndCollapseFrom("     Mahesh     Parashar ", ' '));

        // trim whitespace at ends, and replace/collapse whitespace into single spaces
        System.out.println(CharMatcher.JAVA_DIGIT.replaceFrom("mahesh123", "*")); // star out all digits
        System.out.println(CharMatcher.JAVA_DIGIT.or(CharMatcher.JAVA_LOWER_CASE).retainFrom("mahesh123"));

        // eliminate all characters that aren't digits or lowercase
    }
}
