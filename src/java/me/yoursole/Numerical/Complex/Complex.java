package me.yoursole.Numerical.Complex;


import me.yoursole.Numerical.Numerical;

public interface Complex extends Numerical {

    Complex multiply(Complex other);

    Complex add(Complex other);

    double[] getCoefficients();

}
