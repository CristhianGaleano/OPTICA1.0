
package VISTA;

import CONTROLADOR.Cordinador;
import MODELO.VO.ClienteVO;
import java.util.Locale;
import javax.swing.JOptionPane;

/**
 *
 * @author alexisruiz
 */
public class ConsultarCliente extends javax.swing.JInternalFrame {

    private Cordinador miCordinador;

    /**
     * Creates new form ConsultarCliente
     */
    public ConsultarCliente() {
        initComponents();
        setBounds(30, 50, 1200, 500);
    }

    
    public void setear(){
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
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtfFechaNaci = new javax.swing.JTextField();
        jtfDocumento = new javax.swing.JTextField();
        jtfEmail = new javax.swing.JTextField();
        jtfApellidos = new javax.swing.JTextField();
        jtfTelefono = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jtfDireccion = new javax.swing.JTextField();
        jtfObservacion = new javax.swing.JTextField();
        jtfNombres = new javax.swing.JTextField();
        jtfLugarNaci = new javax.swing.JTextField();
        jtfOcupacion = new javax.swing.JTextField();
        jtfEstadoCivil = new javax.swing.JTextField();
        jtfEscolaridad = new javax.swing.JTextField();
        jtfGenero = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jtfLugarProcedencia = new javax.swing.JTextField();
        jtfEPS = new javax.swing.JTextField();
        jtfDocumentoBuscar = new javax.swing.JTextField();
        jbBuscar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jbEnviarCita = new javax.swing.JButton();
        jbActualizar = new javax.swing.JButton();
        jbEliminarCliente = new javax.swing.JButton();
        jbCerrar1 = new javax.swing.JButton();

        setIconifiable(true);
        setTitle("CONSULTAR CLIENTE");
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(51, 51, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CONSULTAR CLIENTE");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(180, 20, 430, 40);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(10, 10, 1060, 80);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setLayout(null);

        jLabel2.setText("Ingrese documento del cliente: ");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(10, 10, 224, 15);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Resultado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 0, 204))); // NOI18N
        jPanel4.setLayout(null);

        jLabel3.setText("Documento");
        jPanel4.add(jLabel3);
        jLabel3.setBounds(17, 29, 100, 15);

        jLabel4.setText("Apellidos");
        jPanel4.add(jLabel4);
        jLabel4.setBounds(420, 30, 65, 15);

        jLabel5.setText("Nombres");
        jPanel4.add(jLabel5);
        jLabel5.setBounds(210, 30, 63, 15);

        jLabel6.setText("Fecha nacimiento");
        jPanel4.add(jLabel6);
        jLabel6.setBounds(20, 80, 124, 15);

        jLabel7.setText("Email");
        jPanel4.add(jLabel7);
        jLabel7.setBounds(420, 80, 65, 15);
        jPanel4.add(jtfFechaNaci);
        jtfFechaNaci.setBounds(40, 100, 180, 19);

        jtfDocumento.setEditable(false);
        jPanel4.add(jtfDocumento);
        jtfDocumento.setBounds(40, 50, 150, 19);
        jPanel4.add(jtfEmail);
        jtfEmail.setBounds(420, 100, 200, 19);
        jPanel4.add(jtfApellidos);
        jtfApellidos.setBounds(420, 50, 200, 19);
        jPanel4.add(jtfTelefono);
        jtfTelefono.setBounds(230, 100, 170, 19);

        jLabel8.setText("Direccion");
        jPanel4.add(jLabel8);
        jLabel8.setBounds(630, 30, 65, 15);
        jPanel4.add(jtfDireccion);
        jtfDireccion.setBounds(630, 50, 200, 19);

        jtfObservacion.setText("No hay observaciones del cliente");
        jPanel4.add(jtfObservacion);
        jtfObservacion.setBounds(20, 230, 340, 40);
        jPanel4.add(jtfNombres);
        jtfNombres.setBounds(210, 50, 200, 19);
        jPanel4.add(jtfLugarNaci);
        jtfLugarNaci.setBounds(630, 100, 150, 19);
        jPanel4.add(jtfOcupacion);
        jtfOcupacion.setBounds(40, 150, 180, 19);
        jPanel4.add(jtfEstadoCivil);
        jtfEstadoCivil.setBounds(230, 150, 110, 19);
        jPanel4.add(jtfEscolaridad);
        jtfEscolaridad.setBounds(420, 150, 140, 19);
        jPanel4.add(jtfGenero);
        jtfGenero.setBounds(40, 190, 100, 19);

        jLabel9.setText("Telefono");
        jPanel4.add(jLabel9);
        jLabel9.setBounds(210, 80, 65, 15);

        jLabel10.setText("Lugar Nacimiento");
        jPanel4.add(jLabel10);
        jLabel10.setBounds(630, 80, 130, 15);

        jLabel11.setText("Ocupacion");
        jPanel4.add(jLabel11);
        jLabel11.setBounds(20, 130, 90, 15);

        jLabel12.setText("Estado civil");
        jPanel4.add(jLabel12);
        jLabel12.setBounds(210, 130, 90, 15);

        jLabel13.setText("Escolaridad");
        jPanel4.add(jLabel13);
        jLabel13.setBounds(420, 130, 90, 15);

        jLabel14.setText("Lugar procedencia");
        jPanel4.add(jLabel14);
        jLabel14.setBounds(630, 130, 140, 15);

        jLabel15.setText("Genero");
        jPanel4.add(jLabel15);
        jLabel15.setBounds(20, 170, 100, 15);

        jLabel17.setText("EPS");
        jPanel4.add(jLabel17);
        jLabel17.setBounds(210, 170, 65, 15);
        jPanel4.add(jtfLugarProcedencia);
        jtfLugarProcedencia.setBounds(630, 150, 150, 19);
        jPanel4.add(jtfEPS);
        jtfEPS.setBounds(210, 190, 160, 19);

        jPanel3.add(jPanel4);
        jPanel4.setBounds(12, 48, 850, 280);

        jtfDocumentoBuscar.setBackground(new java.awt.Color(51, 51, 255));
        jtfDocumentoBuscar.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(jtfDocumentoBuscar);
        jtfDocumentoBuscar.setBounds(240, 10, 160, 19);

        jbBuscar.setText("SHEAR");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });
        jPanel3.add(jbBuscar);
        jbBuscar.setBounds(410, 10, 110, 25);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(0, 100, 880, 340);

        jPanel5.setBackground(new java.awt.Color(204, 204, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel5.setLayout(null);

        jbEnviarCita.setText("SEND CITA");
        jbEnviarCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEnviarCitaActionPerformed(evt);
            }
        });
        jPanel5.add(jbEnviarCita);
        jbEnviarCita.setBounds(10, 10, 160, 25);

        jbActualizar.setText("UPDATE");
        jbActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbActualizarActionPerformed(evt);
            }
        });
        jPanel5.add(jbActualizar);
        jbActualizar.setBounds(10, 50, 160, 25);

        jbEliminarCliente.setText("TO DOWN");
        jbEliminarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarClienteActionPerformed(evt);
            }
        });
        jPanel5.add(jbEliminarCliente);
        jbEliminarCliente.setBounds(10, 90, 160, 25);

        jbCerrar1.setText("CLOSE");
        jbCerrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCerrar1ActionPerformed(evt);
            }
        });
        jPanel5.add(jbCerrar1);
        jbCerrar1.setBounds(20, 170, 140, 40);

        jPanel1.add(jPanel5);
        jPanel5.setBounds(890, 100, 180, 340);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1090, 470);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbEnviarCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEnviarCitaActionPerformed
        
       
        miCordinador.enviarCitaCola(jtfDocumento.getText().trim());
        JOptionPane.showMessageDialog(null, "Paciente enviado a la espera","En espera",JOptionPane.INFORMATION_MESSAGE);
              
       setear();
    }//GEN-LAST:event_jbEnviarCitaActionPerformed

    private void jbActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbActualizarActionPerformed
        // TODO add your handling code here:
        
        //necesitamosencapsular la info de las cajas
        ClienteVO miClienteVo= new ClienteVO();
            
        miClienteVo.setDocumento(jtfDocumento.getText().trim());
        miClienteVo.setNombres(jtfNombres.getText().trim());
        miClienteVo.setApellidos(jtfApellidos.getText().trim());
        miClienteVo.setFechaNaci(jtfFechaNaci.getText().trim());
        miClienteVo.setDireccion(jtfDireccion.getText().trim());
        miClienteVo.setTelefono(jtfTelefono.getText().trim());
        miClienteVo.setEmail(jtfEmail.getText().trim());
        miClienteVo.setLugarNaci(jtfLugarNaci.getText().trim());
        miClienteVo.setOcupacion(jtfOcupacion.getText().trim());
        miClienteVo.setEstadoCivil(jtfEstadoCivil.getText().trim());
        miClienteVo.setEscolaridad(jtfEscolaridad.getText().trim());
        miClienteVo.setLugarProcedencia(jtfLugarProcedencia.getText().trim());
        miClienteVo.setGenero(jtfGenero.getText().trim());
        miClienteVo.setEPS(jtfEPS.getText().trim());
        miClienteVo.setObservacion(jtfObservacion.getText().trim());
        
               
         String valido;
        if(miCordinador.validarCliente(miClienteVo)){
            
            valido=miCordinador.actualizarDatos(miClienteVo);
        }else{
            valido="mas_datos";
        }
        
        
    
        if(valido.equals("ok")){
            JOptionPane.showMessageDialog(null, "Datos guardados...");
        }else
           if(valido.equals("error")) {
            JOptionPane.showMessageDialog(null, "Error al intentar actualizar...");
        }else{
            JOptionPane.showMessageDialog(null, "No ha diligenciado los campos obligatorios");    
                }
        
        ClienteVO miClienteVO = miCordinador.consultaCliente(jtfDocumentoBuscar.getText().trim());
        if(miClienteVO!=null){
            jtfDocumento.setText(miClienteVO.getDocumento());
            jtfEmail.setText(miClienteVO.getNombres());
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
            
        }else{
            JOptionPane.showMessageDialog(null, "Ocurrio un error");
        }
        
        jtfDocumentoBuscar.setText("");
       
        
    }//GEN-LAST:event_jbActualizarActionPerformed

    private void jbEliminarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarClienteActionPerformed
        // TODO add your handling code here:
        String resultado="";
        if(jtfDocumentoBuscar.getText().trim().equals("")){
             JOptionPane.showMessageDialog(null, "Asegurese de haber introducido algun valor","ADVERTENCIA",JOptionPane.INFORMATION_MESSAGE);
         
        }else{
         resultado =miCordinador.eliminarCliente(jtfDocumentoBuscar.getText());  
        }
        
        if(resultado.equals("ok")){
            JOptionPane.showMessageDialog(null, "Se ha dado de baja al paciente seleccionado","DONE",JOptionPane.INFORMATION_MESSAGE);
            setear();
        }else{
            JOptionPane.showMessageDialog(null, "Ocurrio un erroral intentar dar de baja alccliente","NOT DONE",JOptionPane.INFORMATION_MESSAGE);
        }
        
        
        
    }//GEN-LAST:event_jbEliminarClienteActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        // TODO add your handling code here:
       
         ClienteVO miClienteVO = miCordinador.consultaCliente(jtfDocumentoBuscar.getText().trim());
        if(miClienteVO!=null){
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
            
        }else{
            JOptionPane.showMessageDialog(null, "Ocurrio un error");
        }
        
       
        
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbCerrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCerrar1ActionPerformed
        // TODO add your handling code here:
        setear();
        miCordinador.cerrarConsultaCliente();
    }//GEN-LAST:event_jbCerrar1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel10;
    public javax.swing.JLabel jLabel11;
    public javax.swing.JLabel jLabel12;
    public javax.swing.JLabel jLabel13;
    public javax.swing.JLabel jLabel14;
    public javax.swing.JLabel jLabel15;
    public javax.swing.JLabel jLabel17;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel6;
    public javax.swing.JLabel jLabel7;
    public javax.swing.JLabel jLabel8;
    public javax.swing.JLabel jLabel9;
    public javax.swing.JPanel jPanel1;
    public javax.swing.JPanel jPanel2;
    public javax.swing.JPanel jPanel3;
    public javax.swing.JPanel jPanel4;
    public javax.swing.JPanel jPanel5;
    public javax.swing.JButton jbActualizar;
    public javax.swing.JButton jbBuscar;
    public javax.swing.JButton jbCerrar1;
    public javax.swing.JButton jbEliminarCliente;
    public javax.swing.JButton jbEnviarCita;
    public javax.swing.JTextField jtfApellidos;
    public javax.swing.JTextField jtfDireccion;
    public javax.swing.JTextField jtfDocumento;
    public javax.swing.JTextField jtfDocumentoBuscar;
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
        this.miCordinador=miCordinador;
    }
}
