package day29;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        System.out.print("Nilai x: ");
        int x = p.nextInt();
        System.out.print("Nilai y: ");
        int y = p.nextInt();
        System.out.println("Apakah nilai x lebih kecil dari nilai y?: " + (x < y));
        System.out.println("Apakah nilai x lebih besar dari nilai y?: " + (x > y));
        
    }
    
}
