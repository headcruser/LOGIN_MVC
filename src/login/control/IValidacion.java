package login.control;

import login.control.Exception.DAOException;


/**Interface que almacena los metodos para el inicio de sesion
 * @author Headcruser87*/
public interface IValidacion
{
    public void recibeUsuario(String usuario);
    public void recibePasswd(String passwd);
    public void iniciarSesion() throws DAOException ;
    public void salir();
}
