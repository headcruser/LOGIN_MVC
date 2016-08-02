
package login.control.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import login.control.Exception.DAOException;

public class Conexion_SqlServer extends CConexion
{
   public Conexion_SqlServer()  throws ClassNotFoundException, 
                                                InstantiationException,
                                                IllegalAccessException,
                                                DAOException,
                                                SQLException
    {
                leerConfiguracion();
           
                // SE MANDA LLAMAR AL DRIVER DE CONEXION SQL SERVER
               Class.forName( DRIVER ).newInstance();

           try {
               // SE ESTABLECE UNA CONEXION CON LA BASE DE DATOS
               System.out.println("Conectando con el servidor........");
               conexionDB = DriverManager.getConnection( getUrl() );
               System.out.println("Conexion SqlServer establecida...");
           } catch (SQLException ex) {  System.out.println(ex);   }
    }
   
   
        //**Obtiene el url para el driver de la conexion /
    private  String getUrl()
    {                    
       StringBuilder builderURL = new StringBuilder();
        builderURL.append("jdbc:sqlserver://")
                                        .append(EQUIPO)
                                        .append(":49926;")  // NOTA: REVISAR EL NUMERO DE PUERTO DE LA INSTANCIA 
                                        .append("databaseName=")
                                        .append(BD_NOMBRE)
                                        .append(";user=")
                                        .append(USUARIO)
                                        .append(";password=")
                                        .append(PASSWD)
                                        .append(";");
        return builderURL.toString();
    } // fin del metodo 
    
     
    private void leerConfiguracion()
    {
        DRIVER= System.getProperty("DRIVER");
        USUARIO= System.getProperty("USUARIO");
        PASSWD= System.getProperty("PASSWD");
        BD_NOMBRE= System.getProperty("BD_NOMBRE");
        EQUIPO=System.getProperty("EQUIPO");
    }

    @Override
    public boolean existConexionDB() {   return conexionDB!=null;  }

    @Override
    public Connection getConection() {  return conexionDB;}

    @Override
    public void closeConection() throws SQLException{ conexionDB.close();}
   
}
    
    
    
       
  
  
 


