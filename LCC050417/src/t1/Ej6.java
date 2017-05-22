
package t1;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class Ej6 extends Applet {

    public void init() {
        resize(1366,768);
    }
    
    public void paint(Graphics g){
        int a=300,b=200;
        
        int x=500,y=225;
//      Principal
        g.setColor(Color.magenta);
        g.fillRect(x,y,a,b);
//      Mas pequeños
        g.setColor(Color.red);
        g.fillRect(x-(a/2),y-(a/2),(a/2),(a/2));
        
        g.setColor(Color.yellow);
        g.fillRect(x-(a/2),y+b,(a/2),(a/2));
        
        g.setColor(Color.green);
        g.fillRect(x+a,y-(a/2),(a/2),(a/2));
        
        g.setColor(Color.blue);
        g.fillRect(x+a,y+b,(a/2),(a/2));
    }
}
