package day14.java;

public class Main {
    
    public static void main(String[] args) {
        //mengubah string menjadi tipe data primitif
        String a1 = "10";
        short a2 = Short.parseShort(a1);
        System.out.println("a1 :" + a1);
        
        String b1 = "11";
        byte b2 = Byte.parseByte(b1);
        System.out.println("b1 :" + b1);
        
        String c1 = "13";
        int c2 = Integer.parseInt(c1);
        System.out.println("c1 :" + c1);
        
        String d1 = "14";
        long d2 = Long.parseLong(d1);
        System.out.println("d1 :" + d1);
        
        String e1 = "15";
        float e2 = Float.parseFloat(e1);
        System.out.println("e1 :" + e1);
        
        String f1 = "16";
        double f2 = Double.parseDouble(f1);
        System.out.println("f1 :" + f1);
        
        String kelas = "c";
        char kls = kelas.charAt(0);
        System.out.println("kelas :" + kelas);
        
        String lulus = "true";
        boolean lulus1 = Boolean.parseBoolean(lulus);
        System.out.println("lulus :" + lulus);
        
        /* mengubah string menjadi tipe data primitif agar kita tidak
         * hanya menggunakannya sebagai teks tetapi juga bisa mengubah/memakai 
         * data sesuai fungsinya, contohnya(logika,perhitungan, karakter)
         */
    }
    
}
