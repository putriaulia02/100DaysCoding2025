package day67;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        //Latihan membuat pola horizontal
        
        System.out.print("Masukkan batas : ");
        int batas = p.nextInt();
        
        for (int i = 0; i <= batas; i++){
            System.out.print("-");
        }
    }
    
}
