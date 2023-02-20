package me.yoursole.Numerical.Matrix;

import lombok.Getter;
import me.yoursole.Numerical.AdditionStrategy;
import me.yoursole.Numerical.Numerical;


public record Matrix(@Getter Numerical[][] values) implements Numerical {

    @Override
    public Numerical add(Numerical other) {
        AdditionStrategy strategy = AdditionStrategy.fetch(this, other);
        return strategy.getOperation().operate(this, other);
    }

    @Override
    public Numerical multiply(Numerical other) {
        return null;
    }

    @Override
    public int[] getDimension() {
        return new int[]{this.values.length, this.values[0].length};
    }

    @Override
    public Numerical[] getGroup(int location, boolean v) {
        return new Numerical[0];
    }
}
