
package t1;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class Ej3 extends Applet {

    public void init() {
        resize(1366,768);
    }
    
    public void paint(Graphics g){
        
        int x=150,y=150,radio=200;
        
        g.setColor(Color.yellow);
        g.fillArc(x, y, radio , radio, 15, 330);
        g.setColor(Color.blue);
        g.fillOval(x+(radio/2)+(radio/8), y+(radio/6), 20, 20);
        
    }

}
