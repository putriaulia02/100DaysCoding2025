package day35;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        System.out.print("Angka: ");
        int angka = p.nextInt();
        
        if(angka % 2 == 0){
            System.out.println("Genap");
        }else{
            System.out.println("Ganjil");
        }
    }
    
}
