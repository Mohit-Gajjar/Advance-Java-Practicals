
// Write an applet that draws two sets of ever-decreasing rectangles one in outline form and one filled alternately in black and white. 
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

/*
<applet code="Practical10.class" width=300 height=500>
</applet>
*/

public class Practical10 extends Applet {

    int x, y, h, w;

    @Override
    public void init() {
        setSize(500, 500);
        x = 20;
        y = 100;
        h = 300;
        w = 200;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        for (int i = 0; i < 20; i++) {
            x = x + 5;
            y = y + 5;
            h = h - 10;
            w = w - 10;
            if (i % 2 == 0) {
                g.setColor(Color.black);
                g.fillRect(x, y, h, w);
            } else {
                g.setColor(Color.white);
                g.fillRect(x, y, h, w);
            }
        }
    }
}