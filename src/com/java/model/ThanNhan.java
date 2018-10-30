/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.model;

import com.java.client.controller.DateController;
import java.util.Date;

/**
 *
 * @author macos
 */
public class ThanNhan {
    private String MaNV;
    private String TenTN;
    private boolean Phai;
    private String DC;
    private Date NgSinh;
    private String QuanHe;

    public ThanNhan(String MaNV, String TenTN, boolean Phai, String DC, Date NgSinh, String QuanHe) {
        this.MaNV = MaNV;
        this.TenTN = TenTN;
        this.Phai = Phai;
        this.DC = DC;
        this.NgSinh = NgSinh;
        this.QuanHe = QuanHe;
    }

    public String getNgSinh() {
        return DateController.dateToString(NgSinh);
    }

    public void setNgSinh(Date NgSinh) {
        this.NgSinh = NgSinh;
    }
    
    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getTenTN() {
        return TenTN;
    }

    public void setTenTN(String TenTN) {
        this.TenTN = TenTN;
    }

    public boolean isPhai() {
        return Phai;
    }

    public void setPhai(boolean Phai) {
        this.Phai = Phai;
    }

    public String getDC() {
        return DC;
    }

    public void setDC(String DC) {
        this.DC = DC;
    }

    public String getQuanHe() {
        return QuanHe;
    }

    public void setQuanHe(String QuanHe) {
        this.QuanHe = QuanHe;
    }
    
}
