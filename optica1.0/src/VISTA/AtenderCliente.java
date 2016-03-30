package VISTA;

import CONTROLADOR.Cordinador;
import MODELO.VO.ClienteVO;
import javax.swing.JOptionPane;
import javax.swing.JFrame;

/**
 *
 * @author alexisruiz
 */
public class AtenderCliente extends javax.swing.JInternalFrame {

    private Cordinador miCordinador;
    private JFrame miEscritorio;

    /**
     * Creates new form ConsultarCliente
     */
    public AtenderCliente() {
        initComponents();
        setBounds(5, 10, 1250, 600);

    }
    
    void clean(){
    jtfDocumento.setText("");
            jtfNombres.setText("");
            jtfApellidos.setText("");
            jtfFechaNaci.setText("");
            jtfDireccion.setText("");
            jtfTelefono.setText("");
            jtfEmail.setText("");
            jtfLugarNaci.setText("");
            jtfOcupacion.setText("");
            jtfEstadoCivil.setText("");
            jtfEscolaridad.setText("");
            jtfLugarProcedencia.setText("");
            jtfGenero.setText("");
            jtfEPS.setText("");
            jtfObservacion.setText("");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtfFechaNaci = new javax.swing.JTextField();
        jtfDocumento = new javax.swing.JTextField();
        jtfNombres = new javax.swing.JTextField();
        jtfApellidos = new javax.swing.JTextField();
        jtfTelefono = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jtfDireccion = new javax.swing.JTextField();
        jtfObservacion = new javax.swing.JTextField();
        jtfEscolaridad = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jtfLugarNaci = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jtfOcupacion = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jtfLugarProcedencia = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jtfEmail = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jtfEstadoCivil = new javax.swing.JTextField();
        jtfGenero = new javax.swing.JTextField();
        jtfEPS = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jbOrdenPedido = new javax.swing.JButton();
        jbHistoriaClinica1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jbLookNext = new javax.swing.JButton();
        jbSiguiente = new javax.swing.JButton();
        jbMostrarEnEspera = new javax.swing.JButton();
        jbClose = new javax.swing.JButton();

        setIconifiable(true);
        setTitle("AREA DE CITA");
        getContentPane().setLayout(null);

        jPanel1.setMaximumSize(new java.awt.Dimension(82767, 32767));
        jPanel1.setMinimumSize(new java.awt.Dimension(300, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 600));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(51, 51, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ATENCION PACIENTE");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(290, 20, 430, 40);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(10, 10, 1070, 80);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setLayout(null);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("DATOS PACIENTE"));
        jPanel4.setLayout(null);

        jLabel3.setText("Documento");
        jPanel4.add(jLabel3);
        jLabel3.setBounds(17, 29, 100, 15);

        jLabel4.setText("Apellidos");
        jPanel4.add(jLabel4);
        jLabel4.setBounds(520, 30, 65, 15);

        jLabel5.setText("Nombres");
        jPanel4.add(jLabel5);
        jLabel5.setBounds(290, 30, 63, 15);

        jLabel6.setText("Fecha nacimiento");
        jPanel4.add(jLabel6);
        jLabel6.setBounds(520, 70, 124, 15);
        jPanel4.add(jtfFechaNaci);
        jtfFechaNaci.setBounds(520, 90, 130, 19);

        jtfDocumento.setEditable(false);
        jPanel4.add(jtfDocumento);
        jtfDocumento.setBounds(40, 50, 150, 19);
        jPanel4.add(jtfNombres);
        jtfNombres.setBounds(300, 50, 200, 19);
        jPanel4.add(jtfApellidos);
        jtfApellidos.setBounds(520, 50, 200, 19);
        jPanel4.add(jtfTelefono);
        jtfTelefono.setBounds(520, 130, 170, 19);

        jLabel8.setText("Escolaridad");
        jPanel4.add(jLabel8);
        jLabel8.setBounds(20, 70, 90, 15);
        jPanel4.add(jtfDireccion);
        jtfDireccion.setBounds(40, 130, 230, 19);

        jtfObservacion.setText("No hay observaciones del cliente");
        jPanel4.add(jtfObservacion);
        jtfObservacion.setBounds(20, 280, 400, 60);
        jPanel4.add(jtfEscolaridad);
        jtfEscolaridad.setBounds(40, 90, 200, 19);

        jLabel9.setText("Direccion");
        jPanel4.add(jLabel9);
        jLabel9.setBounds(20, 110, 65, 15);
        jPanel4.add(jtfLugarNaci);
        jtfLugarNaci.setBounds(40, 210, 200, 19);

        jLabel10.setText("Lugar de nacimiento");
        jPanel4.add(jLabel10);
        jLabel10.setBounds(20, 190, 150, 15);
        jPanel4.add(jtfOcupacion);
        jtfOcupacion.setBounds(520, 170, 200, 19);

        jLabel11.setText("Ocupacion");
        jPanel4.add(jLabel11);
        jLabel11.setBounds(510, 150, 80, 15);

        jLabel12.setText("Estado civil");
        jPanel4.add(jLabel12);
        jLabel12.setBounds(290, 110, 90, 15);

        jLabel13.setText("Genero");
        jPanel4.add(jLabel13);
        jLabel13.setBounds(290, 70, 65, 15);
        jPanel4.add(jtfLugarProcedencia);
        jtfLugarProcedencia.setBounds(300, 210, 170, 19);

        jLabel14.setText("Telefono");
        jPanel4.add(jLabel14);
        jLabel14.setBounds(510, 110, 65, 20);

        jLabel15.setText("E-mail");
        jPanel4.add(jLabel15);
        jLabel15.setBounds(20, 150, 42, 15);
        jPanel4.add(jtfEmail);
        jtfEmail.setBounds(40, 170, 200, 19);

        jLabel16.setText("EPS");
        jPanel4.add(jLabel16);
        jLabel16.setBounds(290, 150, 65, 15);
        jPanel4.add(jtfEstadoCivil);
        jtfEstadoCivil.setBounds(300, 130, 170, 19);
        jPanel4.add(jtfGenero);
        jtfGenero.setBounds(300, 90, 170, 19);
        jPanel4.add(jtfEPS);
        jtfEPS.setBounds(300, 170, 170, 19);

        jLabel17.setText("Lugar de procedencia");
        jPanel4.add(jLabel17);
        jLabel17.setBounds(290, 190, 160, 15);

        jPanel3.add(jPanel4);
        jPanel4.setBounds(10, 20, 790, 350);

        jPanel6.setBackground(new java.awt.Color(153, 153, 153));
        jPanel6.setLayout(null);

        jbOrdenPedido.setText("ORDEN DE PEDIDO");
        jbOrdenPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbOrdenPedidoActionPerformed(evt);
            }
        });
        jPanel6.add(jbOrdenPedido);
        jbOrdenPedido.setBounds(180, 20, 180, 40);

        jbHistoriaClinica1.setText("HISTORIA CLINICA");
        jbHistoriaClinica1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbHistoriaClinica1ActionPerformed(evt);
            }
        });
        jPanel6.add(jbHistoriaClinica1);
        jbHistoriaClinica1.setBounds(10, 20, 155, 40);

        jPanel3.add(jPanel6);
        jPanel6.setBounds(10, 380, 790, 70);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(10, 100, 820, 460);

        jPanel5.setBackground(new java.awt.Color(204, 204, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel5.setLayout(null);

        jbLookNext.setText("LOOK NEXT");
        jbLookNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLookNextActionPerformed(evt);
            }
        });
        jPanel5.add(jbLookNext);
        jbLookNext.setBounds(20, 70, 170, 40);

        jbSiguiente.setText("NEXT");
        jbSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSiguienteActionPerformed(evt);
            }
        });
        jPanel5.add(jbSiguiente);
        jbSiguiente.setBounds(20, 20, 170, 40);

        jbMostrarEnEspera.setText("How have in waiting?");
        jbMostrarEnEspera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMostrarEnEsperaActionPerformed(evt);
            }
        });
        jPanel5.add(jbMostrarEnEspera);
        jbMostrarEnEspera.setBounds(10, 120, 200, 40);

        jPanel1.add(jPanel5);
        jPanel5.setBounds(860, 100, 220, 340);

        jbClose.setText("CLOSE");
        jbClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCloseActionPerformed(evt);
            }
        });
        jPanel1.add(jbClose);
        jbClose.setBounds(860, 460, 220, 100);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1090, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbLookNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLookNextActionPerformed

        String result = miCordinador.waitingLook();
        JOptionPane.showMessageDialog(null, "Paciente en espera: " + result, "NEXT ", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jbLookNextActionPerformed

    private void jbOrdenPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbOrdenPedidoActionPerformed
        // TODO add your handling code here:
        miCordinador.iniciarMiOrden();

    }//GEN-LAST:event_jbOrdenPedidoActionPerformed

    private void jbSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSiguienteActionPerformed
        // TODO add your handling code here:

        //IMPORTANTE,COMO PRIMERA VALIDADCION PARA UN SISTEMA INNOVADOR SE DEBE CREAR UNA ALERTA PARA CUANDO EL PACIENTE PASE A LA 
        //CITA Y ES EVALUAR SI ESTE TIENE HISTORIA CLINICA EN LA OPTICA DE SER ASI NO OCURRE NADA, DE LO CONTRARIO SE MOSTRARA
        //UN MENSAJE DE ALERTA INDICANDO ESTA NOVEDAD Y PROCEDERA A MOSTRAR EL FORMULARIO
        //objetivo: traer el documento del paciente en cola 
        String doc = miCordinador.consultarCola();
        //jtfDocumento.setText(doc);

        Boolean vacia = miCordinador.historiaVacia(doc);

        if (vacia) {
          
            JOptionPane.showMessageDialog(null, "El paciente no tiene historia clinica", "Debe crear la historia del paciente", JOptionPane.WARNING_MESSAGE);
            
            
            ClienteVO miClienteVO = new ClienteVO();

            //busca cliente por documento y recoge los datos pasandoselos a las cajas del formulario, previamnete validando si 
            //ha encontrado resultado de lo contrario marcara error
        miClienteVO = miCordinador.consultaCliente(doc);
        
        if (miClienteVO != null) {
            jtfDocumento.setText(miClienteVO.getDocumento());
            jtfNombres.setText(miClienteVO.getNombres());
            jtfApellidos.setText(miClienteVO.getApellidos());
            jtfFechaNaci.setText(miClienteVO.getFechaNaci());
            jtfDireccion.setText(miClienteVO.getDireccion());
            jtfTelefono.setText(miClienteVO.getTelefono());
            jtfEmail.setText(miClienteVO.getEmail());
            jtfLugarNaci.setText(miClienteVO.getLugarNaci());
            jtfOcupacion.setText(miClienteVO.getOcupacion());
            jtfEstadoCivil.setText(miClienteVO.getEstadoCivil());
            jtfEscolaridad.setText(miClienteVO.getEscolaridad());
            jtfLugarProcedencia.setText(miClienteVO.getLugarProcedencia());
            jtfGenero.setText(miClienteVO.getGenero());
            jtfEPS.setText(miClienteVO.getEPS());
            jtfObservacion.setText(miClienteVO.getObservacion());

        }
            miCordinador.showFormularioHistoriaClinica(miClienteVO);
            
        }else{
        
        ClienteVO miClienteVO = new ClienteVO();

            //busca cliente por documento y recoge los datos pasandoselos a las cajas del formulario, previamnete validando si 
            //ha encontrado resultado de lo contrario marcara error
        miClienteVO = miCordinador.consultaCliente(doc);
        
        if (miClienteVO != null) {
            jtfDocumento.setText(miClienteVO.getDocumento());
            jtfNombres.setText(miClienteVO.getNombres());
            jtfApellidos.setText(miClienteVO.getApellidos());
            jtfFechaNaci.setText(miClienteVO.getFechaNaci());
            jtfDireccion.setText(miClienteVO.getDireccion());
            jtfTelefono.setText(miClienteVO.getTelefono());
            jtfEmail.setText(miClienteVO.getEmail());
            jtfLugarNaci.setText(miClienteVO.getLugarNaci());
            jtfOcupacion.setText(miClienteVO.getOcupacion());
            jtfEstadoCivil.setText(miClienteVO.getEstadoCivil());
            jtfEscolaridad.setText(miClienteVO.getEscolaridad());
            jtfLugarProcedencia.setText(miClienteVO.getLugarProcedencia());
            jtfGenero.setText(miClienteVO.getGenero());
            jtfEPS.setText(miClienteVO.getEPS());
            jtfObservacion.setText(miClienteVO.getObservacion());

        }
        
    }
        
        
    }//GEN-LAST:event_jbSiguienteActionPerformed

    private void jbCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCloseActionPerformed
        clean();
        miCordinador.closeGestionarCliente();
    }//GEN-LAST:event_jbCloseActionPerformed

    private void jbMostrarEnEsperaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMostrarEnEsperaActionPerformed
        // TODO add your handling code here:
        int tamano = miCordinador.mostrarEnEspera();
        JOptionPane.showMessageDialog(null, "El numero de pasientes a la espera es: " + tamano, "Pacientes en espera", JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_jbMostrarEnEsperaActionPerformed

    private void jbHistoriaClinica1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbHistoriaClinica1ActionPerformed
        // TODO add your handling code here:
        
        //Ahora al mostrar la historia clinica debemos tambien mostrar la tabla datos del paciente, podemos por medio del documento
        //crear una consulta y traer la info desde la tabla o recoger y encapsular los datos traidos desde la caja de este formulario
        //parece que esta opcion es la mas relevante 
            
            ClienteVO miClienteVO = new ClienteVO();
        
            miClienteVO.setDocumento(jtfDocumento.getText());
            miClienteVO.setNombres(jtfNombres.getText());
            miClienteVO.setApellidos(jtfApellidos.getText());
            miClienteVO.setFechaNaci(jtfFechaNaci.getText());
            miClienteVO.setDireccion(jtfDireccion.getText());
            miClienteVO.setTelefono(jtfTelefono.getText());
            miClienteVO.setEmail(jtfEmail.getText());
            miClienteVO.setLugarNaci(jtfLugarNaci.getText());
            miClienteVO.setOcupacion(jtfOcupacion.getText());
            miClienteVO.setEstadoCivil(jtfEstadoCivil.getText());
            miClienteVO.setEscolaridad(jtfEscolaridad.getText());
            miClienteVO.setLugarProcedencia(jtfLugarProcedencia.getText());
            miClienteVO.setGenero(jtfGenero.getText());
            miClienteVO.setEPS(jtfEPS.getText());
            miClienteVO.setObservacion(jtfObservacion.getText());

        
        
        miCordinador.iniciarMostrarHistoriaClinica(miClienteVO);
    }//GEN-LAST:event_jbHistoriaClinica1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel10;
    public javax.swing.JLabel jLabel11;
    public javax.swing.JLabel jLabel12;
    public javax.swing.JLabel jLabel13;
    public javax.swing.JLabel jLabel14;
    public javax.swing.JLabel jLabel15;
    public javax.swing.JLabel jLabel16;
    public javax.swing.JLabel jLabel17;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel6;
    public javax.swing.JLabel jLabel8;
    public javax.swing.JLabel jLabel9;
    public javax.swing.JPanel jPanel1;
    public javax.swing.JPanel jPanel2;
    public javax.swing.JPanel jPanel3;
    public javax.swing.JPanel jPanel4;
    public javax.swing.JPanel jPanel5;
    public javax.swing.JPanel jPanel6;
    public javax.swing.JButton jbClose;
    public javax.swing.JButton jbHistoriaClinica1;
    public javax.swing.JButton jbLookNext;
    public javax.swing.JButton jbMostrarEnEspera;
    public javax.swing.JButton jbOrdenPedido;
    public javax.swing.JButton jbSiguiente;
    public javax.swing.JTextField jtfApellidos;
    public javax.swing.JTextField jtfDireccion;
    public javax.swing.JTextField jtfDocumento;
    public javax.swing.JTextField jtfEPS;
    public javax.swing.JTextField jtfEmail;
    public javax.swing.JTextField jtfEscolaridad;
    public javax.swing.JTextField jtfEstadoCivil;
    public javax.swing.JTextField jtfFechaNaci;
    public javax.swing.JTextField jtfGenero;
    public javax.swing.JTextField jtfLugarNaci;
    public javax.swing.JTextField jtfLugarProcedencia;
    public javax.swing.JTextField jtfNombres;
    public javax.swing.JTextField jtfObservacion;
    public javax.swing.JTextField jtfOcupacion;
    public javax.swing.JTextField jtfTelefono;
    // End of variables declaration//GEN-END:variables

    public void setCordinador(Cordinador miCordinador) {
        this.miCordinador = miCordinador;
    }
}
