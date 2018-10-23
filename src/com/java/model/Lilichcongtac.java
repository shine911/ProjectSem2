/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.model;

/**
 *
 * @author macos
 */
public class Lilichcongtac {
    private String MaNoiCT;
    private String TenNoiCT;
    private String DC;

    public Lilichcongtac(String MaNoiCT, String TenNoiCT, String DC) {
        this.MaNoiCT = MaNoiCT;
        this.TenNoiCT = TenNoiCT;
        this.DC = DC;
    }

    public String getMaNoiCT() {
        return MaNoiCT;
    }

    public void setMaNoiCT(String MaNoiCT) {
        this.MaNoiCT = MaNoiCT;
    }

    public String getTenNoiCT() {
        return TenNoiCT;
    }

    public void setTenNoiCT(String TenNoiCT) {
        this.TenNoiCT = TenNoiCT;
    }

    public String getDC() {
        return DC;
    }

    public void setDC(String DC) {
        this.DC = DC;
    }
    
}
