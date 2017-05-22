
package t1;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class Ej4 extends Applet {

    public void init() {
        resize(1366,768);
    }
    
    public void paint(Graphics g){
        
        int w[]=new int[17];
        int z[]=new int[17];
        
        int x=600,y=300, a=20, b=80, c=15, d=30;
        
        w[0]=x;         z[0]=y;
        w[1]=x;         z[1]=y-b;
        w[2]=x-c;       z[2]=y-b;
        w[3]=x+(a/2);   z[3]=y-b-d;
        w[4]=x+a+c;     z[4]=y-b;
        w[5]=x+a;       z[5]=y-b;
        w[6]=x+a;       z[6]=y+a+b;
        w[7]=x+a+c;     z[7]=y+a+b;
        w[8]=x+(a/2);   z[8]=y+a+b+d;
        w[9]=x-c;       z[9]=y+a+b;
        w[10]=x;        z[10]=y+a+b;
        w[11]=x;        z[11]=y+a;
        w[12]=x-b;      z[12]=y+a;
        w[13]=x-b;      z[13]=y+a+c;
        w[14]=x-b-d;    z[14]=y+(a/2);
        w[15]=x-b;      z[15]=y-c;
        w[16]=x-b;      z[16]=y;
        
        
        g.setColor(Color.blue);
        g.fillPolygon(w, z, 17);
   //     g.fillPolygon(a, b, 4);
        
        
    }

}
