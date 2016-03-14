/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODELO;

import CONTROLADOR.Cordinador;
import MODELO.ColaCita.Cola;
import MODELO.VO.ClienteVO;

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
                    retorno ="error";
                }
               break;
            case ESPECIALISTA: 
                if(text.equals(PASS_ESPECIALISTA)){
                    retorno="especialista";
                }else{
                    retorno ="error";
                }
       
        }
             return retorno;
   }
    
    //validar campos obligarorios
    public boolean validarCampos(ClienteVO miClienteVO){
            System.out.printf("empezo a validar logica");
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

    
    
}
