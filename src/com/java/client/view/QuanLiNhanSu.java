/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.client.view;

import com.java.client.controller.ThoatController;
import com.java.model.Chuyenmon;
import com.java.model.Nhanvien;
import com.java.model.Phongban;
import com.java.model.Tinh;
import com.java.model.TrinhDoNN;
import com.java.model.dao.NhanvienDAO;
import java.util.Map;
import java.util.SortedMap;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author macos
 */
public class QuanLiNhanSu extends javax.swing.JFrame {

    public static String username;
    public static QuanLiNhanSu obj = null;
    public static SortedMap<String, Nhanvien> danhSachNhanVien;
    public static Map<String, Chuyenmon> danhSachChuyenMon;
    public static Map<String, Phongban> danhSachPhongBan;
    public static Map<String, Tinh> Quequan;
    public static Map<String, TrinhDoNN> danhSachtrinhDoNN;

    public static QuanLiNhanSu getForm(String user) {
        if (obj == null) {
            obj = new QuanLiNhanSu(user);
        }
        return obj;
    }

    /**
     * Creates new form QuanLiNhanSu
     */
    private QuanLiNhanSu(String user) {
        initComponents();
        username = user;
        if (!username.equals("ADMIN")) {
            danhSachNhanVien.values().removeIf(x -> x.getMaNv().equals("ADMIN")); // Remove if none ADMIN
        }

        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        Bang = new javax.swing.JTable();
        BtnView = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        Thoat = new javax.swing.JButton();
        Menu = new javax.swing.JMenuBar();
        Action = new javax.swing.JMenu();
        DanhSachNv = new javax.swing.JMenuItem();
        KTKL = new javax.swing.JMenuItem();
        BangLuong = new javax.swing.JMenuItem();
        ThoatKhoiHeThong = new javax.swing.JMenuItem();
        trogiup = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Management System");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        Bang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        Bang.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                BangFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                BangFocusLost(evt);
            }
        });
        jScrollPane2.setViewportView(Bang);

        BtnView.setText("View");
        BtnView.setEnabled(false);
        BtnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnViewActionPerformed(evt);
            }
        });

        jButton2.setText("Add");
        jButton2.setEnabled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Edit");
        jButton3.setEnabled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Delete");
        jButton4.setEnabled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        Thoat.setText("Quit");
        Thoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThoatActionPerformed(evt);
            }
        });

        Action.setText("Action");

        DanhSachNv.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        DanhSachNv.setText("View Employee List");
        DanhSachNv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DanhSachNvActionPerformed(evt);
            }
        });
        Action.add(DanhSachNv);

        KTKL.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_K, java.awt.event.InputEvent.CTRL_MASK));
        KTKL.setText("View Reward and Discipline");
        KTKL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KTKLActionPerformed(evt);
            }
        });
        Action.add(KTKL);

        BangLuong.setText("View Salary List");
        Action.add(BangLuong);

        ThoatKhoiHeThong.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        ThoatKhoiHeThong.setText("Quit");
        ThoatKhoiHeThong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThoatKhoiHeThongActionPerformed(evt);
            }
        });
        Action.add(ThoatKhoiHeThong);

        Menu.add(Action);

        trogiup.setText("Help");
        Menu.add(trogiup);

        setJMenuBar(Menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtnView, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Thoat, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 712, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(BtnView)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(Thoat))
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void callUpdate() {
        this.DanhSachNvActionPerformed(null);
    }
    private void DanhSachNvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DanhSachNvActionPerformed
        DefaultTableModel model = new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "ID", "Name", "Address", "Mail", "Phone", "Position", "Dep No", "Edu", "Foregin Language"
                }
        ) {
            boolean[] canEdit = new boolean[]{
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        };
        if (model.getRowCount() != 0) {
            model.setRowCount(0);
        }

        danhSachNhanVien.values().forEach((nv) -> {
            model.addRow(new Object[]{nv.getMaNv(), nv.getTenNv(), nv.getDc(),
                nv.getEmail(), nv.getDienThoai(),
                danhSachPhongBan.get(nv.getMaPb()).getDanhSachChucVu().get(nv.getMaCv()).getTenCV(),
                danhSachPhongBan.get(nv.getMaPb()).getTenPB(),
                danhSachChuyenMon.get(nv.getMaCM()).getTDHV(nv.getMaTDHV()).getTenTDHV(),
                danhSachtrinhDoNN.get(nv.getMaTDNN()).getTenTDNN()});
        });
        Bang.setModel(model);
    }//GEN-LAST:event_DanhSachNvActionPerformed

    private void ThoatKhoiHeThongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThoatKhoiHeThongActionPerformed
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        int choose = JOptionPane.showConfirmDialog(rootPane, "Do you want quit?",
                "Confirmation", JOptionPane.YES_NO_OPTION);
        if (choose == 0) {
            this.dispose();
            DangNhap.callRun();
        }
    }//GEN-LAST:event_ThoatKhoiHeThongActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Nhap_Sua_TTNV.callrun();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void KTKLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KTKLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_KTKLActionPerformed

    private void ThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThoatActionPerformed
        ThoatController.Thoat(this);
    }//GEN-LAST:event_ThoatActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int row = Bang.getSelectedRow();
        int choose = JOptionPane.showConfirmDialog(rootPane, "Do you want delete: " + Bang.getValueAt(row, 2), "Confirm Dialog", JOptionPane.YES_NO_OPTION);
        if (choose == 0) {
            NhanvienDAO.deleteNhanVien(QuanLiNhanSu.danhSachNhanVien.get(Bang.getValueAt(row, 0)));
            danhSachNhanVien.remove(Bang.getValueAt(row, 0));
            ((DefaultTableModel) Bang.getModel()).removeRow(row);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void BtnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnViewActionPerformed
        // TODO add your handling code here:
        int row = Bang.getSelectedRow();
        ThongTinNhanVien.nv = QuanLiNhanSu.danhSachNhanVien.get(Bang.getValueAt(row, 0));
        if (ThongTinNhanVien.nv != null) {
            ThongTinNhanVien.callRun();
        }
        this.setVisible(false);
    }//GEN-LAST:event_BtnViewActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        obj = null;
        ThoatController.Thoat(this);
    }//GEN-LAST:event_formWindowClosing

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int row = Bang.getSelectedRow();
        Nhap_Sua_TTNV.callRun(QuanLiNhanSu.danhSachNhanVien.get(Bang.getValueAt(row, 0)));
    }//GEN-LAST:event_jButton3ActionPerformed

    private void BangFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BangFocusGained
        // TODO add your handling code here:
        BtnView.setEnabled(true);
        jButton2.setEnabled(true);
        jButton3.setEnabled(true);
        jButton4.setEnabled(true);
    }//GEN-LAST:event_BangFocusGained

    private void BangFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BangFocusLost
        // TODO add your handling code here:
        BtnView.setEnabled(false);
        jButton2.setEnabled(false);
        jButton3.setEnabled(false);
        jButton4.setEnabled(false);
    }//GEN-LAST:event_BangFocusLost

    public void callRun() {
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
            java.util.logging.Logger.getLogger(QuanLiNhanSu.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLiNhanSu.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLiNhanSu.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLiNhanSu.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                obj.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Action;
    private javax.swing.JTable Bang;
    private javax.swing.JMenuItem BangLuong;
    private javax.swing.JButton BtnView;
    private javax.swing.JMenuItem DanhSachNv;
    private javax.swing.JMenuItem KTKL;
    private javax.swing.JMenuBar Menu;
    private javax.swing.JButton Thoat;
    private javax.swing.JMenuItem ThoatKhoiHeThong;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenu trogiup;
    // End of variables declaration//GEN-END:variables
}
