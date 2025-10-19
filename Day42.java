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
        System.out.println("==================");
        int pajak = 0;
        if(pilih == 1){
            String jenispekerjaan = "PNS";
            if(penghasilan >= 5000000){
                pajak = 15;
                double potongan = penghasilan * pajak/100;
                double penghasilanbersih = penghasilan - potongan;
                System.out.println("Nama pegawai\t\t: " + nama);
                System.out.println("Jenis pekerjaan\t\t: " + jenispekerjaan);
                System.out.println("Penghasilan kotor\t: " + penghasilan);
                System.out.println("Pajak dikenakan\t\t: " + pajak + "%");
                System.out.println("Potongan\t\t: " + potongan);
                System.out.println("Penghasilan bersih\t: " + penghasilanbersih);
            }else if(penghasilan >= 3000000 && penghasilan < 5000000){
                pajak = 10;
                double potongan = penghasilan * pajak/100;
                double penghasilanbersih = penghasilan - potongan;
                System.out.println("Nama pegawai\t\t: " + nama);
                System.out.println("Jenis pekerjaan\t\t: " + jenispekerjaan);
                System.out.println("Penghasilan kotor\t: " + penghasilan);
                System.out.println("Pajak dikenakan\t\t: " + pajak + "%");
                System.out.println("Potongan\t\t: " + potongan);
                System.out.println("Penghasilan bersih\t: " + penghasilanbersih);
            }else if(penghasilan < 3000000){
                pajak = 0;
                double potongan = penghasilan * pajak/100;
                double penghasilanbersih = penghasilan - potongan;
                System.out.println("Nama pegawai\t\t: " + nama);
                System.out.println("Jenis pekerjaan\t\t: " + jenispekerjaan);
                System.out.println("Penghasilan kotor\t: " + penghasilan);
                System.out.println("Pajak dikenakan\t\t: " + pajak + "%");
                System.out.println("Potongan\t\t: " + potongan);
                System.out.println("Penghasilan bersih\t: " + penghasilanbersih);
            }
        }else if(pilih == 2){
            String jenispekerjaan = "Freelancer";
            if(penghasilan >= 5000000){
                pajak = 8;
                double potongan = penghasilan * pajak/100;
                double penghasilanbersih = penghasilan - potongan;
                System.out.println("Nama pegawai\t\t: " + nama);
                System.out.println("Jenis pekerjaan\t\t: " + jenispekerjaan);
                System.out.println("Penghasilan kotor\t: " + penghasilan);
                System.out.println("Pajak dikenakan\t\t: " + pajak + "%");
                System.out.println("Potongan\t\t: " + potongan);
                System.out.println("Penghasilan bersih\t: " + penghasilanbersih);
            }else if(penghasilan >= 3000000 && penghasilan < 5000000){
                pajak = 3;
                double potongan = penghasilan * pajak/100;
                double penghasilanbersih = penghasilan - potongan;
                System.out.println("Nama pegawai\t\t: " + nama);
                System.out.println("Jenis pekerjaan\t\t: " + jenispekerjaan);
                System.out.println("Penghasilan kotor\t: " + penghasilan);
                System.out.println("Pajak dikenakan\t\t: " + pajak + "%");
                System.out.println("Potongan\t\t: " + potongan);
                System.out.println("Penghasilan bersih\t: " + penghasilanbersih);
            }else if(penghasilan < 3000000){
                pajak = 0;
                double potongan = penghasilan * pajak/100;
                double penghasilanbersih = penghasilan - potongan;
                System.out.println("Nama pegawai\t\t: " + nama);
                System.out.println("Jenis pekerjaan\t\t: " + jenispekerjaan);
                System.out.println("Penghasilan kotor\t: " + penghasilan);
                System.out.println("Pajak dikenakan\t\t: " + pajak + "%");
                System.out.println("Potongan\t\t: " + potongan);
                System.out.println("Penghasilan bersih\t: " + penghasilanbersih);
            }
        }
    }
    
}
