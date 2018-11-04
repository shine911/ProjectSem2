/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.client.view;

import com.java.client.controller.DateController;
import com.java.config.LookConfig;
import com.java.model.Lilichcongtac;
import com.java.model.Nhanvien;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Windows 8
 */
public class NoiCongTac extends javax.swing.JFrame {

    private Nhanvien nv;
    public static NoiCongTac obj = null;

    /**
     * Creates new form NoiCongTac
     */
    public NoiCongTac(Nhanvien nv) {
        this.nv = nv;
        initComponents();
    }

    public DefaultTableModel createBangCongTac() {
        DefaultTableModel model = new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "Bussiness", "Address", "Date"
                }
        );
        if (nv.getDanhSachCongTac() != null) {
            ArrayList arrRow = new ArrayList();
            for (Lilichcongtac congtac : nv.getDanhSachCongTac()) {
                arrRow.add(congtac.getTenNoiCT());
                arrRow.add(congtac.getDC());
                arrRow.add(congtac.getThgian());

                model.addRow(arrRow.toArray());
                arrRow.clear();
            };
        }
        return model;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Title = new javax.swing.JLabel();
        addRow = new javax.swing.JButton();
        BackBtn = new javax.swing.JButton();
        NextBtn = new javax.swing.JButton();
        CancelBtn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Nhập thông tin nhân viên");
        setMaximumSize(new java.awt.Dimension(1024, 768));
        setResizable(false);

        Title.setText("Information on the work process");

        addRow.setText("Add row");
        addRow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addRowActionPerformed(evt);
            }
        });

        BackBtn.setText("Back");
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });

        NextBtn.setText("Next");
        NextBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextBtnActionPerformed(evt);
            }
        });

        CancelBtn.setText("Cancel");
        CancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelBtnActionPerformed(evt);
            }
        });

        table.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        table.setModel(this.createBangCongTac());
        jScrollPane1.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setResizable(false);
            table.getColumnModel().getColumn(1).setResizable(false);
            table.getColumnModel().getColumn(2).setResizable(false);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 35, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(BackBtn)
                        .addGap(6, 6, 6)
                        .addComponent(NextBtn)
                        .addGap(6, 6, 6)
                        .addComponent(CancelBtn)
                        .addGap(29, 29, 29)
                        .addComponent(addRow))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BackBtn)
                    .addComponent(NextBtn)
                    .addComponent(CancelBtn)
                    .addComponent(addRow)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelBtnActionPerformed
        int choose = JOptionPane.showConfirmDialog(rootPane, "Do you want to empty table?", "Question", JOptionPane.YES_NO_OPTION);
        if(choose == 0){
            this.nv.getDanhSachCongTac().clear();
            table.setModel(this.createBangCongTac());
        }
    }//GEN-LAST:event_CancelBtnActionPerformed

    private void NextBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextBtnActionPerformed
        List<Lilichcongtac> danhSach = new ArrayList<>();
        if (table.isEditing()) {
            table.getCellEditor().stopCellEditing();
        }
        if (table.getRowCount() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Empty table are not allowed", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            for (int row = 0; row < table.getRowCount(); row++) {
                Lilichcongtac obj = new Lilichcongtac();
                String TenNoiCT = table.getValueAt(row, 0).toString();
                String DC = table.getValueAt(row, 1).toString();
                String ThGian = table.getValueAt(row, 2).toString();
                obj.setTenNoiCT(TenNoiCT);
                obj.setDC(DC);
                obj.setThgian(ThGian);
                danhSach.add(obj);
            }
            nv.setDanhSachCongTac(danhSach);
            System.out.println(nv.getDanhSachCongTac().get(0).getTenNoiCT());
            this.setVisible(false);
            ThongTinNhanThan.callRun(nv);
        }
    }//GEN-LAST:event_NextBtnActionPerformed

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        this.dispose();
        Nhap_Sua_TTNV.obj.setVisible(true);
    }//GEN-LAST:event_BackBtnActionPerformed

    private void addRowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addRowActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) this.table.getModel();
        model.addRow(new Object[]{"", "", "", ""});
    }//GEN-LAST:event_addRowActionPerformed

    /**
     * @param nv
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
                if (LookConfig.LookAndFeel.equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NoiCongTac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NoiCongTac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NoiCongTac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NoiCongTac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                obj = new NoiCongTac(nv);
                obj.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn;
    private javax.swing.JButton CancelBtn;
    private javax.swing.JButton NextBtn;
    private javax.swing.JLabel Title;
    private javax.swing.JButton addRow;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
