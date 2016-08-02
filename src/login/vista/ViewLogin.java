package login.vista;

import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import login.control.Exception.DAOException;
import login.control.IValidacion;
import login.control.PanelCarga;



public class ViewLogin extends javax.swing.JDialog 
{
    private  boolean acceso;
   private IValidacion validarEvento=null;
  
    
    public ViewLogin( IValidacion validacion) throws Exception
    {
        
        super((javax.swing.JFrame)null, true);
        validarEvento=validacion;
        initComponents();
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/login/Imagenes/applibrary.png")).getImage());
       panelCarga.setVisible(false);
       
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JTF_USUARIO = new javax.swing.JTextField();
        JPF_PASSWD = new javax.swing.JPasswordField();
        lb_usuario = new javax.swing.JLabel();
        lb_pass = new javax.swing.JLabel();
        btnIniciar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        panelCarga = new login.control.PanelCarga();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("TBD_LIBRERIA");
        setIconImage(null);
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JTF_USUARIO.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        JTF_USUARIO.setToolTipText("");
        JTF_USUARIO.setBorder(null);
        JTF_USUARIO.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                JTF_USUARIOCaretUpdate(evt);
            }
        });
        getContentPane().add(JTF_USUARIO, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 290, 30));

        JPF_PASSWD.setBorder(null);
        JPF_PASSWD.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                JPF_PASSWDCaretUpdate(evt);
            }
        });
        getContentPane().add(JPF_PASSWD, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 290, 30));

        lb_usuario.setBackground(new java.awt.Color(0, 0, 0));
        lb_usuario.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        lb_usuario.setForeground(new java.awt.Color(0, 0, 0));
        lb_usuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/Imagenes/user_txt.png"))); // NOI18N
        getContentPane().add(lb_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        lb_pass.setBackground(new java.awt.Color(0, 0, 0));
        lb_pass.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        lb_pass.setForeground(new java.awt.Color(0, 0, 0));
        lb_pass.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_pass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/Imagenes/pass_txt.png"))); // NOI18N
        getContentPane().add(lb_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        btnIniciar.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        btnIniciar.setForeground(new java.awt.Color(255, 255, 255));
        btnIniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/Imagenes/inicio_norm.png"))); // NOI18N
        btnIniciar.setBorder(null);
        btnIniciar.setBorderPainted(false);
        btnIniciar.setContentAreaFilled(false);
        btnIniciar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIniciar.setFocusPainted(false);
        btnIniciar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/login/Imagenes/inicio_rol.png"))); // NOI18N
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });
        getContentPane().add(btnIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 100, 50));

        btnSalir.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/Imagenes/canc_norm.png"))); // NOI18N
        btnSalir.setBorder(null);
        btnSalir.setBorderPainted(false);
        btnSalir.setContentAreaFilled(false);
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.setFocusPainted(false);
        btnSalir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/login/Imagenes/canc_rol.png"))); // NOI18N
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 100, 50));

        jLabel1.setBackground(new java.awt.Color(124, 159, 159));
        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/Imagenes/frame.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 58));

        panelCarga.setOpaque(false);
        getContentPane().add(panelCarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 120, 120));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/Imagenes/sesionLibreria.jpg"))); // NOI18N
        fondo.setBorder(null);
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTF_USUARIOCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_JTF_USUARIOCaretUpdate
        validarEvento.recibeUsuario( getUsuario() );
    }//GEN-LAST:event_JTF_USUARIOCaretUpdate

    private void JPF_PASSWDCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_JPF_PASSWDCaretUpdate
        validarEvento.recibePasswd( getPasswd() );
    }//GEN-LAST:event_JPF_PASSWDCaretUpdate

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        try {
            validarEvento.iniciarSesion();
        } catch (DAOException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_btnIniciarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        validarEvento.salir();
    }//GEN-LAST:event_btnSalirActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField JPF_PASSWD;
    private javax.swing.JTextField JTF_USUARIO;
    private javax.swing.JButton btnIniciar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lb_pass;
    private javax.swing.JLabel lb_usuario;
    private login.control.PanelCarga panelCarga;
    // End of variables declaration//GEN-END:variables

    // GETTERS
    
    public JButton getIniciar() {
        return btnIniciar;
    }

    public JPasswordField getJPF_PASSWD() {
        return JPF_PASSWD;
    }

    public JTextField getJTF_USUARIO() {
        return JTF_USUARIO;
    }

    public JButton getSalir() {
        return btnSalir;
    }
    

    public void acceder(boolean acceso) {
        this.acceso = acceso;
    }
    
    //obtiene el nombre del usuario
    public String getUsuario()
    {
        return JTF_USUARIO.getText().trim();
    } // Fin del metodo 
    
    //obtiene la contraseña 
    public String getPasswd()
    {
        return ( new String( JPF_PASSWD.getPassword() ).trim() );
    }

    public boolean isAceptado()
    {
        return acceso;
    }
    
    public void limpiarCampos()
    {
        JTF_USUARIO.setText( null );
        JPF_PASSWD.setText( null );
    }

    public PanelCarga getPanelCarga() {
        return panelCarga;
    }
    
    public void updateProgress(int progress)
    {
      panelCarga.updateProgressBar(progress);
    }
    
    public void crearPanel()
    {
       panelCarga=null;
       panelCarga=new PanelCarga();
       panelCarga.repaint();
    }
    
}
