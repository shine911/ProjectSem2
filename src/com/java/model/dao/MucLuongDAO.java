/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.model.dao;

import com.java.client.view.QuanLiLuong;
import com.java.client.view.QuanLiNhanSu;
import com.java.model.Chucvu;
import com.java.model.Mucluong;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author STUDENT
 */
public class MucLuongDAO {

    public static SortedMap<String, Mucluong> getAllMucLuong() {
        SortedMap<String, Mucluong> danhSach = new TreeMap<>();
        try {

            String sql = "SELECT * FROM MUCLUONG";
            Statement st = NhanvienDAO.connection.createStatement();
            st.execute(sql);
            ResultSet rs = st.getResultSet();
            //Create List MucLuong
            while (rs.next()) {
                Mucluong obj = new Mucluong(rs.getString(1), rs.getInt(2));
                danhSach.put(obj.getMaML(), obj);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MucLuongDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return danhSach;
    }

    public static Mucluong getMucLuongTheoChucVu(String MaMl) {
        return QuanLiLuong.danhSachMucLuong.get(MaMl);
    }

    public static void updateMucLuong(Mucluong ml) {
        String sql = "UPDATE MUCLUONG SET SoTien = ? WHERE MaML = ?";
        try {
            PreparedStatement pre = NhanvienDAO.connection.prepareStatement(sql);
            pre.setInt(1, ml.getSoTien());
            pre.setString(2, ml.getMaML());
            pre.execute();
        } catch (SQLException ex) {
            Logger.getLogger(MucLuongDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void insertMucLuong(Mucluong ml) {
        String sql = "INSERT INTO MUCLUONG VALUES(?,?)";
        try {
            PreparedStatement pre = NhanvienDAO.connection.prepareStatement(sql);
            pre.setString(1, ml.getMaML());
            pre.setInt(2, ml.getSoTien());
            pre.execute();
        } catch (SQLException ex) {
            Logger.getLogger(MucLuongDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void updateCV_ML(Chucvu cv, Mucluong ml) {
        String sql = "UPDATE CHUCVU SET MaML = ? WHERE MaCV = ?";
        try {
            PreparedStatement pre = NhanvienDAO.connection.prepareStatement(sql);
            pre.setString(1, ml.getMaML());
            pre.setString(2, cv.getMaCV());
            pre.execute();
        } catch (SQLException ex) {
            Logger.getLogger(MucLuongDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void deleteMucLuong(Mucluong ml) {
        QuanLiLuong.danhSachChucVu.values().stream()
                .filter(cv -> cv.getMucluong().equals(ml))
                .forEachOrdered(cv -> {
                    Mucluong ml00 = QuanLiLuong.danhSachMucLuong.get("ML00");
                    cv.setMucluong(ml00);
                    updateCV_ML(cv, ml00);
                });

        String sql = "DELETE FROM MUCLUONG WHERE MaML=?";
        try {
            PreparedStatement pre = NhanvienDAO.connection.prepareStatement(sql);
            pre.setString(1, ml.getMaML());
            pre.execute();
        } catch (SQLException ex) {
            Logger.getLogger(MucLuongDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
