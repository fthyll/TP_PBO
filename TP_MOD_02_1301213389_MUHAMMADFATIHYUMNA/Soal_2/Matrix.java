package Soal_2;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            // Meminta inputan nilai n
            System.out.print("Masukkan nilai n: ");
            int n = input.nextInt();

            // Membuat matriks pertama
            int[][] matrix1 = new int[n][n];
            System.out.println("Isi matriks pertama:");

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    matrix1[i][j] = input.nextInt();
                }
            }

            // Membuat matriks kedua
            int[][] matrix2 = new int[n][n];
            System.out.println("Isi matriks kedua:");

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    matrix2[i][j] = input.nextInt();
                }
            }

            // Melakukan perkalian matriks
            int[][] result = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    result[i][j] = 0;
                    for (int k = 0; k < n; k++) {
                        result[i][j] += matrix1[i][k] * matrix2[k][j];
                    }
                }
            }

            // Mencetak hasil perkalian matriks
            System.out.println("Hasil Perkalian Matriks:");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(result[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

    public Matrix multiply(Matrix matrix2) {
        return null;
    }

    public void inputMatrix(Scanner input, String string) {
    }

    public void printMatrix() {
    }
}

// Muhammad Fatih Yumna Lajuwirdi Lirrahman 1301213389