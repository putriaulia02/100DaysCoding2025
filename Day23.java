package day23;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("panjang: ");
        int panjang = sc.nextInt();
        System.out.print("lebar: ");
        int lebar = sc.nextInt();
        int luas = panjang * lebar;
        System.out.println("luas persegi panjang: " + luas);
    }
    
}
