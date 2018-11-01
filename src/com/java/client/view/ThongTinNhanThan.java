/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.client.view;

import com.java.client.controller.DateController;
import com.java.model.Nhanvien;
import com.java.model.ThanNhan;
import com.java.model.dao.LiLichCongTacDAO;
import com.java.model.dao.NhanvienDAO;
import com.java.model.dao.ThanNhanDAO;
import java.awt.Component;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JTextField;

/**
 *
 * @author Windows 8
 */
public class ThongTinNhanThan extends javax.swing.JFrame {

    private Nhanvien nv;
    private Map<String, ThanNhan> danhSachThanNhan = new HashMap<>();

    /**
     * Creates new form ThongTinNhanThan
     */
    public ThongTinNhanThan(Nhanvien nv) {
        initComponents();
        this.nv = nv;
        if (nv.getDanhSachThanNhan() != null) {
            this.danhSachThanNhan = nv.getDanhSachThanNhan();
            this.addThanNhanInfo("Father", this.danhSachThanNhan.get("Father").getTenTN(), this.txtten1);
            this.addThanNhanInfo("Father", this.danhSachThanNhan.get("Father").getDC(), this.txtdiachi1);
            this.addThanNhanInfo("Father", this.danhSachThanNhan.get("Father").getNgSinh(), this.txtngaysinh1);
            this.addThanNhanInfo("Mother", this.danhSachThanNhan.get("Mother").getTenTN(), this.txtten2);
            this.addThanNhanInfo("Mother", this.danhSachThanNhan.get("Mother").getDC(), this.txtdiachi2);
            this.addThanNhanInfo("Mother", this.danhSachThanNhan.get("Mother").getNgSinh(), this.txtngaysinh2);
            String key = "Wife";
            if(!this.danhSachThanNhan.containsKey(key)){
                key = "Husband";
                if(!this.danhSachThanNhan.containsKey(key)){
                    key = "None";
                }
            }
            if(!key.equals("None")){
                this.addThanNhanInfo(key, this.danhSachThanNhan.get(key).getTenTN(), txtten3);
                this.addThanNhanInfo(key, this.danhSachThanNhan.get(key).getDC(), txtdiachi3);
                this.addThanNhanInfo(key, this.danhSachThanNhan.get(key).getNgSinh(), txtngaysinh3);
            }
        }
    }

