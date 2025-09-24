package day17;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        //operator aritmatika modulus/sisa bagi(%)
        System.out.print("masukkan a : ");
        int a = masuk.nextInt();
        System.out.print("masukkan b : ");
        int b = masuk.nextInt();
        System.out.println("hasil a % b : " + a % b);
    }
    
}
