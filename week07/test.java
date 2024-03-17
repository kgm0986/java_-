package week07;

import com.sun.source.tree.ArrayAccessTree;

import java.sql.Array;
import java.util.*;

public class test {
    public static void main(String[] args) {
        String[] friends={"muzi", "ryan", "frodo", "neo"};
        String[] gifts = {"muzi frodo", "muzi frodo", "ryan muzi", "ryan muzi", "ryan muzi", "frodo muzi", "frodo ryan", "neo muzi"};
        System.out.println(Solution.solution(friends,gifts));





    }
}
class Solution {
    public static int solution(String[] friends, String[] gifts) {
        int answer = 0;
        String[][] str = new String[gifts.length][2];
        int num1[] = new int[friends.length];//선물지수
        int num2[] = new int[friends.length];
        int num4[][] = new int[friends.length][friends.length];//wnrh qkedms 선물

        for(int i =0; i<num4.length;i++){
            for (int j = 0; j<num4.length;j++){
                num4[i][j]=0;
            }
        }
        for (int i = 0; i < gifts.length; i++) {
            str[i] = gifts[i].split(" ");
        }

        for(int i=0; i<friends.length; i++) {
            for(int j=0; j<friends.length; j++) {
                if(i!=j){
                    for(int k=0; k<str.length; k++) {
                        if(friends[i].equals(str[k][0])){
                            if(friends[j].equals(str[k][1])){
                                num4[i][j]++;
                            }
                        }
                    }
                }
            }
        }

        for(int i=0; i<friends.length; i++) {
            int p =0;//받은거
            int q=0;//준거
            for (int j=0; j<friends.length; j++) {
                p +=num4[j][i];
                q +=num4[i][j];
            }
            num1[i]= q-p;
        }
        for(int i=0; i<friends.length; i++) {
            for(int j=0; j<friends.length; j++) {
                if(i!=j){
                    if(num4[i][j]==0&&num4[j][i]==0&&num4[j][i]==num4[i][j]){
                        if(num1[i]>num1[j]){
                            num2[i]++;
                        }
                    }else if(num4[i][j]>num4[j][i]){
                        num2[i]++;
                    }
                }
            }
        }
        int max = 0;

        for(int i=0; i<friends.length;i++){
            if(num2[i]>max){
                max = num2[i];

            }
        }





        answer=max;
        return answer;
    }
}
//class Solution {
//    public int solution(String t, String p) {
//        int answer = 0;
//        int as=p.length();
//        for (int i = 0; i < t.length()-as+1; i++) {
//            Long k=Long.parseLong(t.substring(i,i+as));
//            if(k<=Long.parseLong(p)){
//                answer++;
//            }
//
//        }
//        return answer;
//    }
//}











//class Solution {
//    public static int[] solution(String today, String[] terms, String[] privacies) {
//        List<Integer> li = new ArrayList<>();
//        String[] str = today.split("\\.");
//        int num11=(Integer.parseInt(str[0])-2000)*336;
//        int num22=(Integer.parseInt(str[1])-1)*28;
//        int num33=Integer.parseInt(str[2]);
//        num11=num11+num22+num33;
//        int todo = num11;
//
//        Map<String, Integer>  sp2 = new HashMap<String, Integer>();
//        for (int i = 0; i < terms.length; i++) {
//            String[] st = terms[i].split(" ");
//            sp2.put(st[0],Integer.parseInt(st[1])*28);
//        }
//
//        for (int i = 0; i < privacies.length; i++) {
//            String[] st = privacies[i].split(" ");
//            String[] sd = st[0].split("\\.");
//            int num1=(Integer.parseInt(sd[0])-2000)*336;
//            int num2=(Integer.parseInt(sd[1])-1)*28;
//            int num3=Integer.parseInt(sd[2]);
//            num1=num1+num2+num3;
//            if(num1+sp2.get(st[1])<=todo ){
//                li.add(i+1);
//            }
//        }
//        int[] answer = new int[li.size()];
//        for(int i = 0; i < answer.length; i++) {
//            answer[i] = li.get(i);
//        }
//
//
//        return answer;
//    }
//}
//class Solution {
//    public int[] solution(int[] lottos, int[] win_nums) {
//        int num=0;
//        int num1=0;
//        int[] rank = {6,6,5,4,3,2,1};
//        for(int i=0; i<lottos.length; i++) {
//            if(lottos[i]==0){
//                num++;
//            }
//            for(int j=0; j<win_nums.length; j++){
//                if(lottos[i]==win_nums[j]){
//                    num1++;
//                }
//            }
//        }
//
//
//
//        int[] answer = new int[2];
//        answer[0]=rank[num1+num];
//        answer[1]=rank[num1];
//
//        return answer;
//    }
//}

