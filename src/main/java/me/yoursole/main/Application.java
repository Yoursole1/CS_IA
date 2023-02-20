package me.yoursole.main;

import me.yoursole.Numerical.Matrix.Matrix;
import me.yoursole.Numerical.Matrix.NumericalBase;
import me.yoursole.Numerical.Numerical;

import java.util.Arrays;

public class Application {

    public static void main(String[] args){

        Matrix m = new Matrix(new Numerical[][]{
                {new NumericalBase(1), new NumericalBase(3)},
                {new NumericalBase(4), new NumericalBase(5)}
        });

        Matrix a = new Matrix(new Numerical[][]{
                {new NumericalBase(1), new NumericalBase(3)},
                {new NumericalBase(4), new NumericalBase(5)},
        });

        System.out.println(Arrays.deepToString(((Matrix) m.add(a)).getValues()));
    }
}
