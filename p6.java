import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class p6 {
    public static void main(String[] args) {
        List<String> line1 = new ArrayList<String>();
        List<String> line2 = new LinkedList<>();
        long startTime;
        long endTime;
        startTime = System.nanoTime();
        for(int i =0;i< 10000;i++){
            line1.add(0,String.valueOf(i));
        }
        endTime = System.nanoTime();
        System.out.println("ArrayList 걸린시간 : "+(endTime-startTime));
        startTime = System.nanoTime();
        for(int i =0;i< 10000;i++){
            line2.add(0,String.valueOf(i));
        }
        endTime = System.nanoTime();
        System.out.println("LinkedList 걸린시간 : "+(endTime-startTime));
    }
}
