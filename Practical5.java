// Write an applet that contains one button. Initialize the label on the button to “start”, when the user presses the button change the label between these two values each time the button is pressed.
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/*
<applet code="Practical5.class" width=300 height=500>
</applet>
*/
public class Practical5 extends Applet implements ActionListener {
    Button button;

    @Override
    public void init() {
        button = new Button();
        button.setLabel("Start");
        button.addActionListener(this);
        add(button);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (button.getLabel().equals("Start")) {
            button.setLabel("Stop");
        } else {
            button.setLabel("Start");
        }

    }
}
