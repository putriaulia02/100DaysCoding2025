package day76;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        System.out.print("Masukkan kata/teks : ");
        String kata = p.nextLine();
        
        if(kata.equals("putri")){
            System.out.println("teks yang keluar sama persis 'putri' ");
        }else{
            System.out.println("teks yang keluar tidak sama 'putri' ");
        }
        
        if(kata.equalsIgnoreCase("Putri")){
            System.out.println("Teks yg keluar sama dan tdk memperhatikan huruf besar/kecil");
        }
        
        if(kata.contains("saya")){
            System.out.println("Teks yang mengandung kata 'saya'");
        }else{
            System.out.println("Teks tdk mengandung kata 'saya'");
        }
        
        if(kata.isEmpty()){
            System.out.println("Teks kosong");
        }else{
            System.out.println("Teks tidak kosong");
        }
    }
    
}
