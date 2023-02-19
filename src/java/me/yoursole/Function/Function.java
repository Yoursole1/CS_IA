package me.yoursole.Function;

import me.yoursole.MathObject;
import me.yoursole.Numerical.Numerical;

/**
 * A (1* -> 1) mathematical function
 */

@FunctionalInterface
public interface Function extends MathObject {

    /**
     * @param x numerical value to evaluate
     * @return a transformed value
     */
    Numerical f(Numerical... x);
}
