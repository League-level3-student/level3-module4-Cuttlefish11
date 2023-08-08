package _00_IntroToStacks;

import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class _02_TextUndoRedo {
    
     // Create a JFrame with a JPanel and a JLabel.
JFrame frame = new JFrame();
 JPanel panel = new JPanel();
 JLabel label = new JLabel();

 
     // Every time a key is pressed, add that character to the JLabel. It should
      //look like a basic text editor.
     public static void main(String[] args) {
		
	}
     public void blarg() {
    	 frame.add(panel);
    	 panel.add(label);
    	 frame.pack();
    	 frame.setVisible(true);
     }
     public void keyPressed(KeyEvent e) {
    char c = e.getKeyChar();
    //if(c == 'a' ||c == 'b' || c == 'c' ||c == 'd' ||c == 'e' ||c == 'f' ||c == 'g' ||c == 'h' ||c == 'i' ||c == 'j' ||c == 'k' ||c == 'l' ||c == 'm' ||c == 'n' ||c == 'o' ||c == 'p' ||c == 'q' ||c == 'r' ||c == 's' ||c == 't'||c == 'u' ||c == 'v' ||c == 'w' ||c == 'x' ||c == 'y' ||c == 'z') {
    //}
    if(c>='a' && c<='z' || c>='A' && c<='Z') {
    	
    }
 	}
     // Make it so that every time the BACKSPACE key is pressed, the last
     // character is erased from the JLabel.
     
     // Save that deleted character onto a Stack of Characters.
      
     // Choose a key to be the Undo key. Make it so that when that key is
     // pressed, the top Character is popped  off the Stack and added back to
      //the JLabel.
     


}
