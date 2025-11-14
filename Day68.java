package day68;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        System.out.print("Masukkan panjang : ");
        int panjang = p.nextInt();
        System.out.print("Masukkan lebar : ");
        int lebar = p.nextInt();
        
        for (int i = 1; i <= panjang; i++){
            for (int j = 1; j <= lebar; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    
}
