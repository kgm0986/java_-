package week05;

import java.util.Scanner;
import java.util.StringTokenizer;

public class ex0507 {
    private static int n;
    private static int parent[];
    private static boolean visited[];
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();//숫자 개수
        parent = new int[n];
        visited = new boolean[n];
        sc.nextLine();

        String str = sc.nextLine();
        StringTokenizer st = new StringTokenizer(str);
        for (int i = 0; i < n; i++) {
            parent[i] = Integer.parseInt(st.nextToken());
        }
        int rmIdx = sc.nextInt();
        remove(rmIdx);

    }
    static void remove(int idx){
        visited[idx] = true;
        for(int i =0; i<n; i++) {
            if(parent[i] == idx) remove(i);
        }
    }
    static int leafCount(){
        int sum=0;
        for(int i=0; i<n; i++){
            if(visited[i]) {
                continue;
            }
            if(isLeaf(i)) sum++;
        }
        return sum;
    }
    static boolean isLeaf(int idx) {
        visited[idx] = true;
        boolean isLeaf = true;
        for(int i=0; i<n; i++){
            if(parent[i] == idx) {
                isLeaf = false;
                break;
            }
        }
        return isLeaf;
    }

}

