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
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.MessageDigest;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Calendar;
import java.util.List;
import javax.crypto.*;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author The Shubham Singh
 */
public class AppPage extends javax.swing.JFrame {
        static Cipher cipher;
    /**
     * Creates new form AppPage
     */
    public AppPage() {
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

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SecuringWayzZ");
        setLocation(new java.awt.Point(430, 120));
        setResizable(false);
        setSize(new java.awt.Dimension(400, 300));

        jButton1.setText("Quit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Generate Key");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Encrypt");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Merge File Parts");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Decrypt");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Check Integrity");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jButton3)
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addGap(18, 18, 18)
                .addComponent(jButton5)
                .addGap(18, 18, 18)
                .addComponent(jButton6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        //Key Generation Using AES Algorithm
        try
            {
                KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
                keyGenerator.init(128);
                SecretKey secretKey = keyGenerator.generateKey();
                System.out.println("Key as object: "+secretKey);
                //Providing Key to user as String
                Base64.Encoder obj=Base64.getEncoder().withoutPadding();
                String encodedKey = obj.encodeToString(secretKey.getEncoded());
                System.out.println("Key as String: "+encodedKey);
                //Converting back to object key for checking purpose
                byte[] decodedKey = Base64.getDecoder().decode(encodedKey);
                SecretKey originalKey = new SecretKeySpec(decodedKey, 0, decodedKey.length, "AES");
                System.out.println("Key as object: "+originalKey);
                JOptionPane.showMessageDialog(this, "Generated Key: "+encodedKey+"\nKeep the key with you during Encrypton/Decryption process");
                }
        catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
    }//GEN-LAST:event_jButton2ActionPerformed
