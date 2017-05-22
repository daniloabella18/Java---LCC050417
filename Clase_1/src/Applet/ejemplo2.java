/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Applet;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author LAB-MAT
 */
public class ejemplo2 extends Applet {

    public void init() {
        resize(500,500);
    }
    
    public void paint(Graphics g){
        
        for(int i=0;i<1000000;i++){
            int R=(int)(Math.random()*256);
            int G=(int)(Math.random()*256);
            int B=(int)(Math.random()*256);
            
            g.setColor(new Color(R,G,B));
            int x=(int)(Math.random()*500);
            int y=(int)(Math.random()*500);
            g.fillRect(x, y, 20, 20);
            R=(int)(Math.random()*256);
            G=(int)(Math.random()*256);
            B=(int)(Math.random()*256);
            g.setColor(new Color(R,G,B));
            g.fillOval(x, y, 20, 20);
            pausa(5);
        }
        
    }
            public void pausa(int n){
            try{
                Thread.sleep(n);
            }catch(Exception e){
                
            }
        }

}
