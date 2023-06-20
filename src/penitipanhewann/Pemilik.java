/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package penitipanhewann;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Muhamad Wisnu Mubaro
 */
public class Pemilik extends javax.swing.JFrame {
    private Connection con;
    private Statement stat;
    private ResultSet res;
    
    String ID_pemilik;
    String Nama;
    String Alamat;
    String No_Hp;
    String Email;
    String JK;
    /**
     * Creates new form Pemilik
     */
    public Pemilik() {
        initComponents();
        koneksi();
        kosongkan();
    }
     private void koneksi(){
    try {
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://127.0.0.1/penitipan_hewan","root","");
        stat = con.createStatement();
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
    }
}
     private void kosongkan(){
         id_pemilik.setText(" ");
         nama.setText(" ");;
         alamat.setText(" ");;
         no_hp.setText(" ");
         email.setText(" ");
         id_pemilik.requestFocus();
         
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        id_pemilik = new javax.swing.JTextField();
        nama = new javax.swing.JTextField();
        alamat = new javax.swing.JTextField();
        no_hp = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 255, 102));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Masukan Informasi Pemilik Hewan");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(90, 30, 330, 22);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Email");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(40, 320, 110, 17);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("ID Pemilik");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(40, 90, 110, 17);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Nama");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(40, 140, 110, 17);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Jenis Kelamin");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(40, 180, 110, 20);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("No Handphone");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(40, 280, 110, 17);

        email.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(email);
        email.setBounds(170, 320, 240, 30);

        id_pemilik.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(id_pemilik);
        id_pemilik.setBounds(170, 80, 240, 30);

        nama.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(nama);
        nama.setBounds(170, 130, 240, 30);

        alamat.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(alamat);
        alamat.setBounds(170, 220, 240, 30);

        no_hp.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(no_hp);
        no_hp.setBounds(170, 270, 240, 30);

        jButton1.setText("Simpan & Lanjutkan");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(240, 370, 170, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Alamat");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(40, 220, 110, 20);

        jCheckBox1.setText("Laki-laki");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox1);
        jCheckBox1.setBounds(170, 180, 90, 23);

        jCheckBox2.setText("Perempuan");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox2);
        jCheckBox2.setBounds(300, 180, 100, 23);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 503, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ID_pemilik = id_pemilik.getText();
        Nama = nama.getText();
        Alamat = alamat.getText();
        No_Hp = no_hp.getText();
        Email = email.getText();
        
        try{
            stat.executeUpdate("insert into pemilik_hewan (id_pemilik,nama_pemilik,alamat,no_hp,email,jenis_kelamin) values ("+"'"+ID_pemilik+"',"
                    + "'"+Nama+"',"
                    +"'"+Alamat+"',"
                    +"'"+No_Hp+"',"
                    +"'"+Email+"',"
                    +"'"+JK+"')");
            kosongkan();
            JOptionPane.showMessageDialog(null, "Berhasil Menyimpan Data");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "perintah salah"+e);
        }
        
        InputHewan hw = new InputHewan();
        hw.setVisible(true);
        hw.pack();
        hw.setDefaultCloseOperation(WIDTH);
        hw.setLocationRelativeTo(null);
        setVisible(false);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        jCheckBox2.setSelected(false);
        JK="Laki-laki";
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        jCheckBox1.setSelected(false);
        JK="Perempuan";
    }//GEN-LAST:event_jCheckBox2ActionPerformed

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
            java.util.logging.Logger.getLogger(Pemilik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pemilik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pemilik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pemilik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pemilik().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alamat;
    private javax.swing.JTextField email;
    private javax.swing.JTextField id_pemilik;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField no_hp;
    // End of variables declaration//GEN-END:variables
}
