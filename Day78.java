package day78;

public class Main {
    
    public static void main(String[] args) {
        String kalimat = "SAYA INGIN SUKSES";
        System.out.println(kalimat);
        
        System.out.println("==Hasil pemeriksaan==");
        
        //equals()
        System.out.println(kalimat.equals("saya ingin sukses"));
        
        //equalsIgnoreCase()
        System.out.println(kalimat.equalsIgnoreCase("SAya INGin SukSEs"));
        
        //contains()
        System.out.println(kalimat.contains("sangat"));
        
        //substring()
        System.out.println(kalimat.substring(1, 3));
        
        //isEmpty()
        System.out.println(kalimat.isEmpty());
        
        //replace()
        System.out.println(kalimat.replace("SUKSES", "KAYA"));
        
        //trim()
        System.out.println(kalimat.trim());
    
    }
    
}
