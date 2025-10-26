package day49;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        System.out.print("a: ");
        int a = p.nextInt();
        System.out.print("b: ");
        int b = p.nextInt();
        int hasil = a + b;
        String jawaban = hasil % 2 == 0 ? "Ganjil" : "Genap";
        System.out.println("Hasil dari penjumlahan diatas apakah ganjil atau genap? ,jawabannya adalah: " + jawaban);
    }
    
}
