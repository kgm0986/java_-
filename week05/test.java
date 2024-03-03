package week05;

import java.util.*;
import java.util.stream.Stream;

public class test {
    public static void main(String[] args){
        System.out.println(Solution.solution(3,5));
    }
}

class Solution {
    public static long solution(int a, int b) {
        long answer = 0;
        if (a<=b){
            for(int i=a; i<= b;i++){
                answer+=i;
                System.out.println(answer);
            }
        }else{
            for(int i=b; i<= a;i++){
                answer+=i;
            }
        }

        return answer;
    }
}

//class Solution {
//    public int[] solution(int[] arr, int divisor) {
//        List<Integer> result = new ArrayList<>();
//        for(int i = 0; i < arr.length; i++){
//            if(arr[i]%divisor==0){
//                result.add(arr[i]);
//            }
//        }
//        Collections.sort(result);
//        if(result.size()==0){
//            int answer[]=new int[1];
//            answer[0]=-1;
//            return answer;
//        }
//        int[] answer = new int[result.size()];
//
//
//        for(int i = 0; i < answer.length; i++){
//            answer[i]=(int)result.get(i);
//        }
//        return answer;
//    }
//}

//class Solution {
//    public static String solution(int a, int b) {
//        String w[] = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
//        int months[] = {31,29,31,30,31,30,31,31,30,31,30,31};
//        int day=0 ;
//        for(int i = 0; i < a-1; i++){
//            day += months[i];
//        }
//        day += b-1;
//        day = day%7;
//        String answer = w[day];
//        return answer;
//    }
//}

//class Solution {
//    public int solution(int[] nums) {
//        int k = nums.length/2;
//        HashSet<Integer> set = new HashSet<>();
//        for(int i = 0; i < nums.length; i++) {
//            set.add(nums[i]);
//        }
//        int answer = 0;
//        if(set.size()>k){
//            return k;
//        }
//        return set.size();
//    }
//}
//


//class Solution {
//    public static int[] solution(int n) {
//        TreeSet<Integer> ss = new TreeSet<Integer>();
//        int qw = 0;
//        for(int i =1; i <=n/2; i++){
//            if((n%i)==0){
//                ss.add(i);
//                ss.add(n/i);
//
//            }
//        }
//        int[] answer = new int[ss.size()];
//        while (!ss.isEmpty()){
//            answer[qw] = ss.pollFirst();
//            System.out.println(answer[qw]);
//            qw++;
//        }
//
//
//
//        return answer;
//    }
//}
//class Solution {
//    public int solution(int num, int k) {
//        String s[] = String.valueOf(num).split("");
//        return BinSearch1.binSearch(s,k);
//    }
//}
//class BinSearch1 {
//    static  int binSearch(String[] a, int key) {
//        int pl =0;
//        int pr = a.length-1;
//
//        do {
//            int pc = (pr + pl)/2;
//            if(Integer.parseInt(a[pc]) == key) return pc;
//            else if(Integer.parseInt(a[pc])<key) {
//                pl = pc+1;
//            }else{
//                pr= pc-1;
//            }
//        }while (pl<=pr);
//        return -1;
//    }
//}

//class Solution {
//    public int[] solution(int[] array) {
//        TreeMap<Integer,Integer> tm = new TreeMap<>();
//        for(int i = 0; i<array.length;i++) {
//            tm.put(array[i],i);
//
//        }
//
//        Map.Entry<Integer,Integer> entry = tm.lastEntry();
//        int answer[] = {entry.getKey(), entry.getValue()};
//        return answer;
//    }
//}
