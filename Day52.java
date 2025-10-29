package day52;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        while (true) {
            System.out.print("Masukkan angka: ");
            int angka = p.nextInt();
            if(angka > 0){
                if(angka < 10){
                   System.out.println(angka + " adalah bilangan satuan");
                }else if(angka < 100){
                   System.out.println(angka + " adalah bilangan puluhan");
                }else if(angka < 1000){
                   System.out.println(angka + " adalah bilangan ratusan");
                }else{
                   System.out.println(angka + " adalah bilangan lain(ribuan, puluh ribuan, dan seterusnya)");
                   break;
                }
            }else{
                System.out.println("tidak menerima inputan nol dan negatif");
                break;
            }
        }
    }
    
}
