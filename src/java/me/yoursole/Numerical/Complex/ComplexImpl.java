package me.yoursole.Numerical.Complex;


import lombok.Getter;

public class ComplexImpl implements Complex {

    /**
     * In theory this could be non-real but implementation gets too complex
     * while there is little value in doing so
     *
     * Element 0 of this array is the "real" part of the complex number (not that it really matters internally)
     * This is also the only spot in the entire library where "double" should be used.  It introduces floating
     * point errors and causes issues, and should be avoided
     */
    @Getter
    private final double[] coefficients;

    protected ComplexImpl(double[] coefficients){
        this.coefficients = coefficients;
    }

    @Override
    public Complex multiply(Complex other) {

        double[] product = new double[];
    }

    @Override
    public Complex add(Complex other) {
        if(this.getCoefficients().length != other.getCoefficients().length){
            throw new IllegalArgumentException("Complex number dimensions must match");
        }

        double[] sum = new double[this.getCoefficients().length];

        for (int i = 0; i < this.getCoefficients().length; i++) {
            sum[i] = this.coefficients[i] + other.getCoefficients()[i];
        }

        return new ComplexImpl(sum);
    }
}
