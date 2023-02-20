package me.yoursole.Numerical;


import me.yoursole.MathObject;

/**
 * Any mathematical object that does not have free variables
 */
public interface Numerical extends MathObject {
    Numerical add(Numerical other);

    Numerical multiply(Numerical other);
}
