
package t1;

import java.applet.Applet;
import java.awt.Graphics;

public class Ej1 extends Applet {

    public void init() {
        resize(1366,768);
    }
    
    public void paint(Graphics g){
        
        int x=100,y=100;
        g.drawRect(x,y,200,100);
        g.drawLine(x,y,x+200,y+100);
        g.drawLine(x,y+100,x+200,y);
    }

}
