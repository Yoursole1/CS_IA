package me.yoursole.Numerical;

import lombok.AllArgsConstructor;
import lombok.Getter;
import me.yoursole.Common.NumericalTransformer;
import me.yoursole.Numerical.Matrix.Matrix;
import me.yoursole.Numerical.Matrix.NumericalBase;


@AllArgsConstructor
public enum AdditionStrategy {
    BASE_MATRIX(new NumericalTransformer<NumericalBase, Matrix>() {
        @Override
        public Numerical operate(NumericalBase numerical, Matrix numerical2) {
            return null;
        }

        @Override
        public Class<?> getA() {
            return NumericalBase.class;
        }

        @Override
        public Class<?> getB() {
            return Matrix.class;
        }
    })
;

    @Getter
    private final NumericalTransformer<? extends Numerical, ? extends Numerical> operation;


    public static AdditionStrategy fetch(Numerical left, Numerical right) {
        Class<? extends Numerical> leftType = left.getClass();
        Class<? extends Numerical> rightType = right.getClass();

        for (AdditionStrategy strategy : AdditionStrategy.values()) {
            NumericalTransformer<? extends Numerical, ? extends Numerical> operation = strategy.getOperation();
            if(leftType == operation.getA() && rightType == operation.getB()){
                return strategy;
            }
        }

        return null;
    }

}
