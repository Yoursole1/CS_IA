package me.yoursole.Numerical.Complex;


public abstract class AbstractComplex implements Complex{

    /**
     * In theory this could be non-real but implementation gets too complex
     * while there is little value in doing so
     *
     * Element 0 of this array is the "real" part of the complex number (not that it really matters internally)
     * This is also the only spot in the entire library where "double" should be used.  It introduces floating
     * point errors and causes issues, and should be avoided
     */
    private double[] coefficients;

    protected AbstractComplex(double[] coefficients){
        this.coefficients = coefficients;
    }
}
