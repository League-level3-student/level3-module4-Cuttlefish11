package _00_IntroToStacks;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_TextUndoRedo {
    
     static // Create a JFrame with a JPanel and a JLabel.
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JLabel label = new JLabel();
Stack s;

 
     // Every time a key is pressed, add that character to the JLabel. It should
      //look like a basic text editor.
     public static void main(String[] args) {
new _02_TextUndoRedo().run();
	}
     public void run() {
    	 frame.add(panel);
    	 panel.add(label);
    	 frame.pack();
    	 frame.setVisible(true);
    	 frame.addKeyListener((KeyListener) this);
    	 s= new Stack<String>();
    	 label.setText(s.toString());
     }
     public void keyPressed(KeyEvent e) {
    char c = e.getKeyChar();
    //if(c == 'a' ||c == 'b' || c == 'c' ||c == 'd' ||c == 'e' ||c == 'f' ||c == 'g' ||c == 'h' ||c == 'i' ||c == 'j' ||c == 'k' ||c == 'l' ||c == 'm' ||c == 'n' ||c == 'o' ||c == 'p' ||c == 'q' ||c == 'r' ||c == 's' ||c == 't'||c == 'u' ||c == 'v' ||c == 'w' ||c == 'x' ||c == 'y' ||c == 'z') {
    //}
    if(c>='a' && c<='z' || c>='A' && c<='Z') {
    	String z = Character.toString(c);
    	s.add(z);
    }
 	}
     // Make it so that every time the BACKSPACE key is pressed, the last
     // character is erased from the JLabel.
     
     // Save that deleted character onto a Stack of Characters.
      
     // Choose a key to be the Undo key. Make it so that when that key is
     // pressed, the top Character is popped  off the Stack and added back to
      //the JLabel.
     


}
