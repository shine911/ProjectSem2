/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.model.dao;

import com.java.client.controller.DateController;
import com.java.config.ConnectionUtil;
import com.java.model.Nhanvien;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.SortedMap;
import java.util.TreeMap;
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
            nv.setNgSinh(rs.getDate(4).toLocalDate());
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
    
    public static SortedMap<String, Nhanvien> getAllNhanvien() {
        SortedMap<String, Nhanvien> danhSach = new TreeMap<>();
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
                nv.setNgSinh(rs.getDate(4).toLocalDate());
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
    
    public static void createNhanVien(Nhanvien nv) {
        try {
            String sql = "INSERT INTO NHANVIEN VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement pre = connection.prepareStatement(sql);
            pre.setString(1, nv.getMaNv());
            pre.setString(2, nv.getTenNv());
            pre.setBoolean(3, nv.isPhai());
            pre.setDate(4, Date.valueOf(DateController.parseStringtoLocalDate(nv.getNgSinh())));
            pre.setString(5, nv.getDc());
            pre.setString(6, nv.getDienThoai());
            pre.setString(7, nv.getEmail());
            pre.setString(8, nv.getPassword());
            pre.setString(9, nv.getMaPb());
            pre.setString(10, nv.getMaCv());
            pre.setString(11, nv.getMaT());
            pre.setString(12, nv.getMaH());
            pre.setString(13, nv.getMaCM());
            pre.setString(14, nv.getMaTDHV());
            pre.setString(15, nv.getMaTDNN());
            pre.execute();
        } catch (SQLException ex) {
            Logger.getLogger(NhanvienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        LiLichCongTacDAO.createDanhSachCongTac(nv);
        ThanNhanDAO.insertThanNhan(nv);
    }
    
    public static void updateNhanVien(Nhanvien nv) {
        try {
            String sql = "UPDATE NHANVIEN SET "
                    + "HoTen = ?,"
                    + "Phai = ?,"
                    + "NgSinh = ?,"
                    + "DC = ?,"
                    + "DienThoai = ?,"
                    + "Email = ?,"
                    + "Password = ?,"
                    + "MaPB = ?,"
                    + "MaCV = ?,"
                    + "MaT = ?,"
                    + "MaH = ?,"
                    + "MaCM = ?,"
                    + "MaTDHV = ?,"
                    + "MaTDNN = ?"
                    + " WHERE MaNV = ?";
            PreparedStatement pre = connection.prepareStatement(sql);
            pre.setString(15, nv.getMaNv());//get ID
            pre.setString(1, nv.getTenNv());
            pre.setBoolean(2, nv.isPhai());
            pre.setDate(3, Date.valueOf(DateController.parseStringtoLocalDate(nv.getNgSinh())));
            pre.setString(4, nv.getDc());
            pre.setString(5, nv.getDienThoai());
            pre.setString(6, nv.getEmail());
            pre.setString(7, nv.getPassword());
            pre.setString(8, nv.getMaPb());
            pre.setString(9, nv.getMaCv());
            pre.setString(10, nv.getMaT());
            pre.setString(11, nv.getMaH());
            pre.setString(12, nv.getMaCM());
            pre.setString(13, nv.getMaTDHV());
            pre.setString(14, nv.getMaTDNN());
            pre.execute();
        } catch (SQLException ex) {
            Logger.getLogger(NhanvienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        LiLichCongTacDAO.UpdateDanhSachCongTac(nv);
        ThanNhanDAO.updateThanNhan(nv);
    }
    
    public static void deleteNhanVien(Nhanvien nv) {
        try {
            //Remove FK first
            LiLichCongTacDAO.deleteDanhSachCongTac(nv.getMaNv());
            ThanNhanDAO.deleteThanNhan(nv);
            
            String sql = "DELETE FROM NHANVIEN WHERE MaNV=?";
            PreparedStatement pre = connection.prepareStatement(sql);
            pre.setString(1, nv.getMaNv());
            pre.execute();
        } catch (SQLException ex) {
            Logger.getLogger(NhanvienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
