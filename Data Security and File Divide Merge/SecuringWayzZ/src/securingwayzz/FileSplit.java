/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package securingwayzz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author The Shubham Singh
 */
public class FileSplit extends javax.swing.JFrame {

    /**
     * Creates new form FileSplit
     */
    public FileSplit() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(550, 220));
        setMinimumSize(new java.awt.Dimension(199, 149));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(199, 149));
        setResizable(false);
        setSize(new java.awt.Dimension(199, 149));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("    Choose File Division Method");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 190, 40);

        jButton1.setText("Partwise");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(0, 50, 200, 30);

        jButton2.setText("Sizewise");
        getContentPane().add(jButton2);
        jButton2.setBounds(0, 80, 200, 30);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 150, 300, 50);

        jButton3.setText("Go back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(60, 120, 80, 23);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new AppPage().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        // Choose Encrypted file
        File fin = null;
        String fnm=null;
        String nnm=null;
        JFileChooser fc=new JFileChooser();
        int rv=fc.showOpenDialog(fc);
        if (rv==JFileChooser.APPROVE_OPTION)
            {
                try
                    {
                    fin=fc.getSelectedFile();
                    fnm=(String)fin.getName();
                    System.out.println("File Name:  "+fnm);
                    }
                catch(Exception e)
                    {
                        System.out.println(e.getMessage());
                    }
            }
        //Enter number of parts
        String input = JOptionPane.showInputDialog(this,"Enter number of parts","1");
        int n=Integer.parseInt(input);
        System.out.println("Number of parts: "+n);
        //Count the number of lines in the file
        int nol=0;
        try
            {
            FileInputStream fis = new FileInputStream(fin);
            BufferedReader br = new BufferedReader(new InputStreamReader(fis));
            String line = null;
            while ((line = br.readLine()) != null) 
                {
                   nol++;
                }
            fis.close();
            br.close();
            }
        catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
        //Computing Lines per part
        int lpp=0;
        lpp=nol/(n-1);
        //Creating parts
        try
            {
                FileInputStream fis = new FileInputStream(fin);
                BufferedReader br = new BufferedReader(new InputStreamReader(fis));
                String line = null;
                //Extensionless file name
                int lastPeriodPos = fnm.lastIndexOf('_');
                nnm=fnm.substring(0, lastPeriodPos);
                System.out.println("Extensionless File Name: "+nnm);
                //Destination file
                File dir = new File(".");
                int fnum=1;
                int coun=1;
                String dest = dir.getCanonicalPath() + File.separator + nnm+"_P"+fnum+".txt";
                FileWriter fstream = new FileWriter(dest, true);
                BufferedWriter out = new BufferedWriter(fstream);
                line = br.readLine();
                out.write(line);
                coun++;
                line = br.readLine();
                while ((line) != null) 
                    {
                        if(coun<=lpp)
                            {
                                //line = br.readLine();
                                out.newLine();
                                out.write(line);
                                coun++;
                            }
                        else
                            {
                                out.close();
                                fnum++;
                                dest = dir.getCanonicalPath() + File.separator + nnm+"_P"+fnum+".txt";
                                fstream = new FileWriter(dest, true);
                                out = new BufferedWriter(fstream);
                                coun=1;
                                out.write(line);
                                coun++;
                            }
                        line = br.readLine();
                    }
                br.close();
                out.close();
            }
        catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
       JOptionPane.showMessageDialog(this, "File divided successfully");
       this.setVisible(false);
       new AppPage().setVisible(true);
       
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FileSplit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FileSplit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FileSplit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FileSplit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FileSplit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
