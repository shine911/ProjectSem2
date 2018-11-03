/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.model.dao;

import com.java.model.PhieuLuong;
import com.java.client.view.LapPhieuLuong;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author macos
 */
public class PhieuLuongDAO {
    public static SortedMap<LocalDate, PhieuLuong> getDanhSachPhieuLuong(){
        SortedMap<LocalDate, PhieuLuong> danhSach = new TreeMap<>((a,b)->a.compareTo(b));
        String sql = "SELECT * FROM PHIEULUONG";        
        try {
            Statement st = NhanvienDAO.connection.createStatement();
            st.execute(sql);
            ResultSet rs = st.getResultSet();
            while(rs.next()){
                PhieuLuong pl = new PhieuLuong(rs.getString(1), rs.getInt(2), rs.getDate(3).toLocalDate(), rs.getString(4));
                danhSach.put(pl.getNgPhat(), pl);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PhieuLuongDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return danhSach;
    }
    
    private static void insertPhieuLuong(PhieuLuong pl){
        String sql = "INSERT INTO VALUES(?,?,?,?)";
        try {
            PreparedStatement pre = NhanvienDAO.connection.prepareStatement(sql);
            pre.setString(1, pl.getMaPL());
            pre.setInt(2, pl.getTongSoTien());
            pre.setDate(3, Date.valueOf(pl.getNgPhat()));
            pre.setString(4, pl.getMaNV());
            pre.execute();
        } catch (SQLException ex) {
            Logger.getLogger(PhieuLuongDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private static void updatePhieuLuong(PhieuLuong pl){
        String sql = "UPDATE PHIEULUONG SET MaPL = ?, TongSoTien = ?, NgayPhat = ?, MaNv = ? WHERE NgayPhat = ?";
        try {
            PreparedStatement pre = NhanvienDAO.connection.prepareStatement(sql);
            pre.setString(1, pl.getMaPL());
            pre.setInt(2, pl.getTongSoTien());
            pre.setDate(3, Date.valueOf(pl.getNgPhat()));
            pre.setString(4, pl.getMaNV());
            pre.setDate(5, Date.valueOf(pl.getNgPhat()));
            pre.execute();
        } catch (SQLException ex) {
            Logger.getLogger(PhieuLuongDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void lapPhieuLuong(PhieuLuong pl){
        LocalDate now = LocalDate.now();
        if(LapPhieuLuong.phieuLuong.containsKey(now))
        {
            updatePhieuLuong(pl);
        } else {
            insertPhieuLuong(pl);
        }
    }
}
