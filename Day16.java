package day16;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
       //operator aritmatika perkalian(*) dan pembagian (/)
        Scanner s = new Scanner(System.in);
        System.out.print("masukkan a :");
        int a = s.nextInt();
        System.out.print("masukkan b :");
        int b = s.nextInt();
        
        //mencetak
        System.out.println("hasil a * b :" + (a * b));
        System.out.println("hasil a / b :" + (a / b));
    }
    
}
