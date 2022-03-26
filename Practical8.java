// Write an applet that contains three check boxes and 30 x 30 pixel canvas. The three checkboxes should be labeled “Red”, ”Green”, ”Blue”. The selection of the check boxes determine the color of the canvas. For example, if the user selects both “Red” and “Blue”, the canvas should be purple.
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Practical8 extends JFrame implements ItemListener {
    JCheckBox checkBoxRed, checkBoxBlue, checkBoxGreen;
    Canvas canvas = new Canvas();

    Practical8() {
        setLayout(new FlowLayout());
        canvas.setSize(200, 200);
        add(canvas);

        checkBoxRed = new JCheckBox("RED");
        checkBoxGreen = new JCheckBox("GREEN");
        checkBoxBlue = new JCheckBox("BLUE");

        checkBoxRed.addItemListener(this);
        checkBoxGreen.addItemListener(this);
        checkBoxBlue.addItemListener(this);

        add(checkBoxRed);
        add(checkBoxGreen);
        add(checkBoxBlue);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 350);
        setVisible(true);
    }

    int red = 0, green = 0, blue = 0;

    public void itemStateChanged(ItemEvent ie) {
        if (checkBoxRed.isSelected()) {
            red = 255;
            canvasColor();
        } else if (!checkBoxRed.isSelected()) {
            red = 0;
            canvasColor();
        }
        if (checkBoxGreen.isSelected()) {
            green = 255;
            canvasColor();
        } else if (!checkBoxGreen.isSelected()) {
            green = 0;
            canvasColor();
        }
        if (checkBoxBlue.isSelected()) {
            blue = 255;
            canvasColor();
        } else if (!checkBoxBlue.isSelected()) {
            blue = 0;
            canvasColor();
        }

    }

    public void canvasColor() {
        canvas.setBackground(new Color(red, green, blue));
    }

    public static void main(String arg[]) {
        new Practical8();
    }
}