package login.control.DAO;

import login.control.Exception.DAOException;
import login.modelo.Usuarios;


public interface UsuarioDAO extends DAO<Usuarios>
{
   boolean login(String P_usuario,String p_passwd) throws  DAOException;
}
