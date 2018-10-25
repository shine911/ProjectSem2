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
public class Mucluong {
    private String MaML;
    private int SoTien;

    public Mucluong(String MaML, int SoTien) {
        this.MaML = MaML;
        this.SoTien = SoTien;
    }

    public String getMaML() {
        return MaML;
    }

    public void setMaML(String MaML) {
        this.MaML = MaML;
    }

    public int getSoTien() {
        return SoTien;
    }

    public void setSoTien(int SoTien) {
        this.SoTien = SoTien;
    }
    
}
