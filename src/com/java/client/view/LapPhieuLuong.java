package com.java.client.view;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.java.client.controller.DateController;
import com.java.config.LookConfig;
import com.java.model.Nhanvien;
import com.java.model.PhieuLuong;
import com.java.model.dao.ChucvuDAO;
import com.java.model.dao.PhieuLuongDAO;
import java.time.LocalDate;
import java.util.SortedMap;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MR.K
 */
public class LapPhieuLuong extends javax.swing.JFrame {

    private static LapPhieuLuong obj = null;
    private Nhanvien nv;
    public static SortedMap<String, PhieuLuong> phieuLuong;
    private Nhanvien payer;
    private PhieuLuong pl;

    /**
     * Creates new form lapphieuluongNV
     */
    public LapPhieuLuong(Nhanvien nv, Nhanvien payer) {
        this.nv = nv;
        this.payer = payer;
        initComponents();
        String MaNgPhat = String.valueOf(LocalDate.now().getYear())
                + String.valueOf(LocalDate.now().getMonthValue());
        String MaPl = "PL" + MaNgPhat;
        pl = new PhieuLuong(MaPl, 0, LocalDate.now(), nv.getMaNv());
        this.formCode.setText(MaPl);
        this.Day.setText(DateController.dateToString(LocalDate.now()));
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
        formCode = new javax.swing.JTextField();
        Day = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableEmp = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableOwner = new javax.swing.JTable();
        okBtn = new javax.swing.JButton();
        CancelBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Payslip");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("CRYSTAL COMPANY SOLUTION");

        jLabel2.setText("Form code:");

        jLabel3.setText("Day:");

        formCode.setEnabled(false);

        Day.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel4.setText("EMPLOYEE PAYSLIP");

        table.setModel(this.bangLuongModel());
        jScrollPane1.setViewportView(table);

        tableEmp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Frist and last name:", this.nv.getTenNv()},
                {"Employee code: ", this.nv.getMaNv()},
                {"Position:", QuanLiNhanSu.danhSachPhongBan.get(nv.getMaPb()).getChucvu(nv.getMaCv())},
                {"Working Committee:", QuanLiNhanSu.danhSachPhongBan.get(nv.getMaPb())},
                {"Salary Level", QuanLiLuong.danhSachChucVu.get(nv.getMaCv()).getMucluong().getSoTien()}
            }, new String[]{"",""}
        ));
        tableEmp.setTableHeader(null);
        jScrollPane2.setViewportView(tableEmp);

        tableOwner.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Payer", QuanLiNhanSu.username, QuanLiNhanSu.danhSachPhongBan.get(payer.getMaPb()).getTenPB()}
            },
            new String [] {
                "", "", ""
            }
        ));
        tableOwner.setEnabled(false);
        tableOwner.setTableHeader(null);
        jScrollPane3.setViewportView(tableOwner);

        okBtn.setText("OK");
        okBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okBtnActionPerformed(evt);
            }
        });

        CancelBtn.setText("Cancel");
        CancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 709, Short.MAX_VALUE)
            .addComponent(jScrollPane2)
            .addComponent(jScrollPane3)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(267, 267, 267)
                        .addComponent(okBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 168, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(jLabel3)
                        .addGap(9, 9, 9))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Day, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                    .addComponent(formCode)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(formCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(Day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(okBtn)
                    .addComponent(CancelBtn))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void okBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okBtnActionPerformed
        // TODO add your handling code here:
        int row = table.getRowCount() - 1;
        String value = table.getValueAt(row, 3).toString();
        pl.setTongSoTien(Integer.parseInt(value));
        PhieuLuongDAO.lapPhieuLuong(pl);
        this.dispose();
    }//GEN-LAST:event_okBtnActionPerformed

    private void CancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelBtnActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_CancelBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void callRun(Nhanvien nv, Nhanvien payer) {
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
            java.util.logging.Logger.getLogger(LapPhieuLuong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LapPhieuLuong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LapPhieuLuong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LapPhieuLuong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        new LapPhieuLuong(nv, payer).setVisible(true);
    }

    private DefaultTableModel bangLuongModel() {
        DefaultTableModel model = new DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "STT", "Category", "Explain", "Number of money:"
                }
        );
        String tenMl = "Level" + QuanLiLuong.danhSachChucVu.get(nv.getMaCv()).getMucluong().getMaML().substring(3);
        int salaryValue = QuanLiLuong.danhSachChucVu.get(nv.getMaCv()).getMucluong().getSoTien();
        model.addRow(new String[]{"1", "Salary", tenMl, String.valueOf(salaryValue)});
        int index = 2;
        nv.getDanhSachKTKL().values().stream()
                .forEach(ktkl -> {
                    model.addRow(new String[]{String.valueOf(index), ktkl.getTenKTKL(), ktkl.getHinhThuc(),
                        String.valueOf(ktkl.getSotien())});
                });

        int value = 0;
        for (int i = 0; i < model.getRowCount(); i++) {
            value += Integer.parseInt(model.getValueAt(i, 3).toString());
        }
        model.addRow(new String[]{"", "", "Total", String.valueOf(value)});
        return model;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelBtn;
    private javax.swing.JTextField Day;
    private javax.swing.JTextField formCode;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton okBtn;
    private javax.swing.JTable table;
    private javax.swing.JTable tableEmp;
    private javax.swing.JTable tableOwner;
    // End of variables declaration//GEN-END:variables
}
