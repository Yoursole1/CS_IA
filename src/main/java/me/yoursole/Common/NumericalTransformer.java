package me.yoursole.Common;

import me.yoursole.Numerical.Numerical;


public interface NumericalTransformer<A extends Numerical, B extends Numerical> {


    Numerical operate(A a, B b);

    Class<?> getA();
    Class<?> getB();
}
