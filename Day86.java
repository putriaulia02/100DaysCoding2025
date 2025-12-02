package day86;

public class day86 {
    public static void main(String[] args) {
        int [] nilai = {12, 33, 85, 813, 1, 78, 94};
        
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nilai.length; i++) {
            System.out.print(i + " ");
            if (nilai[i] < min) {
                min = nilai[i];
            }
        }
        System.out.println("");
        System.out.println("Angka minimum : "+min);
    }
}
