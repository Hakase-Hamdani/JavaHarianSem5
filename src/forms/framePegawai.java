/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package forms;
import dataBase.configdb_2110010302;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrator 10
 */
public class framePegawai extends javax.swing.JFrame {
    configdb_2110010302 obj;
    
    /**
     * Creates new form frameBahan
     */
    public void tampilDataPegawai(){
        String[] JudulKolom = {"kd_pegawai", "nama_pegawai", "kd_jabatan", "password_pegawai", "foto_pegawai"};
        int[] lebar = {100, 200, 200, 100, 200};
        String query = "SELECT * From tbl_pegawai";
        obj.JudulJTable(jTablePegawai, JudulKolom);
        obj.tampilTable(JudulKolom, query, jTablePegawai);
        obj.LebarJtable(jTablePegawai, lebar);
        lblJmlData.setText(String.valueOf(obj.jumlahRecord(query)));
    }
    public framePegawai() { //konstruktor
        initComponents();
        this.setLocationRelativeTo(null);
        obj = new configdb_2110010302();
        tampilDataPegawai();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtKd = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        txtKdJabatan = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTablePegawai = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        txtFt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        lblJmlData = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("kode pegawai");

        jLabel2.setText("nama pegawai");

        jLabel3.setText("kd_jabatan");

        jLabel4.setText("password");

        txtKd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKdActionPerformed(evt);
            }
        });

        jButton1.setText("SIMPAN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("UBAH");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("HAPUS");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTablePegawai.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        jTablePegawai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablePegawaiMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTablePegawai);

        jLabel5.setText("direktori foto");

        jLabel6.setText("CARI DATA:");

        lblJmlData.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblJmlData.setText("\"\"");

        jButton4.setText("CLEAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });

        jLabel7.setText("JUMLAH DATA:");

        jButton5.setText("REPORT");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(48, 48, 48)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel5))
                                    .addGap(40, 40, 40)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtKd, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                                        .addComponent(txtNama)
                                        .addComponent(txtKdJabatan)
                                        .addComponent(txtPassword)
                                        .addComponent(txtFt))
                                    .addGap(18, 18, 18)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jButton2)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jButton3))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addGap(6, 6, 6)
                                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(291, 291, 291)
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(lblJmlData))))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtKd, txtKdJabatan, txtNama, txtPassword});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtKd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtKdJabatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtFt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jButton2)
                            .addComponent(jButton1)
                            .addComponent(jButton3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton4)
                            .addComponent(jButton5))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblJmlData)
                    .addComponent(jLabel7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtKdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKdActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            String[] Fieldnya = {"kd_pegawai", "nama_pegawai", "kd_jabatan", "password_pegawai", "foto_pegawai"};
            String[] Isitabelnya = {txtKd.getText(), txtNama.getText(), txtKdJabatan.getText(), txtPassword.getText(), txtFt.getText()};
            String NamaTabel = "tbl_pegawai";
            if (txtKd.getText().isEmpty()){ //jika Id kosong, tampilkan pesan
                JOptionPane.showMessageDialog(this, "Kode Pegawai Belum Di isi!");
                txtKd.requestFocus();
            } else if(txtNama.getText().isEmpty()) { //jika Nama kosong, tampilkan pesan
                JOptionPane.showMessageDialog(this, "Nama Belum Di isi!");
                txtNama.requestFocus();
            } else if(txtKdJabatan.getText().isEmpty()){ //jika Kategori kosong, tampilkan pesan
                JOptionPane.showMessageDialog(this, "Kode Jabatan Belum Di isi!");
                txtKdJabatan.requestFocus();
            } else if(txtPassword.getText().isEmpty()){ //jika Jumlah kosong, tampilkan pesan
                JOptionPane.showMessageDialog(this, "Password Belum Di isi!");
                txtPassword.requestFocus();
            } else if(txtFt.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "Direktori Foto Belum Di isi!");
                txtFt.requestFocus();
            } else if(obj.duplikasiKey(NamaTabel, "kd_pegawai", txtKd.getText())){
                JOptionPane.showMessageDialog(this, "Kode Pegawai Sudah Terpakai!");
                try {
                    Statement stm = obj.getKoneksi().createStatement();
                    ResultSet rslt = stm.executeQuery("SELECT * FROM tbl_pegawai WHERE kd_pegawai = "+txtKd.getText());
                    rslt.next();
                    txtKd.setText(rslt.getString(2));
                    txtNama.setText(rslt.getString(3));
                    txtKdJabatan.setText(rslt.getString(4));
                    txtPassword.setText(rslt.getString(5));
                    txtFt.setText(rslt.getString(6));
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, e.toString());
                }
            } else {
                obj.simpanDBAuto(NamaTabel, Fieldnya, Isitabelnya);
                tampilDataPegawai();
                JOptionPane.showMessageDialog(this, "Data Berhasil Di Simpan!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.toString());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            if ((txtKd.getText().isEmpty()) && (txtNama.getText().isEmpty()) && (txtKdJabatan.getText().isEmpty()) && (txtPassword.getText().isEmpty()) && (txtFt.getText().isEmpty())) {
                JOptionPane.showMessageDialog(this, "Silahkan Pilih Data Terlebih Dahulu!");
                jTablePegawai.requestFocus();
            } else {
                String[] Fieldnya = {"nama_pegawai", "kd_jabatan", "password_pegawai", "foto_pegawai"};
                String[] Isitabelnya = {txtNama.getText(), txtKdJabatan.getText(), txtPassword.getText(), txtFt.getText()};
                String NamaTabel = "tbl_pegawai";
                String kd_pegawai = txtKd.getText();
                obj.UbahDBAuto(NamaTabel, "kd_pegawai", kd_pegawai, Fieldnya, Isitabelnya);
                tampilDataPegawai();
                JOptionPane.showMessageDialog(this, "Data Berhasil Di Ubah!");
            }
        } catch (Exception e) {
            System.err.println(e.toString());
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            if ((txtKd.getText().isEmpty()) && (txtNama.getText().isEmpty()) && (txtKdJabatan.getText().isEmpty()) && (txtPassword.getText().isEmpty()) && (txtFt.getText().isEmpty())) {
                JOptionPane.showMessageDialog(this, "Silahkan Pilih Data Terlebih Dahulu!");
                jTablePegawai.requestFocus();
            } else {
                String NamaTabel = "tbl_pegawai";
                String kd_pegawai = txtKd.getText();
                obj.HapusDBAuto(NamaTabel, "kd_pegawai", kd_pegawai);
                tampilDataPegawai();
                JOptionPane.showMessageDialog(this, "Data Berhasil Di Hapus!");
            }
        } catch (Exception e) {
        
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTablePegawaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePegawaiMouseClicked
        int i = jTablePegawai.getSelectedRow();
        String kd_pegawai = jTablePegawai.getValueAt(i, 0).toString();
        String nama_pegawai = jTablePegawai.getValueAt(i, 1).toString();
        String kd_jabatan = jTablePegawai.getValueAt(i, 2).toString();
        String password_pegawai = jTablePegawai.getValueAt(i, 3).toString();
        String foto_pegawai = jTablePegawai.getValueAt(i, 4).toString();
        
        txtKd.setText(kd_pegawai);
        txtNama.setText(nama_pegawai);
        txtKdJabatan.setText(kd_jabatan);
        txtPassword.setText(password_pegawai);
        txtFt.setText(foto_pegawai);
    }//GEN-LAST:event_jTablePegawaiMouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String clear = "";
        txtKd.setText(clear);
        txtNama.setText(clear);
        txtKdJabatan.setText(clear);
        txtPassword.setText(clear);
        txtFt.setText(clear);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        try {
            String cari = jTextField1.getText();
            String SQL = "SELECT * FROM tbl_pegawai WHERE kd_pegawai LIKE '%"+cari+"%' OR nama_pegawai LIKE '%"+cari+"%' OR kd_jabatan LIKE '%"+cari+"%'";
            
            String[] JudulKolom = {"kd_pegawai", "nama_pegawai", "kd_jabatan", "password_pegawai", "foto_pegawai"};
            int[] lebar = {100, 200, 200, 100, 200};
            obj.JudulJTable(jTablePegawai, JudulKolom);
            obj.tampilTable(JudulKolom, SQL, jTablePegawai);
            obj.LebarJtable(jTablePegawai, lebar);
        } catch (Exception e) {
            System.err.println(e.toString());
        }
    }//GEN-LAST:event_jTextField1KeyPressed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try {
            String cari = jTextField1.getText();
            String SQL = "SELECT * FROM tbl_pegawai WHERE kd_pegawai LIKE '%"+cari+"%' OR nama_pegawai LIKE '%"+cari+"%' OR kd_jabatan LIKE '%"+cari+"%'";
            obj.tampilLaporan("src/report/lapPegawai.jrxml", SQL);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.toString());
        }
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(framePegawai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(framePegawai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(framePegawai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(framePegawai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new framePegawai().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTablePegawai;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblJmlData;
    private javax.swing.JTextField txtFt;
    private javax.swing.JTextField txtKd;
    private javax.swing.JTextField txtKdJabatan;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtPassword;
    // End of variables declaration//GEN-END:variables
}
