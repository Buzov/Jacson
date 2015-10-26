package com.barracuda.guava.l_14_Math_Utilities.BigIntegerMath;

import java.math.BigInteger;
import java.math.RoundingMode;

import com.google.common.math.BigIntegerMath;

public class GuavaTester {

    public static void main(String args[]) {
        GuavaTester tester = new GuavaTester();
        tester.testBigIntegerMath();
    }

    private void testBigIntegerMath() {

        System.out.println(BigIntegerMath.divide(BigInteger.TEN, new BigInteger("2"), RoundingMode.UNNECESSARY));

        try {
         //exception will be thrown as 100 is not completely divisible by 3 
            // thus rounding is required, and RoundingMode is set as UNNESSARY
            System.out.println(BigIntegerMath.divide(BigInteger.TEN, new BigInteger("3"), RoundingMode.UNNECESSARY));

        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Log2(2): " + BigIntegerMath.log2(new BigInteger("2"), RoundingMode.HALF_EVEN));

        System.out.println("Log10(10): " + BigIntegerMath.log10(BigInteger.TEN, RoundingMode.HALF_EVEN));

        System.out.println("sqrt(100): " + BigIntegerMath.sqrt(BigInteger.TEN.multiply(BigInteger.TEN), RoundingMode.HALF_EVEN));

        System.out.println("factorial(5): " + BigIntegerMath.factorial(5));
    }
}
