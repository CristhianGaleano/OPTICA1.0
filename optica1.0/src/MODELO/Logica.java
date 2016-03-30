/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODELO;

import CONTROLADOR.Cordinador;
import MODELO.ColaCita.Cola;
import MODELO.VO.ClienteVO;
import MODELO.VO.HistoriaVO;
import MODELO.conexion.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTextField;

/**
 *
 * @author alexisruiz
 */
public class Logica {
    private  final int SELECCION=0;
    private  final int ADMINISTRADOR=1;
    private  final int ESPECIALISTA=2;
    private  final String PASS_ADMIN="admin";
    private  final String PASS_ESPECIALISTA="espe";
    private Cordinador miCordinador;
    private Cola miCola;

    public void setCordinador(Cordinador miCordinador) {
        this.miCordinador=miCordinador;
    }

    public String validarIngresos(int selectedIndex, String text) {
        String retorno = "";
        if(selectedIndex == SELECCION){
            retorno  = "error";
        }else{
            retorno=validarPass(selectedIndex,text);
        }
        return retorno;
    }
    
    public String validarPass(int index,String text){
        String retorno="";
        switch(index){
            case ADMINISTRADOR: 
                if(text.equals(PASS_ADMIN)){
                    retorno="administrador"; 
                }else{
                    retorno ="error_contra";
                }
               break;
            case ESPECIALISTA: 
                if(text.equals(PASS_ESPECIALISTA)){
                    retorno="especialista";
                }else{
                    retorno ="error_contra";
                }
       
        }
             return retorno;
   }
    
    //validar campos obligarorios
    public boolean validarCampos(ClienteVO miClienteVO){
            
        boolean docu;
        boolean nomb;
        boolean ape;
        boolean fecha;
        boolean tele;
        
        String doc=miClienteVO.getDocumento();
        String nombres=miClienteVO.getNombres();
        String apellidos=miClienteVO.getApellidos();
        String fechaNaci=miClienteVO.getFechaNaci();
        String telefono=miClienteVO.getTelefono();
        
        if(doc!=null && !doc.equals("")){
            docu=true;
        }else{
            docu=false;
        }
        
        if(nombres!=null && !nombres.equals("")){
            nomb=true;
        }else{
            nomb=false;
        }
        
        if(apellidos!=null && !apellidos.equals("")){
            ape=true;
        }else{
            ape=false;
        }
        
        if(fechaNaci!=null && !fechaNaci.equals("")){
            fecha=true;
        }else{
            fecha=false;
        }
        
        if(telefono!=null && !telefono.equals("")){
            tele=true;
        }else{
            tele=false;
        }
        
        if(docu==true && nomb==true && ape==true && fecha ==true && tele == true){
            return true;
        }else{
            return false;
        }
        
          
    }

    public Boolean validarHistoriaVacia(String Documento) {
        boolean result=false;
  
        PreparedStatement ps;
        ResultSet rs=null; 
        conexion miConexion=new conexion();
        Connection miConnection=null;
        
        miConnection=miConexion.getConection();
        

        String SQL="SELECT historiaClinica.cliente_idcliente,historiaClinica.cliente_documentoCliente FROM historiaClinica,cliente WHERE"
                + " historiaClinica.cliente_idcliente=cliente.idcliente AND historiaClinica.cliente_documentoCliente="
                + "cliente.documentoCliente AND cliente.documentoCliente='"+Documento+"'";
        try {
            System.out.println("Documento seteado: "+ Documento);
            ps=miConnection.prepareStatement(SQL);
            rs=ps.executeQuery();
            if(rs.next()){
                result=false;
            }
            else{
                result=true;
            }
        } catch (SQLException e) {
            System.out.println(e);
            
        }
        
        
        return result;
    }

    public Boolean validarHistoriaClinica(HistoriaVO miHistoriaVO) {
        //Aqui debemos validar los campos obligatorios,campos obligatorios: 
        //Alcolico, fumador, accidentes, fecha y examenFisico.
        
        Boolean alcolico,fumador,accidentes,fecha, examenFsico;
        Boolean alco,fuma,acci;
        String fechaH, examenF;
        
        alco=miHistoriaVO.getAlcoholico();
        fuma=miHistoriaVO.getFumador();
        acci=miHistoriaVO.getAccidentes();
        fechaH=miHistoriaVO.getFechaHistoria();
        examenF=miHistoriaVO.getExamenFisico();
        
        if(alco!=null && !alco.equals("")){
            alcolico=true;
        }else{
            alcolico=false;
        }
        
        if(fuma!=null && !fuma.equals("")){
            fumador=true;
        }else{
            fumador=false;
        }
        
        if(acci!=null && !acci.equals("")){
            accidentes=true;
        }else{
            accidentes=false;
        }
        
        if(fechaH!=null && !fechaH.equals("")){
            fecha=true;
        }else{
            fecha=false;
        }
        
        if(examenF!=null && !examenF.equals("")){
            examenFsico=true;
        }else{
            examenFsico=false;
        }
        
        
        if(alcolico==true && fumador==true && accidentes && true && fecha==true && examenFsico==true){
            return true;
        }else{
            return false;
        }
        
        
        
    }

    
    
}
