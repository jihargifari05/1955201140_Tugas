/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan8;

import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class contohException {
    public static void main(String[] args) {
        
        // contoh Exception Handling menggunakan try-catch
        try{
        int a= 10;
        int b = 0;
        
        int c = 10/0;
        System.out.println(c);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Terjadi Erorr karena " + e);
        }
    }
 
}
