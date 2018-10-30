/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.model;

import com.java.model.dao.CM_TDHVDAO;
import java.util.Map;

/**
 *
 * @author macos
 */
public class Chuyenmon {
    private String maCM;
    private String tenCM;
    private Map<String, TDHV> TDHV;

    public Chuyenmon(String maCM, String tenCM) {
        this.maCM = maCM;
        this.tenCM = tenCM;
        this.TDHV = CM_TDHVDAO.getTrinhTheoCM(this.maCM);
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

    public Map<String, TDHV> getTDHV() {
        return TDHV;
    }

    public void setTDHV(Map<String, TDHV> TDHV) {
        this.TDHV = TDHV;
    }
    
    public TDHV getTDHV(String MaTDHV){
        return this.getTDHV().get(MaTDHV);
    }

    @Override
    public String toString() {
        return this.tenCM;
    }
    
    
    
}
