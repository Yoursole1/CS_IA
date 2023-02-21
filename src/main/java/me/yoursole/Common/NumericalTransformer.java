package me.yoursole.Common;

import me.yoursole.Numerical.Numerical;


/**
 * @param <A> left argument
 * @param <B> right argument
 */
public interface NumericalTransformer<A extends Numerical, B extends Numerical> {

    /**
     * @param a left argument
     * @param b right argument
     * @return the solution to the transformation using A and B
     */
    Numerical operate(A a, B b);

    Class<?> getA();
    Class<?> getB();
}
