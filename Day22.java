package day22;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //latihan :program luas persegi
        System.out.print("sisi: ");
        int sisi = sc.nextInt();
        int L = sisi * sisi;
        System.out.println("luas persegi: " + L);
    }
    
}
