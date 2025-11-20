package day74;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        int pilihan;
        int harga = 0;
        System.out.println("====Menu Makanan====");
            System.out.println("1. Nasi bakar \n2. Nasi Goreng \n3. Nasi ayam geprek");
        do{
            System.out.print("Masukkan pilihan : ");
            pilihan = p.nextInt();
            
            if(pilihan == 1){
                System.out.println("Nasi Bakar");
                harga = 18000;
                System.out.println("Harga perporsi : Rp." + harga);
            }else if(pilihan == 2){
                System.out.println("Nasi Goreng");
                harga = 15000;
                System.out.println("Harga perporsi : Rp." + harga);
            }else if(pilihan == 3){
                System.out.println("Nasi Ayam geprek");
                harga = 13000;
                System.out.println("Harga perporsi : Rp." + harga);
            }else if(pilihan == 4){
                System.out.println("Menu tidak ada!!");
            }
        }while(pilihan != 4);
    }
    
}
