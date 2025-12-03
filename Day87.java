package day87;

import java.util.Scanner;

public class Day87 {

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        int [] angka = {23, 5, 43, 67, 14};
        
        System.out.print("Masukkan angka yang ingin dicari : ");
        int cari = p.nextInt();
        
        boolean ditemukan = false;
        
        for (int i = 0; i < angka.length; i++) {
            if (cari == angka[i]) {
                ditemukan = true;
                break;
            }
        }
        
        if (ditemukan) {
            System.out.println("angka  ditemukan");
        }else{
            System.out.println("angka tidak ditemukan");
        }
    }
    
}
