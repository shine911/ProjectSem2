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
    private Mucluong Mucluong;

    public Chucvu(String MaCV, String TenCV, int BaoHiem, int TroCap, Mucluong MaMl) {
        this.MaCV = MaCV;
        this.TenCV = TenCV;
        this.BaoHiem = BaoHiem;
        this.TroCap = TroCap;
        this.Mucluong = MaMl;
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

    public Mucluong getMucluong() {
        return Mucluong;
    }

    public void setMucluong(Mucluong Mucluong) {
        this.Mucluong = Mucluong;
    }

    @Override
    public String toString() {
        return this.getTenCV();
    }
    
    
}
