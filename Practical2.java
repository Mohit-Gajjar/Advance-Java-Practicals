
// Draw ten red circles in a vertical column in the center of the applet.
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

/*
<applet code="Practical2.class" width=300 height=500>
</applet>
*/
public class Practical2 extends Applet {

    int padding = 50;

    @Override
    public void paint(Graphics g) {

       
        for (int i = 0; i < 10; i++) {
            g.setColor(Color.red);
            g.fillOval(120, padding, 40, 40);
            g.drawOval(120, padding, 40, 40);
            padding = padding + 50;
        }
    }
}
