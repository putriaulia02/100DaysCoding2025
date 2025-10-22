package day45;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        System.out.print("Masukkan pilihan kelas (1=A/2=B/3=C/4=D): ");
        int pilihan = p.nextInt();
        switch(pilihan){
            case 1:
            System.out.println("Kamu masuk kelas A");
            break;
            case 2:
            System.out.println("Kamu masuk kelas B");
            break;
            case 3:
            System.out.println("Kamu masuk kelas C");
            break;
            case 4:
            System.out.println("Kamu masuk kelas D");
            break;
            default:
            System.out.println("Pilihan kelas tidak ada");
            break;
        }
    }
    
}
