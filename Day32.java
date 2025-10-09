package day32;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        //Operator logika OR(||)
        System.out.print("Nilai matematika: ");
        int nilaiMtk = inp.nextInt();
        System.out.print("Nilai bahasa indonesia: ");
        int nilaiBindo = inp.nextInt();
        
        boolean lulus = (nilaiMtk >= 80) || (nilaiBindo >= 85);
        System.out.println("Apakah adik saya lulus tes untuk sekolah di SMAN 1 cendrawasi?: " + lulus);
    }
    
}
