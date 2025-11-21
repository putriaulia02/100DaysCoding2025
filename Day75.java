package day75;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        System.out.print("Masukkan kata/teks : ");
        String kata = p.nextLine();
        
        System.out.println("Teks awal : " + kata);
        System.out.println("Jumlah kata : " + kata.length());
        System.out.println("Uppercase(huruf besar) : " + kata.toUpperCase());
        System.out.println("Lowercase(huruf kecil) : " + kata.toLowerCase());
    }
    
}
