package day59;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        System.out.print("Masukkan nilai N : ");
        int N = p.nextInt();
        
        for (int i = 1; i <= N; i+=2) {
            System.out.println("Angka ganjil : " +i);
        }
        
        System.out.println();
        for (int i = 2; i <= N; i+=2) {
            System.out.println("Angka genap : " +i);
        }
    }
    
}
