
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
        setBounds(30, 50, 800, 500);
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
        jtfNombres = new javax.swing.JTextField();
        jtfApellidos = new javax.swing.JTextField();
        jtfTelefono = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jtfDireccion = new javax.swing.JTextField();
        jtfObservacion = new javax.swing.JTextField();
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
        jPanel2.setBounds(10, 10, 760, 80);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setLayout(null);

        jLabel2.setText("Ingrese documento del cliente: ");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(21, 22, 224, 15);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Resultado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 0, 204))); // NOI18N
        jPanel4.setLayout(null);

        jLabel3.setText("Documento");
        jPanel4.add(jLabel3);
        jLabel3.setBounds(17, 29, 100, 15);

        jLabel4.setText("Apellidos");
        jPanel4.add(jLabel4);
        jLabel4.setBounds(20, 70, 65, 15);

        jLabel5.setText("Nombres");
        jPanel4.add(jLabel5);
        jLabel5.setBounds(290, 30, 63, 15);

        jLabel6.setText("Fecha nacimiento");
        jPanel4.add(jLabel6);
        jLabel6.setBounds(290, 70, 124, 15);

        jLabel7.setText("Telefono");
        jPanel4.add(jLabel7);
        jLabel7.setBounds(290, 110, 65, 15);
        jPanel4.add(jtfFechaNaci);
        jtfFechaNaci.setBounds(300, 90, 180, 19);

        jtfDocumento.setEditable(false);
        jPanel4.add(jtfDocumento);
        jtfDocumento.setBounds(40, 50, 150, 19);
        jPanel4.add(jtfNombres);
        jtfNombres.setBounds(300, 50, 200, 19);
        jPanel4.add(jtfApellidos);
        jtfApellidos.setBounds(40, 90, 200, 19);
        jPanel4.add(jtfTelefono);
        jtfTelefono.setBounds(300, 130, 170, 19);

        jLabel8.setText("Direccion");
        jPanel4.add(jLabel8);
        jLabel8.setBounds(20, 110, 65, 15);
        jPanel4.add(jtfDireccion);
        jtfDireccion.setBounds(40, 130, 230, 19);

        jtfObservacion.setText("No hay observaciones del cliente");
        jPanel4.add(jtfObservacion);
        jtfObservacion.setBounds(40, 160, 340, 40);

        jPanel3.add(jPanel4);
        jPanel4.setBounds(12, 68, 546, 260);

        jtfDocumentoBuscar.setBackground(new java.awt.Color(51, 51, 255));
        jtfDocumentoBuscar.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(jtfDocumentoBuscar);
        jtfDocumentoBuscar.setBounds(175, 43, 210, 19);

        jbBuscar.setText("SHEAR");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });
        jPanel3.add(jbBuscar);
        jbBuscar.setBounds(410, 40, 110, 25);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(10, 100, 570, 340);

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
        jPanel5.setBounds(590, 100, 180, 340);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 780, 470);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbEnviarCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEnviarCitaActionPerformed
        
       
        miCordinador.enviarCitaCola(jtfDocumento.getText().trim());
        
       
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
        miClienteVo.setObservacion(jtfObservacion.getText().trim());
        
        System.out.println(
        miClienteVo.getDocumento()+
        miClienteVo.getNombres()+
        miClienteVo.getApellidos()+
        miClienteVo.getFechaNaci()+
        miClienteVo.getDireccion()+
        miClienteVo.getTelefono()+
        miClienteVo.getObservacion()
        );
        
        
         String valido;
        if(miCordinador.validarCliente(miClienteVo)){
            
            valido=miCordinador.actualizarDatos(miClienteVo);
        }else{
            valido="mas_datos";
        }
        
        
         System.out.printf("llego condiciones");
        if(valido.equals("ok")){
            JOptionPane.showMessageDialog(null, "Se ha actualizado el cliente...");
        }else
           if(valido.equals("error")) {
            JOptionPane.showMessageDialog(null, "Error al intentar actualizar...");
        }else{
            JOptionPane.showMessageDialog(null, "No ha diligenciado los campos obligatorios");    
                }
        
         System.out.printf("termino condiciones");
        
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
            JOptionPane.showMessageDialog(null, "Se ha dado de baja al cliente seleccionado","DONE",JOptionPane.INFORMATION_MESSAGE);
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
            jtfObservacion.setText(miClienteVO.getObservacion());
            
        }else{
            JOptionPane.showMessageDialog(null, "Hubo un error al encapsular");
        }
        
        jtfDocumentoBuscar.setText("");
        
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbCerrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCerrar1ActionPerformed
        // TODO add your handling code here:
        miCordinador.cerrarConsultaCliente();
    }//GEN-LAST:event_jbCerrar1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel6;
    public javax.swing.JLabel jLabel7;
    public javax.swing.JLabel jLabel8;
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
    public javax.swing.JTextField jtfFechaNaci;
    public javax.swing.JTextField jtfNombres;
    public javax.swing.JTextField jtfObservacion;
    public javax.swing.JTextField jtfTelefono;
    // End of variables declaration//GEN-END:variables

    public void setCordinador(Cordinador miCordinador) {
        this.miCordinador=miCordinador;
    }
}
