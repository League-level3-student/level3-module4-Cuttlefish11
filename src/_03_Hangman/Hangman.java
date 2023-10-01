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



public class Hangman implements ActionListener, KeyListener {
JPanel panel = new JPanel();
JFrame frame = new JFrame();
JLabel label = new JLabel();
Stack words = new Stack<String>();
Stack pile =  new Stack<String>();
String s = "";
char[] rwc;
String t=new String();
int l = 5;
String a;

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
rwc = rw.toCharArray();
for (int i = 0; i < rwc.length; i++) {
	String zzyzx = Character.toString(rwc[i]);
	pile.push(zzyzx);
}

frame.add(panel);	
panel.add(label);
frame.setVisible(true);
label.setVisible(true);
//frame.addKeyListener((KeyListener) this);

for (int i = 0; i < rwc.length; i++) {
	s=s+"_";
	System.out.println(s);
}
frame.addKeyListener(this);
label.setText(s);
frame.pack();
}
public void reset() {
	System.out.println("GAME OVER");
	
	String s = "";
	String t=new String();
	l = 5;
	
	String rw = (String) words.lastElement();
	words.pop();
	rwc = rw.toCharArray();
	for (int i = 0; i < rwc.length; i++) {
		String zzyzx = Character.toString(rwc[i]);
		pile.push(zzyzx);	
	}
	for (int i = 0; i < rwc.length; i++) {
		s=s+"_";
		System.out.println(s);
	}
	label.setText(s);	
}	
@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub
	if(l==0) {
		reset();
	}
	char c = e.getKeyChar();
	t=s;
	char[] tmv=t.toCharArray();
	s= new String();
	for (int i = 0; i < rwc.length; i++) {
		
		if(c==rwc[i]) {
			s=s+ c ;
		}
		else {
			s=s+ tmv[i];
		}
	}
	if(s.equals(t)) {
		l--;
	}
	label.setText(t);
	JOptionPane.showMessageDialog(null, "Lives: "+l);
	

}
@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
}
}
