package day26;

public class Main {
    
    public static void main(String[] args) {
        int a = 8;
        int b = 2;
        System.out.println("Penambahan : " + (a += b));
        System.out.println("Pengurangan : " + (a -= b));
        System.out.println("perkalian : " + (a *= b));
        System.out.println("pembagian : " + (a /= b));
        System.out.println("sisa bagi : " + (a %= b));
        System.out.println("a + b: " + (a = b));
    }
}
