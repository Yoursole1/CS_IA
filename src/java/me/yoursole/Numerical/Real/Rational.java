package me.yoursole.Numerical.Real;


import lombok.Getter;
import me.yoursole.Numerical.Complex.AbstractComplex;


@Getter
public class Rational extends AbstractComplex {
    int numerator;
    int denominator;


    public Rational(int numerator, int denominator){
        super(new double[]{(double) numerator/denominator});

        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Rational add(double value){
        return null;
    }
}
