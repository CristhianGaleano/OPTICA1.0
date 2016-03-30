/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODELO.DAO;

import CONTROLADOR.Cordinador;
import MODELO.VO.ClienteVO;
import MODELO.conexion.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author alexisruiz
 */
/*
    COMO ESTA CLASE NO TENNDRA DUPLICADOS A DIFERENCIA DE LA CLASE CLIENTEVO QUE MUCHOS OBJETOS TENDRAN LOS MISMOS ATRIBUTOS, ESTA
    CLASE LA INSTANCIAREMOS UNA SOLA VES EN LA CLASE APLICACION Y LA RELACIONAREMOS CON EL CORDINADR
    */
public class ClienteDAO {
    private Cordinador miCordinador;
    
    public void setCordinador(Cordinador miCordinador) {
        this.miCordinador=miCordinador;
    }

    public String registrarClienteNuevo(ClienteVO miClienteVO) {
        String resultado="";
        Connection connection;
        conexion miConexion = new conexion();
        
        connection=miConexion.getConection();
        PreparedStatement ps=null;
        
        //sentencia SQL
        String SQL="INSERT INTO cliente (documentoCliente,nombresCliente,apellidosCliente,"
                + "fechaNaciCliente,direccionCliente,telefonoCliente, "
                + "email, lugarNaci,ocupacion, estadoCivil, escolaridad, lugarProcedencia, \n" +
"genero, ESP, observacionCliente) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        
        try {
            ps=connection.prepareStatement(SQL);
            ps.setString(1, miClienteVO.getDocumento());
            ps.setString(2, miClienteVO.getNombres());
            ps.setString(3, miClienteVO.getApellidos());
            ps.setString(4, miClienteVO.getFechaNaci());
            ps.setString(5, miClienteVO.getDireccion());
            ps.setString(6, miClienteVO.getTelefono());
            ps.setString(7, miClienteVO.getEmail());
            ps.setString(8, miClienteVO.getLugarNaci());
            ps.setString(9, miClienteVO.getOcupacion());
            ps.setString(10, miClienteVO.getEstadoCivil());
            ps.setString(11, miClienteVO.getEscolaridad());
            ps.setString(12, miClienteVO.getLugarProcedencia());
            ps.setString(13, miClienteVO.getGenero());
            ps.setString(14, miClienteVO.getEPS());
            ps.setString(15, miClienteVO.getObservacion());
            
            
            //ejecutamos este proceso
            ps.execute();
            
            resultado= "OK";
            
        } catch (SQLException e) {
            System.out.println("No se pudo registrar el cliente: "+ e.getMessage());
            resultado="ERROR";
        }
        
        return resultado;
    }

    public ClienteVO consultaCliente(String doc) {
        ResultSet result=null;
         ClienteVO miClienteVO=null;
         
         PreparedStatement ps;
         Connection conection;
         conexion miConexion = new conexion();
         
         conection=miConexion.getConection();
         String SQL="SELECT documentoCliente,nombresCliente,apellidosCliente,"
                + "fechaNaciCliente,direccionCliente,telefonoCliente, "
                + "email, lugarNaci,ocupacion, estadoCivil, escolaridad, lugarProcedencia, \n" +
"genero, ESP, observacionCliente FROM cliente WHERE documentoCliente=?";
         
         
         try {
         
             ps=conection.prepareStatement(SQL);
             ps.setString(1, doc);
             result=ps.executeQuery();
             
             while(result.next()==true){
                 miClienteVO = new ClienteVO();
                 miClienteVO.setDocumento(result.getString("documentoCliente"));
                 miClienteVO.setNombres(result.getString("nombresCliente"));
                 miClienteVO.setApellidos(result.getString("apellidosCliente"));
                 miClienteVO.setFechaNaci(result.getString("fechaNaciCliente"));
                 miClienteVO.setDireccion(result.getString("direccionCliente"));
                 miClienteVO.setTelefono(result.getString("telefonoCliente"));
                 miClienteVO.setEmail(result.getString("email"));
                 miClienteVO.setLugarNaci(result.getString("lugarNaci"));
                 miClienteVO.setOcupacion(result.getString("ocupacion"));
                 miClienteVO.setEstadoCivil(result.getString("estadoCivil"));
                 miClienteVO.setEscolaridad(result.getString("escolaridad"));
                 miClienteVO.setLugarProcedencia(result.getString("lugarProcedencia"));
                 miClienteVO.setGenero(result.getString("genero"));
                 miClienteVO.setEPS(result.getString("ESP"));
                 miClienteVO.setObservacion(result.getString("observacionCliente"));
             }

             
        } catch (SQLException e) {
           System.out.print(e);
        }
         
         
       return miClienteVO;
    }

    public String actualizarDatos(ClienteVO miClienteVo) {
    String result;
    
    
   PreparedStatement ps;
         Connection conection;
         conexion miConexion = new conexion();
         
         conection=miConexion.getConection();
    
        try {
            
            String SQL="UPDATE cliente SET documentoCliente=?, nombresCliente=?, apellidosCliente=?, fechaNaciCliente=?, direccionCliente=?,"
                    + "telefonoCliente=?,email=?,lugarNaci=?,ocupacion=?,estadoCivil=?,escolaridad=?,lugarProcedencia=?,genero=?,ESP=?,"
                    + " observacionCliente=? WHERE documentoCliente='"+miClienteVo.getDocumento()+"'";
            
            
    
            
             ps = conection.prepareStatement(SQL);
             ps.setString(1, miClienteVo.getDocumento());
            ps.setString(2, miClienteVo.getNombres());
            ps.setString(3, miClienteVo.getApellidos());
            ps.setString(4, miClienteVo.getFechaNaci());
            ps.setString(5, miClienteVo.getDireccion());
            ps.setString(6, miClienteVo.getTelefono());
            ps.setString(7, miClienteVo.getEmail());
            ps.setString(8, miClienteVo.getLugarNaci());
            ps.setString(9, miClienteVo.getOcupacion());
            ps.setString(10, miClienteVo.getEstadoCivil());
            ps.setString(11, miClienteVo.getEscolaridad());
            ps.setString(12, miClienteVo.getLugarProcedencia());
            ps.setString(13, miClienteVo.getGenero());
            ps.setString(14, miClienteVo.getEPS());
            ps.setString(15, miClienteVo.getObservacion());
            
            ps.executeUpdate();
            
            result="ok";
            
          
            
        } catch (SQLException e) {
            System.out.println(e);
            result="error";
        }
   
    return result;
    }

    public String eleminarCliente(String doc) {
        String result="";
        
        Connection connectio;
        conexion miConexion = new conexion();
        
        PreparedStatement ps=null;
        
        connectio=miConexion.getConection();
        
        String SQL="DELETE FROM cliente WHERE documentoCliente='"+doc+"'";
        try {
            
            ps=connectio.prepareStatement(SQL);
            ps.execute();
            
            result="ok";
            
        } catch (SQLException e) {
            System.out.println(e);
            result="error";
        }
        
        
        return result;
    }
    
    
}
