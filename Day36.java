package day36;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=====Kedai putri=====");
        System.out.println("1. Bakso");
        System.out.println("2. Mie ayam");
        System.out.print("Pilihan: ");
        int pilihan = sc.nextInt();
        if(pilihan == 1){
            System.out.println("1. Bakso urat \n2. Bakso biasa");
            System.out.print("masukkan pilihan: ");
            int pilih = sc.nextInt();
            if(pilih == 1){
                System.out.println("=====keterangan=====");
                String menu = "Bakso urat";
                int harga = 15000;
                String deskripsi = "Baksonya lezat dan wenakkk poll";
                System.out.println("Menu: " + menu);
                System.out.println("Harga: " + harga);
                System.out.println("Deskripsi: " + deskripsi);
            }else if(pilih == 2);
                System.out.println("=====keterangan=====");
                String menu = "Bakso biasa";
                int harga = 12000;
                String deskripsi = "Baksonya enak poll";
                System.out.println("Menu: " + menu);
                System.out.println("Harga: " + harga);
                System.out.println("Deskripsi: " + deskripsi);
        }else if(pilihan == 2){
            System.out.println("1. Mie ayam level 1 \n2. Mie ayam level 2");
            System.out.print("masukkan pilihan: ");
            int pilih = sc.nextInt();
            if(pilih == 1){
                System.out.println("=====keterangan=====");
                String menu = "Mie level 1";
                int harga = 15000;
                String deskripsi = "Mie ayamnya lezat dan ayamnya banyak";
                System.out.println("Menu: " + menu);
                System.out.println("Harga: " + harga);
                System.out.println("Deskripsi: " + deskripsi);
            }else if(pilih == 2){
                System.out.println("=====keterangan=====");
                String menu = "Mie level 2";
                int harga = 16000;
                String deskripsi = "Mie ayamnya lezat, ayamnya banyak dan super pedass";
                System.out.println("Menu: " + menu);
                System.out.println("Harga: " + harga);
                System.out.println("Deskripsi: " + deskripsi);
            }
        }
        
    }
    
}
