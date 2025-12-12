package day96;

import java.util.Scanner;

public class day96 {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        int a = 10;
        int b = 5;
        System.out.print("Masukkan operator  : ");
        char operator = p.next().charAt(0);
        
        System.out.println("Hasil " + a + " " + operator + " " + b + " : "+mencarihasil(a,b,operator));
        
    }
    public static int mencarihasil(int a, int b, char operator){
        int hasil = 0;
        if (operator == '+') {
            hasil  =  a + b;
        }else if(operator == '-'){
            hasil = a - b;
        }else if(operator == '*'){
            hasil = a * b;
        }else if(operator == '/'){
            hasil = a / b;
        }else{
            System.out.println("operator tdk diminta di roadmap");
        }
        return hasil;
    }
}
