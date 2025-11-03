package day57;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        System.out.print("Masukkan panjang : ");
        int panjang = p.nextInt();
        System.out.print("Masukkan lebar : ");
        int lebar = p.nextInt();
        
        for(int i = 1; i <= panjang; i++){
            for(int a = 1; a <= lebar; a++){
                System.out.print(" o ");
            }
            System.out.println();
        }
    }
    
}
