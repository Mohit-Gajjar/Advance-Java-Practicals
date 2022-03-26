// Built an applet that displays a horizontal rectangle in its center. Let the rectangle fill with color from left to right.
import java.applet.Applet;
import java.awt.*;
/*
<applet code="Practical3.class" width=300 height=500>
</applet>
*/

public class Practical3 extends Applet{
    public void paint(Graphics s)
    {
        int a=100,b=100,c=50;
        s.setColor(Color.red);
        s.drawRect(100, 100, 100, 50);
      
        for(a=100;a<300;a=a+5)
        {
            try
            {
                Thread.sleep(1500);
                s.fillRect(a, b, 5, c);
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    } 
}
