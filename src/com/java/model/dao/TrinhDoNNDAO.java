/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.model.dao;

import com.java.model.TrinhDoNN;
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
public class TrinhDoNNDAO {

    public static Map<String, TrinhDoNN> getListTrinhDoNN() {
        String sql = "SELECt * FROM TRINHDONN";
        Map<String, TrinhDoNN> danhSach = new HashMap<>();
        try {
            Statement st = NhanvienDAO.connection.createStatement();
            st.execute(sql);
            ResultSet rs = st.getResultSet();
            while(rs.next()){
                TrinhDoNN nn = new TrinhDoNN(rs.getString(1), rs.getString(2));
                danhSach.put(nn.getMaTDNN(), nn);
            }
        } catch (SQLException ex) {
            Logger.getLogger(TrinhDoNNDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return danhSach;
    }
}
