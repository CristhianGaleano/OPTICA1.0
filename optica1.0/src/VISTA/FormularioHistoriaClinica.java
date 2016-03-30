/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VISTA;

import CONTROLADOR.Cordinador;
import MODELO.Reloj;
import MODELO.VO.ClienteVO;
import MODELO.VO.HistoriaVO;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

/**
 *
 * @author alexisruiz
 */
public class FormularioHistoriaClinica extends javax.swing.JInternalFrame {

    private Cordinador miCordinador;
    private ClienteVO miClienteVO;

    /**
     * Creates new form FormularioHistoriaClinica
     */
    
    void cleanBox(){
        jccheckbAlcolico.setSelected(false);
        jcheckbFumador.setSelected(false);
        jcheckbAccidentes.setSelected(false);
        jtaAccidentes.setText("");
        jtfAlerjico.setText("");
        jcbParientePatologico.setSelectedIndex(0);
        jtaDetalleHistoricoFamiliar.setText("");
        jtaExamenFisico.setText("");
        jtaEnfermedades.setText("");
    }
    
    public FormularioHistoriaClinica() {
        initComponents();
       miFecha();
       jtaAccidentes.setEnabled(false);
      
    }

    public void datos(ClienteVO miClienteVO){
        this.miClienteVO=miClienteVO;
        jlNombre.setText(this.miClienteVO.getNombres());
        jlDocumento.setText(this.miClienteVO.getDocumento());
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
        
        String miFecha = String.valueOf(ano) + "/" + setMonth(mes) + "/" +  String.valueOf(dia);
        
        return miFecha;
    }
    
