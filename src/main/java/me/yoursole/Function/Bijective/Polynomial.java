package me.yoursole.Function.Bijective;

import me.yoursole.Numerical.Complex.NumericalBase;
import me.yoursole.Numerical.Numerical;

import java.util.Arrays;

public class Polynomial implements Bijective{

    /**
     * Coefficients of polynomial in descending order
     * (index 0 is the highest power, the last index is power 0)
     */
    private final Numerical[] coefficients;

    public Polynomial(Numerical[] coefficients){
        this.coefficients = coefficients;
    }

    @Override
    public Bijective inverse() {
        return null;
    }

    /**
     * @throws IllegalArgumentException if the input is not a single numerical
     * @param x numerical value to evaluate
     * @return f(x)
     */
    @Override
    public Numerical f(Numerical... x) {
        if(x.length != 1){
            throw new IllegalArgumentException("Multivariable input on 1 -> 1 function");
        }

        Numerical output = new NumericalBase(0, 0);

        for (int i = 0; i < this.coefficients.length; i++) {
            Numerical freeTerm = x[i].pow(this.coefficients.length - i - 1);
            Numerical coefficient = this.coefficients[i];

        }

        return output;
    }
}
