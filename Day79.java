package day79;

import java.util.Scanner;

public class day79 {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        while(true){
            System.out.print("Masukkan username : ");
            String user = p.nextLine();
            System.out.print("Masukkan password : ");
            String pass = p.nextLine();
            
            if(!user.equals("putriauliaa") && !pass.equals("p3627sf")){
                System.out.println("gagal login");
            }else if(user.equals("putriauliaa") && pass.equals("p3627sf")){
                System.out.println("berhasil login");
                break;
            }
        }
    }
}
