/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.model.dao;

import com.java.client.view.BangKTKL;
import com.java.model.KTKL;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author macos
 */
public class KTKLDAO {
    public static SortedMap<String, KTKL> getAllKTKL(){
        String sql = "SELECT * FROM KTKL";
        SortedMap<String, KTKL> danhSach = new TreeMap<>();
        try {
            Statement st = NhanvienDAO.connection.createStatement();
            st.execute(sql);
            ResultSet rs = st.getResultSet();
            while(rs.next()){
                KTKL ktkl = new KTKL(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4));
                danhSach.put(ktkl.getMaKTKL(), ktkl);
            }
        } catch (SQLException ex) {
            Logger.getLogger(KTKLDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return danhSach;
    }
    
    public static SortedMap<String, KTKL> getDanhSachKTKL(String MaNv){
        String sql = "SELECT * FROM KTKL_NHANVIEN WHERE MONTH(ThGian) = ? AND YEAR(ThGian) = ? AND MaNV = ?";
        SortedMap<String, KTKL> danhSach = new TreeMap<>();
        try {
            PreparedStatement pre = NhanvienDAO.connection.prepareStatement(sql);
            pre.setInt(1, LocalDate.now().getMonthValue());
            System.out.println(LocalDate.now().getMonthValue());
            pre.setInt(2, LocalDate.now().getYear());
            System.out.println(LocalDate.now().getYear());
            pre.setString(3, MaNv);
            pre.execute();
            ResultSet rs = pre.getResultSet();
            while(rs.next()){
                KTKL ktkl = BangKTKL.danhSachKTKL.get(rs.getString(1));
                danhSach.put(ktkl.getMaKTKL(), ktkl);
                System.out.println(ktkl.getTenKTKL());
            }
        } catch (SQLException ex) {
            Logger.getLogger(KTKLDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return danhSach;
    }
}
