package day71;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        //latihan membuat pola segitiga siku siku
        System.out.print("Masukkan tinggi segitiga : ");
        int tinggi = p.nextInt();
        
        for (int i = 0; i <= tinggi; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    
}
