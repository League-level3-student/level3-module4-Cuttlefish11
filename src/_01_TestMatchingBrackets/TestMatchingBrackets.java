package _01_TestMatchingBrackets;

import java.util.Stack;

public class TestMatchingBrackets {
    /*
     * Use a Stack to complete the method for checking if every opening bracket
     * has a matching closing bracket
     */
    public static boolean doBracketsMatch(String b) {
    	int num = 0;
char c[] = b.toCharArray();
Stack s = new Stack<>();
for (int i = 0; i < c.length; i++) {
s.push(c[i]);
}
for (int i = 0; i < s.size(); i++) {
	if(s.firstElement().equals('{')) {
		num++;
	}
	s.pop();
}
if (s.size()==num) {
        return true;
}
else {
	return false;
}
    }    

/*for (int i = 0; i < c.length; i++) {
	if(c[i]=='{') {
		num++;
	}
	else if(c[i]=='}') {
		num--;
	}
}
if (num==0) {
        return true;
}
else {
	return false;
}
}*/    
}