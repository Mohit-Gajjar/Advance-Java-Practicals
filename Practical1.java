// Write an applet that draws a circle. The dimension of the applet should be 500 x 300 pixels. The circle should be centered in the applet and have a radius of 100 pixels. Display your name centered in a circle.(using drawOval() method).
import java.applet.*;
import java.awt.Graphics;
/*
<applet code="Practical1.class" width=300 height=500>
</applet>
*/

public class Practical1 extends Applet
{
    public void paint(Graphics g)
    {
         g.drawOval(50, 50, 200, 230);
         g.drawString("Mohit Gajjar", 115, 170);
    }
}