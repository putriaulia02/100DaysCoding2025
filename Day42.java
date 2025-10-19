package day42;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nama pegawai: ");
        String nama = sc.nextLine();
        System.out.println("=======Pekerjaan=======");
        System.out.println("1. PNS \n2. Freelancer");
        System.out.println("===============");
        System.out.print("Pilih pekerjaan: ");
        int pilih= sc.nextInt();
        System.out.print("Penghasilan: ");
        double penghasilan = sc.nextInt();

        String pekerjaan = "";
        int pajak = 0;
        if(pilih == 1){
            pekerjaan = "PNS";
            if(penghasilan >= 5000000){
                pajak = 15;
            }else if(penghasilan >= 3000000 && penghasilan < 5000000){
                pajak = 10;
            }else if(penghasilan < 3000000){
                pajak = 0;
            }
        }else if(pilih == 2){
            pekerjaan = "Freelancer";
            if(penghasilan >= 5000000){
                pajak = 8;
            }else if(penghasilan >= 3000000 && penghasilan < 5000000){
                pajak = 3;
            }else if(penghasilan < 3000000){
                pajak = 0;
            }
        }
        
        double potongan = penghasilan * pajak/100;
        double gajibersih = penghasilan - potongan;
        System.out.println("=====================");
        System.out.println("Nama pegawai: " + nama);
        System.out.println("Jenis pekerjaan: " + pekerjaan);
        System.out.println("Penghasilan kotor: " + penghasilan);
        System.out.println("Pajak dikenakan: " + pajak + "%");
        System.out.println("Potongan: " + potongan);
        System.out.println("Penghasilan bersih: " + gajibersih);
    }
    
}
     