//class Solution {
//    public int[] solution(int[] numbers) {
//        HashSet<Integer> hs = new HashSet<Integer>();
//        for(int i = 0; i < numbers.length; i++){
//            for(int j = i+1; j <numbers.length; j++){
//                hs.add(numbers[j]+numbers[i]);
//            }
//        }
//        Integer[] answer1 = hs.toArray(new Integer[hs.size()]);
//        int[] answer = new int[answer1.length];
//        for (int i =0;i < answer.length;i++){
//            answer[i] = answer1[i];
//        }
//
//
//        Arrays.sort(answer);
//        return answer;
//    }
//}

//class Solution {
//    public String solution(String new_id) {
//        String answer = "";
//        new_id= new_id.toLowerCase();
//        new_id=new_id.replaceAll("[^0-9a-z-_.]","");
//        while (new_id.contains("..")){
//            new_id=new_id.replace("..",".");
//        }
//        new_id=new_id.replaceAll("[.]$","");
//        new_id=new_id.replaceAll("^[.]","");
//        if(new_id.isEmpty()){
//            new_id="a";
//        }
//        if(new_id.length()>15){
//            new_id=new_id.substring(0,15);
//        }
//        new_id=new_id.replaceAll("[.]$","");
//        while(new_id.length()<3){
//            new_id=  (new_id + new_id.charAt(new_id.length() - 1));
//
//        }
//        answer=new_id;
//        return answer;
//    }
//}

//class Solution {
//    public String solution(String[] survey, int[] choices) {
//        String answer = "";
//        int R=0;
//        int T=0;
//        int F=0;
//        int C=0;
//        int M=0;
//        int J=0;
//        int A=0;
//        int N=0;
//
//        for (int i = 0; i < survey.length; i++) {
//            switch (survey[i]) {
//                case "RT" :
//                    if(choices[i]>4){
//                        T+=choices[i]-4;
//                    }else{
//                        R+=4-choices[i];
//                    }
//                    break;
//                case "TR" :
//                    if(choices[i]>4){
//                        R+=choices[i]-4;
//                    }else{
//                        T+=4-choices[i];
//                    }
//                    break;
//                case "FC" :
//                    if(choices[i]>4){
//                        C+=choices[i]-4;
//                    }else{
//                        F+=4-choices[i];
//                    }
//                    break;
//                case "CF" :
//                    if(choices[i]>4){
//                        F+=choices[i]-4;
//                    }else{
//                        C+=4-choices[i];
//                    }
//                    break;
//                case "MJ" :
//                    if(choices[i]>4){
//                        J+=choices[i]-4;
//                    }else{
//                        M+=4-choices[i];
//                    }
//                    break;
//                case "JM" :
//                    if(choices[i]>4){
//                        M+=choices[i]-4;
//                    }else{
//                        J+=4-choices[i];
//                    }
//                    break;
//                case "AN" :
//                    if(choices[i]>4){
//                        N+=choices[i]-4;
//                    }else{
//                        A+=4-choices[i];
//                    }
//                    break;
//                case "NA" :
//                    if(choices[i]>4){
//                        A+=choices[i]-4;
//                    }else{
//                        N+=4-choices[i];
//                    }
//                    break;
//
//            }
//            answer="";
//        }
//        String a ="";
//        String b ="";
//        String c ="";
//        String d ="";
//        if(A>=N){
//            a="A";
//        } else {
//            a="N";
//        }
//
//        if(R>=T){
//            b="R";
//        } else {
//            b="T";
//        }
//
//        if(C>=F){
//            c="C";
//        } else {
//            c="F";
//        }
//
//        if(J>=M){
//            d="J";
//        } else {
//            d="M";
//        }
//        answer = String.format("%s%s%s%s",b,c,d,a);
//        return answer;
//    }
//}