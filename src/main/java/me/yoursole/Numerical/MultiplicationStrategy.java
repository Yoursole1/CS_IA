package me.yoursole.Numerical;

import lombok.AllArgsConstructor;
import lombok.Getter;
import me.yoursole.Common.NumericalTransformer;
import me.yoursole.Numerical.Matrix.Matrix;
import me.yoursole.Numerical.Matrix.NumericalBase;


@AllArgsConstructor
public enum MultiplicationStrategy {

    BASE_MATRIX(new NumericalTransformer<NumericalBase, Matrix>() {
        @Override
        public Numerical operate(NumericalBase base, Matrix matrix) {

        }

        @Override
        public Class<?> getA() {
            return NumericalBase.class;
        }

        @Override
        public Class<?> getB() {
            return Matrix.class;
        }
    }),

    MATRIX_BASE(new NumericalTransformer<Matrix, NumericalBase>() {
        @Override
        public Numerical operate(Matrix matrix, NumericalBase base) {

        }

        @Override
        public Class<?> getA() {
            return Matrix.class;
        }

        @Override
        public Class<?> getB() {
            return NumericalBase.class;
        }
    }),

    BASE_BASE(new NumericalTransformer<NumericalBase, NumericalBase>() {
        @Override
        public Numerical operate(NumericalBase baseA, NumericalBase baseB) {

        }

        @Override
        public Class<?> getA() {
            return NumericalBase.class;
        }

        @Override
        public Class<?> getB() {
            return NumericalBase.class;
        }
    })
    ;

    @Getter
    private final NumericalTransformer operation;


    public static MultiplicationStrategy fetch(Numerical left, Numerical right) {
        Class<? extends Numerical> leftType = left.getClass();
        Class<? extends Numerical> rightType = right.getClass();

        for (MultiplicationStrategy strategy : MultiplicationStrategy.values()) {
            NumericalTransformer<? extends Numerical, ? extends Numerical> operation = strategy.getOperation();
            if(leftType == operation.getA() && rightType == operation.getB()){
                return strategy;
            }
        }

        throw new IllegalStateException("No Addition Strategy for given set: " + left.getClass() + " + " + right.getClass());
    }

}
