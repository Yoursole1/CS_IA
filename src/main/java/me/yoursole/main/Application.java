package me.yoursole.main;


import me.yoursole.MathObject;
import me.yoursole.function.non_bijective.row_echelon.RowAdd;
import me.yoursole.function.non_bijective.row_echelon.Scalar;
import me.yoursole.numerical.Numerical;
import me.yoursole.numerical.complex.NumericalBase;
import me.yoursole.numerical.matrix.Matrix;


public class Application {

    public static void main(String[] args){

        Matrix a = new Matrix(new Numerical[][]{
                new Numerical[]{new NumericalBase(1), new NumericalBase(2)}
        });

        Matrix b = new Matrix(new Numerical[][]{
                new Numerical[]{new NumericalBase(2), new NumericalBase(4)}
        });

        RowAdd adder = new RowAdd();
        Scalar s = new Scalar(new NumericalBase(5));

        System.out.println(s.f(a));

    }


    /**
     * This is just a helper function
     * @param o
     */
    public static void print(MathObject o){
        System.out.println(o);
    }
}
