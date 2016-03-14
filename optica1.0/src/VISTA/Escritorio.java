/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VISTA;

import CONTROLADOR.Cordinador;
import MODELO.Reloj;
import java.awt.image.BufferedImage;
import java.io.InputStream;
import java.util.GregorianCalendar;
import javax.imageio.ImageIO;

/**
 *
 * @author alexisruiz
 */
public class Escritorio extends javax.swing.JFrame {
    
    public InputStream image1=this.getClass().getResourceAsStream("/IMG/fondoAstro.jpg");

    private Cordinador miCordinador;
    private ClienteNuevo nuevoCliente;

    /**
     * Creates new form Inicio
     */
    public Escritorio() {
        initComponents();
        Reloj reloj = new Reloj(jlHora);
        reloj.start();
        miFecha();
        cararImagen(JDPEscritorio, image1);
    }
    
    
    public void cararImagen(javax.swing.JDesktopPane jDeskt, InputStream fileImagen){
        try {
            BufferedImage image = ImageIO.read(fileImagen);
            jDeskt.setBorder(new Fondo(image));
            
        } catch (Exception e) {System.out.println("Imagen no disponible");
        }
    }
    
    
    public void miFecha(){
        String fecha = fecha();
        jlFecha.setText(fecha);
    }

    public String fecha(){
        GregorianCalendar fecha = new GregorianCalendar();
        int dia = fecha.get(fecha.DAY_OF_MONTH) ;
        int mes = fecha.get(fecha.MONTH);
        int ano = fecha.get(fecha.YEAR);
        
        String miFecha = String.valueOf(dia) + "/" + setMonth(mes) + "/" + String.valueOf(ano) ;
        
        return miFecha;
    }
    
    public String setMonth(int mes){
        switch(mes){
            case 0: return "January";
            case 1: return "February";
            case 2: return "March";
            case 3: return "April";
            case 4: return "may";
            case 5: return "Juny";
            case 6: return "July";
            case 7: return "Augost";
            case 8: return "Sept";
            case 9: return "October";
            case 10: return "November";
            case 11: return "December";
             
            default: return "Error";
        }
        
    }
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JDPEscritorio = new javax.swing.JDesktopPane();
        jlHora = new javax.swing.JLabel();
        jlFecha = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmClientes = new javax.swing.JMenu();
        jmiAltaCliente = new javax.swing.JMenuItem();
        jmiConsultarCliente = new javax.swing.JMenuItem();
        jmAtencion = new javax.swing.JMenu();
        JMGestionarCita = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jbCerrar = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 204, 204));
        setSize(new java.awt.Dimension(1200, 700));
        getContentPane().setLayout(null);

        JDPEscritorio.setBackground(new java.awt.Color(0, 153, 153));
        JDPEscritorio.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JDPEscritorio.setPreferredSize(new java.awt.Dimension(790, 400));

        jlHora.setFont(new java.awt.Font("Dialog", 2, 18)); // NOI18N
        JDPEscritorio.add(jlHora);
        jlHora.setBounds(0, 620, 110, 20);

        jlFecha.setFont(new java.awt.Font("Dialog", 2, 18)); // NOI18N
        JDPEscritorio.add(jlFecha);
        jlFecha.setBounds(120, 620, 170, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/close.jpg"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        JDPEscritorio.add(jLabel1);
        jLabel1.setBounds(751, 555, 79, 80);

        getContentPane().add(JDPEscritorio);
        JDPEscritorio.setBounds(0, 0, 1380, 700);

        jMenuBar1.setFont(new java.awt.Font("Mukti Narrow", 1, 14)); // NOI18N
        jMenuBar1.setMaximumSize(new java.awt.Dimension(1230, 32769));

        jmClientes.setText("CLIENTES");

        jmiAltaCliente.setText("ALTA");
        jmiAltaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAltaClienteActionPerformed(evt);
            }
        });
        jmClientes.add(jmiAltaCliente);

        jmiConsultarCliente.setText("CONSULTAR");
        jmiConsultarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiConsultarClienteActionPerformed(evt);
            }
        });
        jmClientes.add(jmiConsultarCliente);

        jMenuBar1.add(jmClientes);

        jmAtencion.setText("ATENCION");

        JMGestionarCita.setText("GESTIOANR CITA");
        JMGestionarCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMGestionarCitaActionPerformed(evt);
            }
        });
        jmAtencion.add(JMGestionarCita);

        jMenuBar1.add(jmAtencion);

        jMenu1.setText("OPCIONES");

        jMenuItem1.setText("CAMBIAR USUARIO");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jbCerrar.setText("CLOSE");
        jbCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCerrarActionPerformed(evt);
            }
        });
        jMenu1.add(jbCerrar);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("HERRAMIENTAS");

        jMenuItem7.setText("CALCULADORA");
        jMenu2.add(jMenuItem7);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("AYUDA");

        jMenuItem8.setText("INFORMACION DEL DESARROLLADOR");
        jMenu4.add(jMenuItem8);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmiAltaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAltaClienteActionPerformed
        // TODO add your handling code here:
       miCordinador.iniciarVentanaClienteNuevo(JDPEscritorio );
      
    }//GEN-LAST:event_jmiAltaClienteActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        miCordinador.cambiarUsuario();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jmiConsultarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiConsultarClienteActionPerformed
         miCordinador.iniciarConsultaCliente(JDPEscritorio);
    }//GEN-LAST:event_jmiConsultarClienteActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        miCordinador.closeAplication();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jbCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCerrarActionPerformed
        miCordinador.closeAplication();
    }//GEN-LAST:event_jbCerrarActionPerformed

    private void JMGestionarCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMGestionarCitaActionPerformed
        // TODO add your handling code here:
        miCordinador.iniciarVentanaAreaCita(JDPEscritorio );
    }//GEN-LAST:event_JMGestionarCitaActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JDesktopPane JDPEscritorio;
    private javax.swing.JMenuItem JMGestionarCita;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jbCerrar;
    private javax.swing.JLabel jlFecha;
    private javax.swing.JLabel jlHora;
    private javax.swing.JMenu jmAtencion;
    private javax.swing.JMenu jmClientes;
    public javax.swing.JMenuItem jmiAltaCliente;
    private javax.swing.JMenuItem jmiConsultarCliente;
    // End of variables declaration//GEN-END:variables

    public void setCordinador(Cordinador miCordinador) {
       this.miCordinador=miCordinador;
    }

    public void asignarPrivilegios(String result) {
        if(result.equals("administrador")){
            jmAtencion.setVisible(false);
            jmClientes.setVisible(true);
        }else if(result.equals("especialista")){
            jmAtencion.setVisible(true);
            jmClientes.setVisible(false);
        
        }
    }
}
