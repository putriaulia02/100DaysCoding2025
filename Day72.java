package day72;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        //latihan membuat pola segitiga siku siku terbalik
        System.out.print("Masukkan tinggi segitiga : ");
        int tinggi = p.nextInt();
        
        for (int i = tinggi; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ∆ ");
            }
            System.out.println();
        } 
    }
    
}
