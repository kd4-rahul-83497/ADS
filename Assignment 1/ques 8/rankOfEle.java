package com.assignment.a1;

import java.util.Scanner;

public class rankOfEle {
    public static int rankofelement(int[] arr,int key){
      int count=0;
      for(int i=0;i< arr.length;i++){
          if(arr[i]<=key){
              count++;
          }
      }
        return count;
    }
    public static void main(String[] args) {
        int[] arr ={ 10, 20, 15, 3, 4, 4, 1 };
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int key = sc.nextInt();
        int rank = rankofelement(arr, key);
        if (rank != 0)
            System.out.println(" Rank of "+key +" is:" +rank);
        else
            System.out.println("number is not found");
        sc.close();
    }
}
