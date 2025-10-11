package day34;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nilai a = ");
        int a = sc.nextInt();
        System.out.print("nilai b = ");
        int b = sc.nextInt();
        System.out.print("nilai c = ");
        int c = sc.nextInt();
        
        //update nilai a
        int nilaibaruA = a+(b * c);
        a = nilaibaruA;
        System.out.println("Nilai akhir a = " + a);
        boolean hasilLogika = a % 2 == 0 && (a / b) > c || (a - b) <= 10;
        System.out.println("Hasil logika = " + hasilLogika);
    
    }
    
}
