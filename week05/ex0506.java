package week05;

import java.util.Arrays;
import java.util.Scanner;

public class ex0506 {
    public static void main(String[] args){
        int arr[] = {5,7,11,15,20,28,28,31,39,58,68,70,95};
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int idx = Arrays.binarySearch(arr,n);
        if(idx <0) {
            System.out.println(String.format("존재하지 않는 수 %d 수(%d)",n,idx));
        }else {
            System.out.println(String.format("%d 수는 arr[%d]에 존재",n,idx));
        }
    }
}
