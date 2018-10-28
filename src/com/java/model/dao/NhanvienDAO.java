/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.model.dao;

import com.java.config.ConnectionUtil;
import com.java.model.Lilichcongtac;
import com.java.model.Nhanvien;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author macos
 */
public class NhanvienDAO {

    public static Connection connection = ConnectionUtil.getInstance().getConnection();

    public static Nhanvien getNhanVienbyID(String id) {
        Nhanvien nv = null;
        try {
            String sql = "Select * FROM NHANVIEN WHERE MaNV = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, id);
            preparedStatement.execute();
            ResultSet rs = preparedStatement.getResultSet();
            rs.next();
            nv = new Nhanvien();
            nv.setMaNv(rs.getString(1));
            nv.setTenNv(rs.getString(2));
            nv.setPhai(rs.getBoolean(3));
            nv.setNgSinh(rs.getDate(4));
            nv.setDc(rs.getString(5));
            nv.setDienThoai(rs.getString(6));
            nv.setEmail(rs.getString(7));
            nv.setPassword(rs.getString(8));
            nv.setMaPb(rs.getString(9));
            nv.setMaCv(rs.getString(10));
            nv.setMaT(rs.getString(11));
            nv.setMaH(rs.getString(12));
            nv.setMaCM(rs.getString(13));
            nv.setMaTDHV(rs.getString(14));
            nv.setMaTDNN(rs.getString(15));
        } catch (SQLException ex) {
            Logger.getLogger(NhanvienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return nv;
    }

    public static Map<String, Nhanvien> getAllNhanvien() {
        Map<String, Nhanvien> danhSach = new HashMap<>();
        try {
            String sql = "Select * FROM NHANVIEN";
            Statement statement = connection.createStatement();
            statement.execute(sql);
            ResultSet rs = statement.getResultSet();
            while (rs.next()) {
                Nhanvien nv = new Nhanvien();
                nv.setMaNv(rs.getString(1));
                nv.setTenNv(rs.getString(2));
                nv.setPhai(rs.getBoolean(3));
                nv.setNgSinh(rs.getDate(4));
                nv.setDc(rs.getString(5));
                nv.setDienThoai(rs.getString(6));
                nv.setEmail(rs.getString(7));
                nv.setPassword(rs.getString(8));
                nv.setMaPb(rs.getString(9));
                nv.setMaCv(rs.getString(10));
                nv.setMaT(rs.getString(11));
                nv.setMaH(rs.getString(12));
                nv.setMaCM(rs.getString(13));
                nv.setMaTDHV(rs.getString(14));
                nv.setMaTDNN(rs.getString(15));
                nv.setDanhSachThanNhan(ThanNhanDAO.getThanNhan(nv.getMaNv()));
                nv.setDanhSachCongTac(LiLichCongTacDAO.getDanhSachCongTac(nv.getMaNv()));
                danhSach.put(nv.getMaNv(), nv);
            }
        } catch (SQLException ex) {
            Logger.getLogger(NhanvienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return danhSach;
    }
}
