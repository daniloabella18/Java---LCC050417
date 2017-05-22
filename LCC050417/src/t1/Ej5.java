
package t1;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class Ej5 extends Applet {

    public void init() {
        resize(1366,768);
    }
    
    public void paint(Graphics g){
        int a=400,b=200;
        
        int x=350,y=150;
//      Rectángulo
        g.drawRect(x,y,a,b);
//      Aros
        g.drawArc(x-a, y, 2*a, 2*b, 90, -90);
        g.drawArc(x, y, 2*a, 2*b, 180, -90);
        
        g.drawArc(x, y-b, 2*a, 2*b, 180, 90);
        g.drawArc(x-a, y-b, 2*a, 2*b, 0, -90);
        
    }

}
