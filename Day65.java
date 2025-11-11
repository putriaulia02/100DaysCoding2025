package day65;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        System.out.print("angka : ");
        int angka = p.nextInt();
        int hasil = angka;
        System.out.print(angka + "! = ");
        for(int i = angka; i > 0; i--){
            System.out.print(i);
            if(i > 1){
                System.out.print(" x ");
            }
            
            if(angka != i){
                hasil *= i;
            }
        }
        System.out.print(" = " + hasil);
    }
    
}
