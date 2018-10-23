/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.model.dao;

import com.java.config.ConnectionUtil;
import com.java.model.TDHV;
import java.sql.Connection;
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

    public static Map<String, Map<String, TDHV>> getTrinhTheoCM() {
        Map<String, TDHV> danhSachTrinhDo = TrinhDoDAO.getDanhSachTrinhDo();
        Map<String, Map<String, TDHV>> danhSach = new HashMap<>();
        try {
            String cmtd = "select * from CHUYENMON_TRINHDOHV";
            Statement st = connection.createStatement();
            st.execute(cmtd);
            ResultSet rs = st.getResultSet();
            while (rs.next()) {
                String keyCM = rs.getString(1);
                String keyTD = rs.getString(2);
                if (!danhSach.containsKey(keyCM)) {
                    danhSach.put(keyCM, new HashMap<>());
                }
                danhSach.get(keyCM).put(keyTD, danhSachTrinhDo.get(keyTD));
            }
        } catch (SQLException ex) {
            Logger.getLogger(CM_TDHVDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return danhSach;
    }

}
