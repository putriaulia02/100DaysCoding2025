package day94;

import java.util.Scanner;

public class day94 {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        System.out.print("Nilai x : ");
        int x = p.nextInt();
        System.out.print("Nilai y : ");
        int y = p.nextInt();
        
        hitungnilai(x,y);
    }
    public static void hitungnilai(int x, int y){
        int hasil = x * y;
        System.out.println("Hasil perkalian : "+hasil);
    }
}
