public class Main1 {
    private int[][] matrix;

    private int size;

    public Main1(int size) {
        this.size = size;
        this.matrix = new int[size][size];
    }

    // Создание единичной (диагональной) матрицы
    public static Main1 createIdentityMatrix(int size) {
        Main1 matrix = new Main1(size);
        for (int i = 0; i < size; i++) {
            matrix.matrix[i][i] = 1;
        }
        return matrix;
    }

    // Создание нулевой матрицы
    public static Main1 createZeroMatrix(int size) {
        return new Main1(size);
    }

    // Сложение матриц
    public Main1 add(Main1 other) {
        if (this.size != other.size) {
            throw new IllegalArgumentException("Матрицы должны быть одного размера");
        }

        Main1 result = new Main1(size);
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                result.matrix[i][j] = this.matrix[i][j] + other.matrix[i][j];
            }
        }
        return result;
    }

    // Умножение матриц
    public Main1 multiply(Main1 other) {
        if (this.size != other.size) {
            throw new IllegalArgumentException("Матрицы должны быть одного размера");
        }

        Main1 result = new Main1(size);
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int sum = 0;
                for (int k = 0; k < size; k++) {
                    sum += this.matrix[i][k] * other.matrix[k][j];
                }
                result.matrix[i][j] = sum;
            }
        }
        return result;
    }

    // Умножение матрицы на скаляр
    public Main1 multiplyByScalar(int scalar) {
        Main1 result = new Main1(size);
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                result.matrix[i][j] = this.matrix[i][j] * scalar;
            }
        }
        return result;
    }

    // Определение детерминанта матрицы
    public int determinant() {
        if (size == 1) {
            return matrix[0][0];
        }

        int det = 0;
        int sign = 1;
        for (int i = 0; i < size; i++) {
            int minorDet = createMinorMatrix(0, i).determinant();
            det += sign * matrix[0][i] * minorDet;
            sign *= -1;
        }
        return det;
    }

    // Создание минорной матрицы
    private Main1 createMinorMatrix(int row, int col) {
        Main1 minor = new Main1(size - 1);
        int minorRow = 0;
        int minorCol;
        for (int i = 0; i < size; i++) {
            if (i == row) {
                continue;
            }
            minorCol = 0;
            for (int j = 0; j < size; j++) {
                if (j == col) {
                    continue;
                }
                minor.matrix[minorRow][minorCol] = matrix[i][j];
                minorCol++;
            }
            minorRow++;
        }
        return minor;
    }

    // Вывод матрицы на консоль
    public void printMatrix() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

import java.util.Arrays;
import java.util.Comparator;

public class Main1 {
    private String[] array;

    public Main1(String[] array) {
        this.array = array;
    }
    // Вывод содержимого массива в строку через пробел
    public String arrayToString() {
        return String.join(" ", array);
    }

    // Сортировка массива в обратном порядке (без учета регистра) от z до a
    public void sortReverseOrder() {
        Arrays.sort(array, String.CASE_INSENSITIVE_ORDER.reversed());
    }

    // Сортировка массива по количеству слов в строке
    public void sortByWordCount() {
        Arrays.sort(array, Comparator.comparingInt(this::countWords));
    }

    // Метод для подсчета количества слов в строке
    private int countWords(String str) {
        return str.trim().split("\\s+").length;
    }
}
