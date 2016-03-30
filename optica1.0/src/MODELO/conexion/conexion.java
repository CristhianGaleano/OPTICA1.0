/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODELO.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author alexisruiz
 */
public class conexion {
    
    private String nameBD="optica1.0";
    private String user="root";
    private String password="1088264375C";
    //localhost por que labd esta en este cliente, de lo contrario colocariamos la ip o la ruta del servidor
    private String url="jdbc:mysql://localhost/"+nameBD;
    
    //definimos un objeto de tipo connection
    Connection conexion=null;
    
    public conexion(){
        
        try {
        
            //ahora indicamos la forma de conectar, buscando el driver
        Class.forName("com.mysql.jdbc.Driver");
        //ahora le indicamos que obtenga la conexion
        conexion=DriverManager.getConnection(url,user,password);
        if(conexion!=null){
            System.out.println("Conexion a la BD: " + nameBD + " exitosa");
        }
        
            
        } catch (ClassNotFoundException e) {
            System.out.println("Ocurrio un error ClassNotFoundException: "+ e.getMessage());
        }catch(SQLException e){
            System.out.println("Ocurrio un error SQLExeption :"+ e.getMessage());
        }
       
    }//fin metodo conexion
    
    //metodo para idicar desconectarnos y conectarnos a la BD
    public Connection getConection(){
        return conexion;
    }
    
    //metodo para cerrar laconexion y no tener la aplicacion sobrecargada
    public void closeConnection(){
        conexion=null;
    }
    
}
