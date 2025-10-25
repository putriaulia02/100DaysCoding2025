package day48;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        System.out.print("Masukkan angka1: ");
        int angka1 = p.nextInt();
        System.out.print("Masukkan angka2: ");
        int angka2 = p.nextInt();
        System.out.print("Masukkan operator: ");
        char operator = p.next().charAt(0);
        int hasil = 0;
        switch(operator){
            case '+':
            hasil = angka1 + angka2;
            System.out.println("Hasil dari " + angka1 + " + " + angka2 + "  adalah " + hasil);
            break;
            case '-':
            hasil = angka1 - angka2;
            System.out.println("Hasil dari " + angka1 + " - " + angka2 + "  adalah " + hasil);
            break;
            case '*':
            hasil = angka1 * angka2;
            System.out.println("Hasil dari " + angka1 + " * " + angka2 + "  adalah " + hasil);
            break;
            case '/':
            hasil = angka1 / angka2;
            System.out.println("Hasil dari " + angka1 + " / " + angka2 + "  adalah " + hasil);
            break;
            case '%':
            hasil = angka1 % angka2;
            System.out.println("Hasil dari " + angka1 + " % " + angka2 + "  adalah " + hasil);
            break;
            default:
            System.out.println("Operator tidak ditemukan");
        }
    }
    
}
