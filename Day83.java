package day83;

public class day83 {
    public static void main(String[] args) {
        int [] nilai = {10, 20, 30, 40, 50};
        int hasil = 0;
        for (int i = 0; i < nilai.length; i++) {
            System.out.print(nilai[i] +" ");
            hasil +=nilai[i];
        }
        System.out.println("");
        System.out.println("Hasil penjumlahan : "+hasil);
    }
}
