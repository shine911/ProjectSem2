/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.config;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author macos
 */
public class ConnectionUtil {
    public static ConnectionUtil obj = null;
    private String user = "sa";
    private String password = "123456";
    private String database = "sql";
    private String hostUrl = "jdbc:sqlserver://192.168.1.6;databaseName="+database;
    private ConnectionUtil(){
    }
    
    public static ConnectionUtil getInstance(){
        if(obj == null){
            obj = new ConnectionUtil();
        }
        return obj;
    }
    
    public Connection getConnection(){
        Connection connect = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connect = DriverManager.getConnection(hostUrl,user,password);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(ConnectionUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
        return connect;
    }
    
    public ResultSet getResultSet(String sql) throws SQLException{
        Statement st = this.getConnection().createStatement();
        st.execute(sql);
        return st.getResultSet();
    }
}
