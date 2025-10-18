package day41;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Evaluasi mentor 2
        //soal 1
        System.out.print("Masukkan suhu dalam celcius: ");
        double celcius = sc.nextDouble();
        System.out.println("Pilih konversi: ");
        System.out.println("1. Fahrenheit\n2. Kelvin");
        System.out.print("Masukkan pilihan anda: ");
        int pilih = sc.nextInt();
        final double fahrenheit = (celcius *9/5) + 32;
        final double kelvin = celcius + 273.15;
        if(pilih == 1){
            double konversi = fahrenheit;
            System.out.println("Hasil konversi: " + celcius + "°C = " + konversi + "F");
        }else if(pilih == 2){
            double konversi = kelvin;
            System.out.println("Hasil konversi: " + celcius + "°C = " + konversi + "K");
        }
        
        //soal 2
        System.out.print("Username: ");
        String username = sc.nextLine();
        System.out.print("Password: ");
        String password = sc.nextLine();
        if(username.equals("Putri") && password.equals("4")){
            System.out.println("Anda login sebagai pengguna");
        }else if(username.equals("admin") && password.equals("admin")){
            System.out.println("Anda login sebagai admin");
        }else{
            System.out.println("Akun tidak ditemukan");
        }
        
    }
    
}
