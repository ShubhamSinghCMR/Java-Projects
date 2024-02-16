/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package securingwayzz;

import javax.swing.JOptionPane;

/**
 *
 * @author The Shubham Singh
 */
public class SecuringWayzZ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        Loading l1=new Loading();
        l1.setVisible(true);
        Thread.sleep(1900);
        l1.setVisible(false);
        new AppPage().setVisible(true);
        JOptionPane.showMessageDialog(null, "Generate Key before encryption if you dont have one");
    }
    
}
