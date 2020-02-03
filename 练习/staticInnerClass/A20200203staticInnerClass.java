//package staticInnerClassc;
//import interfaces.*;

import java.util.*;

/**
 * This program demonstrates the use of static inner classes.
 *
 * @author chengcai
 * @version 1.0 2020.02.03
 */

public class A20200203staticInnerClass {
    public static void main(String[] args) {
        double[] d = new double[20];
        for (int i = 0; i < d.length; i++) {
            d[i] = 100 * Math.random();
        }
        ArrayAlg.Pair p = ArrayAlg.minmax(d);
        System.out.println("min = " + p.getFirst());
        System.out.println("max = " + p.getSecond());
    }
}

class ArrayAlg {
    /**
     * A pair of floating-point numbers
     */
    public static class Pair {
        private double first;
        private double second;

        /**
         * Constructs a pair form two floating-point numbers
         *
         * @param f the first number
         * @param s the second number
         */
        public Pair(double aFirst, double aSecond) {
            first = aFirst;
            second = aSecond;
        }

        /**
         * Returns the first number of the pari
         *
         * @return the first number
         */
        public double getFirst() {
            return first;
        }

        /**
         * Returns the second nember of the pair
         *
         * @return the second number
         */
        public double getSecond() {
            return second;
        }
    }
    /**
     * Computes both the minimum and the maximum of an array
     *
     * @param values an array of floating-point numbers
     * @return a pair whose first element is the minimum and whose second element
     * is the maximum
     * 静态内部类
     */
    public static Pair minmax(double[] values) {
        double min = Double.POSITIVE_INFINITY;
        double max = Double.NEGATIVE_INFINITY;
        for (double v : values) {
            if (min > v) {
                min = v;
            }
            if (max < v) {
                max = v;
            }
        }
        return new Pair(min, max);
    }
}