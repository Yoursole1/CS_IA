package me.yoursole.Numerical.Matrix;

import lombok.Getter;
import me.yoursole.Numerical.Numerical;


/**
 * Since matrices can contain other matrices, this is the
 * "base case" in that recursion.  NumericalBase acts as a
 * double but from the perspective of the algorithms operating
 * on the matrix it is within this is simply another term within
 * the nested matrix, hence the reason for it containing
 * getDimension (even though this always returns [1,1])
 */

public record NumericalBase(@Getter double value) implements Numerical {

    @Override
    public Numerical add(Numerical other) {
        return null;
    }

    @Override
    public Numerical multiply(Numerical other) {
        return null;
    }

    @Override
    public int[] getDimension() {
        return new int[]{1, 1};
    }

    @Override
    public Numerical[] getGroup(int location, boolean v) {
        if (location == 0) {
            return new Numerical[]{this};
        }
        throw new IndexOutOfBoundsException(location + " out of bounds for length 1");
    }
}
