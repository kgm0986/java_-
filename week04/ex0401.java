package week04;

import java.util.Arrays;
import java.util.Stack;

public class ex0401 {
    public  static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(1);
        System.out.println(stack.toString());
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.pop();//4번을 가져옴
        System.out.println(stack.toString());
        System.out.println(stack.peek());//가져오지만 사라지지 않음
        System.out.println(stack.isEmpty());
        System.out.println(stack.search(4));//4를 찾는다 없으면 -1 있으면 순번을 가져온다
        System.out.println(stack.search(2));//4를 찾는다 없으면 -1 있으면 순번을 가져온다
        System.out.println(stack.contains(2));//2가 있는가 없는다 t/f
        System.out.println(stack.containsAll(Arrays.asList(1,2,3)));//모두다 포함되야 T아니면 F
        System.out.println(stack.size());


    }
}
