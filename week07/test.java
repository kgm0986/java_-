package week07;

import com.sun.source.tree.ArrayAccessTree;

import java.sql.Array;
import java.util.*;

import static java.lang.Math.abs;
import static java.lang.Math.scalb;

public class test {
    public static void main(String[] args) {
        int[][] s = {{1,2,3,5},{5,6,7,8},{4,3,2,1}};
        System.out.println(Solution.solution(15));


    }
}


class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=1; i<=n;i++){
            int sum=0;
            for(int j=i; j<=n;j++){
                sum+=j;
                if(sum==n){
                    answer++;

                }else if(sum>n){
                    break;
                }




            }

        }
        return answer;
    }
}

//class  Solution {
//   static int  solution(int[][] land) {
//        int answer = 0;
//        int arr[][]=new int[land.length+1][4];
//        for (int i = 1; i <= land.length; i++) {
//            for (int j = 0; j<4;j++){
//                for (int k = 0; k < 4; k++) {
//                    if(k==j){
//                        continue;
//                    }
//                    arr[i][j] =Math.max(arr[i][j],arr[i-1][k]+land[i-1][j]);
//                    System.out.println(arr[i][j]);
//                   // System.out.println(answer);
//                    answer=Math.max(answer,arr[i][j]);
//                }
//            }
//
//        }
//
//        return answer;
//    }
//}

//class Solution {
//    public static int[] solution(int brown, int yellow) {
//        int[] answer = {};
//        int n=2;
//        int n1=1;
//        int l =brown/n;
//        int k1=0;
//        int k2=0;
//        boolean qa=true;
//        while(qa){
//        k1=l-n1;
//        k2=n1;
//
//            if((k1-2)*k2==yellow){
//                answer= new int[]{k1,k2};
//                qa=false;
//                System.out.println("tlfgod");
//                break;
//            }else{
//                n1++;
//                System.out.println(k1);
//            }
//        }
//
//
//
//        return answer;
//    }
//}

//class Solution {
//    List<int[]> answer1 = new ArrayList<>();
//    public  int[][] solution(int n) {
//        int[][] answer = resolution(n,1,2,3);
//
//        return answer;
//    }
//    public int[][] resolution(int n, int q, int w, int e){//원판 갯수 시작 경유 도착
//
//
//        if(n==1){
//            answer1.add(new int[]{q, e});//내가 다른 언어랑 햇갈린건지 모르겠는데 원래 배열 이니셜라이저 오류가 뜨나?
//
//        }else{
//            resolution(n-1,q,e,w);
//            answer1.add(new int[]{q,e});
//            resolution(n-1,w,q,e);//나중에 다시보기
//            System.out.println(q +"에서"+e+"로");
//
//
//        }
//        return answer1.toArray(new int[0][]);
//    }
//}



//class Solution {
//    public static int[] solution(String[] wallpaper) {
//        int x1 = 0;
//        int x2 = 50;
//        int y1 = 0;
//        int y2 = 50;
//        String[][] wallpaper1 = new String[wallpaper.length][wallpaper.length];
//        for(int i=0; i<wallpaper.length; i++){
//            wallpaper1[i] = wallpaper[i].split("");
//        }
//        for(int i=0; i<wallpaper1.length; i++){
//            for (int j=0; j<wallpaper1[i].length;j++){
//                if(wallpaper1[i][j].equals("#")){
//                  if(j > x1){
//                      x1 = j;
//                      System.out.println(x1);
//                  }
//                  if(i>y1){
//                      y1 = i;
//                  }
//                  if(j<x2){
//                      x2=j;
//                  }
//                  if(i<y2){
//                      y2=i;
//                  }
//                }
//            }
//        }
//        int[] answer = {x2,y2,x1+1,y1+1};
//        return answer;
//    }
//}

