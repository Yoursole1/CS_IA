package me.yoursole.Numerical.Real;


import lombok.Getter;

import me.yoursole.Numerical.Complex.ComplexImpl;


@Getter
public class Rational extends ComplexImpl {
    int numerator;
    int denominator;


    public Rational(int numerator, int denominator){
        super(new double[]{(double) numerator/denominator});

        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Rational(double value){
        super(new double[]{value});

        //todo implement
    }

}
