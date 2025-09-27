package day20;

public class Main {
    
    public static void main(String[] args) {
        //Mengubah tipe data primitif menjadi string
        int a = 100;
        String nilai = String.valueOf(a);
        System.out.println("int ke String :" + nilai);
        
        double b = 154.0;
        String tinggi = b + "";
        System.out.println("double ke String :" + tinggi);
    }
    
}
