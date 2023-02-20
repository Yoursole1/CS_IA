package me.yoursole.Numerical.Matrix;

import lombok.Getter;
import me.yoursole.Numerical.Numerical;

import java.util.Arrays;


public class Matrix implements Numerical {

    @Getter
    private final Numerical[][] values;

    public Matrix(Numerical[][] values){
        this.values = values;
    }

    public int[] getDimension() {
        return new int[]{this.values.length, this.values[0].length};
    }


    public Numerical[] getGroup(int location, boolean v) {
        int dim1 = this.getDimension()[0];
        int dim2 = this.getDimension()[1];
        Numerical[] group = new Numerical[v ? dim1 : dim2];

        for (int i = 0; i < group.length; i++) {
            int row = v ? i : location;
            int col = v ? location : i;
            group[i] = this.values[row][col];
        }

        return group;
    }

    public static Numerical productSum(Numerical[] a, Numerical[] b) {
        if (a.length != b.length) {
            throw new IllegalArgumentException("Mismatched vector dimensions");
        }

        Numerical sum = a[0].multiply(b[0]);

        for (int i = 1; i < a.length; i++) {
            sum = sum.add(a[i].multiply(b[i]));
        }

        return sum;
    }

    @Override
    public String toString() {
        return Arrays.deepToString(this.values);
    }
}
