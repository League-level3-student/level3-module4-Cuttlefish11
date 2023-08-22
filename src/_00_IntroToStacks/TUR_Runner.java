package _00_IntroToStacks;

import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TUR_Runner {
public void flap(JFrame frame, JPanel panel, JLabel label, Stack s) {
frame.add(panel);
panel.add(label);
frame.pack();
frame.setVisible(true);
frame.addKeyListener((KeyListener) this);
s= new Stack<String>();
label.setText(s.toString());
}
}
