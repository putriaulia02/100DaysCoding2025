package day33;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nilai: "); 
        double nilai = sc.nextDouble();
        
        boolean lulus = !(nilai <= 80);
        System.out.println("Apakah saya lulus?, : " + lulus );
    }
    
}
