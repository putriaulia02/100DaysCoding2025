package day18;

public class Main {
    
    public static void main(String[] args) {
        //konversi otomatis(dari tipe data kecil ke besar)
        //byte ke int
        byte a = 18;
        long b = a;
        System.out.println("byte ke long : " + b);
        
        //int ke double
        int c = 44;
        double d = c;
        System.out.println("int ke double : " + d);   
    }
    
}
