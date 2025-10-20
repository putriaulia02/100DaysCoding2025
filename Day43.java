package day43;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int angka = p.nextInt();
        if(angka <= 9){
            System.out.print(angka + " adalah angka satuan");
            if(angka % 2 == 0){
                System.out.print(" genap");
                if(angka % 3 == 0){
                    System.out.println(" yang bisa dibagi 3");
                }
            }else{
                System.out.println(" ganjil");
                if(angka % 5 == 0){
                    System.out.println(" yang bisa dibagi 5");
                }
            }
        }else if(angka <= 99){
            System.out.print(angka + " adalah angka puluhan");
            if(angka % 2 == 0){
                System.out.print(" genap");
                if(angka % 3 == 0 && angka % 5 == 0){
                    System.out.println(" yang bisa dibagi 3 dan 5");
                }
            }else{
                System.out.print(" ganjil");
                if(angka % 3 == 0 && angka % 5 == 0){
                    System.out.println(" yang bisa dibagi 3 dan 5");
                }
            }
        }else if(angka <= 999){
            System.out.print(angka + " adalah angka ratusan");
            if(angka % 2 == 0){
                System.out.print(" genap");
                if(angka % 3 == 0 && angka % 5 == 0){
                    System.out.println(" yang bisa dibagi 3 dan 5");
                }
            }else{
                System.out.print(" ganjil");
                if(angka % 3 == 0 && angka % 5 == 0){
                    System.out.println(" yang bisa dibagi 3 dan 5");
                }
            }
        }
    }
    
}
