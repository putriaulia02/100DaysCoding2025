package day90;

import java.util.Scanner;

public class day90 {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        System.out.print("Masukkan nama : ");
        String n = p.nextLine();
        
        System.out.println("Nama saya adalah "+nama(n));
    }
    static String nama(String n){
        return n;
    }
}
