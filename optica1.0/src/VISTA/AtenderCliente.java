
package VISTA;

import CONTROLADOR.Cordinador;
import MODELO.VO.ClienteVO;
import java.util.Locale;
import javax.swing.JOptionPane;

/**
 *
 * @author alexisruiz
 */
public class AtenderCliente extends javax.swing.JInternalFrame {

    private Cordinador miCordinador;

    /**
     * Creates new form ConsultarCliente
     */
    public AtenderCliente() {
        initComponents();
        setBounds(5, 10, 1250, 600);
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
        jLabel7 = new javax.swing.JLabel();
        jtfFechaNaci = new javax.swing.JTextField();
        jtfDocumento = new javax.swing.JTextField();
        jtfNombres = new javax.swing.JTextField();
        jtfApellidos = new javax.swing.JTextField();
        jtfTelefono = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jtfDireccion = new javax.swing.JTextField();
        jtfObservacion = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jbCerrar3 = new javax.swing.JButton();
        jbHistoriaClinica = new javax.swing.JButton();
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
        jLabel1.setText("ATENCION CLIENTE");
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
        jtfObservacion.setBounds(40, 210, 400, 60);

        jPanel3.add(jPanel4);
        jPanel4.setBounds(10, 20, 790, 350);

        jPanel6.setBackground(new java.awt.Color(153, 153, 153));
        jPanel6.setLayout(null);

        jbCerrar3.setText("HISTORIA CLINICA");
        jbCerrar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCerrar3ActionPerformed(evt);
            }
        });
        jPanel6.add(jbCerrar3);
        jbCerrar3.setBounds(210, 20, 155, 25);

        jbHistoriaClinica.setText("HISTORIA CLINICA");
        jbHistoriaClinica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbHistoriaClinicaActionPerformed(evt);
            }
        });
        jPanel6.add(jbHistoriaClinica);
        jbHistoriaClinica.setBounds(10, 20, 180, 20);

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
         
         String result=miCordinador.waitingLook();
         JOptionPane.showMessageDialog(null, "Paciente en espera: "+result,"NEXT ",JOptionPane.INFORMATION_MESSAGE );
    }//GEN-LAST:event_jbLookNextActionPerformed

    private void jbCerrar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCerrar3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbCerrar3ActionPerformed

    private void jbSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSiguienteActionPerformed
        // TODO add your handling code here:
        ClienteVO miClienteVO = new ClienteVO();
        //objetivo: traer el documento del paciente en cola 
        String doc=miCordinador.consultarCola(); 
        jtfDocumento.setText(doc);
        
        miClienteVO=miCordinador.consultaCliente(doc);
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
        
    }//GEN-LAST:event_jbSiguienteActionPerformed

    private void jbCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCloseActionPerformed
       miCordinador.closeGestionarCliente();
    }//GEN-LAST:event_jbCloseActionPerformed

    private void jbHistoriaClinicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbHistoriaClinicaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbHistoriaClinicaActionPerformed

    private void jbMostrarEnEsperaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMostrarEnEsperaActionPerformed
        // TODO add your handling code here:
       int tamano = miCordinador.mostrarEnEspera();
        JOptionPane.showMessageDialog(null, "El numero de pasientes a la espera es: "+ tamano,"Pacientes en espera",JOptionPane.INFORMATION_MESSAGE);
        
    }//GEN-LAST:event_jbMostrarEnEsperaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel jLabel1;
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
    public javax.swing.JPanel jPanel6;
    public javax.swing.JButton jbCerrar3;
    public javax.swing.JButton jbClose;
    public javax.swing.JButton jbHistoriaClinica;
    public javax.swing.JButton jbLookNext;
    public javax.swing.JButton jbMostrarEnEspera;
    public javax.swing.JButton jbSiguiente;
    public javax.swing.JTextField jtfApellidos;
    public javax.swing.JTextField jtfDireccion;
    public javax.swing.JTextField jtfDocumento;
    public javax.swing.JTextField jtfFechaNaci;
    public javax.swing.JTextField jtfNombres;
    public javax.swing.JTextField jtfObservacion;
    public javax.swing.JTextField jtfTelefono;
    // End of variables declaration//GEN-END:variables

    public void setCordinador(Cordinador miCordinador) {
        this.miCordinador=miCordinador;
    }
}
