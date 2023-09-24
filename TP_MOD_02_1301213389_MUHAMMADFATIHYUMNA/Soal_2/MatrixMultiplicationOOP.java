package Soal_2;

import java.util.Scanner;

public class MatrixMultiplicationOOP {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta inputan nilai n
        System.out.print("Masukkan nilai n: ");
        // Membuat matriks pertama
        Matrix matrix1 = new Matrix();
        matrix1.inputMatrix(input, null);

        // Membuat matriks kedua
        Matrix matrix2 = new Matrix();
        matrix2.inputMatrix(input, null);

        // Melakukan perkalian matriks
        Matrix result = matrix1.multiply(matrix2);

        if (result != null) {
            // Mencetak matriks pertama
            System.out.println("Matriks Pertama:");
            matrix1.printMatrix();

            // Mencetak matriks kedua
            System.out.println("Matriks Kedua:");
            matrix2.printMatrix();

            // Mencetak hasil perkalian matriks
            System.out.println("Hasil Perkalian Matriks:");
            result.printMatrix();
        }
    }
}

// Muhammad Fatih Yumna Lajuwirdi Lirrahman 1301213389