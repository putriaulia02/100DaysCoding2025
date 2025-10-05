package day28;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Operator perbandingan == dan !=
        System.out.print("Nilai a: ");
        int a = sc.nextInt();
        System.out.print("Nilai b: ");
        int b = sc.nextInt();
        System.out.println("Apakah nilai a sama dengan nilai b?: " + (a == b));
        System.out.println("Apakah nilai a tidak sama dengan nilai b?: " + (a != b));
    }
    
}
