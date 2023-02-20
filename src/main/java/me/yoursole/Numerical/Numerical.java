package me.yoursole.Numerical;


import me.yoursole.MathObject;

/**
 * Any mathematical object that does not have free variables
 */
public interface Numerical extends MathObject {
    default Numerical add(Numerical other){
        AdditionStrategy strategy = AdditionStrategy.fetch(this, other);
        return strategy.getOperation().operate(this, other);
    }

    default Numerical multiply(Numerical other){
        MultiplicationStrategy strategy = MultiplicationStrategy.fetch(this, other);
        return strategy.getOperation().operate(this, other);
    }
}
