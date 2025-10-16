package day39;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("====Ontime====");
        System.out.println("Menu: \n1. Makanan berat: \n1.Ayam geprek \n2.Nasi goreng");
        System.out.println("Menu: \n2. Minuman: \n1.Brown sugar \n2.Readvelfet");
        System.out.println("Menu: \n3. Cemilan: \n1.Banana rol \n2.Tela tela");
        System.out.print("Masukkan pilihan anda: ");
        int pilihan = sc.nextInt();
        if(pilihan == 1){
            System.out.println("1.Makanan berat");
            System.out.print("Pilih menu: ");
            int pilih = sc.nextInt();
            if(pilih == 1){
                System.out.println("1.Ayam geprek");
                System.out.println("====Deskripsi====");
                int porsi = 2;
                int hargaSatuan = 10000;
                int total = porsi*hargaSatuan;
                System.out.println("jumlah porsi : " + porsi);
                System.out.println("Harga perporsi: " + hargaSatuan);
                System.out.println("Total bayar: " + total);
            }else if(pilih == 2){
                System.out.println("1.Nasi goreng");
                System.out.println("====Deskripsi====");
                int porsi = 3;
                int hargaSatuan = 15000;
                int total = porsi*hargaSatuan;
                System.out.println("jumlah porsi : " + porsi);
                System.out.println("Harga perporsi: " + hargaSatuan);
                System.out.println("Total bayar: " + total);
            }
        }else if(pilihan == 2){
            System.out.println("1.Minuman");
            System.out.print("Pilih menu: ");
            int pilih = sc.nextInt();
            if(pilih == 1){
                System.out.println("1.Brown sugar");
                System.out.println("====Deskripsi====");
                int porsi = 2;
                int hargaSatuan = 13000;
                int total = porsi*hargaSatuan;
                System.out.println("jumlah porsi : " + porsi);
                System.out.println("Harga perporsi: " + hargaSatuan);
                System.out.println("Total bayar: " + total);
            }else if(pilih == 2){
                System.out.println("1.Readvelfet");
                System.out.println("====Deskripsi====");
                int porsi = 4;
                int hargaSatuan = 12000;
                int total = porsi*hargaSatuan;
                System.out.println("jumlah porsi : " + porsi);
                System.out.println("Harga perporsi: " + hargaSatuan);
                System.out.println("Total bayar: " + total);
            }
        }else if(pilihan == 3){
            System.out.println("1.Cemilan");
            System.out.print("Pilih menu: ");
            int pilih = sc.nextInt();
            if(pilih == 1){
                System.out.println("1.Banana rol");
                System.out.println("====Deskripsi====");
                int porsi = 2;
                int hargaSatuan = 10000;
                int total = porsi*hargaSatuan;
                System.out.println("jumlah porsi : " + porsi);
                System.out.println("Harga perporsi: " + hargaSatuan);
                System.out.println("Total bayar: " + total);
            }else if(pilih == 2){
                System.out.println("1.Tela tela");
                System.out.println("====Deskripsi====");
                int porsi = 3;
                int hargaSatuan = 7000;
                int total = porsi*hargaSatuan;
                System.out.println("jumlah porsi : " + porsi);
                System.out.println("Harga perporsi: " + hargaSatuan);
                System.out.println("Total bayar: " + total);
            }
        }
        /*Kak rifky, kak daud izin minta maaf kak, kalo ada salah, tapi pasti adami jadi
         minta maaf sekali kak, kalo kadang juga rese':(
         terus jangan jadi pertemuan terakhir kak, menteenya masih mau belajar*/
        
    }
    
}
