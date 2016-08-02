
package login.control.Exception;

/** Clase que maneja los errores
 * @see Exception 
 * @author Headcruser87*/
public class DAOException extends Exception
{
    public DAOException(String mensaje) 
    {
        super(mensaje);
    }
    public DAOException(Throwable cause) {
        super(cause);
    }
    public DAOException(String message, Throwable cause) {
        super(message, cause);
    }
} // Fin de la clase 
