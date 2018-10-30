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
public class Chucvu {
    private String MaCV;
    private String TenCV;
    private int BaoHiem;
    private int TroCap;
    private String MaMl;

    public Chucvu(String MaCV, String TenCV, int BaoHiem, int TroCap, String MaMl) {
        this.MaCV = MaCV;
        this.TenCV = TenCV;
        this.BaoHiem = BaoHiem;
        this.TroCap = TroCap;
        this.MaMl = MaMl;
    }

    public Chucvu() {
    }

    public String getMaCV() {
        return MaCV;
    }

    public void setMaCV(String MaCV) {
        this.MaCV = MaCV;
    }

    public String getTenCV() {
        return TenCV;
    }

    public void setTenCV(String TenCV) {
        this.TenCV = TenCV;
    }

    public int getBaoHiem() {
        return BaoHiem;
    }

    public void setBaoHiem(int BaoHiem) {
        this.BaoHiem = BaoHiem;
    }

    public int getTroCap() {
        return TroCap;
    }

    public void setTroCap(int TroCap) {
        this.TroCap = TroCap;
    }

    public String getMaMl() {
        return MaMl;
    }

    public void setMaMl(String MaMl) {
        this.MaMl = MaMl;
    }

    @Override
    public String toString() {
        return this.getTenCV();
    }
    
    
}
