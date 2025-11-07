package day61;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        
        System.out.print("Masukkan nilai N : ");
        int N = p.nextInt();
        System.out.print("Masukkan nilai kelipatan M : ");
        int M = p.nextInt();

        for (int i = 1; i <= N; i++) {
            int kelipatan = M * i;
            if (kelipatan <= N) {
                System.out.println(kelipatan);
            }
        }
    }
}
