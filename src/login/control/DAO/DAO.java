package login.control.DAO;


import java.util.List;
import login.control.Exception.DAOException;

/** Interfaz a ser implementada por las clases posteriores del proyecto,
 * utilizando el patron de diseño Dao
 * @author Headcruser87
 * @param <contenedor> alamcena la clase a implementar*/
public interface DAO<contenedor>
{
    boolean insert ( contenedor elemento ) throws  DAOException;
    boolean delete( contenedor elemento ) throws  DAOException;
    boolean update( contenedor elemento ) throws  DAOException;
   contenedor read( Object idElemento ) throws  DAOException;
   List<contenedor> readAll() throws  DAOException;
}
