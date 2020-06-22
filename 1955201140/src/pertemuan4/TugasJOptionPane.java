/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4;

import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class TugasJOptionPane {
    public static void main(String[] args) {
        
        String kuliah = JOptionPane.showInputDialog("dimana anda kuliah?");
        System.out.println("anda kuliah di : " + kuliah);
        
        String nim = JOptionPane.showInputDialog("Berapa No NIM Anda?");
        System.out.println("NIM Anda Adalah : " + nim);
        
        String prodi = JOptionPane.showInputDialog("Apa Prodi Anda?");
        System.out.println("Prodi Anda Adalah : "+prodi);
        
        String ipk = JOptionPane.showInputDialog("Berapa Ipk Anda?");
        System.out.println("Ipk Anda Adalah : "+ipk);
        
        String lulus = JOptionPane.showInputDialog("Anda Lulus Tahun Berapa?");
        System.out.println("Anda Lulus Tahun : "+lulus);
        
    }   
}
