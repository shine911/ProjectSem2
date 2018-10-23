/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.model;

import java.util.List;

/**
 *
 * @author macos
 */
public class Chuyenmon_Trinhdo {
    private Chuyenmon cm;
    private List<TDHV> tdhv;

    public Chuyenmon_Trinhdo(Chuyenmon cm, List<TDHV> tdhv) {
        this.cm = cm;
        this.tdhv = tdhv;
    }

    public Chuyenmon getCm() {
        return cm;
    }

    public void setCm(Chuyenmon cm) {
        this.cm = cm;
    }

    public List<TDHV> getTdhv() {
        return tdhv;
    }

    public void setTdhv(List<TDHV> tdhv) {
        this.tdhv = tdhv;
    }
    
    
}
