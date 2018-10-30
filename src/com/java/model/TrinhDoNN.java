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
public class TrinhDoNN {
    String MaTDNN;
    String TenTDNN;

    public TrinhDoNN(String MaTDNN, String TenTDNN) {
        this.MaTDNN = MaTDNN;
        this.TenTDNN = TenTDNN;
    }

    public String getMaTDNN() {
        return MaTDNN;
    }

    public void setMaTDNN(String MaTDNN) {
        this.MaTDNN = MaTDNN;
    }

    public String getTenTDNN() {
        return TenTDNN;
    }

    public void setTenTDNN(String TenTDNN) {
        this.TenTDNN = TenTDNN;
    }
    
    
}
