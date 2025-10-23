package day46;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        int pilih, porsi, harga = 0;
        System.out.println("===== Menu =====");
        System.out.println("1. Nasi goreng\n2. Mie ayam\n3. Nasi bakar");
        System.out.print("Pilih menu (1-3): ");
        pilih = p.nextInt();
        System.out.print("Jumlah porsi: ");
        porsi = p.nextInt();
        switch (pilih){
            case 1:
            System.out.println("Nasi goreng 15k/Porsi");
            harga = 15000 * porsi;
            System.out.println("Total bayar: " + harga);
            break;
            case 2:
            System.out.println("Mie ayam 12k/Porsi");
            harga = 12000 * porsi;
            System.out.println("Total bayar: " + harga);
            break;
            case 3:
            System.out.println("Nasi bakar 16k/Porsi");
            harga = 16000 * porsi;
            System.out.println("Total bayar: " + harga);
            break;
            default:
            System.out.println("Maaf, pilihan menu tidak ada");
        }
        System.out.println("");
        System.out.println("Terima kasihhh!!!");
    }
    
}
