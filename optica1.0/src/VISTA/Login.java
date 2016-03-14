
package VISTA;

import CONTROLADOR.Cordinador;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


/**
 *
 * @author alexisruiz
 */
public class Login extends javax.swing.JDialog {

    private Cordinador miCordinador;

    /**
     * Creates new form Login
     */
    public Login(JFrame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        jlbPass.setVisible(false);
         jbAceptar.setVisible(false);
        jpfPassword.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jlUserBienvenida = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jlbPass = new javax.swing.JLabel();
        jbAceptar = new javax.swing.JButton();
        jcbPerfil = new javax.swing.JComboBox<>();
        jlbUser = new javax.swing.JLabel();
        jpfPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(0, 255, 204)));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setText("BIENVENIDO");

        jlUserBienvenida.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jlUserBienvenida, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 95, 95))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(55, 55, 55))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlUserBienvenida, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(120, 10, 370, 107);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/candado_opt.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(300, 120, 280, 220);

        jlbPass.setText("Password");
        jPanel1.add(jlbPass);
        jlbPass.setBounds(100, 210, 90, 15);

        jbAceptar.setBackground(new java.awt.Color(102, 102, 102));
        jbAceptar.setText("ACEPTAR");
        jbAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAceptarActionPerformed(evt);
            }
        });
        jPanel1.add(jbAceptar);
        jbAceptar.setBounds(100, 270, 190, 25);

        jcbPerfil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR\t", "ADMINISTRADOR", "ESPECIALISTA", " " }));
        jcbPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbPerfilActionPerformed(evt);
            }
        });
        jPanel1.add(jcbPerfil);
        jcbPerfil.setBounds(100, 180, 190, 24);

        jlbUser.setText("USER");
        jPanel1.add(jlbUser);
        jlbUser.setBounds(100, 160, 190, 15);
        jPanel1.add(jpfPassword);
        jpfPassword.setBounds(100, 230, 190, 19);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 610, 410);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcbPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbPerfilActionPerformed
        // TODO add your handling code here:
        String usuario = (String)jcbPerfil.getSelectedItem();
        int index = jcbPerfil.getSelectedIndex();
        if(evt.getSource()== jcbPerfil){
            if(index == 0){
                jlbPass.setVisible(false);
                jpfPassword.setVisible(false);
                jbAceptar.setVisible(false);
            }else{
                jlbPass.setVisible(true);
                jpfPassword.setVisible(true);
                jbAceptar.setVisible(true);
            }
        }
        
        jpfPassword.transferFocus();
    }//GEN-LAST:event_jcbPerfilActionPerformed

    private void jbAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAceptarActionPerformed
        // TODO add your handling code here:
        /*
        Empesamos a realizar las validaciones segun los perfiles con los que se trabajaran, pero todo esto
        serealizara egun el MVC por lo tanto  la logica de este caso se llevara a cabo en "Logica"
        Para instanciasr otro objeto como tenenmos acostumbrado, el MVC nos provee de solo una instancia la 
        cual ya esta en el controlador
        */
        
        String result = miCordinador.validarIngreso(jcbPerfil.getSelectedIndex(), jpfPassword.getText());
        if(result.equals("error")){
            JOptionPane.showMessageDialog(null, "No ha seleccionado un usuario");
        }else{
        JOptionPane.showMessageDialog(null, result);
        jlUserBienvenida.setText(result);
        miCordinador.asignarPrivilegios(result);
        miCordinador.cerrarVentana();
        //miCordinador.registrarCliente();
        }
    }//GEN-LAST:event_jbAceptarActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbAceptar;
    private javax.swing.JComboBox<String> jcbPerfil;
    private javax.swing.JLabel jlUserBienvenida;
    private javax.swing.JLabel jlbPass;
    private javax.swing.JLabel jlbUser;
    private javax.swing.JPasswordField jpfPassword;
    // End of variables declaration//GEN-END:variables

    public void setCordinador(Cordinador miCordinador) {
        this.miCordinador=miCordinador;
    }
    
    
}
