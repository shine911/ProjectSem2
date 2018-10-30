/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.model.dao;

import com.java.config.ConnectionUtil;
import com.java.model.TDHV;
import java.sql.Connection;
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
public class CM_TDHVDAO {

    public static Connection connection = ConnectionUtil.getInstance().getConnection();

    public static Map<String, TDHV> getTrinhTheoCM(String id) {
        Map<String, TDHV> danhSachTrinhDo = new HashMap<>();
        try {
            String cmtd = "SELECT cm.MaTDHV, td.TenTDHV "
                    + "FROM CHUYENMON_TRINHDOHV cm "
                    + "JOIN TRINHDOHV td "
                    + "ON cm.MaTDHV = td.MaTDHV WHERE cm.MaCM = ?";
            PreparedStatement pre = NhanvienDAO.connection.prepareStatement(cmtd);
            pre.setString(1, id);
            pre.execute();
            ResultSet rs = pre.getResultSet();
            while (rs.next()) {
                TDHV td = new TDHV(rs.getString(1), rs.getString(2));
                danhSachTrinhDo.put(td.getMaTDHV(), td);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CM_TDHVDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return danhSachTrinhDo;
    }

}
