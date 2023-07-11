package _00_IntroToStacks;

import java.util.Random;

import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.util.Stack;
public class _01_IntroToStack {
    public static void main(String[] args) {
        // 1. Create a Stack of Doubles
        //    Don't forget to import the Stack class
Stack<Double> pile = new Stack<Double>();
        // 2. Use a loop to push 100 random doubles between 0 and 100 to the Stack.
double q;
for (int i = 0; i < 100; i++) {
	Random ran = new Random();
	q=ran.nextInt(100);
	pile.push(q);
}
        // 3. Ask the user to enter in two numbers between 0 and 100, inclusive. 

String s1 = JOptionPane.showInputDialog("Enter a number between 0 and 100, inclusive");
String s2 = JOptionPane.showInputDialog("Enter another number between 0 and 100");
int i1 = Integer.parseInt(s1);
int i2 = Integer.parseInt(s2);
        // 4. Pop all the elements off of the Stack. Every time a double is popped that is
        //    between the two numbers entered by the user, print it to the screen.

for (int i = pile.size()-1; i > -1; i--) {
	if(i1 > i2) {
		if(pile.get(i) >= i2 && pile.get(i) <= i1) {
			System.out.println(pile.get(i));
			pile.pop();
		}
		else {
			pile.pop();
		}
	}
	else if(i1<i2) {
		if(pile.get(i) <= i2 && pile.get(i) >= i1) {
			System.out.println(pile.get(i));
			pile.pop();
		}
		else {
			pile.pop();
		}	
	}
}

        // EXAMPLE:
        // NUM 1: 65
        // NUM 2: 75

        // Popping elements off stack...
        // Elements between 65 and 75:
        // 66.66876846
        // 74.51651681
        // 70.05110654
        // 69.21350456
        // 71.54506465
        // 66.47984807
        // 74.12121224
    }
}
