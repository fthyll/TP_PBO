package Soal_1;

public class FibonacciCalculator {
    public int calculateFibonacci(int n) {
        if (n <= 1) {
            return 1; // Mulai deret dengan 1 dan 1
        } else {
            return calculateFibonacci(n - 1) + calculateFibonacci(n - 2);
        }
    }
}

// Muhammad Fatih Yumna Lajuwirdi Lirrahman 1301213389