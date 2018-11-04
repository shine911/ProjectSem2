/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.client.controller;

import com.java.client.view.DangNhap;
import com.java.client.view.QuanLiLuong;
import com.java.client.view.QuanLiNhanSu;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author macos
 */
public class ThoatController {
    public static void Thoat(JFrame frame){
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        int choose = JOptionPane.showConfirmDialog(null, "Do you want quit?", "Confirmation", JOptionPane.YES_NO_OPTION);
        if (choose == 0) {
            frame.dispose();
            if(QuanLiNhanSu.username.equals("ADMIN")){
                QuanLiNhanSu.callRun().dispose();
                QuanLiLuong.callRun().dispose();
            }
            QuanLiNhanSu.username="";
            DangNhap.callRun();
        }
    }
}
