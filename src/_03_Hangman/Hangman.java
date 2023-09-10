package _03_Hangman;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Dictionary;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;



public class Hangman implements ActionListener {
JPanel panel = new JPanel();
JFrame frame = new JFrame();
JLabel label = new JLabel();
Stack words = new Stack<String>();
Stack pile =  new Stack<String>();

public static void main(String[] args) {
	new Hangman().SPACE();
}
public void SPACE() {
String nums = JOptionPane.showInputDialog("Enter a number from 2 to 260.");
int nums2 = Integer.parseInt(nums);
Utilities u = new Utilities();
for (int i = 0; i < nums2; i++) {
	String word= u.readRandomLineFromFile("dictionary.txt");
	words.add(word);
}
String rw = (String) words.lastElement();
words.pop();
char[] rwc = rw.toCharArray();
for (int i = 0; i < rwc.length; i++) {
	String zzyzx = Character.toString(rwc[i]);
	pile.push(zzyzx);
}

frame.add(panel);	
panel.add(label);
frame.setVisible(true);
label.setVisible(true);
frame.addKeyListener((KeyListener) this);
for (int i = 0; i < rwc.length; i++) {
	String s = label.getText();
	label.setText(s + " _");
}
frame.pack();
}

public void keyPressed(KeyEvent e) {

}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
}
}
