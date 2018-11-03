/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.client.controller;

import com.java.model.Mucluong;
import javax.swing.JOptionPane;

/**
 *
 * @author macos
 */
public class MucLuongController {
    public static boolean KiemTraMucLuong(Mucluong truoc, Mucluong sau){
        if(truoc.getSoTien()>sau.getSoTien()){
            return false;
        }
        return true;
    }
}