//class Solution {
//    public static int[] solution(String[] park, String[] routes) {
//        int[] answer = new int[2];
//        String[][] rou = new String[routes.length][2];
//        String[][] pk = new String[park.length][park[0].length()];//??
//
//        for(int i=0; i<park.length;i++){
//            pk[i]=park[i].split("");
//
//        }
//        for(int i=0; i<pk.length;i++){
//            for(int j =0; j< pk[0].length;j++){
//                if(pk[i][j].equals("S")){
//                    answer[0]=i;
//                    answer[1]=j;
//                }
//            }
//        }
//        for(int i=0; i<routes.length;i++){
//            rou[i]= routes[i].split(" ");
//        }
//
//
//        for(int i=0; i<rou.length;i++){
//            boolean qwe = true;
//            switch (rou[i][0]) {
//                case "E" :
//                        if(answer[1]+Integer.parseInt(rou[i][1])<pk[0].length){
//                            for(int j =0; j<= Integer.parseInt(rou[i][1]);j++){
//                                if(pk[answer[0]][answer[1]+j].equals("X")){
//                                        qwe=false;
//
//                                }
//                            }
//                            if(qwe){
//                                answer[1]+=Integer.parseInt(rou[i][1]);
//
//                            }
//
//                        }
//                    System.out.print(answer[0]);
//                    System.out.println(answer[1]);
//                    break;
//                case "S" :
//                    if(answer[0]+Integer.parseInt(rou[i][1])<pk[0].length){
//                        for(int j =0; j<= Integer.parseInt(rou[i][1]);j++){
//                            if(pk[answer[0]+j][answer[1]].equals("X")){
//                                qwe=false;
//
//                            }
//                        }
//                        if(qwe){
//                            answer[0]+=Integer.parseInt(rou[i][1]);
//
//                        }
//
//                    }
//
//
//                    System.out.print(answer[0]);
//                    System.out.println(answer[1]);
//                    break;
//                case "W" :
//                    if(answer[1]-Integer.parseInt(rou[i][1])>=0){
//                        for(int j =0; j<= Integer.parseInt(rou[i][1]);j++){
//                            if(pk[answer[0]][answer[1]-j].equals("X")){
//                                qwe=false;
//
//                            }
//                        }
//                        if(qwe){
//                            answer[1]-=Integer.parseInt(rou[i][1]);
//                            System.out.println(rou[i][1]);
//                        }
//
//                    }
//
//
//                    System.out.print(answer[0]);
//                    System.out.println(answer[1]);
//                    break;
//                case "N" :
//                    if(answer[0]-Integer.parseInt(rou[i][1])>=0){
//                        for(int j =0; j<= Integer.parseInt(rou[i][1]);j++){
//                            if(pk[answer[0]-j][answer[1]].equals("X")){
//                                qwe=false;
//
//                            }
//                        }
//                        if(qwe){
//                            answer[0]-=Integer.parseInt(rou[i][1]);
//
//                        }
//
//                    }
//
//
//                    System.out.print(answer[0]);
//                    System.out.println(answer[1]);
//                    break;
//            }
//
//        }
//        return answer;
//    }
//}
//class Solution {
//    public String solution(int[] numbers, String hand) {
//        String[] answer = new String[numbers.length];
//        int right =12;
//        int left =10;
//
//        for (int i = 0; i < numbers.length; i++) {
//            if(numbers[i]==0){
//                numbers[i]=11;
//            }
//        }
//        for(int i=0;i<numbers.length;i++){
//            switch(numbers[i]) {
//                case 1: case 4: case 7:
//                    answer[i] = "L";
//                    left=numbers[i];
//                    break;
//                case 3: case 6: case 9:
//                    answer[i] ="R";
//                    right=numbers[i];
//                    break;
//                default:
//
//                    int r=abs(numbers[i]-right)/3 + abs(numbers[i]-right)%3;
//                    int l=abs(numbers[i]-left)/3 + abs(numbers[i]-left)%3;
//                    if(r==l){
//                        if("right".equals(hand)){
//                            answer[i]="R";
//                            right=numbers[i];
//
//
//                        }else{
//                            answer[i]="L";
//                            left=numbers[i];
//                        }
//                    }else if(r<l){
//                        answer[i] = "R";
//                        right=numbers[i];
//                    }else{
//                        answer[i] = "L";
//                        left=numbers[i];
//                    }
//
//            }
//
//        }
//
//        String answer1= String.join(",",answer).replaceAll(",","");
//
//        return answer1;
//    }
//}
//class Solution {
//    public static int solution(String[] friends, String[] gifts) {
//        int answer = 0;
//        String[][] str = new String[gifts.length][2];
//        int num1[] = new int[friends.length];//선물지수
//        int num2[] = new int[friends.length];
//        int num4[][] = new int[friends.length][friends.length];//wnrh qkedms 선물
//
//        for(int i =0; i<num4.length;i++){
//            for (int j = 0; j<num4.length;j++){
//                num4[i][j]=0;
//            }
//        }
//        for (int i = 0; i < gifts.length; i++) {
//            str[i] = gifts[i].split(" ");
//        }
//
//        for(int i=0; i<friends.length; i++) {
//            for(int j=0; j<friends.length; j++) {
//                if(i!=j){
//                    for(int k=0; k<str.length; k++) {
//                        if(friends[i].equals(str[k][0])){
//                            if(friends[j].equals(str[k][1])){
//                                num4[i][j]++;
//                            }
//                        }
//                    }
//                }
//            }
//        }
//
//
//
//        for(int i=0; i<friends.length; i++) {
//            int p =0;//받은거
//            int q=0;//준거
//            for (int j=0; j<friends.length; j++) {
//                p +=num4[j][i];
//                q +=num4[i][j];
//            }
//            num1[i]= q-p;
//        }
//        s
//
//        for(int i=0; i<friends.length; i++) {
//            for(int j=0; j<friends.length; j++) {
//                if(i!=j){
//                    if(num4[i][j]==0&&num4[j][i]==0||num4[j][i]==num4[i][j]){
//                        if(num1[i]>num1[j]){
//                            num2[i]++;
//
//                        }
//                    }else if(num4[i][j]>num4[j][i]){
//                        num2[i]++;
//                    }
//                }
//            }
//        }
//        for(int i=0; i<friends.length; i++) {
//            System.out.println(num2[i]);
//        }
//
//
//        int max = 0;
//
//        for(int i=0; i<friends.length;i++){
//            if(num2[i]>max){
//                max = num2[i];
//
//            }
//        }
//
//
//
//
//
//
//        answer=max;
//        return answer;
//    }
//}
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