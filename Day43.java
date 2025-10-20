package day43;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int angka = p.nextInt();
        
        String bilangan = "";
        String ganjilOrgenap = "";
        String hasilbagi = "";
        if(angka > 0){
            if(angka > 0 && angka <= 9){
            bilangan = " angka adalah satuan";
            }else if(angka > 0 && angka <= 99){
            bilangan = " angka adalah puluhan";
            }else if(angka > 0 && angka <= 999){
            bilangan = " angka adalah ratusan";
            }else{
            //bilangan = " yang diinputkan tidak boleh mines";
            }
        
            //menentukan ganjil genap
            if(angka > 0 && angka % 2 == 0){
                 ganjilOrgenap = " genap";
            }else if(angka > 0 && angka % 2 == 1){
                 ganjilOrgenap = " ganjil";
            }else{
            
            }
        
            //menentukan hasil yang bisa dibagi 3,5, dan 3 dan 5
            if(angka > 0 && (angka % 3 == 0 && angka % 5 == 0)){
                hasilbagi = " yang bisa dibagi 3 dan 5"; 
            }else if(angka > 0 && angka % 3 == 0){
                hasilbagi = " yang bisa dibagi 3";
            }else if(angka > 0 && angka % 5 == 0){
                hasilbagi = " yang bisa dibagi 5";
            }else{
                hasilbagi = " tidak habis dibagi 3 dan 5";
            }
            //mencetak keseluruhan
            System.out.println(angka + bilangan + ganjilOrgenap + hasilbagi);
        }else{
             System.out.println("tidak menerima inputan negatif");
        }    
    }
    
}
