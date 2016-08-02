
package login.control.Genericos;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *CLASE PARA PEDIR DATOS DE MANERA GRAFICA
 * @author Headcruser87
 * @version 2015.4
 */
public class CLeerDato 
{
  /**________________Metodo para pedir cadenas ___________________________
    * @param p_cadena INFORMACION QUE SE DESEA INGRESAR
    * @param p_Tventana MENSAJE DE TITULO DE VENTANA
    * @return  Regresa un dato de tipo cadena */
   public static String m_Dato(String p_cadena,String p_Tventana)
   {
       String v_cadena="";
       JTextArea areaSalida=new JTextArea();
       areaSalida.setText(p_cadena);
       
       do 
       {
          v_cadena=JOptionPane.showInputDialog
                          (null,areaSalida,p_Tventana,JOptionPane.PLAIN_MESSAGE);
         
         
         //Si el usuario Presiona la tecla de cancelar, 
         if(v_cadena==null)
             v_cadena="";
          
       } while (v_cadena.equals(""));
       
       return v_cadena;
   } //========================== FIN DEL METODO =======================================
   
   /** ____________ Método que convierte el tipo de dato a short ____________________
    * @param p_Mensaje Muestra el mensaje al usuario
    * @param p_TituloVentana Muestra un titulo en la ventana
    * @return Devuelve el dato tecleado de tipo short*/
    public static short m_DatoShort(String p_Mensaje,String p_TituloVentana)
    {
        Short v_dato=null;
        do
        {
            try
            {
                v_dato=Short.parseShort(m_Dato(p_Mensaje, p_TituloVentana));
            }
            catch(NumberFormatException e)
            {
                v_dato= Short.MIN_VALUE; // retorna el valor mas pequeño
            }
        }
        while(v_dato==Short.MIN_VALUE);
        return v_dato;
    }//========================= FIN DEL METODO  ======================================
    
    
  /** _____________  Método para pedir datos de tipo Entero __________________
   * @param p_Mensaje Mensaje a mostrar al usuario
   * @param p_TituloVentana Titulo a mostrar al usuario  
      @return Regresa un dato de tipo Int  */
    public static int m_DatoInt(String p_Mensaje,String p_TituloVentana)
    {
        int v_dato=Integer.MIN_VALUE;
        do
         {
            try
            {
                v_dato= Integer.parseInt
                        (m_Dato(p_Mensaje, p_TituloVentana));
            }
            catch(NumberFormatException e){}
         }
        while(v_dato==Integer.MIN_VALUE);
        
        return v_dato;
    }//========================= FIN DEL METODO  ======================================
    
    
  /**______________ Método para pedir datos de tipo Long  ______________________
    * @param p_Mensaje Mensaje a mostrar al usuario
   * @param p_TituloVentana Titulo a mostrar al usuario  */
    public static long m_DatoLong(String p_Mensaje,String p_TituloVentana)
    {
        long v_dato=Long.MIN_VALUE;
        do
        {
           try
            {
                return Long.parseLong(m_Dato(p_Mensaje, p_TituloVentana));
            }
            catch(NumberFormatException e){}
        }
        while(v_dato==Long.MIN_VALUE);
        return v_dato;
    } //========================= FIN DEL METODO  ======================================
    
    
    
/**_________________ Método para pedir datos de tipo Long  ______________________
    * @param p_Mensaje Mensaje a mostrar al usuario
   * @param p_TituloVentana Titulo a mostrar al usuario  
    @return  Regresa un dato de tipo Double*/
     public static Double m_datoDouble(String p_Mensaje,String p_TituloVentana)
    {
        double v_dato=Double.MIN_VALUE;
        do
         {
           try
            {
                v_dato=Double.parseDouble(m_Dato(p_Mensaje, p_TituloVentana));
            }
            catch(NumberFormatException e){}
         }
        while(v_dato==Double.MIN_VALUE);
        return v_dato;
    }//========================= FIN DEL METODO  ======================================
} //============================== FIN DE LA CLASE LEER ===============================
