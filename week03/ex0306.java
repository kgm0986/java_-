package week03;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ex0306 {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 0; i <= num; i++){
            int token1 = sc.nextInt();
            int token2 = sc.nextInt();

            LinkedList<int[]> queue = new LinkedList<>();
            for (int j = 0; j < token1; j++){
                queue.offer(new int[] {j,sc.nextInt()});
            }
            int print =0;

            while ((!queue.isEmpty())){
                int[] front = queue.poll();
                boolean isMax = true;
                for (int k = 0; k < queue.size(); k++){
                    if (front[1]<queue.get(k)[1]) {
                        queue.offer(front);
                        isMax = false;
                        break;
                    }
                }
                if(!isMax) continue;
                print++;
                if(token2 ==front[0]) break;

            }
            sb.append(print).append("\n");







        }
        System.out.println(sb.toString());

    }
}
