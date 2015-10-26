package com.barracuda.guava.l_14_Math_Utilities.LongMath;

import java.math.RoundingMode;
import com.google.common.math.LongMath;

public class GuavaTester {

    public static void main(String args[]) {
        GuavaTester tester = new GuavaTester();
        tester.testLongMath();
    }

    private void testLongMath() {
        try {
            System.out.println(LongMath.checkedAdd(Long.MAX_VALUE, Long.MAX_VALUE));

        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println(LongMath.divide(100, 5, RoundingMode.UNNECESSARY));
        try {
         //exception will be thrown as 100 is not completely divisible by 3
            // thus rounding is required, and RoundingMode is set as UNNESSARY
            System.out.println(LongMath.divide(100, 3, RoundingMode.UNNECESSARY));

        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Log2(2): " + LongMath.log2(2, RoundingMode.HALF_EVEN));

        System.out.println("Log10(10): " + LongMath.log10(10, RoundingMode.HALF_EVEN));

        System.out.println("sqrt(100): " + LongMath.sqrt(LongMath.pow(10, 2), RoundingMode.HALF_EVEN));

        System.out.println("gcd(100,50): " + LongMath.gcd(100, 50));

        System.out.println("modulus(100,50): " + LongMath.mod(100, 50));

        System.out.println("factorial(5): " + LongMath.factorial(5));
    }
}
