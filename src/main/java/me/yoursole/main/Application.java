package me.yoursole.main;

import me.yoursole.Numerical.Matrix.Matrix;
import me.yoursole.Numerical.Complex.NumericalBase;
import me.yoursole.Numerical.Numerical;

import java.util.Arrays;

public class Application {

    public static void main(String[] args){

        NumericalBase a = new NumericalBase(1, 1);
        NumericalBase b = new NumericalBase(1, -1);
        System.out.println(a.multiply(b));

//        Matrix m = new Matrix(new Numerical[][]{
//                {new NumericalBase(1, 0), new NumericalBase(3, 0)},
//                {new NumericalBase(4, 0), new NumericalBase(5, 0)}
//        });
//
//        Matrix a = new Matrix(new Numerical[][]{
//                {new NumericalBase(1, 0), new NumericalBase(3, 0)},
//                {new NumericalBase(4, 0), new NumericalBase(5, 0)},
//        });
//
//        System.out.println(Arrays.deepToString(((Matrix) m.multiply(a)).getValues()));
    }
}
