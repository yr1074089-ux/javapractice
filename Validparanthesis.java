import java.util.*;
public class Validparanthesis{
    public static boolean isValid(String str) {
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            } else {
                if(stack.isEmpty()) {
                    return false;
                }
                if(stack.peek()=='(' && ch==')' || 
                   stack.peek()=='{' && ch=='}' || 
                   stack.peek()=='[' && ch==']') {
                    stack.pop();
                } else {
                    return false;
                }
            }  
        }
        if(stack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean isDuplicate(String str){
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == ')') {
                int count=0;
                while(stack.peek() != '(') {
                    stack.pop();
                    count++;
                }
                if(count<1){
                    return true;
                } else {
                    stack.pop(); // 
                }
            }
            else{
                stack.push(ch);
            }
        }  
        return false;      
    }
    public static void main(String[] args) {
        String str="((a+b))";
        String str2="(a+b)";
        System.out.println(isDuplicate(str2));
        System.out.println(isDuplicate(str));
    }
}