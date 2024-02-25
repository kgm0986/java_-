package week04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class test {
    public static void main(String[] args){


    }

}

class Solution1 {
    public int solution(int[] common) {
        boolean as1 = false;
        boolean as2 = false;
        int answer = 0;
        if(common[0]+common[2]==(common[1]/2)){
            as1=true;
        }else {
            as2=true;
        }
        if (as1) {
            answer=(common[common.length-1])+(common[1]-common[0]);
        }else {
            answer=(common[common.length-1])*(common[1]/common[0]);
        }


        return answer;
    }
}


//class Solution1 {
//    public String[] solution(String[] quiz) {
//        String str[] ;
//        String[] answer= new String[quiz.length] ;
//        int num = 0;
//        for(int i=0; i< quiz.length; i++) {
//            str=quiz[i].split(" ");
//            if(str[1].equals("-")){
//                if(Integer.parseInt(str[0])-Integer.parseInt(str[2])==Integer.parseInt(str[4])){
//                    answer[num]="O";
//                    num++;
//                }else{
//                    answer[num]="X";
//                    num++;
//                }
//            }else{
//                if(Integer.parseInt(str[0])+Integer.parseInt(str[2])==Integer.parseInt(str[4])){
//                    answer[num]="O";
//                    num++;
//                }else{
//                    answer[num]="X";
//                    num++;
//                }
//
//            }
//        }
//
//        return answer;
//    }
//}

//class Solution1 {
//    public long solution(String numbers) {
//        String list[] = {"zero", "one", "two", "three", "four", "five","six", "seven", "eight", "nine"};
//        for(int i=0; i<list.length;i++){
//               numbers= numbers.replaceAll(list[i], String.valueOf(i));
//
//        }
//
//
//        long answer = Long.parseLong(numbers);
//        return answer;
//    }
//}

//class Solution {
//    public String solution(String my_string) {
//        char[] a = my_string.toCharArray();
//        for(int i=0; i<a.length;i++){
//            if(Character.isUpperCase(a[i])){
//                a[i]=Character.toLowerCase(a[i]);
//            }else{
//                a[i]=Character.toUpperCase(a[i]);
//
//            }
//        }
//
//        String answer = new String(a);
//        return answer;
//    }
//}
//class Solution1 {
//    public static int solution(String before, String after) {
//        ArrayList<String[]> arr = new ArrayList<>();
//        arr.add(before.split(""));
//        ArrayList<String[]> arr2 = new ArrayList<>();
//        arr2.add(after.split(""));
//        int num =0;
//        System.out.println(arr.get(0).toString());
//        System.out.println(arr2.get(0));
//        Arrays
//
//        for(int i=0; i<arr.size();i++){
//            for(int j=0; j<arr2.size();j++){
//                if(arr.get(i).equals(arr2.get(j))){
//                    arr2.remove(j);
//
//                    num++;
//                    break;
//                }
//            }
//        }
//        Character.
//        int answer = 0;
//
//        if(num==arr.size()){
//            answer = 1;
//        }else {
//            answer=0;
//        }
//        System.out.println("num"+num);
//        return answer;
//    }
//}