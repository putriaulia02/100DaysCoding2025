package day50;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int angka = p.nextInt();
        
        String ganjilgenap = angka % 2 == 0 ? "Genap" : "Ganjil";
        String jenis = angka > 0 ? "Positif" : "Negatif";
        System.out.println(angka + " termasuk angka " + ganjilgenap + " dan termasuk jenis bilangan " + jenis);
    }
    
}
