package day97;

import java.util.Scanner;

public class Day97 {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        System.out.print("Masukkan sisi : ");
        int sisi = p.nextInt();

        System.out.println("Luas Persegi : "+ carisisi(sisi));
    }
    public static int carisisi(int sisi){
        int luaspersegi = sisi * sisi;
        return luaspersegi;
    }
    
}
