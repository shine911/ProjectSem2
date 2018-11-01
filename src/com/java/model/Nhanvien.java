/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.model;

import com.java.client.controller.DateController;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;

/**
 *
 * @author macos
 */
public class Nhanvien{
    private String maNv;
    private String tenNv;
    private boolean Phai;
    private LocalDate NgSinh;
    private String Dc;
    private String DienThoai;
    private String Email;
    private String Password;
    private String maPb;
    private String MaCv;
    private String MaT;
    private String MaH;
    private String MaCM;
    private String MaTDHV;
    private String MaTDNN;
    private Map<String, ThanNhan> danhSachThanNhan;
    private List<Lilichcongtac> danhSachCongTac;

    public Nhanvien() {
    }


    public String getNgSinh() {
        return DateController.dateToString(NgSinh);
    }

    public void setNgSinh(LocalDate NgSinh) {
        this.NgSinh = NgSinh;
    }

    public String getMaNv() {
        return maNv;
    }

    public void setMaNv(String maNv) {
        this.maNv = maNv;
    }

    public String getTenNv() {
        return tenNv;
    }

    public void setTenNv(String tenNv) {
        this.tenNv = tenNv;
    }

    public boolean isPhai() {
        return Phai;
    }

    public void setPhai(boolean Phai) {
        this.Phai = Phai;
    }

    public String getDc() {
        return Dc;
    }

    public void setDc(String Dc) {
        this.Dc = Dc;
    }

    public String getDienThoai() {
        return DienThoai;
    }

    public void setDienThoai(String DienThoai) {
        this.DienThoai = DienThoai;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getMaPb() {
        return maPb;
    }

    public void setMaPb(String maPb) {
        this.maPb = maPb;
    }

    public String getMaCv() {
        return MaCv;
    }

    public void setMaCv(String MaCv) {
        this.MaCv = MaCv;
    }

    public String getMaT() {
        return MaT;
    }

    public void setMaT(String MaT) {
        this.MaT = MaT;
    }

    public String getMaH() {
        return MaH;
    }

    public void setMaH(String MaH) {
        this.MaH = MaH;
    }

    public String getMaCM() {
        return MaCM;
    }

    public void setMaCM(String MaCM) {
        this.MaCM = MaCM;
    }

    public List<Lilichcongtac> getDanhSachCongTac() {
        return danhSachCongTac;
    }

    public void setDanhSachCongTac(List<Lilichcongtac> danhSachCongTac) {
        this.danhSachCongTac = danhSachCongTac;
    }

    public Map<String, ThanNhan> getDanhSachThanNhan() {
        return danhSachThanNhan;
    }

    public void setDanhSachThanNhan(Map<String, ThanNhan> danhSachThanNhan) {
        this.danhSachThanNhan = danhSachThanNhan;
    }

    public String getMaTDHV() {
        return MaTDHV;
    }

    public void setMaTDHV(String MaTDHV) {
        this.MaTDHV = MaTDHV;
    }

    public String getMaTDNN() {
        return MaTDNN;
    }

    public void setMaTDNN(String MaTDNN) {
        this.MaTDNN = MaTDNN;
    }
    
    
}
