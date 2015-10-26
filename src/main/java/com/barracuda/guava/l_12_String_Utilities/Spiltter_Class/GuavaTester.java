package com.barracuda.guava.l_12_String_Utilities.Spiltter_Class;

import com.google.common.base.Splitter;

/**
 *
 * @author RT
 */
public class GuavaTester {

    public static void main(String args[]) {
        GuavaTester tester = new GuavaTester();
        tester.testSplitter();
    }

    private void testSplitter() {
        System.out.println(Splitter.on(',')
                .trimResults()
                .omitEmptyStrings()
                .split("the ,quick, ,brown, fox, jumps, over, the, lazy, little dog."));
    }
}
