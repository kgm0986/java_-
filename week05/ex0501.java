package week05;
import java.util.*;


public class ex0501 {
    public static void main(String[] args){
        TreeSet<Integer> scores = new TreeSet<Integer>();
        scores.add(87);
        scores.add(98);
        scores.add(75);
        scores.add(95);
        scores.add(80);
        Integer score = null;
        score = scores.first();
        System.out.println("가장 높은 점수"+score);
        score = scores.last();
        System.out.println("가장낮은점수"+score);
        score = scores.lower(95);
        System.out.println("95점 아래점수"+score);
        score = scores.higher(95);
        System.out.println("95점위점수"+score);
        score = scores.floor(94);
        System.out.println("94점이거나 바로 아래 점수"+score);
        score = scores.ceiling(94);
        System.out.println("94점이거나 바로위점수"+score);
        while (!scores.isEmpty()) {
            score = scores.pollFirst();
            System.out.println(score+"(남은 객체수 " + scores.size()+")");
        }

    }
}
