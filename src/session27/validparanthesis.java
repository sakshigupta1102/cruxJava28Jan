package session27;
import java.util.*;
public class validparanthesis {
	public boolean isValid(String str) {
        Stack<Character> stack = new Stack();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch == '(' || ch == '[' || ch =='{'){
                stack.push(ch);
            }
            else{
                if(stack.isEmpty()) return false;
                char pop = stack.pop();
                if( (pop == '(' && ch != ')') || (pop == '[' && ch != ']') || 
                (pop == '{' && ch != '}')   ){
                    return false;
                }
            }
        }
        return stack.isEmpty();
        
    }
}
