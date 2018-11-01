/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.client.controller;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
/**
 *
 * @author macos
 */
public class DateController {
    public static String dateToString(LocalDate date){
        return date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }
    
    public static LocalDate parseStringtoLocalDate(String date){
        return LocalDate.parse(date, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }
    
    public static boolean checkDateFormat(String date){
                /*RegEx Contributor: Alok Chaudhary
         Read more: https://stackoverflow.com/questions/15491894/regex-to-validate-date-format-dd-mm-yyyy
         */
        return date.matches("^(?:(?:31(\\/|-|\\.)"
                + "(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)"
                + "(?:0?[1,3-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|"
                + "^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|"
                + "[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))"
                + "$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))"
                + "\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$");
    }
}
