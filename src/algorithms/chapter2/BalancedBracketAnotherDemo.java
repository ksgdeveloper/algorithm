package algorithms.chapter2;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class BalancedBracketAnotherDemo {
    public static void main(String[] args) {
        String str = "{[]([{[]}])}]";
        boolean result = firstMethod(str);
        System.out.println(result);
        result = secondMethod(str);
        System.out.println(result);
        result = thirdMethod(str);
        System.out.println(result);
    }

    private static boolean firstMethod(String str){
        Deque<Character> deque = new LinkedList<>();
        boolean flag = false;

        for(char ch : str.toCharArray()){
            if(ch == '{' || ch == '[' || ch == '('){
                deque.addFirst(ch);
            }else {
                if(!deque.isEmpty() && (deque.peekFirst() == '{' && ch == '}')){
                    deque.removeFirst();
                }else{
                    flag = false;
                }
            }
        }

        if(deque.isEmpty()){
            flag = true;
            System.out.println("Balanced");
        }

        return flag;
    }

    private static boolean secondMethod(String expr){
        Deque<Character> stack = new ArrayDeque<>();
        boolean flat = false;
        if(expr == null || expr.length()%2 == 0){
            return false;
        }

        for(int i = 0; i< expr.length() ; i++){
            char ch = expr.charAt(i);

            if (ch == '(' || ch == '[' || ch == '{') {
                // Push the element in the stack
                //stack.push(ch);
                System.out.println(stack);
                continue;
            }

            char check;
            if(stack.isEmpty()){
                return false;
            }

            switch(ch){
                case ')':
                    check = stack.pop();
                    if (check == '{' || check == '[')
                        return false;
                    break;
                case '}':
                    check = stack.pop();
                    if (check == '(' || check == '[')
                        return false;
                    break;

                case ']':
                    check = stack.pop();
                    if (check == '(' || check == '{')
                        return false;
                    break;
            }
            //System.out.println(stack);
        }
        return (stack.isEmpty());
    }

    private static boolean thirdMethod(String str){
        Boolean result = false;

        //validations
        if(str == null || str.length()%2 == 0){
            result = false;
        }else{
            char[] ch = str.toCharArray();
            for (char c : ch) {
                if (!(c == '{' || c == '[' || c == '(' || c == '}' || c == ']' || c == ')')) {
                    result = false;
                }
            }
        }

        while (str.contains("()") || str.contains("[]") || str.contains("{}")) {
            str = str.replaceAll("\\(\\)", "")
                    .replaceAll("\\[\\]", "")
                    .replaceAll("\\{\\}", "");
        }
        if(str.length() == 0){
            result = true;
        }
        return result;
    }
}
