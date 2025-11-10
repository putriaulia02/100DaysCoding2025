package day64;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        System.out.print("Masukkan M : ");
        int M = p.nextInt();
        System.out.print("Masukkan N: ");
        int N = p.nextInt();
        int hasil = M;
        
        for (int i = 1; i < N; i++){
            hasil *= M;
        }
        
        System.out.println("Hasil " + M + " pangkat " + N + " : " + hasil);
        
    }
    
}