    public String setMonth(int mes){
        switch(mes){
            case 0: return "01";
            case 1: return "2";
            case 2: return "03";
            case 3: return "04";
            case 4: return "05";
            case 5: return "06";
            case 6: return "07";
            case 7: return "08";
            case 8: return "09";
            case 9: return "10";
            case 10: return "11";
            case 11: return "12";
             
            default: return "Error";
        }
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jlNombre = new javax.swing.JLabel();
        jlDocumento = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jcheckbFumador = new javax.swing.JCheckBox();
        jcbParientePatologico = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaDetalleHistoricoFamiliar = new javax.swing.JTextArea();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtaExamenFisico = new javax.swing.JTextArea();
        Enfermedades = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jtaEnfermedades = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        jtaAccidentes = new javax.swing.JTextArea();
        jtfAlerjico = new javax.swing.JTextField();
        jccheckbAlcolico = new javax.swing.JCheckBox();
        jcheckbAccidentes = new javax.swing.JCheckBox();
        jlFecha = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jbGuardar = new javax.swing.JButton();
        jbClose = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("FORMULARIO HISTORIA CLINICA");

        jPanel2.setBackground(new java.awt.Color(51, 51, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("FORMULARIO HISTORIA CLINICA DEL PACIENTE");

        jlNombre.setText("Cristhian Alexis");

        jlDocumento.setText("1088264375");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(jlNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(jlDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 645, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(149, 149, 149))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jlDocumento)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jlNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));

        jLabel3.setText("Fecha");

        jLabel5.setText("Pariente patologico");

        jLabel6.setText("Alerjico");

        jLabel8.setText("Detalle historico Familiar");

        jcheckbFumador.setText("Fumador");
        jcheckbFumador.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jcheckbFumadorStateChanged(evt);
            }
        });

        jcbParientePatologico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR", "Madre", "Padre", "Abuelo", "Abuela" }));

        jtaDetalleHistoricoFamiliar.setColumns(20);
        jtaDetalleHistoricoFamiliar.setRows(5);
        jScrollPane1.setViewportView(jtaDetalleHistoricoFamiliar);

        jLabel13.setText("Examen fisico");

        jtaExamenFisico.setColumns(20);
        jtaExamenFisico.setRows(5);
        jScrollPane3.setViewportView(jtaExamenFisico);

        Enfermedades.setText("Enfermedades");

        jtaEnfermedades.setColumns(20);
        jtaEnfermedades.setRows(5);
        jScrollPane4.setViewportView(jtaEnfermedades);

        jtaAccidentes.setColumns(20);
        jtaAccidentes.setRows(5);
        jScrollPane5.setViewportView(jtaAccidentes);

        jccheckbAlcolico.setText("Alcolico");
        jccheckbAlcolico.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jccheckbAlcolicoStateChanged(evt);
            }
        });

        jcheckbAccidentes.setText("Accidentes");
        jcheckbAccidentes.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jcheckbAccidentesStateChanged(evt);
            }
        });

        jlFecha.setText("FECHA");

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));

        jbGuardar.setText("SAVE");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jbClose.setText("CLOSE");
        jbClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbClose, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                    .addComponent(jbGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbClose, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(173, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jccheckbAlcolico, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addComponent(jcheckbFumador)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel6))
                            .addComponent(jLabel8))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(jtfAlerjico, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(63, 63, 63)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jlFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addComponent(Enfermedades))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addComponent(jcbParientePatologico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jcheckbAccidentes)
                                    .addGap(18, 18, 18)
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(167, 167, 167))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jccheckbAlcolico)
                            .addComponent(jcheckbFumador)
                            .addComponent(jLabel6)
                            .addComponent(jtfAlerjico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jlFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcbParientePatologico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jcheckbAccidentes)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(17, 17, 17)
                                        .addComponent(jLabel8)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(81, 81, 81)
                                .addComponent(Enfermedades)))))
                .addGap(0, 59, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        
        
        //Creamo  un objeto de la clase historiaVO, la cual encapsulara el la tabla historiaClinica
        HistoriaVO miHistoriaVO = new HistoriaVO();
        miHistoriaVO.setAlcoholico(jccheckbAlcolico.isSelected());
        miHistoriaVO.setFumador(jcheckbFumador.isSelected());
        miHistoriaVO.setAccidentes(jcheckbAccidentes.isSelected());
        miHistoriaVO.setDetalleAccidentes(jtaAccidentes.getText());
        miHistoriaVO.setParientePatologico(jcbParientePatologico.getSelectedItem().toString());
        miHistoriaVO.setDetalleHistoricoFamiliar(jtaDetalleHistoricoFamiliar.getText());
        miHistoriaVO.setFechaHistoria(jlFecha.getText());
        miHistoriaVO.setExamenFisico(jtaExamenFisico.getText());
        miHistoriaVO.setDetalleEnfermedades(jtaEnfermedades.getText());
        
        
        //Aqui debemos validar los campos obligatorios,campos obligatorios: 
        //Alcolico, fumador, accidentes, fecha y examenFisico.
        Boolean resultCampos=miCordinador.validarHistoriaClinica(miHistoriaVO);
        
        if(resultCampos){
            
        //Llamamos al metodo registrar... pasandole como argumento el documento del paciente, y el objeto  en capsulado
        miCordinador.registrarHistoriaClinica(jlDocumento.getText(),miHistoriaVO);
        }else{
            JOptionPane.showMessageDialog(null, "Verifique los campos obligatorios","Campos obligatorios",JOptionPane.ERROR_MESSAGE);
        }
        
        cleanBox();
        
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jcheckbFumadorStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jcheckbFumadorStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jcheckbFumadorStateChanged

    private void jccheckbAlcolicoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jccheckbAlcolicoStateChanged
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jccheckbAlcolicoStateChanged

    private void jcheckbAccidentesStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jcheckbAccidentesStateChanged
        // TODO add your handling code here:
        jtaAccidentes.setEnabled(true);
    }//GEN-LAST:event_jcheckbAccidentesStateChanged

    private void jbCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCloseActionPerformed
        // TODO add your handling code here:
        cleanBox();
        miCordinador.closeFormularioHistoriaClinica();
        
    }//GEN-LAST:event_jbCloseActionPerformed

    public void setCordinador(Cordinador miCordinador) {
       this.miCordinador=miCordinador;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Enfermedades;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JButton jbClose;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JComboBox<String> jcbParientePatologico;
    private javax.swing.JCheckBox jccheckbAlcolico;
    private javax.swing.JCheckBox jcheckbAccidentes;
    private javax.swing.JCheckBox jcheckbFumador;
    private javax.swing.JLabel jlDocumento;
    private javax.swing.JLabel jlFecha;
    private javax.swing.JLabel jlNombre;
    private javax.swing.JTextArea jtaAccidentes;
    private javax.swing.JTextArea jtaDetalleHistoricoFamiliar;
    private javax.swing.JTextArea jtaEnfermedades;
    private javax.swing.JTextArea jtaExamenFisico;
    private javax.swing.JTextField jtfAlerjico;
    // End of variables declaration//GEN-END:variables
}
