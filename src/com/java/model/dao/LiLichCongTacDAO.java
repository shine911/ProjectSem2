/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.model.dao;
import java.util.List;
import com.java.model.Lilichcongtac;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author macos
 */
public class LiLichCongTacDAO {
    public static List<Lilichcongtac> getDanhSachCongTac(String id){
        List<Lilichcongtac> danhsach = new ArrayList<>();
        try {
            String sql = "select lilich.MaNoiCT, lilich.TenNoiCT, lilich.DC, "
                    + "nv.ThGian from LILICHCT lilich join NHANVIEN_LILICHCT nv on"
                    + " lilich.MaNoiCT = nv.MaNoiCT where nv.MaNV = ?";
            PreparedStatement pre = NhanvienDAO.connection.prepareStatement(sql);
            pre.setString(1, id);
            pre.execute();
            ResultSet rs = pre.getResultSet();
            while(rs.next()){
                danhsach.add(new Lilichcongtac(rs.getString(1), rs.getString(2),
                        rs.getString(3), rs.getString(4)));
            }
        } catch (SQLException ex) {
            Logger.getLogger(LiLichCongTacDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return danhsach;
    }
}
