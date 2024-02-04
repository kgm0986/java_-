import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class p7 {
    public static void main(String[] args){
        Set<String> set = new HashSet<String>();
        set.add("A");
        set.add("B");
        set.add("C");
        System.out.println(set.size());

        Iterator<String> it = set.iterator();
        while (it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }
        set.add("A");
        for (String s : set){
            System.out.println(s);
        }
    }
}
