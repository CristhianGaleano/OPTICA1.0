/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODELO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author alexisruiz
 */
public class Conexion {
    public Conexion(){
    }        
        public Connection getConnection(){
            Connection con = null;
            try {
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                con = DriverManager.getConnection("jdbc:mysql://localhost3306/optica1.0","root","1088264375C");
            } catch (SQLException ex) {
            } catch (Exception e){
            }
            
            
            return con;
        }
        
    }

