/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class TugasScanner {
    public static void main(String[] args) {
        int beratbadan,tinggibadan,ukuransepatu,kodepos,norumah = 0;
        
        System.out.println("Berat Badan Anda Berapa ?");
        Scanner inputUser = new Scanner(System.in);
        beratbadan = Integer.parseInt(inputUser.nextLine());
        
        System.out.println("Tinggi Badan Anda Berapa ?");
        tinggibadan = Integer.parseInt(inputUser.nextLine());
         
        System.out.println("Ukuran Sepatu Anda Berapa ?");
        ukuransepatu= Integer.parseInt(inputUser.nextLine());
        
        System.out.println("Kode Pos Anda Berapa");
        kodepos = Integer.parseInt(inputUser.nextLine());
        
        System.out.println("No Rumah Anda Berapa");
        norumah = Integer.parseInt(inputUser.nextLine());
        
        System.out.println("Berat Badan Anda Adalah : "+beratbadan);
        System.out.println("Tinggi Badan Anda Adalah : "+tinggibadan);
        System.out.println("Ukuran Sepatu Anda Adalah : "+ukuransepatu);
        System.out.println("Kode Pos Anda Adalah : "+kodepos);
        System.out.println("No Rumah Anda Adalah : "+norumah);
    }
}
