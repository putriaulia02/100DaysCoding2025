package day14.java;

public class Main {
    
    public static void main(String[] args) {
        //mengubah string menjadi tipe data primitif
        String a = "10";
        short angka = Short.parseShort(a);
        System.out.println("angka :" + angka);
        
        String u = "11";
        byte umur = Byte.parseByte(u);
        System.out.println("umur :" + umur);
        
        String s = "13";
        int saudara = Integer.parseInt(s);
        System.out.println("saudara :" + saudara);
        
        String k = "14";
        long kursi = Long.parseLong(k);
        System.out.println("kursi :" + kursi);
        
        String b = "15";
        float berat = Float.parseFloat(b);
        System.out.println("berat :" + berat);
        
        String t = "16";
        double tinggi = Double.parseDouble(t);
        System.out.println("tinggi :" + tinggi);
        
        String a = "c";
        char kelas = a.charAt(0);
        System.out.println("kelas :" + kelas);
        
        String l = "true";
        boolean lulus = Boolean.parseBoolean(l);
        System.out.println("lulus :" + lulus);
        
        /* mengubah string menjadi tipe data primitif agar kita tidak
         * hanya menggunakannya sebagai teks tetapi juga bisa mengubah/memakai 
         * data sesuai fungsinya, contohnya(logika,perhitungan, karakter)
         */
    }
    
}
