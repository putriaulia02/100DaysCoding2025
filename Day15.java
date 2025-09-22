package day15.java;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner pro = new Scanner(System.in);
        System.out.print("masukkan x :");
        int x = pro.nextInt();
        System.out.print("masukkan y :");
        int y = pro.nextInt();
        
        System.out.println("x + y :" + (x + y));
        System.out.println("x - y :" + (x - y));
    }
    
}
