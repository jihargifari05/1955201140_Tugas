/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan10;

import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class TugasArrayMultiDimensiBentukString {
    public static void main(String[] args) {
        String transportasi[][] = {{"01","PESAWAT"},{"02","KERETA API"},{"03","BUS"}};
        for (int i = 0; i < transportasi.length; i++){
            for (int j = 0; j < transportasi[0].length; j++){
                System.out.print(transportasi[i][j]+" ");
            }
            System.out.println();
        }
        
        String cari = JOptionPane.showInputDialog(null, "Cari Transportasi berdasarkan nomor :");
        for (int i = 0; i < transportasi.length; i++){
            for (int j = 0; j < transportasi[0].length; j++){
                if (transportasi[i][j].equals(cari)) {
                    JOptionPane.showConfirmDialog(null, "Transportasi dengan nomor " + cari + " di temukan berjenis " + transportasi[i][j+1]);
                }
                System.out.print(transportasi[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}
