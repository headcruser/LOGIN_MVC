package login.control.Genericos;

import java.awt.Dimension;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *CLASE QUE CONTIENE METODOS GENERICOS 
 * COMO PEDIR DATOS O IMPRIMIR INFORMACION 
 * DE MANERA GRAFICA
 * @author Daniel Martinez Sierra 
 */

public class CImprimir 
{
    
 /** VERSION MEJORADA 2.0 
  * METODO PARA IMPRIMIR UNA INTERFAZ GRAFICA
  * AGREGANDO UNA SCROLLBAR
  * @param p_mensaje MENSAJE QUE SE QUIERE IMPRIMIR EN LA VENTANA
     * @param p_Titulo Titulo de la ventana
  */
    public static void m_impIntefaz(String p_mensaje,String p_Titulo)
 {
     //Seccion para imprimir
     JFrame frame = new JFrame();
     JTextArea areaSalida=new JTextArea(3,100);     //  CREACION DEL AREA DE TEXTO
     JScrollPane Scroll= new JScrollPane(areaSalida);   // CREACION DE LA BARRA DESLIZANTE
     Scroll.setPreferredSize(new Dimension(300,100)); // TAMAÑO DEL SCROLL
     areaSalida.setText(p_mensaje);                  // AGREGA EL MENSAJE
     
   /**LAS SIGUIENTES LINEAS SON PARA ATRAPAR LA CADENA Y TOMAR EL ANCHO
      * YA QUE EN SI ES UN VECTOR QUE SE PONE EN ELAREA DE TEXTO 
      * PARA SIMULAR UNAA LISTA*/
     areaSalida.setLineWrap(true);
     areaSalida.setWrapStyleWord(true);
     Scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
     areaSalida.setCaretPosition(areaSalida.getDocument().getLength());
     
     // SIMPLEMENTE SE IMPRIME EN UN JOPTIONPANE 
     JOptionPane.showMessageDialog(frame, Scroll,p_Titulo,JOptionPane.PLAIN_MESSAGE);
     frame.dispose();
     
 } // ************************** FIN DEL METODO *******************************************
    
    
    /**
     * METODO PARA MOSTRAR MENSAJES 
     * @param p_mensaje MENSAJE QUE APARECE EN LA VENTANA
     * @param p_mensaje_Ventana  MENSAJE DE TITULO DE LA VENTANA
     * @param p_opcion ICONO DE MENSAJE QUE SE QUIERA PONER
     *  PARA MENSAJES:
     * 1 : ERROR MENSAJE
     * 2 WARNING MENSAJE
     * 3 QUESTION MENSAJE
     */
    public static void m_mensajes(String p_mensaje,String p_mensaje_Ventana,int p_opcion)
    {
         JFrame frame = new JFrame();
         

         
         switch(p_opcion)
         {
             case 1: 
                 JOptionPane.showMessageDialog
                        (frame, p_mensaje, p_mensaje_Ventana, JOptionPane.ERROR_MESSAGE);
                        break;
             case 2:    
              JOptionPane.showMessageDialog
                        (frame, p_mensaje, p_mensaje_Ventana, JOptionPane.WARNING_MESSAGE);
                         break;
             case 3:  
              JOptionPane.showMessageDialog
                        (frame, p_mensaje, p_mensaje_Ventana, JOptionPane.QUESTION_MESSAGE);
                        break;
             case 4:
                 JOptionPane.showMessageDialog(frame, p_mensaje,p_mensaje_Ventana,JOptionPane.INFORMATION_MESSAGE);
                 
                 
         } 
        frame.dispose();   
    } //=========================== FIN DEL METODO ===========================================
    
}
