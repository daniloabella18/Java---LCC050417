
package t1;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class Ej10 extends Applet {

    public void init() {
        resize(1366,768);
    }
    
    public void paint(Graphics g){
        
        int x=480,y=150,a=400;
        
//      1er Circulo
        g.setColor(Color.blue);
        g.fillOval(x, y , a, a);
        
//      2do Circulo
        g.setColor(Color.red);
        g.fillOval(x+(a/16), y+(a/16), (7*a)/8, (7*a)/8);
        
//      3er Circulo
        g.setColor(Color.green);
        g.fillOval(x+(a/8), y+(a/8), (3*a)/4, (3*a)/4);
        
//      4to Circulo
        g.setColor(Color.yellow);
        g.fillOval(x+(3*a/16), y+(3*a/16), (5*a)/8, (5*a)/8);
        
//      5to Circulo
        g.setColor(Color.CYAN);
        g.fillOval(x+(a/4), y+(a/4), a/2, a/2);
        
//      6to Circulo
        g.setColor(Color.ORANGE);
        g.fillOval(x+(5*a/16), y+(5*a/16), (3*a)/8, (3*a)/8);
        
    }

}
