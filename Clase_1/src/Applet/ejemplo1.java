
package Applet;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class ejemplo1 extends Applet {

    public void init() {
        resize(500,500);
    }
    
    public void paint(Graphics g){
        g.setColor(Color.red);
        g.drawRect(100, 100, 200, 200);
        g.fillRect(40, 40, 100, 100);
        g.setColor(Color.MAGENTA);
        g.drawOval(20, 20, 200, 200);
    }

}
