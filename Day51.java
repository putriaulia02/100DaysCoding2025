package day51;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        System.out.print("Masukkan batas: ");
        int batas = p.nextInt();
        String jenis = "";
        for(int i = 1; i <= batas; i++){
            if(i % 2 == 0){
                jenis = "Genap";
                System.out.println(i + " adalah angka genap");
            }else{
                jenis = "Ganjil";
                System.out.println(i + " adalah angka ganjil");
            }
        }
        System.out.println("Angka batas yang diinputkan adalah jenis angka? " + jenis);
    }
    
}
