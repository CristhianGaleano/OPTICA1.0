/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLADOR;

import MODELO.ColaCita.Cola;
import MODELO.DAO.ClienteDAO;
import MODELO.Logica;
import MODELO.VO.ClienteVO;
import VISTA.ClienteNuevo;
import VISTA.ConsultarCliente;
import VISTA.Escritorio;
import VISTA.Login;
import VISTA.AtenderCliente;
import javax.swing.JDesktopPane;



   public class Cordinador {

    private Escritorio vistaPrincipal;
    private Logica miLogica;
    private Login login;
    private ClienteNuevo miNuevoCliente;
    private ClienteDAO miClienteDAO;
    private ConsultarCliente miConsultaCliente;
    private AtenderCliente miAtenderCliente;
    private Cola miCola;
 

   void setMiConsultaCliente(ConsultarCliente miConsultaCliente) {
        this.miConsultaCliente=miConsultaCliente;
    }
 
    
    void setVistaPrincipal(Escritorio vistaPrincipal) {
        this.vistaPrincipal=vistaPrincipal;
    }

    void setMiLogica(Logica miLogica) {
        this.miLogica=miLogica;        
    }

    void setInicio(Login login) {
        this.login=login;
    }
    void setClienteNuevo(ClienteNuevo miClienteNuevo){
        this.miNuevoCliente=miClienteNuevo;
    }

    void setClienteDAO(ClienteDAO miClienteDAO) {
        this.miClienteDAO=miClienteDAO;
    }
    
    void setMiAtenderCliente(AtenderCliente miAtenderCliente) {
        this.miAtenderCliente=miAtenderCliente;
    }
    
    public String validarIngreso(int selectedIndex, String text) {
       return miLogica.validarIngresos(selectedIndex,text);        
    }

    public void cerrarVentana() {
        login.dispose();
    }

    public void asignarPrivilegios(String result) {
        vistaPrincipal.asignarPrivilegios(result);
    }

    public void cambiarUsuario() {
        login.setVisible(true);
    }

    public void cerrarVentanaClienteNuevo() {
       miNuevoCliente.dispose();
    }

    public String registrarCliente(ClienteVO miClienteVO) {
        return miClienteDAO.registrarClienteNuevo(miClienteVO);
    }

    
    void setMiNodo(Cola miCola) {
        this.miCola=miCola;
    }
   
    
    public void iniciarConsultaCliente(JDesktopPane JDPEscritorio) {
     JDPEscritorio.add(miConsultaCliente);
     miConsultaCliente.setVisible(true);
    }

    public void iniciarVentanaClienteNuevo(JDesktopPane JDPEscritorio) {
     JDPEscritorio.add(miNuevoCliente);
     miNuevoCliente.setVisible(true);
    }

    public void iniciarVentanaAreaCita(JDesktopPane JDPEscritorio) {
       JDPEscritorio.add(miAtenderCliente);
     miAtenderCliente.setVisible(true);
    }
    
    public ClienteVO consultaCliente(String doc) {
        return miClienteDAO.consultaCliente(doc);
    }

    public void cerrarConsultaCliente() {
       miConsultaCliente.dispose();
    }

    public boolean validarCliente(ClienteVO miClienteVo) {
            System.out.printf("llego a validarcliente cordinador");
        return miLogica.validarCampos(miClienteVo);
    }

    public String actualizarDatos(ClienteVO miClienteVo) {
            System.out.printf("llego a actualizardatosCordinador");
    return miClienteDAO.actualizarDatos(miClienteVo);
    }

    public String eliminarCliente(String doc) {
        return miClienteDAO.eleminarCliente(doc);
    }

    public void closeAplication() {
        System.exit(0);
    }

    public void enviarCitaCola(String doc) {
       miCola.insertar(doc);
    }
    

    public String consultarCola() {
       return miCola.quitar();
    }

    public String waitingLook() {
       return miCola.inicioCola();
    }

    public int mostrarEnEspera() {
        return miCola.tamano();
    }

    public void closeGestionarCliente() {
       miAtenderCliente.dispose();
    }

    
    

    
    
    
    
}

