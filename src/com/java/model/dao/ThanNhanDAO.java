/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.model.dao;

import com.java.client.controller.DateController;
import com.java.config.ConnectionUtil;
import com.java.model.Nhanvien;
import java.util.Map;
import com.java.model.ThanNhan;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author macos
 */
public class ThanNhanDAO {

    public static Map<String, ThanNhan> getThanNhan(String MaNV) {
        Map<String, ThanNhan> danhSach = new HashMap<>();
        try {
            String sql = "SELECT * FROM THANNHAN WHERE MaNV = ?";
            PreparedStatement prest = ConnectionUtil.getInstance().getConnection().prepareStatement(sql);
            prest.setString(1, MaNV);
            prest.execute();
            ResultSet rs = prest.getResultSet();
            while (rs.next()) {
                ThanNhan thannhan = new ThanNhan(rs.getString(1), rs.getString(2), rs.getBoolean(3), rs.getString(4), rs.getDate(5).toLocalDate() ,rs.getString(6));
                danhSach.put(thannhan.getQuanHe(), thannhan);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ThanNhanDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return danhSach;
    }
    
    public static void insertThanNhan(Nhanvien nv){
        try {
            String sql = "INSERT INTO THANNHAN VALUES(?, ?, ?, ?, ?, ?)";
            PreparedStatement pre = NhanvienDAO.connection.prepareStatement(sql);
            for(ThanNhan obj : nv.getDanhSachThanNhan().values()){
                pre.setString(1, obj.getMaNV());
                pre.setString(2, obj.getTenTN());
                pre.setBoolean(3, obj.isPhai());
                pre.setString(4, obj.getDC());
                pre.setDate(5, Date.valueOf(DateController.parseStringtoLocalDate(obj.getNgSinh())));
                pre.setString(6, obj.getQuanHe());
                pre.addBatch();
            }
            pre.executeBatch();
        } catch (SQLException ex) {
            Logger.getLogger(ThanNhanDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void updateThanNhan(Nhanvien nv){
        deleteThanNhan(nv);
        insertThanNhan(nv);
    }
    
    public static void deleteThanNhan(Nhanvien nv){
        try {
            String sql = "DELETE FROM THANNHAN WHERE ?";
            PreparedStatement pre = NhanvienDAO.connection.prepareStatement(sql);
            pre.setString(1, nv.getMaNv());
        } catch (SQLException ex) {
            Logger.getLogger(ThanNhanDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
