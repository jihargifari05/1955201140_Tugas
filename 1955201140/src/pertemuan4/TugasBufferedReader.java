/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author hp
 */
public class TugasBufferedReader {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        String nama,alamat,agama = "";
        int umur;
        double ipk;
        
        InputStreamReader isr = new InputStreamReader(System.in);
        
        BufferedReader br = new BufferedReader(isr);
        
        System.out.println("Siapa Nama Anda ?");
          nama = br.readLine();
        
        System.out.println("Dimana Alamat Anda ?");
          alamat = br.readLine();
          
        System.out.println("Berapa Umur Anda ?");
          umur = Integer.parseInt(br.readLine());
          
        System.out.println("Apa Agama Anda ?");
          agama = br.readLine();
          
        System.out.println("Berapa IPK Anda ?");
          ipk = Double.parseDouble(br.readLine());
          
          
        System.out.println("Nama Anda Adalah : "+ nama);
        System.out.println("Alamat Anda Adalah : "+ alamat);
        System.out.println("umur Anda Adalah : "+ umur);
        System.out.println("agama Anda Adalah : "+ agama);
        System.out.println("Ipk Anda Adalah : "+ ipk);
    }
    
}
