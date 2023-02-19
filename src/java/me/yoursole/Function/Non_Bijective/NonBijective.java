package me.yoursole.Function.Non_Bijective;

import me.yoursole.Function.Function;

public interface NonBijective extends Function {
    /**
     * @return inverse applicable on restricted domains if one exists
     */
    NonBijective pseudoInverse();
}
