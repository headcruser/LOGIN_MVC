
package login.control.conexion;

/** Clase que gestiona la conexion con la base de datos 
 * implementando el patron fabrica 
 * @author Headcruser87*/
public class ServicioConexion 
{
    private CConexion conexionBD;
    private static  ServicioConexion instancia;

    private ServicioConexion() {}
    
    
     public static synchronized ServicioConexion getService()
    {
        if (instancia == null) {
            instancia = new ServicioConexion();
        }
        return instancia;
    }

     /**Metodo encargado de obtener la conexion con la base de datos
   * @return Regresa como referencia, el estado de la conexion.
  * @throws Exception  Se lanza una  exepcion si el servicio de sql no funciona.*/
    public CConexion createConection () throws Exception
    {
        if( conexionBD==null )
            conexionBD=new Conexion_SqlServer();
        
        return conexionBD;
    } // FIN DEL METODO 
}
     
   
