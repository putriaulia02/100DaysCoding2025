package day12.java;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        /* hari ini saya membuat biodata saya dengan menggunakan scanner dan
         beberapa tipe data yaitu string, int, double, float, dan char*/
        Scanner sc = new Scanner(System.in);
        String nama, alamat, nim, asalSekolah;
        int umur;
        double tinggi;
        float bb;
        char kelas;
        //penggunaan scanner
        System.out.print("Nama :");
        nama = sc.nextLine();
        System.out.print("Alamat :");
        alamat = sc.nextLine();
        System.out.print("NIM :");
        nim = sc.nextLine();
        System.out.print("Asal Sekolah :");
        asalSekolah = sc.nextLine();
        System.out.print("Umur :");
        umur = sc.nextInt();
        System.out.print("Tinggi badan :");
        tinggi = sc.nextDouble();
        System.out.print("Berat badan :");
        bb = sc.nextFloat();
        System.out.print("Kelas :");
        kelas = sc.next().charAt(0);

        //yang akan mencetak di output
        System.out.println("===============");
        System.out.println("==Biodata==");
        System.out.println("Nama :" + nama);
        System.out.println("Alamat : " + alamat);
        System.out.println("NIM :" + nim);
        System.out.println("Asal Sekolah :" + asalSekolah);
        System.out.println("Umur :" + umur + "thn");
        System.out.println("Tinggi badan :" + tinggi + " cm");
        System.out.println("Berat badan :" + bb + " kg");
        System.out.println("Kelas :" + kelas + " Informatika");

        /*penjelasan penggunaan scanner untuk membaca inputan dari tipe data 
         yang digunakan(string, int, double, float, dan char)*/
        /*string => next.Line(); mencetak/membaca semua kata yang dimasukkan
                 => next(); hanya mencetak/membaca satu kata atau hanya kata pertama
          int => next.Int();
          double => next.Double();
          float => next.Float();
          char => next().charAt(0); *(0) bisa diganti sesuai dengan inisal 
          yang kita mau dari nilai variabel*/
    }
    
}
