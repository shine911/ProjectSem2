/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.model;

import java.time.LocalDate;

/**
 *
 * @author STUDENT
 */
public class PhieuLuong {
    private String maPL;
    private int TongSoTien;
    private LocalDate NgPhat;
    private String MaNV;

    public PhieuLuong(String maPL, int TongSoTien, LocalDate NgPhat, String MaNV) {
        this.maPL = maPL;
        this.TongSoTien = TongSoTien;
        this.NgPhat = NgPhat;
        this.MaNV = MaNV;
    }

    public String getMaPL() {
        return maPL;
    }

    public void setMaPL(String maPL) {
        this.maPL = maPL;
    }

    public int getTongSoTien() {
        return TongSoTien;
    }

    public void setTongSoTien(int TongSoTien) {
        this.TongSoTien = TongSoTien;
    }

    public LocalDate getNgPhat() {
        return NgPhat;
    }

    public void setNgPhat(LocalDate NgPhat) {
        this.NgPhat = NgPhat;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }
    
}
