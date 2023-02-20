package me.yoursole.Numerical.Complex;

import lombok.Getter;
import me.yoursole.Numerical.Numerical;


/**
 * Since matrices can contain other matrices, this is the
 * "base case" in that recursion.  NumericalBase acts as a
 * double but from the perspective of the algorithms operating
 * on the matrix it is within this is simply another term within
 * the nested matrix
 */

public record NumericalBase(@Getter double real, @Getter double imaginary) implements Numerical{

    public NumericalBase complexConjugate(){
        return new NumericalBase(this.real, -this.imaginary);
    }


}
