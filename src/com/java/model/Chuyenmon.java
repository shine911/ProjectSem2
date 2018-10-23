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
public class Chuyenmon {
    private String maCM;
    private String tenCM;

    public Chuyenmon(String maCM, String tenCM) {
        this.maCM = maCM;
        this.tenCM = tenCM;
    }

    public String getMaCM() {
        return maCM;
    }

    public void setMaCM(String maCM) {
        this.maCM = maCM;
    }

    public String getTenCM() {
        return tenCM;
    }

    public void setTenCM(String tenCM) {
        this.tenCM = tenCM;
    }
    
}
