package day37;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("angka: ");
        int angka = sc.nextInt();
        if(angka <= 9){
            System.out.print(angka + " Termasuk bilangan satuan");
            if(angka % 2 == 0){
                System.out.println(" dan genap");
            }else{
                System.out.println(" dan ganjil");
            }
        }else if(angka <= 99){
            System.out.print(angka + " Termasuk bilangan puluhan");
            if(angka % 2 == 0){
                System.out.println(" dan genap");
            }else{
                System.out.println(" dan ganjil");
                }
        }else if(angka <= 999){
            System.out.print(angka + " Termasuk bilangan ratusan");
            if(angka % 2 == 0){
                System.out.println(" dan genap");
            }else{
                System.out.println(" dan ganjil");
                }
        }else if(angka <= 9999){
            System.out.print(angka + " Termasuk bilangan ribuan");
            if(angka % 2 == 0){
                System.out.println(" dan genap");
            }else{
                System.out.println(" dan ganjil");
                }
        }
    }
    
}
