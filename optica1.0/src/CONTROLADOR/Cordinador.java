/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLADOR;

import MODELO.ColaCita.Cola;
import MODELO.DAO.ClienteDAO;
import MODELO.DAO.HistoriaDAO;
import MODELO.Logica;
import MODELO.VO.ClienteVO;
import MODELO.VO.HistoriaVO;
import VISTA.ClienteNuevo;
import VISTA.ConsultarCliente;
import VISTA.Escritorio;
import VISTA.Login;
import VISTA.AtenderCliente;
import VISTA.FormularioHistoriaClinica;
import VISTA.HistoriaClinica;
import VISTA.OrdenServicio;
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
    private HistoriaClinica miHistoria;
    private JDesktopPane JDPEscritorio;
    private OrdenServicio miOrden;
    private FormularioHistoriaClinica miFormularioHistoria;
    private HistoriaDAO miHistoriaDAO;
    private ClienteVO ClienteVO;

    public Cordinador(JDesktopPane JDPEscritorio) {
        this.JDPEscritorio = JDPEscritorio;
    }

    void setMiFormularioHistoria(FormularioHistoriaClinica miFormularioHistoria) {
        this.miFormularioHistoria = miFormularioHistoria;
    }

    void setMiHistoriaDAO(HistoriaDAO miHistoriaDAO) {
        this.miHistoriaDAO = miHistoriaDAO;
    }

    void setMiConsultaCliente(ConsultarCliente miConsultaCliente) {
        this.miConsultaCliente = miConsultaCliente;
    }

    void setMiHistoriaClinica(HistoriaClinica miHistoria) {
        this.miHistoria = miHistoria;
    }

    void setVistaPrincipal(Escritorio vistaPrincipal) {
        this.vistaPrincipal = vistaPrincipal;
    }

    void setMiLogica(Logica miLogica) {
        this.miLogica = miLogica;
    }

    void setInicio(Login login) {
        this.login = login;
    }

    void setClienteNuevo(ClienteNuevo miClienteNuevo) {
        this.miNuevoCliente = miClienteNuevo;
    }

    void setMiOrden(OrdenServicio miOrden) {
        this.miOrden = miOrden;
    }

    void setClienteDAO(ClienteDAO miClienteDAO) {
        this.miClienteDAO = miClienteDAO;
    }

    void setMiAtenderCliente(AtenderCliente miAtenderCliente) {
        this.miAtenderCliente = miAtenderCliente;
    }

    public String validarIngreso(int selectedIndex, String text) {
        return miLogica.validarIngresos(selectedIndex, text);
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
        this.miCola = miCola;
    }

    public void iniciarConsultaCliente() {
        JDPEscritorio.add(miConsultaCliente);
        miConsultaCliente.setVisible(true);
    }

    public void iniciarVentanaClienteNuevo() {
        JDPEscritorio.add(miNuevoCliente);
        miNuevoCliente.setVisible(true);
    }

    public void iniciarVentanaAreaCita() {
        JDPEscritorio.add(miAtenderCliente);
        miAtenderCliente.setVisible(true);
    }

    public void iniciarMostrarHistoriaClinica(ClienteVO miClienteVO) {
        this.ClienteVO=miClienteVO;
        miHistoria.datos(miClienteVO);
        JDPEscritorio.add(miHistoria);
        miHistoria.setVisible(true);
    }

    public ClienteVO consultaCliente(String doc) {
        return miClienteDAO.consultaCliente(doc);
    }

    public void cerrarConsultaCliente() {
        miConsultaCliente.dispose();
    }

    public boolean validarCliente(ClienteVO miClienteVo) {

        return miLogica.validarCampos(miClienteVo);
    }

    public String actualizarDatos(ClienteVO miClienteVo) {

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

    public void iniciarMiOrden() {
        JDPEscritorio.add(miOrden);
        miOrden.setVisible(true);
    }

    public Boolean historiaVacia(String Documento) {
        return miLogica.validarHistoriaVacia(Documento);
    }

    public void showFormularioHistoriaClinica(ClienteVO miCLienteVO) {
        this.ClienteVO=miCLienteVO;
        miFormularioHistoria.datos(this.ClienteVO);
        JDPEscritorio.add(miFormularioHistoria);
        miFormularioHistoria.setVisible(true);
    }

    

    public void registrarHistoriaClinica(String docCliente, HistoriaVO miHistoriaVO) {
        miHistoriaDAO.setRegistrarHistoriaClinica(docCliente,miHistoriaVO);
    }

    public Boolean validarHistoriaClinica(HistoriaVO miHistoriaVO) {
        return miLogica.validarHistoriaClinica(miHistoriaVO);
    }

    public void closeFormularioHistoriaClinica() {
        miFormularioHistoria.dispose();
    }

    public HistoriaVO consultarHistoriaClinica(String doc) {
        return miHistoriaDAO.consultarHistoriaClinica(doc);
    }

    public void closeHistoriaClinica() {
    miHistoria.dispose();
    }

}
