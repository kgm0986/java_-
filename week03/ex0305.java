package week03;

import java.util.ArrayList;

public class ex0305 {
    public static void main(String[] args){
        int[][] data = new int[5][5];
        for (int i=0; i<data.length; i++){
            for (int j=0; j<data.length; j++){
                data[i][j]=0;
            }
        }
        data[3][2]=1;

        System.out.println(Solution.solution(data));

    }
}

class Solution {
    public static int solution(int[][] board) {
        int answer = 0;
        int x[] = {-1,-1,-1,0,0,1,1,1};//x의 x조표
        int y[] = {-1,0,1,-1,1,-1,0,1};//x의 y 좌표
        ArrayList<int[]> b = new ArrayList<int[]>();
        for (int i=0; i<board.length; i++) {
            for (int j=0; j<board.length; j++) {
                if (board[i][j] == 1){
                    int[] temp = {i,j};
                    b.add(temp);
                }
            }
        }
        for(int i=0; i<b.size(); i++){
            int m = b.get(i)[0];//지뢰x
            int n = b.get(i)[1];//지뢰 y
            for(int j=0; j<x.length; j++){
                if(x[j]+m>=0 && y[j] + n>=0&& x[j]+m< board.length&& y[j]+n<board.length){
                    board[x[j]+m][y[j]+n]=2;

                }
            }
        }
        for (int i=0; i<board.length; i++){
            for(int j=0; j<board[i].length; j++){
                if(board[i][j]==0) answer++;
            }
        }

        return answer;
    }
}
//class Solution {
//    public static int solution(int[][] board) {
//        int answer = 0;
//        int map = board.length*board.length;
//        ArrayList<Integer> list = new ArrayList<>();
//        for (int i = 0; i < board.length; i++) {
//            for (int j = 0; j < board.length;j++){
//                if(board[i][j]==1){
//                    if ((i-1)>=0&&(i-1)<board.length&&(j-1)>=0&&(j-1)<board.length&&board[i-1][j-1]!=1){
//                        board[i-1][j-1] = 2;
//
//                    }
//                    if ((i-1)>=0&&(i-1)<board.length&&(j)>=0&&(j)<board.length&&board[i-1][j]!=1){
//                        board[i-1][j] = 2;
//
//                    }
//                    if ((i-1)>=0&&(i-1)<board.length&&(j+1)>=0&&(j+1)<board.length&&board[i-1][j+1]!=1){
//                        board[i-1][j+1] = 2;
//
//                    }
//                    if ((i)>=0&&(i)<board.length&&(j-1)>=0&&(j-1)<board.length&&board[i][j-1]!=1){
//                        board[i][j-1] = 2;
//
//                    }
//                    if ((i)>=0&&(i)<board.length&&(j+1)>=0&&(j+1)<board.length&&board[i][j+1]!=1){
//                        board[i][j+1] = 2;
//
//                    }
//                    if ((i+1)>=0&&(i+1)<board.length&&(j-1)>=0&&(j-1)<board.length&&board[i+1][j-1]!=1){
//                        board[i+1][j-1] = 2;
//
//                    }
//                    if ((i+1)>=0&&(i+1)<board.length&&(j)>=0&&(j)<board.length&&board[i+1][j]!=1){
//                        board[i+1][j] = 2;
//
//                    }
//
//                    if ((i+1)>=0&&(i+1)<board.length&&(j+1)>=0&&(j+1)<board.length&&board[i+1][j+1]!=1){
//                        board[i+1][j+1] = 2;
//
//                    }
//
//                }
//            }
//        }
//        for (int i=0;i<board.length;i++){
//            for (int j=0;j<board.length;j++){
//                if(board[i][j]==0){
//                    answer++;
//                }
//            }
//        }
//        System.out.println();
//
//
//
//        return answer;
//    }
//}
