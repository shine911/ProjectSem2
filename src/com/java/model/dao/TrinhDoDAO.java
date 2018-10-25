/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.model.dao;

import com.java.model.TDHV;
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
public class TrinhDoDAO {
    public static Map<String, TDHV> getDanhSachTrinhDo(){
        Map<String, TDHV> danhsach = new HashMap<>();
        try {
            String sql = "SELECT * FROM TRINHDOHV";
            Statement st = NhanvienDAO.connection.createStatement();
            st.execute(sql);
            ResultSet rs = st.getResultSet();
            while(rs.next()){
                TDHV td = new TDHV(rs.getString(1), rs.getString(2));
                danhsach.put(td.getMaTDHV(), td);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CM_TDHVDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return danhsach;
    }
}
