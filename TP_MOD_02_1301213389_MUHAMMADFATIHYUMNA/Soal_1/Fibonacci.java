package Soal_1;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan n: ");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("Input harus lebih dari 0.");
        } else {
            FibonacciCalculator calculator = new FibonacciCalculator();
            System.out.print("Deret Fibonacci sampai suku ke-" + n + ": ");
            for (int i = 0; i < n; i++) {
                System.out.print(calculator.calculateFibonacci(i) + " ");
            }
        }

        input.close();
    }
}
// Muhammad Fatih Yumna Lajuwirdi Lirrahman 1301213389