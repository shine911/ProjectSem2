/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.model.dao;

import com.java.config.ConnectionUtil;
import java.sql.Connection;
import com.java.model.Chucvu;
import java.sql.PreparedStatement;
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
public class ChucvuDAO {
    public static Map<String, Chucvu> getChucVuPB(String id){
                Map<String, Chucvu> danhSach = new HashMap<>();
        try {
            String sql = "Select cv.MaCV, cv.TenCV, cv.BaoHiem, cv.TroCap, "
                    + "cv.MaML FROM PHONGBAN_CHUCVU pbcv JOIN CHUCVU cv ON "
                    + "pbcv.MaCV = cv.MaCV WHERE pbcv.MaPB = ?";
            
            PreparedStatement pre = NhanvienDAO.connection.prepareStatement(sql);
            pre.setString(1, id);
            pre.execute();
            ResultSet rs = pre.getResultSet();
            while (rs.next()) {
                Chucvu cv = new Chucvu();
                cv.setMaCV(rs.getString(1));
                cv.setTenCV(rs.getString(2));
                cv.setBaoHiem(rs.getInt(3));
                cv.setTroCap(rs.getInt(4));
                cv.setMaMl(rs.getString(5));
                danhSach.put(cv.getMaCV(), cv);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ChucvuDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return danhSach;
    }
}
