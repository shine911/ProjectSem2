/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.model.dao;

import com.java.model.Chuyenmon;
import static com.java.model.dao.CM_TDHVDAO.connection;
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
public class ChuyenmonDAO {
    public static Map<String, Chuyenmon> getDanhSachCM(){
        Map<String, Chuyenmon> danhsach = new HashMap<>();
        try {
            String sql = "SELECT * FROM CHUYENMON";
            Statement st = connection.createStatement();
            st.execute(sql);
            ResultSet rs = st.getResultSet();
            while(rs.next()){
                Chuyenmon cm = new Chuyenmon(rs.getString(1), rs.getString(2));
                danhsach.put(cm.getMaCM(), cm);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CM_TDHVDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return danhsach;
    }
}
