/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.model.dao;

import com.java.model.Huyen;
import com.java.model.Tinh;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author macos
 */
public class QuequanDAO {
    public static HashMap<String, Tinh> getAllTinh(){
        HashMap<String, Tinh> danhSach = new HashMap<>();
        try {
            String sql = "SELECT * FROM TINH";
            Statement st = NhanvienDAO.connection.createStatement();
            st.execute(sql);
            ResultSet rs = st.getResultSet();
            while(rs.next()){
                Tinh obj = new Tinh(rs.getString(1), rs.getString(2));
                danhSach.put(obj.getMaTinh(), obj);
            }
            } catch (SQLException ex) {
            Logger.getLogger(QuequanDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return danhSach;
    }
    
    public static HashMap<String, Huyen> getAllHuyenByTinh(String maT){
        HashMap<String, Huyen> danhSach = new HashMap<>();
        try {
            String sql = "select h.MaH, h.TenHuyen from QUEQUAN qq join HUYEN h "
                    + "on qq.MaH = h.MaH where qq.MaT = ?";
            PreparedStatement pre = NhanvienDAO.connection.prepareStatement(sql);
            pre.setString(1, maT);
            pre.execute();
            ResultSet rs = pre.getResultSet();
            while(rs.next()){
                danhSach.put(rs.getString(1), new Huyen(rs.getString(1), rs.getString(2)));
            }
        } catch (SQLException ex) {
            Logger.getLogger(QuequanDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return danhSach;
    }
}
