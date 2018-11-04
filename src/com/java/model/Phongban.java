/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.model;

import com.java.model.dao.ChucvuDAO;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author macos
 */
public class Phongban {

    private String MaPB;
    private String tenPB;
    private String DC;
    private Map<String, Chucvu> danhSachChucVu;

    public Phongban(String MaPB, String tenPB, String DC) {
        this.MaPB = MaPB;
        this.tenPB = tenPB;
        this.DC = DC;
        this.danhSachChucVu = ChucvuDAO.getDSChucVu(MaPB);
    }

    public String getDC() {
        return DC;
    }

    public void setDC(String DC) {
        this.DC = DC;
    }

    public String getMaPB() {
        return MaPB;
    }

    public void setMaPB(String MaPB) {
        this.MaPB = MaPB;
    }

    public String getTenPB() {
        return tenPB;
    }

    public void setTenPB(String tenPB) {
        this.tenPB = tenPB;
    }

    @Override
    public String toString() {
        return this.tenPB;
    }

    public Map<String, Chucvu> getDanhSachChucVu() {
        return danhSachChucVu;
    }

    public void setDanhSachChucVu(Map<String, Chucvu> danhSachChucVu) {
        this.danhSachChucVu = danhSachChucVu;
    }
    
    public Chucvu getChucvu(String MaCV){
        return this.danhSachChucVu.get(MaCV);
    }
}
