package day56;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        String ulang;
        do{
            System.out.print("Masukkan angka: ");
            int angka = p.nextInt();
            
            if(angka % 2 == 0){
                System.out.println(angka + " termasuk bilangan genap");
            }else{
                System.out.println(angka + " termasuk bilangan ganjil");
            }
            System.out.print("Apakah ingin mengulang? (ya/tidak) : ");
            ulang = p.next();
            
        }while(ulang.equalsIgnoreCase("ya"));
        
        System.out.println("Sampai disini, terima kasih");
    }
    
}
