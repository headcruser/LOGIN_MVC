
package login.control;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import login.control.DAO.DAOManager;
import login.control.Exception.DAOException;
import login.control.Genericos.CImprimir;
import login.control.Genericos.C_Validar;
import login.modelo.Usuarios;
import login.vista.ViewLogin;


/**@author Headcruser87*/
public class viewController implements IValidacion
{
    public final static int TWO_SECOND=5;
    public final static int FIN_PROCESO=100;
   
    private int contador;
    private Timer tiempo;
   
   private Usuarios usuario=null; 
   private ViewLogin view=null;
   private DAOManager control=null;
    // constructor
    public viewController(DAOManager p_contol) throws Exception 
    {
        view = new ViewLogin(this);
        usuario=new Usuarios();
        control=p_contol;
        
        C_Validar.validaLogin( view.getJTF_USUARIO() );
        C_Validar.validaLogin( view.getJPF_PASSWD() );
        
         view.setLocationRelativeTo(null);
         view.setVisible(true);
         view.pack();
    }

    public void cargar()
    {
        view.getPanelCarga().setVisible( true );
        contador=-1;
        tiempo=new Timer( TWO_SECOND, new TimerListener() );
        tiempo.start(); 
    }
    
    public void detener()  { tiempo.stop(); }
    public void esconder(){ view.dispose(); }

    public void reiniciar()
    {
        contador=-1;
        view.updateProgress( 0 );
        view.getPanelCarga().repaint();
        view.limpiarCampos();
        view.getJTF_USUARIO().requestFocus();
        view.getPanelCarga().setVisible(false);
        view.setVisible(true);
    }
    
    
      @Override
    public void iniciarSesion( ) throws DAOException 
    {  
            if(control.getUsuario().login( usuario.getUsuario(), usuario.getPasswd()) ) 
            {
                CImprimir.m_mensajes(" Bienvenido al sistema ", usuario.getUsuario(), 4);
                 cargar();
            }
            else
                CImprimir.m_mensajes( " el usuario no esta registrado", "Error de Sesion", contador);
    } // fin del metodo 
    
    
    @Override
    public void recibeUsuario(String p_usuario) 
    {
        System.out.println(p_usuario);
        if(p_usuario.length()>1)
            usuario.setUsuario(p_usuario);
    }

    @Override
    public void recibePasswd(String passwd) {
        System.out.println(passwd);
        if(passwd.length()>1)
            usuario.setPasswd(passwd);        
    }

    @Override
    public void salir() {
        System.out.println("Cerrando aplicacion .... ");
        System.exit(0);
    }

    
    
    /////////////////////////////////////////////////////////////////
    //                                      Clase interna 
    ///////////////////////////////////////////////////////////////
    class TimerListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) 
        {
            contador++;
           try {
                    view.updateProgress(contador);
                    view.getPanelCarga().repaint();
                    Thread.sleep(60);
                    } catch (InterruptedException ex) {  System.out.println(ex); } 
            
            if( contador==FIN_PROCESO )
            {    
                  detener();
                  System.out.println("Carga completada....");
                  esconder();
                  reiniciar();
            }
        } // Fin del evento
    } // fin de la clase interna 
}
