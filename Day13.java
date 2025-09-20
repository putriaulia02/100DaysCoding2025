package day13.java;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
         //EVALUASI
         // nomor 1

            // file1
            // package No1;

            // file2
            // public class file2 {}

            // file3
            // public static void main(String[] args){}


        // nomor 2
            //deklarasi adalah tempat untuk memebuat tipe data dan nama variabel
            String nama;
            byte umur;
            short umur1;
            int umur2;
            long umur3;
            double tinggi;
            float bb;
            char kelas;
            boolean lulus;

            //inisialisasi adalah cara untuk membuat/mengisikan nilai kepada nama variabel
            nama = "putri";
            umur = 15;
            umur1 = 16;
            umur2 = 17;
            umur3 = 18;
            tinggi = 154.0;
            bb = 44.0f;
            kelas = 'c';
            lulus = false;

            //update variabel adalah mengubah nilai variabel  yang sudah dibuat
            nama = "putri aulia";
            umur = 12;
            umur1 = 13;
            umur2 = 14;
            umur3 = 15;
            tinggi = 156.0;
            bb = 45.0f;
            kelas = 'd';
            lulus = true;

        // nomor 3
            Scanner sc = new Scanner(System.in);
            String nama22, nim2, alamat2;
            int umur22;
            double tinggi2;
            float bb2;
            char kelas2;
            boolean status;

            System.out.print("nama : ");
            nama22 = sc.nextLine();
            System.out.print("umur : ");
            umur22 = sc.nextInt();
            System.out.print("nim : ");
            nim2 = sc.nextLine();
            nim2 = sc.nextLine();
            System.out.print("lulus : ");
            status = sc.nextBoolean();
            System.out.print("tinggi badan : ");
            tinggi2 = sc.nextDouble();
            System.out.print("berat badan : ");
            bb2 = sc.nextFloat();
            System.out.print("kelas : ");
            kelas2 = sc.next().charAt(0);  
            System.out.print("alamat : ");
            alamat2 = sc.next();

            System.out.print("====== Biodata Mahasiswa ======\t");
            System.out.print("\nNama\t\t: \t" + nama22) ;
            System.out.print("\nUmur\t\t: \t" + umur22 + " Tahun");
            System.out.print("\nNIM\t\t: \t" + nim2);
            System.out.print("\nStatus\t\t: \t" + status);
            System.out.print("\nTinggi Badan\t: \t" + tinggi2 + " cm");
            System.out.print("\nBerat Badan\t: \t" + bb2 + " kg"); 
            System.out.print("\nKelas\t\t: \t" + kelas2 );
            System.out.print("\nAlamat\t\t: \t" + alamat2);
   }

}
