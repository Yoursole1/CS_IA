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
            int[] dimension = matrix.getDimension();
            Numerical[][] newMatrix = new Numerical[dimension[0]][dimension[1]];

            for (int i = 0; i < dimension[0]; i++) {
                for (int j = 0; j < dimension[1]; j++) {
                    newMatrix[i][j] = matrix.getValues()[i][j].multiply(base);
                }
            }

            return new Matrix(newMatrix);
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
            return MultiplicationStrategy.BASE_MATRIX.getOperation().operate(base, matrix);
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
            return new NumericalBase(baseA.getValue() * baseB.getValue());
        }

        @Override
        public Class<?> getA() {
            return NumericalBase.class;
        }

        @Override
        public Class<?> getB() {
            return NumericalBase.class;
        }
    }),

    MATRIX_MATRIX(new NumericalTransformer<Matrix, Matrix>() {
        @Override
        public Numerical operate(Matrix matrixA, Matrix matrixB) {
            if (matrixA.getDimension()[1] != matrixB.getDimension()[0]) {
                throw new IllegalArgumentException("Mismatched matrix dimensions");
            }

            Numerical[][] newMatrix = new Numerical[matrixA.getDimension()[0]][matrixB.getDimension()[1]];

            for (int i = 0; i < matrixA.getDimension()[0]; i++) {
                for (int j = 0; j < matrixB.getDimension()[1]; j++) {
                    Numerical[] a = matrixA.getGroup(i, false);
                    Numerical[] b = matrixB.getGroup(j, true);

                    Numerical value = Matrix.productSum(a, b);
                    newMatrix[i][j] = value;
                }
            }

            return new Matrix(newMatrix);
        }

        @Override
        public Class<?> getA() {
            return Matrix.class;
        }

        @Override
        public Class<?> getB() {
            return Matrix.class;
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

        throw new IllegalStateException("No Multiplication Strategy for given set: " + left.getClass() + " + " + right.getClass());
    }

}
