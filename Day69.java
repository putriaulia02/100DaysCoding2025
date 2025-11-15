package day69;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        //soal 1
        int hasil = 0;
        System.out.println("====Kalkulator Sederhana====");
        while (true) {
            System.out.print("");
            int a = p.nextInt();
            System.out.print("");
            char operator = p.next().charAt(0);
            System.out.print("");
            int b = p.nextInt();
            if (operator == '*') {
                hasil = a * b;
                System.out.println("Hasil dari " + a + " " + operator + " " + b + " adalah " + hasil);
            } else if (operator == '-') {
                hasil = a - b;
                System.out.println("Hasil dari " + a + " " + operator + " " + b + " adalah " + hasil);
            } else if (operator == '%') {
                hasil = a % 3;
                System.out.println("Hasil dari " + a + " " + operator + " " + b + " adalah " + hasil);
            } else if (operator == '+') {
                hasil = a + b;
                System.out.println("Hasil dari " + a + " " + operator + " " + b + " adalah " + hasil);
            } else if (operator == '/') {
                hasil = a / b;
                System.out.println("Hasil dari " + a + " " + operator + " " + b + " adalah " + hasil);
            } else {
                System.out.println("operator tidak ada");
            }
        }
        //soal 2
        System.out.print("Jumlah karung : ");
        int jumlah = p.nextInt();
        System.out.print("Berat per karung : ");
        double berat = p.nextInt();
        int ubah = (int)berat;
        int total = jumlah * ubah;
        System.out.println("Total berat : " + total);
        
        //soal 3
        int robot = 0;
        while(true){
            System.out.print("");
            String perintah = p.nextLine();
            if(perintah.equalsIgnoreCase("mundur")){
                robot -=1;
                System.out.println(robot);
            }else if(perintah.equalsIgnoreCase("maju")){
                robot +=1;
                System.out.println(robot);
            }else{
                System.out.println("Berhenti jangan lanjut!!");
                break;
            }
        }
    }
    
}
