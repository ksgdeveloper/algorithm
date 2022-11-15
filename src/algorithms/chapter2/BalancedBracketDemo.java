package algorithms.chapter2;

import java.util.LinkedList;

public class BalancedBracketDemo {
    public static void main(String[] args) {

        LinkedList<Character> linkedList = new LinkedList<>();
        String brackets = "{[()][({})]}";
        Boolean isBalancedBracketResult = isBalancedBracket(brackets);
        System.out.println(isBalancedBracketResult);


     }
     private static boolean isBalancedBracket(String str){
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