    private void addThanNhanInfo(String QuanHe, String str, JTextField tf) {
        tf.setText(str);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtten1 = new javax.swing.JTextField();
        txtdiachi1 = new javax.swing.JTextField();
        txtngaysinh1 = new javax.swing.JTextField();
        txtten2 = new javax.swing.JTextField();
        txtdiachi2 = new javax.swing.JTextField();
        txtngaysinh2 = new javax.swing.JTextField();
        txtten3 = new javax.swing.JTextField();
        txtdiachi3 = new javax.swing.JTextField();
        txtngaysinh3 = new javax.swing.JTextField();
        txtquanhenhanthan = new javax.swing.JComboBox<>();
        btback = new javax.swing.JButton();
        btfinish = new javax.swing.JButton();
        btcancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Enter the employee's personal information");

        jLabel1.setText("Father's full name:");

        jLabel2.setText("Address:");

        jLabel3.setText("Birthday (dd/mmm/yy):");

        jLabel4.setText("Mother's full name:");

        jLabel5.setText("Address:");

        jLabel6.setText("Birthday (dd/mmm/yy):");

        jLabel7.setText("Wife/Husband full name:");

        jLabel8.setText("Address:");

        jLabel9.setText("Birthday (dd/mmm/yy):");

        jLabel10.setText("Relations with employees:");

        txtten1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtten1FocusLost(evt);
            }
        });

        txtdiachi1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtdiachi1FocusLost(evt);
            }
        });

        txtngaysinh1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtngaysinh1FocusLost(evt);
            }
        });

        txtten2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtten2FocusLost(evt);
            }
        });

        txtdiachi2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtdiachi2FocusLost(evt);
            }
        });

        txtngaysinh2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtngaysinh2FocusLost(evt);
            }
        });

        txtten3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtten3FocusLost(evt);
            }
        });

        txtdiachi3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtdiachi3FocusLost(evt);
            }
        });

        txtngaysinh3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtngaysinh3FocusLost(evt);
            }
        });

        txtquanhenhanthan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Wife", "Husband", "None" }));
        txtquanhenhanthan.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                txtquanhenhanthanItemStateChanged(evt);
            }
        });
        txtquanhenhanthan.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtquanhenhanthanFocusLost(evt);
            }
        });

        btback.setText("Back");
        btback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbackActionPerformed(evt);
            }
        });

        btfinish.setText("Finish");
        btfinish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btfinishActionPerformed(evt);
            }
        });

        btcancel.setText("Cancel");
        btcancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtdiachi1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtten1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtten2, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtdiachi2, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtten3, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtdiachi3, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtngaysinh1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtngaysinh2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtngaysinh3, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtquanhenhanthan, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btback)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btfinish)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btcancel)))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtten1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtdiachi1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtngaysinh1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtten2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtdiachi2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtngaysinh2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtten3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtdiachi3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtngaysinh3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtquanhenhanthan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btback)
                    .addComponent(btfinish)
                    .addComponent(btcancel))
                .addContainerGap(79, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btcancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcancelActionPerformed

    }//GEN-LAST:event_btcancelActionPerformed

    private void btbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbackActionPerformed
        NoiCongTac.obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btbackActionPerformed

    private void btfinishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btfinishActionPerformed
        // TODO add your handling code here:
        this.setTenTN("Father", this.txtten1.getText());
        this.setDcTN("Father", this.txtdiachi1.getText());
        this.setNgSinhTN("Father", this.txtngaysinh1.getText());
        this.setTenTN("Mother", this.txtten2.getText());
        this.setDcTN("Mother", this.txtdiachi2.getText());
        this.setNgSinhTN("Mother", this.txtngaysinh2.getText());
        if (this.txtten3.isEnabled()) {
            String quanhe = this.txtquanhenhanthan.getSelectedItem().toString();
            this.setTenTN(quanhe, this.txtten3.getText());
            this.setDcTN(quanhe, this.txtdiachi3.getText());
            this.setNgSinhTN(quanhe, this.txtngaysinh3.getText());
        }

        nv.setDanhSachThanNhan(danhSachThanNhan);
        if (QuanLiNhanSu.danhSachNhanVien.containsKey(nv.getMaNv())) {
            NhanvienDAO.updateNhanVien(nv);
        } else {
            NhanvienDAO.createNhanVien(nv);
        }
        QuanLiNhanSu.danhSachNhanVien.put(nv.getMaNv(), nv);
        this.dispose();
    }//GEN-LAST:event_btfinishActionPerformed
    private void setTenTN(String QuanHe, String Ten) {
        ThanNhan obj;
        if (!danhSachThanNhan.containsKey(QuanHe)) {
            obj = new ThanNhan();
        } else {
            obj = danhSachThanNhan.get(QuanHe);
        }
        obj.setMaNV(nv.getMaNv());
        obj.setTenTN(Ten);
        obj.setQuanHe(QuanHe);
        this.danhSachThanNhan.put(obj.getQuanHe(), obj);
    }

    private void setDcTN(String QuanHe, String DC) {
        ThanNhan obj;
        if (!danhSachThanNhan.containsKey(QuanHe)) {
            obj = new ThanNhan();
        } else {
            obj = danhSachThanNhan.get(QuanHe);
        }
        obj.setMaNV(nv.getMaNv());
        obj.setDC(DC);
        obj.setQuanHe(QuanHe);
        this.danhSachThanNhan.put(obj.getQuanHe(), obj);
    }

    private void setNgSinhTN(String QuanHe, String NgSinh) {
        ThanNhan obj;
        if (!danhSachThanNhan.containsKey(QuanHe)) {
            obj = new ThanNhan();
        } else {
            obj = danhSachThanNhan.get(QuanHe);
        }
        obj.setMaNV(nv.getMaNv());
        obj.setNgSinh(DateController.parseStringtoLocalDate(NgSinh));
        obj.setQuanHe(QuanHe);
        this.danhSachThanNhan.put(obj.getQuanHe(), obj);
    }
    private void txtten1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtten1FocusLost
    }//GEN-LAST:event_txtten1FocusLost

    private void txtdiachi1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtdiachi1FocusLost
    }//GEN-LAST:event_txtdiachi1FocusLost

    private void txtngaysinh1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtngaysinh1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtngaysinh1FocusLost

    private void txtten2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtten2FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtten2FocusLost

    private void txtdiachi2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtdiachi2FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdiachi2FocusLost

    private void txtngaysinh2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtngaysinh2FocusLost
    }//GEN-LAST:event_txtngaysinh2FocusLost

    private void txtten3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtten3FocusLost

    }//GEN-LAST:event_txtten3FocusLost

    private void txtdiachi3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtdiachi3FocusLost
        // TODO add your handling code here:

    }//GEN-LAST:event_txtdiachi3FocusLost

    private void txtngaysinh3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtngaysinh3FocusLost

    }//GEN-LAST:event_txtngaysinh3FocusLost

    private void txtquanhenhanthanItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_txtquanhenhanthanItemStateChanged
        // TODO add your handling code here:
        String value = this.txtquanhenhanthan.getSelectedItem().toString();
        if (value.equals("Husband")) {
            //Check disabled fields
            if (!this.txtten3.isEnabled()) {
                this.txtten3.setEnabled(true);
                this.txtngaysinh3.setEnabled(true);
                this.txtdiachi3.setEnabled(true);
            }
        } else if (value.equals("Wife")) {
            //Check disabled fields
            if (!this.txtten3.isEnabled()) {
                this.txtten3.setEnabled(true);
                this.txtngaysinh3.setEnabled(true);
                this.txtdiachi3.setEnabled(true);
            }
        } else if (value.equals("None")) {
            this.txtten3.setEnabled(false);
            this.txtngaysinh3.setEnabled(false);
            this.txtdiachi3.setEnabled(false);
            if(this.danhSachThanNhan.containsKey("Husband"))
            {
                this.danhSachThanNhan.remove("Husband");
            }
            if(this.danhSachThanNhan.containsKey("Wife"))
            {
                this.danhSachThanNhan.remove("Wife");
            }
        }
    }//GEN-LAST:event_txtquanhenhanthanItemStateChanged

    private void txtquanhenhanthanFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtquanhenhanthanFocusLost

    }//GEN-LAST:event_txtquanhenhanthanFocusLost

    /**
     * @param args the command line arguments
     */
    public static void callRun(Nhanvien nv) {
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
            java.util.logging.Logger.getLogger(ThongTinNhanThan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThongTinNhanThan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThongTinNhanThan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThongTinNhanThan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThongTinNhanThan(nv).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btback;
    private javax.swing.JButton btcancel;
    private javax.swing.JButton btfinish;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtdiachi1;
    private javax.swing.JTextField txtdiachi2;
    private javax.swing.JTextField txtdiachi3;
    private javax.swing.JTextField txtngaysinh1;
    private javax.swing.JTextField txtngaysinh2;
    private javax.swing.JTextField txtngaysinh3;
    private javax.swing.JComboBox<String> txtquanhenhanthan;
    private javax.swing.JTextField txtten1;
    private javax.swing.JTextField txtten2;
    private javax.swing.JTextField txtten3;
    // End of variables declaration//GEN-END:variables
}
