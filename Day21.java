package day21;

public class Main {
    
    public static void main(String[] args) {
        //latihan: program untuk menukar nilai dua variabel
        //1. menukar tanpa variabel tambahan
        int a = 5;
        int b = 15;
        System.out.println("sebelum ditukar a: " + a + ", dan b: " + b);
        
        //menukar 
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("setelah ditukar a: " + a + ", dan b: " + b);
        
        //2. menukar dengan menambahkan 1 variabel
        int x = 6;
        int y = 12;
        System.out.println("sebelum ditukar x: " + x + ", dan y: " + y);
        
        //menukar
        int simpan = x;
        x = y;
        y = simpan;
        System.out.println("setelah ditukar x: " + x + ", dan y: " + y);
        
    }
    
}
