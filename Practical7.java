// Write a program that has only one button in the frame, clicking on the button cycles through the colors: red->green->blue-> and so on.one color change per click.(use getBackGround() method to get the current color).

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Practical7 extends Frame {

    public static void main(String args[]) {
        JFrame frame = new JFrame();
        JButton button = new JButton("click");
        Container c = frame.getContentPane();
        c.setBackground(Color.WHITE);
        FlowLayout flowLayout = new FlowLayout();
        c.setLayout(flowLayout);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(button);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Color color = c.getBackground();
                if (color.equals(Color.WHITE)) {
                    c.setBackground(Color.RED);
                } else if (color.equals(Color.RED)) {
                    c.setBackground(Color.GREEN);
                } else if (color.equals(Color.GREEN)) {
                    c.setBackground(Color.BLUE);
                } else if (color.equals(Color.BLUE)) {
                    c.setBackground(Color.WHITE);
                }
            }
        });
        frame.setSize(400, 400);
        frame.setVisible(true);

    }

}
