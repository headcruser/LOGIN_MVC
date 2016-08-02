
package login.modelo;

/**
 *Clase que modela a los usuaruos 
 * @author Headcruser87
 */
public class Usuarios 
{
    private String cveEmpleado;
    private String usuario;
    private String passwd;
    private String TipoUser;

    public Usuarios()
    {
       cveEmpleado="";
       TipoUser="";
       usuario="";
       passwd="";
        
    }

    public Usuarios( String usuario, String passwd) {
        this.usuario = usuario;
        this.passwd = passwd;
    }
    
    
    
    /**
     * @return the cveEmpleado
     */
    public String getCveEmpleado() {
        return cveEmpleado;
    }

    /**
     * @param cveEmpleado the cveEmpleado to set
     */
    public void setCveEmpleado(String cveEmpleado) {
        this.cveEmpleado = cveEmpleado;
    }

    /**
     * @return the usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the passwd
     */
    public String getPasswd() {
        return passwd;
    }

    /**
     * @param passwd the passwd to set
     */
    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    /**
     * @return the TipoUser
     */
    public String getTipoUser() {
        return TipoUser;
    }

    /**
     * @param TipoUser the TipoUser to set
     */
    public void setTipoUser(String TipoUser) {
        this.TipoUser = TipoUser;
    }

    @Override
    public String toString() {
        return usuario;
    }
} // Fin de la clase usuario
