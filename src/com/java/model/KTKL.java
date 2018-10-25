/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.model;

/**
 *
 * @author STUDENT
 */
public class KTKL {
    private String maKTKL;
    private String tenKTKL;
    private String HinhThuc;
    private int Sotien;

    public KTKL(String maKTKL, String tenKTKL, String HinhThuc, int Sotien) {
        this.maKTKL = maKTKL;
        this.tenKTKL = tenKTKL;
        this.HinhThuc = HinhThuc;
        this.Sotien = Sotien;
    }

    public String getMaKTKL() {
        return maKTKL;
    }

    public void setMaKTKL(String maKTKL) {
        this.maKTKL = maKTKL;
    }

    public String getTenKTKL() {
        return tenKTKL;
    }

    public void setTenKTKL(String tenKTKL) {
        this.tenKTKL = tenKTKL;
    }

    public String getHinhThuc() {
        return HinhThuc;
    }

    public void setHinhThuc(String HinhThuc) {
        this.HinhThuc = HinhThuc;
    }

    public int getSotien() {
        if(this.HinhThuc.equals("Reward")){
            return Sotien;
        }
        return -Sotien;
    }

    public void setSotien(int Sotien) {
        this.Sotien = Sotien;
    }
    
}
