package day99;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan N : ");
        int N = sc.nextInt();

        System.out.println("Bilangan prima dari 1 sampai " + N + " : ");

        for (int i = 2; i <= N; i++) {
            boolean prima = true;

            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    prima = false;
                    break;
                }
            }

            if (prima) {
                System.out.print(i + " ");
            }
        }
    }
}
