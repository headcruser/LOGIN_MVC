package login.control;

import java.io.FileInputStream;
import java.util.Properties;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import login.control.DAO.DAOManager;
import login.control.Genericos.CImprimir;
import login.control.SQL.SQLManager;
import login.control.conexion.CConexion;
import login.control.conexion.ServicioConexion;


/** @author Headcruser87*/
public class GestionMain 
{
  static void LeerConfiguracion()
    {
        System.out.println("Leyendo archivo de configuracion......");
        try (FileInputStream propFile = new FileInputStream("configurardb.txt");)
        {
            Properties p = new Properties(System.getProperties());
            p.load(propFile);
            System.setProperties(p);
        } catch (java.io.FileNotFoundException e) {
            CImprimir.m_mensajes("No se encuentra el archivo de configuracion" ,"mensaje",1);
            System.exit(-1);
        } catch (java.io.IOException w) {
            CImprimir.m_mensajes( "Ocurrio algun error de I/O" ,"Mensaje",1);
            System.exit(-1);
        }
        System.out.println("Cargado con exito...");
    }
  
  public static void lookAndFeel()
  {
       try 
                {  UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
                    //UIManager.setLookAndFeel("com.birosoft.liquid.LiquidLookAndFeel");
                } 
                catch (UnsupportedLookAndFeelException |
                            ClassNotFoundException |
                            InstantiationException |
                            IllegalAccessException ex) 
                { System.out.println("No se pudo cargar la apariencia"); }
  }
    
     public static void main(String[] args) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            @Override
            public void run() 
            {
                LeerConfiguracion();
                lookAndFeel(); // Carga la apariencia 
                DAOManager manager;
                CConexion conexion;
                 
                try 
                {  
                    conexion=ServicioConexion.getService().createConection();
                    if( conexion.existConexionDB() )
                    {
                        manager=new SQLManager( conexion );
                        new viewController(  manager );
                        conexion.closeConection();
                    }
                } catch (Exception ex) {  System.exit(1 );   }
                
            } // fin del metodo run
        }); // Fin de evento      
    } // Fin main
 }
    

