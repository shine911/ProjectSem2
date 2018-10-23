/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.model;

import java.util.Date;

/**
 *
 * @author macos
 */
public class Nhanvien_Lilichct {
    private String MaNv;
    private String MaNoiCT;
    private Date ThGian;

    public Nhanvien_Lilichct(String MaNv, String MaNoiCT, Date ThGian) {
        this.MaNv = MaNv;
        this.MaNoiCT = MaNoiCT;
        this.ThGian = ThGian;
    }

    public String getMaNv() {
        return MaNv;
    }

    public void setMaNv(String MaNv) {
        this.MaNv = MaNv;
    }

    public String getMaNoiCT() {
        return MaNoiCT;
    }

    public void setMaNoiCT(String MaNoiCT) {
        this.MaNoiCT = MaNoiCT;
    }

    public Date getThGian() {
        return ThGian;
    }

    public void setThGian(Date ThGian) {
        this.ThGian = ThGian;
    }
    
}
