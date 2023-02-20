package me.yoursole.Numerical.Matrix.Square;

import me.yoursole.Numerical.Matrix.Matrix;
import me.yoursole.Numerical.Numerical;

public class SquareMatrix extends Matrix {

    public SquareMatrix(Numerical[][] values) {
        super(SquareMatrix.verifySquare(values));
    }

    private static Numerical[][] verifySquare(Numerical[][] values){
        if (values.length != values[0].length){
            throw new IllegalArgumentException("Matrix must be square");
        }
        return values;
    }
}
