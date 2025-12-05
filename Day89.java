package day89;

import java.util.Scanner;

public class day89 {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        System.out.print("Masukkan nilai a : ");
        int a = p.nextInt();
        System.out.print("Masukkan nilai b : ");
        int b = p.nextInt();
        
        penjumlahan(a,b);
        System.out.println("");
    }
    static void penjumlahan(int a, int b){
        int hasil = a + b;
        System.out.print("Hasil dari penjumlahan "+ a + " +  " + b + " : " + hasil);
    }
    
}
