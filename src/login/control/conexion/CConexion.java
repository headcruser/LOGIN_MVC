package login.control.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import login.control.Exception.DAOException;


/**
 *Clase abstracta que modela la conexion con la base de datos .
 * @author Headcruser87
 * @see DriverManager <b>Libreria para utilizar sql </b>
 * @version 2.0_2016
 */
public abstract class CConexion
{
    //////////////////////////////////////////////////////////////////////////////////////
    //                                               ATRIBUTOS DE LA CLASE
    //////////////////////////////////////////////////////////////////////////////////////
    
    /**ATRIBUTO PARA LA CONEXION CON EL SERVIDOR */
    protected static Connection conexionDB;
    
    /**Atributo para indicar el usuario de la base de datos*/
    protected  String USUARIO;
    
    /**Atributo que indica la contraseña del equipo*/
    protected String PASSWD;
    
    /**Atributo que indica el host predeterminado*/
    protected String EQUIPO;
    
    /**Atributo que indica la base de datos a utilizar*/
    protected  String BD_NOMBRE;
    
    /**Atributo para especificar el driver*/
    protected String DRIVER;
    
    public CConexion() { }

    public  abstract  boolean existConexionDB();
    public abstract Connection getConection();
    public abstract void closeConection() throws SQLException;
    
}// FIN DE LA CLASE

