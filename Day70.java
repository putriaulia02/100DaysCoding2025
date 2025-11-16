package day70;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        //Latihan membuat pola persegi panjang
        System.out.print("Masukkan lebar persesi : ");
        int lebar = p.nextInt();
        System.out.print("Masukkan panjang persegi : ");
        int panjang = p.nextInt();
        
        for (int i = 0; i < panjang; i++){
            for (int j = 0; j < lebar; j++){
                System.out.print(" ∆ ");
            }
            System.out.println();
        }
    }
    
}
