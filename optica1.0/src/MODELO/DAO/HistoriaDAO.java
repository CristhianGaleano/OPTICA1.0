/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODELO.DAO;

import CONTROLADOR.Cordinador;
import MODELO.VO.ClienteVO;
import MODELO.VO.HistoriaVO;
import MODELO.conexion.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author alexisruiz
 */
public class HistoriaDAO {

    private Cordinador miCOrdinador;

    public void setCordinador(Cordinador miCordinador) {
        this.miCOrdinador=miCordinador;
    }

    public void setRegistrarHistoriaClinica(String doc, HistoriaVO miHistoriaVO) {
        int id=0;
        String docu="";
        
        Connection miConnection=null;
        conexion miConexion= new conexion();
        PreparedStatement ps=null;
        miConnection=miConexion.getConection();
        
        String SQLs="SELECT idcliente,documentoCliente FROM cliente WHERE documentoCliente=?";
        
        try {
            
            ps=miConnection.prepareStatement(SQLs);   
        ps.setString(1, doc);
        ResultSet rs=ps.executeQuery();
        
        while(rs.next()){
             id=rs.getInt("idcliente");
             docu=rs.getString("documentoCliente");
        }
            
        } catch (SQLException e) {
            System.out.println(e);
        }
        
        String SQL="INSERT INTO historiaClinica(alcolico, fumador, accidentes, detalleAccidentes, "
                + "parientePatologico, detalleHistoricoFamiliar, fechaHistoria, examenFisico, detalleEnfermedades,"
                + "cliente_idcliente, cliente_documentoCliente) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
        
        try {
        ps=miConnection.prepareStatement(SQL);   
        ps.setBoolean(1, miHistoriaVO.getAlcoholico());
        ps.setBoolean(2, miHistoriaVO.getFumador());
        ps.setBoolean(3, miHistoriaVO.getAccidentes());
        ps.setString(4, miHistoriaVO.getDetalleAccidentes());
        ps.setString(5, miHistoriaVO.getParientePatologico());
        ps.setString(6, miHistoriaVO.getDetalleHistoricoFamiliar());
        ps.setString(7, miHistoriaVO.getFechaHistoria());
        ps.setString(8, miHistoriaVO.getExamenFisico());
        ps.setString(9, miHistoriaVO.getDetalleEnfermedades());
        ps.setString(10, String.valueOf(id));
        ps.setString(11,docu);
        ps.execute();
            
            
        } catch (SQLException e) {
            System.out.println(e);
        }
        
    }

    public HistoriaVO consultarHistoriaClinica(String  documento) {
        Connection miConnection=null;
        conexion miConexion= new conexion();
        PreparedStatement ps=null;
        ResultSet rs;
        miConnection=miConexion.getConection();
        int id=0;
        String doc="";
        HistoriaVO miHistoriaClinicaVO = new HistoriaVO();
        
        
//        String SQLS="SELECT idcliente,documentoCliente FROM cliente WHERE documentoCliente='"+documento;
//        try {
//            ps=miConnection.prepareStatement(SQLS);
//            rs=ps.executeQuery();
//            while (rs.next()) {
//                id=rs.getInt("idcliente");
//                doc=rs.getString("documentoCliente");
//            }
//        } catch (SQLException e) {
//            System.out.println(e);
//        }
        
        String SQL="SELECT alcolico, fumador, accidentes, detalleAccidentes, parientePatologico,"
                + " detalleHistoricoFamiliar, fechaHistoria, examenFisico, detalleEnfermedades, cliente_idcliente,"
                + "cliente_documentoCliente FROM historiaClinica WHERE cliente_documentoCliente=?";
        
        
        try {
           
           
            ps=miConnection.prepareStatement(SQL);
              ps.setString(1, documento);
            rs=ps.executeQuery();
            while (rs.next()) {                
                miHistoriaClinicaVO.setAlcoholico(Boolean.valueOf(rs.getBoolean("alcolico")));
                miHistoriaClinicaVO.setFumador(Boolean.valueOf(rs.getBoolean("fumador")));
                miHistoriaClinicaVO.setAccidentes(Boolean.valueOf(rs.getBoolean("accidentes")));
                miHistoriaClinicaVO.setDetalleAccidentes(rs.getString("detalleAccidentes"));
                miHistoriaClinicaVO.setParientePatologico(rs.getString("parientePatologico"));
                miHistoriaClinicaVO.setDetalleHistoricoFamiliar(rs.getString("detalleHistoricoFamiliar"));
                miHistoriaClinicaVO.setFechaHistoria(rs.getString("fechaHistoria"));
                miHistoriaClinicaVO.setExamenFisico(rs.getString("examenFisico"));
                miHistoriaClinicaVO.setDetalleEnfermedades(rs.getString("detalleEnfermedades"));
                
            }
            
        } catch (Exception e) {
             System.out.println(e);
        }
            
           return miHistoriaClinicaVO; 
    }
    
}
