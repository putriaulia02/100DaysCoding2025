package day60;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        System.out.print("Masukkan nilai N : ");
        int N = p.nextInt();
        
        System.out.println("Untuk bagian genap");
        for (int i = N; i >= 2; i--) {
            if(i % 2 == 0){
                System.out.print(i + " ");  
            }   
        }
        
        System.out.println();
        System.out.println("Untuk bagian ganjil");
        for (int i = N; i >= 1; i--) {
            if(i % 2 != 0){
                System.out.print(i + " ");
            }
        }
    }
    
}
