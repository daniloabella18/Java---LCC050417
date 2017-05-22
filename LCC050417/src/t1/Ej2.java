
package t1;

import java.applet.Applet;
import java.awt.Graphics;

public class Ej2 extends Applet {

    public void init() {
        resize(1366,768);
    }
    
    public void paint(Graphics g){
        
        int x=100,y=100;
        g.drawOval(x,y,100,100);
        g.drawOval( x+100 , y+(y/8) , x-(x/4) , y-(y/4) );
        g.drawOval( x+100+(x-(x/4)) , y+(y/8)+(y/8) , x-(x/2) , y-(y/2) );
        g.drawOval( x+100+(x-(x/4)+(x-(x/2))) , y+(y/8)+(y/8)+(y/8) , x-(x/2)-(x/4) , y-(y/2)-(x/4) );
        g.drawOval( x+100+(x-(x/4)+(x-(x/2))+(x-(x/2)-(x/4))) , y+(y/8)+(y/8)+(y/8)+(y/16) , x-(x/2)-(x/4)-(x/8) , y-(y/2)-(y/4)-(y/8) );
        
    }

}
