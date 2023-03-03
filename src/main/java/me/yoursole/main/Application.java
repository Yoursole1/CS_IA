package me.yoursole.main;

import me.yoursole.numerical.complex.NumericalBase;
import me.yoursole.numerical.matrix.Matrix;
import me.yoursole.numerical.Numerical;

public class Application {

    public static void main(String[] args){

        Matrix test = new Matrix(new Numerical[][]{
                {new NumericalBase(1, 0), new NumericalBase(2, 0)},
                {new NumericalBase(0, 1), new NumericalBase(0, 2)}
        });

        Matrix test2 = new Matrix(new Numerical[][]{
                {new NumericalBase(-1, 0), new NumericalBase(-2, 0)},
                {new NumericalBase(0, -1), new NumericalBase(0, -2)}
        });

        System.out.println(test.add(test2.multiply(new NumericalBase(-1, 0))));


//        NumericalBase a = new NumericalBase(4, 5);
//        NumericalBase b = new NumericalBase(2, -3);
//        System.out.println(((NumericalBase)(a.multiply(b))));
//
//        Matrix rotator = a.getMatrixForm();
////        System.out.println(rotator);
//        Matrix arg = new Matrix(new Numerical[][]{
//                {new NumericalBase(2, 0)},
//                {new NumericalBase(-3, 0)}
//        });
//
//        System.out.println(rotator.multiply(arg));

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
