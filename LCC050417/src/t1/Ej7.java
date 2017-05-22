package t1;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class Ej7 extends Applet {

    public void init() {
        resize(1366, 768);
    }

    public void paint(Graphics g) {
//      Declarando
        int a = 300;

        int w[] = new int[17];
        int z[] = new int[17];

        int x = (int) (Math.random() * 500), y = (int) (Math.random() * 300);

//      Asignando
        w[0] = x;               z[0] = y;
        w[1] = x + a;           z[1] = y;
        w[2] = x + ((3*a)/4);   z[2] = y + ((3*a)/8);
        w[3] = x + a;           z[3] = y + a;

//      Graficando

            int R = (int) (Math.random() * 256);
            int G = (int) (Math.random() * 256);
            int B = (int) (Math.random() * 256);
            g.setColor(new Color(R, G, B));
            g.drawPolygon(w, z, 4);
    }
}
