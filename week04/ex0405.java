package week04;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class ex0405 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        Stack stack = new Stack();
        switch (sc.nextInt()) {
            case 1:
                int x = sc.nextInt();
                stack.push(x);
                break;
            case 2:
                if(stack.empty()){
                    sb.append(stack.pop()).append("\n");
                }else{
                    sb.append(stack.pop()).append("\n");
                }
                break;
            case 3:
                sb.append(stack.size()).append("\n");
                break;
            case 4:
                break;
            case 5:
                break;
            default:
                break;

        }
    }
}
//class Solution {
//    public String solution(String[] id_pw, String[][] db) {
//        String answer = "";
//        for(int i=0; i<db.length;i++){
//            if(id_pw[0].equals(db[i][0])){
//                if(id_pw[1].equals(db[i][1])){
//                    answer="login";
//                }else{
//                    answer="wrong pw";
//                }
//            }else{
//                answer ="fail";
//            }
//        }
//        return answer;
//    }
//}


//class Solution {
//    public String solution(String bin1, String bin2) {
//        String answer = "";
//        int binaryToDecimal1 = Integer.parseInt(bin1, 2);
//        int binaryToDecimal2 = Integer.parseInt(bin2, 2);
//        int s=binaryToDecimal2+binaryToDecimal1;
//        answer= Integer.toBinaryString(s);
//
//        return answer;
//    }
//}

class Solution {
    public int solution(String before, String after) {
        ArrayList<String[]> arr = new ArrayList<>();
        arr.add(before.split(""));
        ArrayList<String[]> arr2 = new ArrayList<>();
        arr2.add(after.split(""));
        int num =0;

        for(int i=0; i<arr.size();i++){
            for(int j=0; j<arr2.size();j++){
                if(arr.get(i).equals(arr2.get(j))){
                    arr2.remove(j);
                    num++;
                    break;
                }
            }
        }
        int answer = 0;

        if(num==arr.size()){
            answer = 1;
        }else {
            answer=0;
        }
        System.out.println(num);
        return answer;
    }
}