package day24;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Latihan: Program luas lingkaran
        /*rumus luas lingkaran : π(phi) * r²
         r = jari jari
         π = 3.14 ( nilai phi itu sudah ketetapan dan tidak bisa diubah
        */
        final double phi = 3.14;
        System.out.print("jari jari: ");
        int r = input.nextInt();
        double luas = phi * r * r;
        System.out.println("luas lingkaran: " + luas);
    }
    
}
