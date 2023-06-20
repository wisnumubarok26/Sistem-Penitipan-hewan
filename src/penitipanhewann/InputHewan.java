/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package penitipanhewann;

import java.sql.*;
import java.sql.DriverManager;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import javax.swing.JOptionPane;

/**
 *
 * @author Muhamad Wisnu Mubaro
 */
public class InputHewan extends javax.swing.JFrame {
    private Connection con;
    private Statement stat;
    private ResultSet res;
    
    String idPemilik;
    Integer hari,bulan,tahun,harga,total;
    /**
     * Creates new form InputHewan
     */
    public InputHewan() {
        initComponents();
        koneksi();
        getIdPemilik();
        getTanggalSaatIni();
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
     private void getTanggalSaatIni(){
         LocalDate tanggalSaatIni = LocalDate.now();
         jTglNitip.setText(tanggalSaatIni.toString());
         
     }
     private void hitungHari(){
         // Tanggal saat ini
        LocalDate tanggalSaatIni = LocalDate.now();
        
        // mengambil tanggal penitipan
        hari = Integer.parseInt(jHari.getText());
        bulan = Integer.parseInt(jBulan.getText());
        tahun = Integer.parseInt(jTahun.getText());
        
        LocalDate tanggalTarget = LocalDate.of(tahun, bulan, hari);
        
        long sisaHari = ChronoUnit.DAYS.between(tanggalSaatIni, tanggalTarget);
         System.out.println(sisaHari);
         jTglNitip.setText(tanggalSaatIni.toString());
     }
     private void getIdPemilik(){
         try{ res=stat.executeQuery("select * from pemilik_hewan order by waktu desc limit 1");
            while (res.next()) {
            idPemilik = res.getString("id_pemilik");
            } 
        }catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
          }
         
         ID_PEMILIK.setText(idPemilik);
         System.out.println(idPemilik);
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTahun = new javax.swing.JTextField();
        PENITIPAN = new javax.swing.JTextField();
        ID_PEMILIK = new javax.swing.JTextField();
        HEWAN = new javax.swing.JTextField();
        jTglNitip = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jHari = new javax.swing.JTextField();
        jBulan = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 255, 102));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Masukan Data Penitipan");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(130, 30, 240, 17);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("ID Penitipan");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(40, 100, 90, 17);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("ID Pemilik");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(40, 150, 140, 17);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Nama Hewan");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(40, 200, 140, 17);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Tanggal Penitipan");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(40, 250, 140, 17);

        jTahun.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(jTahun);
        jTahun.setBounds(340, 290, 80, 30);

        PENITIPAN.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(PENITIPAN);
        PENITIPAN.setBounds(190, 90, 230, 30);

        ID_PEMILIK.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ID_PEMILIK.setEnabled(false);
        jPanel1.add(ID_PEMILIK);
        ID_PEMILIK.setBounds(190, 140, 230, 30);

        HEWAN.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(HEWAN);
        HEWAN.setBounds(190, 190, 230, 30);

        jTglNitip.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(jTglNitip);
        jTglNitip.setBounds(190, 240, 230, 30);

        jButton1.setText("Simpan");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(320, 400, 90, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Harga Paket / Hari");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(40, 350, 140, 17);

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Paket 1 - 35000", "Paket 2 - 45000", "Paket 3 - 55000" }));
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(190, 340, 230, 30);

        jHari.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(jHari);
        jHari.setBounds(190, 290, 30, 30);

        jBulan.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(jBulan);
        jBulan.setBounds(270, 290, 30, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Tanggal Kembali");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(40, 300, 140, 17);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel10.setText("/");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(320, 290, 40, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel11.setText("/");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(240, 287, 30, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        hitungHari();
        //Mendapatakan ID Pemilik
        try{ res=stat.executeQuery("select * from pemilik_hewan order by waktu desc limit 1");
            while (res.next()) {
            idPemilik = res.getString("id_pemilik");
            } 
        }catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
          }
        
        // mendapatkan tanggal penitipan sekarang 
        LocalDate tanggalSaatIni = LocalDate.now();
        
        // mengambil tanggal penitipan
        hari = Integer.parseInt(jHari.getText());
        bulan = Integer.parseInt(jBulan.getText());
        tahun = Integer.parseInt(jTahun.getText());
        
        LocalDate tanggalTarget = LocalDate.of(tahun, bulan, hari);
        
        long sisaHari = ChronoUnit.DAYS.between(tanggalSaatIni, tanggalTarget);
        
        // mendapatkan harga
        
        if(jComboBox1.getSelectedIndex()==0){
            harga = 35000;
        }else if(jComboBox1.getSelectedIndex()==1){
            harga = 45000;
        }else if (jComboBox1.getSelectedIndex()==2){
            harga = 55000;
        }
        
        long total = sisaHari * harga;
        try{
            stat.executeUpdate("insert into penitipan (ID_Penitipan,ID_Pemilik,Nama_Hewan,Tanggal_penitipan,Tanggal_kembali,Jumlah_Hari,Harga,Total) values ("+"'"+PENITIPAN.getText()+"',"
                    + "'"+idPemilik+"',"
                    +"'"+HEWAN.getText()+"',"
                    +"'"+tanggalSaatIni+"',"
                    +"'"+tanggalTarget+"',"
                    +"'"+sisaHari+"',"
                    +"'"+harga+"',"
                    +"'"+total+"')");
            JOptionPane.showMessageDialog(null, "Berhasil Menyimpan Data");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "perintah salah"+e);
        }
        
        Home hm = new Home();
        hm.setVisible(true);
        hm.pack();
        hm.setDefaultCloseOperation(WIDTH);
        hm.setLocationRelativeTo(null);
        setVisible(false);
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
            java.util.logging.Logger.getLogger(InputHewan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InputHewan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InputHewan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InputHewan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InputHewan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField HEWAN;
    private javax.swing.JTextField ID_PEMILIK;
    private javax.swing.JTextField PENITIPAN;
    private javax.swing.JTextField jBulan;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JTextField jHari;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTahun;
    private javax.swing.JTextField jTglNitip;
    // End of variables declaration//GEN-END:variables
}
