package day44;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        System.out.print("Nilai ujian: ");
        int nilai = p.nextInt();
        String predikat = "";
        String keterangan = "";
        
        if(nilai >= 90 && nilai <= 100){
            predikat = "A";
            keterangan = "Tuntas";
        }else if(nilai >= 80 && nilai < 90){
            predikat = "B";
            keterangan = "Tuntas";
        }else if(nilai >= 71 && nilai < 80){
            predikat = "C";
            keterangan = "Tuntas tapi perbaikan";
        }else if(nilai >= 60 && nilai < 71){
            predikat = "D";
            keterangan = "Tidak Tuntas";
        }else{
            predikat = "E";
            keterangan = "ERROR";
        }
        System.out.println("Predikat nilai anda : " + predikat + " dan anda " + keterangan);
    }
    
}
