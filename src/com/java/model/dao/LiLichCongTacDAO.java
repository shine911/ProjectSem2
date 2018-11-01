/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.model.dao;
import java.util.List;
import com.java.model.Lilichcongtac;
import com.java.model.Nhanvien;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author macos
 */
public class LiLichCongTacDAO {
    public static List<Lilichcongtac> getDanhSachCongTac(String id){
        List<Lilichcongtac> danhsach = new ArrayList<>();
        try {
            String sql = "select TenNoiCT, DC, "
                    + "ThGian from LILICHCT where MaNV = ?";
            PreparedStatement pre = NhanvienDAO.connection.prepareStatement(sql);
            pre.setString(1, id);
            pre.execute();
            ResultSet rs = pre.getResultSet();
            while(rs.next()){
                danhsach.add(new Lilichcongtac(rs.getString(1), rs.getString(2),
                        rs.getString(3)));
            }
        } catch (SQLException ex) {
            Logger.getLogger(LiLichCongTacDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return danhsach;
    }
    
    public static void createDanhSachCongTac(Nhanvien nv){
        try {
            List<Lilichcongtac> danhSach = nv.getDanhSachCongTac();
            String id  = nv.getMaNv();
            String sql = "INSERT INTO LILICHCT VALUES(?,?,?,?)";
            PreparedStatement pre = NhanvienDAO.connection.prepareStatement(sql);
            for(Lilichcongtac lilich:danhSach){
               pre.setString(1, id);
               pre.setString(2, lilich.getTenNoiCT());
               pre.setString(3, lilich.getDC());
               pre.setString(4, lilich.getThgian());
               pre.addBatch();
            }
            pre.executeBatch();
        } catch (SQLException ex) {
            Logger.getLogger(LiLichCongTacDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void UpdateDanhSachCongTac(Nhanvien nv){
        deleteDanhSachCongTac(nv.getMaNv());
        createDanhSachCongTac(nv);
    }
    
    public static void deleteDanhSachCongTac(String nhanvienID){
        try {
            String sql = "DELETE FROM LILICHCT WHERE MaNV = ?";
            PreparedStatement pre = NhanvienDAO.connection.prepareStatement(sql);
            pre.setString(1, nhanvienID);
            pre.execute();
        } catch (SQLException ex) {
            Logger.getLogger(LiLichCongTacDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
