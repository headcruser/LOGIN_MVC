
package login.control.SQL;


import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import login.control.DAO.UsuarioDAO;
import login.control.Exception.DAOException;
import login.modelo.Usuarios;

public class SQLUsuario implements UsuarioDAO
{
      /**almacena una referencia de la conexion con la base de datos*/
    private Connection conn=null;
    
     String SQL_INSERT="{CALL InsertaCliente (?,?,?,?,?,?,?,?)}";
    String SQL_UPDATE="{CALL UPDATE_CLIENTE (?,?,?,?,?,?,?,?,?)}";
    String SQL_READALL="{CALL MOSTRAR_CLIENTES}";
    String SQL_READ=" {CALL GET_CLIENTE ( ? ) }";
    
    String SQL_LOGIN="{CALL BUSQUEDA (?,?)}";
    
    public SQLUsuario(Connection conn) {
     this.conn=conn;   
    }
    
   

    @Override
    public boolean login(String p_usuario, String p_passwd) 
            throws DAOException 
    {
        String respuesta="";
        Connection conAux=conn;
        CallableStatement entrada=null;
        ResultSet resultado=null;
    try 
        {
             conAux.setAutoCommit( false );
             entrada=conAux.prepareCall( SQL_LOGIN );
             
             entrada.setString(1, p_usuario);
             entrada.setObject(2, p_passwd);
             
             resultado=entrada.executeQuery();
             
            if(resultado.next())
                respuesta=resultado.getString(1);
           
        } catch (SQLException  ex) 
        {
             try 
             {
                 conAux.rollback();
                 throw new DAOException( ex );
             } catch (SQLException ex1) {
                 throw new DAOException("Error en sql", ex);
             }
        }
    finally
        {
            if( resultado!=null)
            {
                try {
                    resultado.close();
                } catch (SQLException e) {
                    throw new DAOException( "Error sql",e );
                }
            }//fin if
            
            if(entrada!=null)
            {
                try {
                    entrada.close();
                } catch (SQLException e) {
                    throw new DAOException( "Error sql",e );
                }
            } //Fin if
        } //Fin finally
            return respuesta.equals("true");
     } // fin del metodo 
    
    
      // FINALIZA CONEXION DE UN PROCEDIMIENTO ALMACENADO 
    private void finalizarConexion(Connection conexion,CallableStatement procedimiento) throws DAOException
    {
          try 
          {
            procedimiento.close();
            conexion.close();
          } catch (SQLException ex) {
            throw new DAOException("Error en sql", ex);
        }
    }

    @Override
    public boolean insert(Usuarios elemento) throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(Usuarios elemento) throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Usuarios elemento) throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Usuarios read(Object idElemento) throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Usuarios> readAll() throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
