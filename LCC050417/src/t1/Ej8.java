
package t1;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

public class Ej8 extends Applet {

    public void init() {
        resize(1366,768);
    }
    
    public void paint(Graphics g){
//      Declarando
        int a=300;
        
        int w[]=new int[17];
        int z[]=new int[17];
        
        int x=500,y=200;
        
//      Asignando
        w[0]=x;         z[0]=y+(a/2);
        w[1]=x+(a/2);   z[1]=y;
        w[2]=x+a;       z[2]=y+(a/2);
        
//      Graficando
        g.drawOval(x, y, a, a);
        g.drawPolygon(w, z, 3);
        
        
    }
}