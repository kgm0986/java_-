package week06;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ex0602 {
    public static void main(String[] args) {
        int[] arr1 = {1,3,4,5,6,9,6};
        int[] arr2 = {5,2,8,3,6};
        System.out.println(sum(arr1,arr2));
        System.out.println(qwe(arr1,arr2));
        System.out.println(asd(arr1,arr2));

    }





    public static Integer[] sum(int arr[], int arr2[]){
        Set<Integer> set =new HashSet<>();
        for(int i = 0; i < arr.length; i++){
            set.add(arr[i]);
        }
        for(int i = 0; i < arr2.length; i++){
            set.add(arr2[i]);
        }


        Integer[] arr3 = set.toArray(new Integer[0]);
        for(int i = 0; i < arr3.length; i++){
            System.out.println(arr3[i]);
        }

        return arr3;
    }
    public static Integer[] qwe(int arr[], int arr2[]){
        Set<Integer> set =new HashSet<>();
       for(int i = 0; i < arr.length; i++){
           for(int j = 0; j < arr2.length; j++){
               if(arr[i]==arr2[j]){
                   set.add(arr[i]);
               }
           }
       }
       Integer[] arr3 = set.toArray(new Integer[0]);

        for(int i = 0; i < arr3.length; i++){
            System.out.println(arr3[i]);
        }

        return arr3;
    }
    public static Integer[] asd(int arr[], int arr2[]){
        Set<Integer> set =new HashSet<>();
        Set<Integer> set2 =new HashSet<>();
       for(int i = 0; i < arr.length; i++){
           for(int j = 0; j < arr2.length; j++){
               if(arr[i]==arr2[j]){
                   set.add(arr[i]);
               }
           }
       }
        Integer[] arr3 = set.toArray(new Integer[0]);

       for(int i = 0; i < arr.length; i++){
           for (int j = 0; j < arr3.length; j++){
               if(arr[i]!=(int)arr3[j]){
                   set2.add(arr[i]);
               }
           }
       }
       Integer[] arr4 = set2.toArray(new Integer[0]);
        for(int i = 0; i < arr4.length; i++){
            System.out.println(arr4[i]);
        }


        return arr4;
    }



}


