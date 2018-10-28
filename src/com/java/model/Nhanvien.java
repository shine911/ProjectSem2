/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.model;

import com.java.model.dao.ThanNhanDAO;
import java.io.Serializable;
import java.util.Date;
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
    private Date NgSinh;
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

    public Nhanvien(String maNv, String tenNv, boolean Phai, Date NgSinh, String Dc, String DienThoai, String Email, String Password, String maPb, String MaCv, String MaT, String MaH, String MaCM, String MaTDHV, String MaTDNN) {
        this.maNv = maNv;
        this.tenNv = tenNv;
        this.Phai = Phai;
        this.NgSinh = NgSinh;
        this.Dc = Dc;
        this.DienThoai = DienThoai;
        this.Email = Email;
        this.Password = Password;
        this.maPb = maPb;
        this.MaCv = MaCv;
        this.MaT = MaT;
        this.MaH = MaH;
        this.MaCM = MaCM;
        this.MaTDHV = MaTDHV;
        this.MaTDNN = MaTDNN;
    }

    public Date getNgSinh() {
        return NgSinh;
    }

    public void setNgSinh(Date NgSinh) {
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
