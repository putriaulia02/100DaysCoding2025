package day73;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        int angka1, angka2;
        int hasil = 0;
        while(true){
            System.out.print("Masukkan angka1 : ");
            angka1 = p.nextInt();
            System.out.print("Masukkan angka2 : ");
            angka2 = p.nextInt();
            
            if(angka1 < 0 || angka2 < 0){
                System.out.println("Tidak menerima inputan negatif");
                break;
            }
            
            hasil = angka1 + angka2;
            System.out.print("Hasil dari " + angka1 + " + " + angka2 + " = " + hasil);
            System.out.println("");
        }
        
    }
    
}
