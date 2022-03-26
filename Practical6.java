//Develop an applet that uses the mouse listener,which overrides only two method which are mousePresses and mouseReleased. 
import java.applet.Applet;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
/*
<applet code="Practical6.class" width=300 height=500>
</applet>
*/
public class Practical6 extends Applet implements MouseListener {

    String message = "";

    public void init() {
        setSize(400, 400);
        addMouseListener(this);
    }

    public void paint(Graphics s) {
        showStatus(message);

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        message = e.toString();
        repaint();

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        message = e.toString();
        repaint();

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

}
