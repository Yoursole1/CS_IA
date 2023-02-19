package me.yoursole.Numerical.Matrix;

import lombok.Getter;
import me.yoursole.Numerical.Numerical;


public record Matrix(@Getter Numerical[][] values) implements Numerical {

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
        return new int[0];
    }

    @Override
    public Numerical[] getGroup(int location, boolean v) {
        return new Numerical[0];
    }
}
