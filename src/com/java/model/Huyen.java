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
public class Huyen {
    private String MaHuyen;
    private String TenHuyen;

    public Huyen(String MaHuyen, String TenHuyen) {
        this.MaHuyen = MaHuyen;
        this.TenHuyen = TenHuyen;
    }

    public String getMaHuyen() {
        return MaHuyen;
    }

    public void setMaHuyen(String MaHuyen) {
        this.MaHuyen = MaHuyen;
    }

    public String getTenHuyen() {
        return TenHuyen;
    }

    public void setTenHuyen(String TenHuyen) {
        this.TenHuyen = TenHuyen;
    }

     @Override
    public String toString(){
        return this.getTenHuyen();
    }
    
}
