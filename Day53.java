package day53;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        System.out.print("Masukkkan batas: ");
        int batas = p.nextInt();
        for (int i = 1; i <= batas; i++){
            System.out.println("no. " + i);
                if(i == 6){
                    System.out.println("berhenti di angka " + i);
                    break;
                }
        }
    }
    
}
