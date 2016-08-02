
package login.control;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JPanel;

/** @author Headcruser87*/
public class PanelCarga extends JPanel
{
    int progreso;

    public PanelCarga() {  progreso=0;
    this.setBackground(Color.WHITE);
    }
    
    @Override
    public void paint(Graphics g) 
    {
        super.paint(g);
        Graphics2D g2=(Graphics2D)g;
        
        g2.setRenderingHint( RenderingHints.KEY_ANTIALIASING, 
                                            RenderingHints.VALUE_ANTIALIAS_ON);
        
        g2.translate(this.getWidth()/2, this.getHeight()/2 );
        g2.rotate(Math.toRadians( 270 ) );
        
        Arc2D.Float arco=new Arc2D.Float(Arc2D.PIE);
        Ellipse2D circle=new Ellipse2D.Float( 0,0,50,50);
        
        arco.setFrameFromCenter(new Point(0,0),new Point( 60, 60 ));
        circle.setFrameFromCenter( new Point(0,0),new Point( 50, 50 ) );
        arco.setAngleStart(1);
        arco.setAngleExtent( -progreso*3.6 );  // 360/100=3.6
        
        g2.setColor(Color.red );
            g2.draw( arco );
            g2.fill(arco);
        
        g2.setColor( Color.WHITE );
            g2.draw( circle );
            g2.fill( circle );
        
        g2.setColor(Color.red );
        g2.rotate(Math.toRadians(90 ) );
        g.setFont(new Font("Verdana",Font.PLAIN,20 ));
        FontMetrics fm=g2.getFontMetrics();
        
        Rectangle2D r=fm.getStringBounds(progreso+" %", g);
        
        int x=(0-(int) r.getWidth())/2;
        int y=(0-(int) r.getHeight())/2+ fm.getAscent() ;
        g2.drawString( progreso+"%",x ,y );
    }
    
      public void updateProgressBar(int progressValue)
    {
        progreso=progressValue;
    }
    
}
