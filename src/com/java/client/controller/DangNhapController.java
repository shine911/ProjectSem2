/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.client.controller;

import com.java.client.view.QuanLiNhanSu;
import com.java.client.view.ThongTinNhanVien;
import com.java.model.dao.NhanvienDAO;
import com.java.model.Nhanvien;

/**
 *
 * @author macos
 */
public class DangNhapController {

    public static boolean DangNhap(String user, String pass) {
        if (!user.isEmpty() && !pass.isEmpty()) {
            return QuanLiNhanSu.danhSachNhanVien.values().stream()
                    .anyMatch(nv -> nv.getMaNv().equals(user) && nv.getPassword().equals(pass));
        }
        return false;
    }

    public static void QuyenDangNhap(String user) {
        if (user.equals("ADMIN")) {
            QuanLiNhanSu.getForm(user).callRun();
        } else {
            ThongTinNhanVien.nv = QuanLiNhanSu.danhSachNhanVien.get(user);
            ThongTinNhanVien.callRun();
        }
    }
}
