/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.model.dao;

import com.java.model.Phongban;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author macos
 */
public class PhongbanDAO {
    public static Map<String, Phongban> getDanhSachPhongBan(){
        Map<String, Phongban> danhsach = new HashMap<>();
        try {
            String sql = "SELECT * FROM PHONGBAN";
            Statement st = NhanvienDAO.connection.createStatement();
            st.execute(sql);
            ResultSet rs = st.getResultSet();
            while(rs.next()){
                Phongban pb = new Phongban(rs.getString(1), rs.getString(2), rs.getString(3));
                danhsach.put(pb.getMaPB(), pb);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CM_TDHVDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return danhsach;
    }
}
