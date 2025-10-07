package day30;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        //Operator perbandingan <= dan >=
        Scanner input = new Scanner(System.in);
        System.out.print("Nilai a: ");
        int a = input.nextInt();
        System.out.print("Nilai b: ");
        int b = input.nextInt();
        
        //cetak
        System.out.println("Apakah nilai a lebih kecil atau sama dengan nilai b?: " + (a <= b));
        System.out.println("Apakah nilai a lebih besar atau sama dengan nilai b?: " + (a >= b));
    }
    
}
