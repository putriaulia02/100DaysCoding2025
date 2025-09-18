package day11.java;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama;
        double tinggi;
        float bb;
        int umur;
        long saudara;
        byte panjang;
        short luas;
        char kelas;
        boolean lulus;
        System.out.print("Nama : ");
        nama = input.nextLine();
        System.out.println(nama);
        System.out.print("Tinggi :");
        tinggi = input.nextDouble();
        System.out.println(tinggi);
        System.out.print("bb : ");
        tinggi = input.nextFloat();
        System.out.println(tinggi);
        System.out.print("umur :");
        umur = input.nextInt();
        System.out.println(tinggi);
        System.out.print("jumlah saudara : ");
        saudara = input.nextLong();
        System.out.println(saudara);
        System.out.print("panjang : ");
        panjang = input.nextByte();
        System.out.println(panjang);
        System.out.print("luas : ");
        luas = input.nextShort();
        System.out.println(luas);
        System.out.print("kelas : ");
        kelas = input.next().charAt(0);
        System.out.println(kelas);
        System.out.print("lulus : ");
        lulus = input.nextBoolean();
        System.out.println(lulus);
        /* scanner adalah class yang digunakan untuk membaca input
         dari berbagai sumber contohnya dari keyboard, dan scanner
        juga dipakai untuk mengisi atau mengetikkan nilai 
        setelah di run atau di output*/
        
    }
    
}
