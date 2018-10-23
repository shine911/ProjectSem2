/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.model.dao;

import com.java.config.ConnectionUtil;
import java.util.Map;
import com.java.model.ThanNhan;
import java.sql.Connection;
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
                ThanNhan thannhan = new ThanNhan(rs.getString(1), rs.getString(2), rs.getBoolean(3), rs.getString(4), rs.getDate(5) ,rs.getString(6));
                danhSach.put(thannhan.getQuanHe(), thannhan);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ThanNhanDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return danhSach;
    }
}
