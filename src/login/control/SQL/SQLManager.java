package login.control.SQL;


import java.sql.Connection;
import login.control.DAO.DAOManager;
import login.control.DAO.UsuarioDAO;
import login.control.conexion.CConexion;


/**Clase que gestiona a las clases implementadas en el programa
 * @see DAOManager implementa al manejador de los DAO
 * @author Headcruser87*/
public class SQLManager  implements DAOManager
{  
   // private  ClienteDAO cliente;
   private UsuarioDAO usuario;
    
    //almacena la conexion
    private Connection conDB=null;
    
    
    /**Constructor de SQLManage
     * @param conexion
     * @throws java.lang.Exception Lanza un error si existe algun error 
     * durante la conexion. */
    public SQLManager(CConexion conexion ) throws Exception
    {
        conDB=conexion.getConection();
        
    }
 
    //Patron Singleton

    @Override
    public UsuarioDAO getUsuario() 
    {
      if( isUsuarioDaoNull() )
             usuario=new SQLUsuario(conDB );
      
         return usuario;
    }

   /**Revisa si el cliente es nulo*/
   private boolean isUsuarioDaoNull()
   {
       return usuario==null;
   }

   
} // Fin de la case 
