package week03;

import java.util.LinkedList;
import java.util.Queue;

public class ex0301 {
    public static void main(String[] args){
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        System.out.println(queue.toString());
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        System.out.println(queue.toString());

        System.out.println(queue.peek());//맨 앞의 하나를 가져온다
        System.out.println(queue.toString());
        System.out.println(queue.poll());//맨 앞의 하나를 가져온다 가져온건 사라짐
        System.out.println(queue.toString());

        System.out.println(queue.isEmpty());
        queue.clear();
        System.out.println(queue.toString());
    }
}
