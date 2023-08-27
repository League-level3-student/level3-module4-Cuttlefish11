package _00_IntroToStacks;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_TextUndoRedo implements KeyListener {
    // Create a JFrame with a JPanel and a JLabel.
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JLabel label = new JLabel();
Stack s =new Stack<String>();
Stack charGraveyard = new  Stack<String>(); 
//String text =  "";
 
     // Every time a key is pressed, add that character to the JLabel. It should
      //look like a basic text editor.
     public static void main(String[] args) {
new _02_TextUndoRedo().run();
	}
     public void run() {
    	 frame.add(panel);
    	 panel.add(label);
    	 frame.setVisible(true);
    	 label.setVisible(true);
    	 label.setText(""+s);
    	 frame.addKeyListener(this);
    	 frame.pack();
    	 System.out.println("testing");
     }
     public void keyPressed(KeyEvent e) {
    char c = e.getKeyChar();
  
    if(e.getKeyChar()==KeyEvent.VK_BACK_SPACE) {
    	charGraveyard.push(s.lastElement());
    	s.pop();
    	label.setText(""+s);
    	System.out.println("DEATH:(");
    }
    //if(c>='a' && c<='z' || c>='A' && c<='Z') {
    else {
    	s.push(e.getKeyChar());
    	//text+=e.getKeyChar();
    	label.setText(""+s);
    	System.out.println("creation");
    }
    
 	}
     // Make it so that every time the BACKSPACE key is pressed, the last
     // character is erased from the JLabel.
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
     
     // Save that deleted character onto a Stack of Characters.
      
     // Choose a key to be the Undo key. Make it so that when that key is
     // pressed, the top Character is popped  off the Stack and added back to
      //the JLabel.
     


}
