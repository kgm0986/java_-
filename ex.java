//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//public class ex {
//    public void main(String[] args){
//        Solution.solution(420);
//
//}}
//
//
//
//
//class  Solution {
//        int as = 2;
//    public List solution1(int k) {
//        List<Integer> answerList = new ArrayList<>();
//        int j=0;
//        for(;(k % as) == 0;) {
//            k = k / as;
//            j++;
//        }
//        if (j!=0) {
//            answerList.add(as-2,as);
//            j=0;
//
//        }
//        as++;
//        if(k!=as){
//            solution1(k);
//        }
//        answerList.add(as);
//        return answerList;
//
//    }
//    public int[] solution(int n) {
//        List<Integer> answerList = new ArrayList<>();
//        answerList = solution1(n);
//        int[] answer = new int[answerList.size()];
//        for(int i = 0;i<answerList.size();i++){
//            answer[i] = answerList.get(i);
//            System.out.println(answer[i]);
//        }
//        return answer;
//    }
//}
////class Solution {
////    public static int[] solution(String my_string) {
////        my_string=my_string.replaceAll("[^0-9]", "");
////        char[] my_char = new char[my_string.length()];
////        for (int i =0; i<my_string.length(); i++){
////            my_char[i] =my_string.charAt(i);
////        }
////        Arrays.sort(my_char);
////        int[] answer = new int[my_char.length];
////        for (int i =0; i< my_char.length; i++){
////            answer[i] = (int)my_char[i]-'0';
////
////        }
////
////
////
////        return answer;
////    }
////}