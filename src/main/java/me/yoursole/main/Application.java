package me.yoursole.main;

import me.yoursole.Numerical.AdditionStrategy;
import me.yoursole.Numerical.Matrix.Matrix;
import me.yoursole.Numerical.Matrix.NumericalBase;
import me.yoursole.Numerical.Numerical;

public class Application {

    public static void main(String[] args){

        System.out.println(AdditionStrategy.fetch(new NumericalBase(1), new Matrix(new Numerical[][]{})));
    }
}
