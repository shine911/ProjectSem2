/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.model.dao;

import com.java.client.view.QuanLiLuong;
import com.java.client.view.QuanLiNhanSu;
import com.java.model.Mucluong;
import com.java.model.Phongban;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author STUDENT
 */
public class MucLuongDAO {
    public static SortedMap<String, Mucluong> getAllMucLuong(){
        SortedMap<String, Mucluong> danhSach = new TreeMap<>();
        try {
            
            String sql = "SELECT * FROM MUCLUONG";
            Statement st = NhanvienDAO.connection.createStatement();
            st.execute(sql);
            ResultSet rs = st.getResultSet();
            //Create List MucLuong
            while(rs.next()){
                Mucluong obj = new Mucluong(rs.getString(1), rs.getInt(2));
                danhSach.put(obj.getMaML(), obj);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MucLuongDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return danhSach;
    }
    
    public static Mucluong getMucLuongTheoChucVu(String MaMl){
        return QuanLiLuong.danhSachMucLuong.get(MaMl);
    }
    
}
