public class Task_01 {

    public static void main(String[] args) {
        Main1 matrix1 = Main1.createIdentityMatrix(3);
        Main1 matrix2 = Main1.createZeroMatrix(3);

        matrix1.printMatrix();
        System.out.println();

        matrix2.printMatrix();
        System.out.println();

        Main1 sumMatrix = matrix1.add(matrix2);
        sumMatrix.printMatrix();
        System.out.println();

        Main1 productMatrix = matrix1.multiply(matrix2);
        productMatrix.printMatrix();
        System.out.println();

        Main1 scalarMatrix = matrix1.multiplyByScalar(2);
        scalarMatrix.printMatrix();
        System.out.println();

        int determinant = matrix1.determinant();
        System.out.println("Determinant: " + determinant);
    }
}
