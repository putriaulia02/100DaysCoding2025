package day98;

import java.util.Scanner;

public class Day98 {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);

        System.out.print("Masukkan jumlah bilangan: ");
        int jumlah = p.nextInt();

        int[] fib = new int[jumlah];

        fib[0] = 0;
        fib[1] = 1;

        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        System.out.println("Bilangan Fibonacci:");
        for (int i = 0; i < n; i++) {
            System.out.print(fib[i] + " ");
        }
    }
}
