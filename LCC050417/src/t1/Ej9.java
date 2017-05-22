package t1;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ej9 extends Applet {

    public void init() {
        resize(1366,768);
    }
 
//  Colores
    private Color ColorAlto, ColorBajo;
    
    public Ej9(Color ColorAlto, Color ColorBajo) {
        this.ColorAlto = ColorAlto;
        this.ColorBajo = ColorBajo;
    }

    public Ej9() {
        this(Color.LIGHT_GRAY, Color.black);
    }
    
    @Override
    public void paint(Graphics g) {
        
        int a=400;
        int x=500,y=150;
        
//---------/ Circulo exterior /--------------------------//

// Círculo der. exterior (blanco)
        g.setColor(ColorAlto);
        g.fillArc(x, y, a, a, -90, 180);
        
// Círculo izq. exterior (negro)
        g.setColor(ColorBajo);
        g.fillArc(x, y, a, a, 90, 180);
        
//---------/ Circulo interior /--------------------------//

// Círculo superior interior (blanco) - lado izquierdo
        g.setColor(ColorAlto);
        g.fillArc(x + (a/4), y , (a/2), (a/2), 90, 180);
        
        // Círculo inferior interior (blanco) - lado derecho
        g.setColor(ColorBajo);
        g.fillArc(x + (a/4), y + (a/2), (a/2), (a/2), -90, 180);
        
//---------/ Circulo interior opuesto /--------------------------//        
      
//      Círculo izquierdo interior ( blanco en negro )
        g.setColor(ColorBajo);
        g.fillArc(x + ( (a/2) - (a/16) ), y + ( (a/4) - (a/16) ), a/8, a/8, 0, 360);
        
//      Círculo izquierdo interior ( negro en blanco )
        g.setColor(ColorAlto);
        g.fillArc(x + ( (a/2) - (a/16) ), y + ( ((a*3)/4) - (a/16) ), a/8, a/8, 0, 360);    
        
    }
}