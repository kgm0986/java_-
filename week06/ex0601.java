package week06;

import java.util.ArrayList;
import java.util.Stack;

public class ex0601 {
    public static void main(String[] args) {
        int n = 10;
        int k = 0;
        Stack<Integer> stack = new Stack<>();
        while (stack.size() < n) {
            int m = (int)(Math.random()*10);
            if(stack.isEmpty()){
                stack.push(m);

            }else {
                if(stack.peek() !=m) {
                    stack.push(m);
                }
            }
        }




    }
}