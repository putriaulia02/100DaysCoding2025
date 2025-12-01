package day85;

public class day85 {
    public static void main(String[] args) {
        int [] nilai = {32, 43, 75, 89, 230, 98, 194};
        
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nilai.length; i++) {
            System.out.print(i + " ");
            if (nilai[i] > max) {
                max = nilai[i];
            }
        }
        System.out.println("");
        System.out.println("Angka maksimal : "+max);
    }
}
