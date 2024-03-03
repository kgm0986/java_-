package week05;

import java.util.Scanner;

public class ex0504 {
    public void main(String[] args) {
        int arr[]={6,4,8,3,2,1};//선형 검색
        Scanner sc = new Scanner(System.in);
        System.out.print("찾은 수:");
        int n = sc.nextInt();
        int idx = SequenceSearch.sequenceSearch(arr, n);
        if(idx == -1) {
            System.out.println(String.format("존재하지 않는 %d 수 " ,n));
        }else{
            System.out.println(String.format("%d 수는 arr[%d}에 존재",n,idx));
        }
    }
}
class SequenceSearch{
    static int sequenceSearch(int[] a, int key){
        for(int i=0; i<a.length; i++){
            if(a[i]==key) return i;
        }
        return -1;
    }
}