public static String encrypt(String plainText, SecretKey secretKey)
			throws Exception {
		byte[] plainTextByte = plainText.getBytes();
		cipher.init(Cipher.ENCRYPT_MODE, secretKey);
		byte[] encryptedByte = cipher.doFinal(plainTextByte);
		Base64.Encoder encoder = Base64.getEncoder();
		String encryptedText = encoder.encodeToString(encryptedByte);
		return encryptedText;
	}
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
            // Choose the desired Textfile
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
                            System.out.println("File name with extension: "+fnm);
                        }
                    catch(Exception e)
                        {
                           System.out.println(e.getMessage());
                        }
                }
            int lastPeriodPos = fnm.lastIndexOf('.');
            nnm=fnm.substring(0, lastPeriodPos);
            System.out.println("Extensionless File name: "+nnm);
            
         //check encryption time
         long startTime = System.nanoTime();
            //Encryption of files using AES
            try
                {
                    String encodedKey=JOptionPane.showInputDialog("Enter secretkey ");
                    //Converting back to object key for checking purpose
                    byte[] decodedKey = Base64.getDecoder().decode(encodedKey);
                    SecretKey secretKey = new SecretKeySpec(decodedKey, 0, decodedKey.length, "AES");
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
                            System.out.println("NOL: "+nol);
                            fis.close();
                            br.close();
                        }
                    catch(Exception e)
                        {
                            System.out.println(e.getMessage());
                        }

                    
                    FileInputStream fis = new FileInputStream(fin);
                    BufferedReader br = new BufferedReader(new InputStreamReader(fis));
                    String line = null;
                    File dir = new File(".");
                    String dest = dir.getCanonicalPath() + File.separator + nnm+"_E.txt";
                    FileWriter fstream = new FileWriter(dest, true);
                    BufferedWriter out = new BufferedWriter(fstream);
                    cipher = Cipher.getInstance("AES");
                    int t=0;
                    while ((line = br.readLine()) != null) 
                        {
                            System.out.println(line);
                            String encryptedText = encrypt(line, secretKey);
                            System.out.println(encryptedText);
                            out.write(encryptedText);
                            if(t<(nol-1))
                            {
                                out.newLine();
                                
                            }
                            t++;
                        }
                    br.close();
                    out.close();
                    
                    //print exect time
                    long endTime = System.nanoTime();
                        System.out.println("Took "+(endTime - startTime) + " ns"); 
                        System.out.println((endTime - startTime)/1000000000+" sec");
                    
                    //Database entry of MD5 value
               /*     String dbval=null;
                    try
                {
                    //"C:\\Users\\The Shubham Singh\\Documents\\NetBeansProjects\\SecuringWayzZ\\"+ nnm+"_E.txt"
                    MessageDigest md = MessageDigest.getInstance("MD5");
                    File finn = new File("C:\\Users\\The Shubham Singh\\Documents\\NetBeansProjects\\SecuringWayzZ\\"+ nnm+"_E.txt");
                    FileInputStream fiss = new FileInputStream(finn);
                    byte[] dataBytes = new byte[1024];
                    int nread = 0;
                    while ((nread = fiss.read(dataBytes)) != -1) {
                    md.update(dataBytes, 0, nread);
                    };
                    byte[] mdbytes = md.digest();
                    StringBuffer sb = new StringBuffer();
                    for (int i = 0; i < mdbytes.length; i++) {
                    sb.append(Integer.toString((mdbytes[i] & 0xff) + 0x100, 16).substring(1));
                    }
                    System.out.println("Encryption Function Value " + sb.toString());
                    dbval=sb.toString();
             
                    }
            catch(Exception e)
                        {
                           System.out.println(e.getMessage());
                        }
                    //Databse Insertion Of Encryption Function Value
                    try
                         {
                         
                            System.out.println("Check 1");
                            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                            Connection con=DriverManager.getConnection("jdbc:odbc:db");
                            System.out.println("Check 2");
                            String query="insert into mdtab values(?,?)";
                            PreparedStatement st=con.prepareStatement(query);
                            st.setString(1,nnm+"_E.txt");
                            st.setString(2,dbval);
                            System.out.println("Check 3");
                            st.executeUpdate();
                         }
                         catch(Exception e){System.out.println(e.getMessage());}

                    
            */        JOptionPane.showMessageDialog(this, "File Encrypted successfully");
                }
            catch(Exception e)
                {
                    System.out.println(e.getMessage());
                }
            //File split
            int a = JOptionPane.showConfirmDialog(this, "Do you want to divide the selected file in parts?", "SecuringWayzZ",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (a == JOptionPane.CLOSED_OPTION)
                {
                    System.out.println("File division cancelled");
                }
            else if (a == JOptionPane.YES_OPTION)
                {
                   // this.setVisible(false);
                   // new FileSplit().setVisible(true);
                    split_file();
                }
            
 
    }//GEN-LAST:event_jButton3ActionPerformed

    private void split_file()
        {
            JOptionPane.showMessageDialog(this, "Choose the encrypted file..");
           //Part size
            byte PART_SIZE = 5;
            //File selection
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
            //Extensionless file name
            int lastPeriodPos = fnm.lastIndexOf('_');
            nnm=fnm.substring(0, lastPeriodPos);
            System.out.println("Extensionless File Name: "+nnm);
            String FILE_NAME=fnm;
            File inputFile = new File(FILE_NAME);
	    FileInputStream inputStream;
	    String newFileName;
	    FileOutputStream filePart;
            int fnum=1;
	    int fileSize = (int) inputFile.length();
	    int nChunks = 0, read = 0, readLength = PART_SIZE;
	    byte[] byteChunkPart;
	    try 
                {
	        inputStream = new FileInputStream(inputFile);
	        while (fileSize > 0) 
                    {
	                if (fileSize <= 5)
                            {
	                    readLength = fileSize;
                            }
	                byteChunkPart = new byte[readLength];
	                read = inputStream.read(byteChunkPart, 0, readLength);
	                fileSize -= read;
	                assert (read == byteChunkPart.length);
	                nChunks++;
	                newFileName = nnm + "_P" + fnum+".txt";//Integer.toString(nChunks - 1);
	                fnum++;
                        filePart = new FileOutputStream(new File(newFileName));
	                filePart.write(byteChunkPart);
                        filePart.flush();
	                filePart.close();
	                byteChunkPart = null;
	                filePart = null;
	            }
	        inputStream.close();
	        }
            catch (IOException exception) {   }
            JOptionPane.showMessageDialog(this, "File Divided into "+(fnum-1)+" parts successfully. Keep the count with you while merging the file..");
            
    }
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        String FILE_NAME = JOptionPane.showInputDialog("Enter File Name");
        String FILE_PART = JOptionPane.showInputDialog("Enter number of parts","1");
        int n=Integer.parseInt(FILE_PART);
        File ofile = new File(FILE_NAME+"_M"+".txt");
	FileOutputStream fos;
	FileInputStream fis;
	byte[] fileBytes;
	int bytesRead = 0;
	List<File> list = new ArrayList<File>();
	for (int i=1;i<=n;i++)
            {
                list.add(new File(FILE_NAME+"_P"+i+".txt"));
            }
        //Computing line numbers
        int kl=0;
	try 
            {
            fos = new FileOutputStream(ofile,true);
            //Merging code
            for (File file : list) 
                {
	        fis = new FileInputStream(file);
	        fileBytes = new byte[(int) file.length()];
	        bytesRead = fis.read(fileBytes, 0,(int)  file.length());
	        assert(bytesRead == fileBytes.length);
	        assert(bytesRead == (int) file.length());
	        fos.write(fileBytes);
            //    if(kl<(n-1))
              //      {
                //        System.out.println("kl: "+kl);
                  //      fos.write(System.getProperty("line.separator").getBytes());
                  //  }
                kl++;
	        fos.flush();
	        fileBytes = null;
	        fis.close();
	        fis = null;
	        }
	    fos.close();
	    fos = null;
	    }
        catch (Exception exception)
            {
	       exception.printStackTrace();
            }   
          JOptionPane.showMessageDialog(this, "File Merged successfully");
    }//GEN-LAST:event_jButton4ActionPerformed
	public static String decrypt(String encryptedText, SecretKey secretKey)
			throws Exception {
		Base64.Decoder decoder = Base64.getDecoder();
		byte[] encryptedTextByte = decoder.decode(encryptedText);
		cipher.init(Cipher.DECRYPT_MODE, secretKey);
		byte[] decryptedByte = cipher.doFinal(encryptedTextByte);
		String decryptedText = new String(decryptedByte);
		return decryptedText;
	}

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
            // Choose the desired Textfile
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
                            System.out.println("File name with extension: "+fnm);
                        }
                    catch(Exception e)
                        {
                           System.out.println(e.getMessage());
                        }
                }
            int lastPeriodPos = fnm.lastIndexOf('_');
            nnm=fnm.substring(0, lastPeriodPos);
            System.out.println("Extensionless File name: "+nnm);
            //Decryption of files using AES
            try
                {
                    String encodedKey=JOptionPane.showInputDialog("Enter secretkey ");
                    //Converting key to object key
                    byte[] decodedKey = Base64.getDecoder().decode(encodedKey);
                    SecretKey secretKey = new SecretKeySpec(decodedKey, 0, decodedKey.length, "AES");
                    //Counting the number of lines
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
                            System.out.println("NOL: "+nol);
                            fis.close();
                            br.close();
                        }
                    catch(Exception e)
                        {
                            System.out.println(e.getMessage());
                        }
                        
                    FileInputStream fis = new FileInputStream(fin);
                    BufferedReader br = new BufferedReader(new InputStreamReader(fis));
                    String line = null;
                    File dir = new File(".");
                    String dest = dir.getCanonicalPath() + File.separator + nnm+"_D.txt";
                    FileWriter fstream = new FileWriter(dest, true);
                    BufferedWriter out = new BufferedWriter(fstream);
                    cipher = Cipher.getInstance("AES");
                    int t=0;
                    while ((line = br.readLine()) != null) 
                        {
                            System.out.println(line);
                            String decryptedText = decrypt(line, secretKey);
                            System.out.println(decryptedText);
                            out.write(decryptedText);
                            if(t<(nol-1))
                            {
                                out.newLine();
                            }
                            t++;
                        }
                    br.close();
                    out.close();
                    JOptionPane.showMessageDialog(this, "File Decrypted successfully");
                }
            catch(Exception e)
                {
                    System.out.println(e.getMessage());
                }
        
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
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
                        }
                    catch(Exception e)
                        {
                           System.out.println(e.getMessage());
                        }
                }
            try
                {
                    MessageDigest md = MessageDigest.getInstance("MD5");
                    FileInputStream fis = new FileInputStream(fin);
                    byte[] dataBytes = new byte[1024];
                    int nread = 0;
                    while ((nread = fis.read(dataBytes)) != -1) {
                    md.update(dataBytes, 0, nread);
                    };
                    byte[] mdbytes = md.digest();
                    StringBuffer sb = new StringBuffer();
                    for (int i = 0; i < mdbytes.length; i++) {
                    sb.append(Integer.toString((mdbytes[i] & 0xff) + 0x100, 16).substring(1));
                    }
                    System.out.println("Digest(in hex format):: " + sb.toString());
                }
            catch(Exception e)
                        {
                           System.out.println(e.getMessage());
                        }
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(AppPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AppPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
