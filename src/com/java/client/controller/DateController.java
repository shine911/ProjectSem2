/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.client.controller;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author macos
 */
public class DateController {
    private static SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
    public static String dateToString(Date date){
        return formatter.format(date);
    }
    
    public static Date parseStringtoDate(String date){
        Date result = null;
        try {
            result = formatter.parse(date);
        } catch (ParseException ex) {
            Logger.getLogger(DateController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }
}
