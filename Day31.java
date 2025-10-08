package day31;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Operator logika AND(&&)
        System.out.print("Tinggi: ");
        double tinggi = input.nextDouble();
        System.out.print("Nilai rata rata: ");
        int nilai = input.nextInt();
        
        boolean lulus = (tinggi >= 156) && (nilai >= 80);
        System.out.println("Apakah saya lulus paskib tingkat kabupaten? : " + lulus);
    }
    
}
