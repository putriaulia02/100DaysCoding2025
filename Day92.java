package day92;

public class Main {
    
    public static void main(String[] args) {
        
        cekUmur(-17);
        cekUmur(18);
    }
    static void cekUmur(int umur){
        if (umur < 0){
            System.out.println("angka input tidak boleh negatif");
            return;
        }
        
        System.out.println("Umur anda adalah : " + umur + " tahun");
    }
    
}
