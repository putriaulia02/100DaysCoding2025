package day40;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //latihan membuat kalkulator sederhana
        System.out.print("x: ");
        int x = sc.nextInt();
        System.out.print("y: ");
        int y = sc.nextInt();
        System.out.print("Aritmatika: ");
        char aritmatika = sc.next().charAt(0);
        if(aritmatika == '+'){
            int hasil = x + y;
            System.out.println("hasil dari " + x + " + " + y + " adalah : " + hasil);
        }else if(aritmatika == '-'){
            int hasil = x - y;
            System.out.println("hasil dari " + x + " - " + y + " adalah : " + hasil);
        }else if(aritmatika == '*'){
            int hasil = x * y;
            System.out.println("hasil dari " + x + " * " + y + " adalah : " + hasil);
        }else if(aritmatika == '/'){
            int hasil = x / y;
            System.out.println("hasil dari " + x + " / " + y + " adalah : " + hasil);
        }else if(aritmatika == '%'){
            int hasil = x % y;
            System.out.println("hasil dari " + x + " % " + y + " adalah : " + hasil);
        }
        
    }
    
}
