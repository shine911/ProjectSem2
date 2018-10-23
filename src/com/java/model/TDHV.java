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
public class TDHV{
    private String MaTDHV;
    private String tenTDHV;

    public TDHV(String MaTDHV, String tenTDHV) {
        this.MaTDHV = MaTDHV;
        this.tenTDHV = tenTDHV;
    }

    public String getMaTDHV() {
        return MaTDHV;
    }

    public void setMaTDHV(String MaTDHV) {
        this.MaTDHV = MaTDHV;
    }

    public String getTenTDHV() {
        return tenTDHV;
    }

    public void setTenTDHV(String tenTDHV) {
        this.tenTDHV = tenTDHV;
    }

 
    
}
