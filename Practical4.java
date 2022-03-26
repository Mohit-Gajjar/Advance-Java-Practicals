// Write an applet that display the position of the mouse at the upper left corner of the applet when it is dragged or moved. draw a 10x10 pixel rectangle filed with black at the current mouse position.
import java.applet.Applet;
import java.awt.*;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
/*
<applet code="Practical4.class" width=300 height=500>
</applet>
*/
public class Practical4 extends Applet implements MouseListener, MouseMotionListener {

    String message = "";

    int a, b;

    public void init() {        
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    public void paint(Graphics g) {

        showStatus(message);
        g.setColor(Color.red);
        g.fillOval(a, b, 10, 10);
        g.drawOval(a, b, 10, 10);
        g.drawString("Coordinates: " + "X: " + a + " Y:" + b, 20, 20);
    }

    @Override
    public void mouseDragged(MouseEvent e) {

        a = e.getX();
        b = e.getY();
        
        message = "X: " + a + "Y: " + b;
        repaint();

    }

    @Override
    public void mouseMoved(MouseEvent e) {

        a = e.getX();
        b = e.getY();

        repaint();
        message = "X=" + a + "Y=" + b;

    }

    @Override
    public void mouseClicked(MouseEvent arg0) {

    }

    @Override
    public void mouseEntered(MouseEvent arg0) {

    }

    @Override
    public void mouseExited(MouseEvent arg0) {

    }

    @Override
    public void mousePressed(MouseEvent arg0) {

    }

    @Override
    public void mouseReleased(MouseEvent arg0) {

    }

}
