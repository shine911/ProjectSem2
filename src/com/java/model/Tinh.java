/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.model;

import com.java.model.dao.QuequanDAO;
import java.util.HashMap;

/**
 *
 * @author macos
 */
public class Tinh {
    private String MaTinh;
    private String TenTinh;
    private HashMap<String, Huyen> huyen;

    public Tinh(String MaTinh, String TenTinh) {
        this.MaTinh = MaTinh;
        this.TenTinh = TenTinh;
        this.huyen = QuequanDAO.getAllHuyenByTinh(MaTinh);
    }

    public String getMaTinh() {
        return MaTinh;
    }

    public void setMaTinh(String MaTinh) {
        this.MaTinh = MaTinh;
    }

    public String getTenTinh() {
        return TenTinh;
    }

    public void setTenTinh(String TenTinh) {
        this.TenTinh = TenTinh;
    }

    public HashMap<String, Huyen> getHuyen() {
        return huyen;
    }

    public void setHuyen(HashMap<String, Huyen> huyen) {
        this.huyen = huyen;
    }
    @Override
    public String toString(){
        return this.getTenTinh();
    }
    
}
