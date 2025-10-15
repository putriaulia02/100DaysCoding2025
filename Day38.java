package day38;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        System.out.print("Angka: ");
        int angka = p.nextInt();
        if(angka > 0){
            System.out.println(angka + " termasuk bilangan positif");
            if(angka % 2 == 0){
                System.out.print(" dan " + angka + " termasuk bilangan genap");
            }else{
                System.out.print(" dan " + angka + " termasuk bilangan ganjil");
            }
        }else if(angka < 0){
            System.out.println(angka + " termasuk bilangan negatif");
            if(angka % 2 == 0){
                System.out.print(" dan " + angka + " termasuk bilangan genap");
            }else{
                System.out.print(" dan " + angka + " termasuk bilangan ganjil");
            }
        }else{
            System.out.println(angka + " termasuk bilangan nol");
        }
    }
    
}
