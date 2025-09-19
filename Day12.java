package day12.java;

public class Main {
    
    public static void main(String[] args) {
        /* hari ini saya membuat biodata saya dengan menggunakan
         beberapa tipe data yaitu string, int, double, float, dan char*/
        String nama, alamat, nim, asalSekolah;
        int umur;
        double tinggi;
        float bb;
        char kelas;
        nama = "Putri aulia";
        alamat = "kalukku (galung)";
        nim = "D0225024";
        asalSekolah = "UPTD SMAN 1 Kalukku";
        umur = 17;
        tinggi = 154.0;
        bb = 44.0f;
        kelas = 'C';
        //perintah untuk mencetak di output
        System.out.println("==Biodata==");
        System.out.println("Nama :" + nama);
        System.out.println("Alamat : " + alamat);
        System.out.println("NIM :" + nim);
        System.out.println("Asal Sekolah :" + asalSekolah);
        System.out.println("Umur :" + umur + "thn");
        System.out.println("Tinggi badan :" + tinggi + "cm");
        System.out.println("Berat badan :" + bb + "kg");
        System.out.println("Kelas :" + kelas + "Informatika");
    }
    
}
