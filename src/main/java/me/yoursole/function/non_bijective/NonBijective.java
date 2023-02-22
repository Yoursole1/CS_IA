package me.yoursole.function.non_bijective;

import me.yoursole.function.Function;

public interface NonBijective extends Function {
    /**
     * @return inverse applicable on restricted domains if one exists
     */
    NonBijective pseudoInverse();
}
