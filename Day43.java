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
        
        //menentukan bilangannya termasuk bilangan apa
        if(angka <= 9){
            bilangan = " satuan";
        }else if(angka <= 99){
            bilangan = " puluhan";
        }else if(angka <= 999){
            bilangan = " ratusa";
        }else{
            hasilbagi = " angka tidak habis dibagi 3 dan 5";
        }
        
        //menentukan ganjil genap
        if(angka % 2 == 0){
            ganjilOrgenap = " genap";
        }else{
            ganjilOrgenap = " ganjil";
        }
        
        //menentukan hasil yang bisa dibagi 3,5, dan 3 dan 5
        if(angka % 3 == 0 && angka % 5 == 0){
            hasilbagi = " yang bisa dibagi 3 dan 5";
        }else if(angka % 3 == 0){
            hasilbagi = " yang bisa dibagi 3";
        }else if(angka % 5 == 0){
            hasilbagi = " yang bisa dibagi 5";
        }
        
        //mencetak keseluruhan
        System.out.println(angka + " adalah angka " + bilangan + ganjilOrgenap + hasilbagi);
    }
    
}
