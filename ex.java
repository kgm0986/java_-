import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ex {
    public static void main(String[] args){


}}





class Solution {
    public int solution(String my_string) {
        String ks = my_string.replaceAll("[^0-9]"," ");
        String[] sks = ks.split(" ");
        int answer = 0;
        for(int i=0; i<sks.length;i++){
            if(sks[i].equals("")){

            }else{
                answer+=Integer.parseInt(sks[i]);

            }
        }
        return answer;
    }
}





















//class Solution {
//    public static String solution(String polynomial) {
//        String ks;
//        String[] pp= polynomial.split(" \\+ ");
//        String[] pp1;
//        int xnum=0;
//        int num=0;
//        for(int i=0; i<pp.length; i++){
//            ks=pp[i];
//            pp1 = pp[i].split("");
//            if(pp1[pp1.length-1].equals("x")){
//                ks=ks.replaceAll("x", "");
//                if(pp1.length==1){
//                    xnum+=1;
//                }else{
//
//                    xnum += Integer.parseInt(ks);
//                }
//            }else{
//                num+=Integer.parseInt(ks);
//            }
//        }
//        String answer = "";
//
//
//        if(xnum==0){
//            answer=Integer.toString(num);
//
//        }else if(xnum==1&&num!=0){
//            answer=("x + "+num);
//        }else if(xnum==1&&num==0){
//            answer=("x");
//        }else if(xnum!=1&&num==0){
//            answer=(xnum+"x");
//        }else if(xnum!=1&&xnum!=0&&num!=0){
//            answer=(xnum+"x + "+num);
//        }else{
//            answer="!";
//        }
//
//
//
//        return answer;
//    }
//}














//class Solution {
//    public int solution(int[] numbers) {
//        int k=numbers[0]*numbers[1];
//        for(int i=0;i<numbers.length-1;i++){
//            for(int j=i+1;j<numbers.length;j++){
//                if(k<(numbers[i]*numbers[j])){
//                    k=numbers[i]*numbers[j];              }
//
//            }
//        }
//            int answer = k;
//        return answer;
//    }
//}


//class Solution {
//    public static int[] solution(String[] keyinput, int[] board) {
//        int a=0;
//        int b=0;
//        for(int i=0;i<keyinput.length;i++){
//            switch (keyinput[i]){
//                case "left":
//                    a-=1;
//                    if (a<((board[0]-1)/2)*-1){
//                        a=(((board[0]-1)/2)*-1);
//                    }
//                    break;
//                case "right":
//                     a+=1;
//                    if (a>((board[0]-1)/2)){
//                        a=((board[0]-1)/2);
//                    }
//                     break;
//                case "up":
//                    b+=1;
//                    if (b>((board[1]-1)/2)){
//                        b=((board[1]-1)/2);
//                    }
//                    break;
//                case "down":
//                    b-=1;
//                    if (b<((board[1]-1)/2)*-1){
//                        b=(((board[1]-1)/2)*-1);
//                    }
//                    break;
//            }
//
//
//        }
//
//
//
//
//
//
//        int[] answer = {a,b};
//        System.out.println(a);
//        System.out.println(b);
//        return answer;
//    }
//}

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
//class Solution {
//    public static int[] solution(String my_string) {
//        my_string=my_string.replaceAll("[^0-9]", "");
//        char[] my_char = new char[my_string.length()];
//        for (int i =0; i<my_string.length(); i++){
//            my_char[i] =my_string.charAt(i);
//        }
//        Arrays.sort(my_char);
//        int[] answer = new int[my_char.length];
//        for (int i =0; i< my_char.length; i++){
//            answer[i] = (int)my_char[i]-'0';
//
//        }
//
//
//
//        return answer;
//    }
//}