import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=in.nextInt();
        }
        int tar=in.nextInt();
        boolean visited[]=new boolean[n];
        printTargetSumSubsets(arr,0,"",0,tar);
    }

    // set is the subset
    // sos is sum of subset
    // tar is target
    public static void printTargetSumSubsets(int[] arr, int idx, String set, int sos, int tar) 
    {
        if(sos==tar)
        {
            System.out.println(set + ".");
            return;
        }
        if(idx==arr.length)
        {
            
            return;
        }
        
        
        printTargetSumSubsets(arr,idx+1,set + arr[idx] +", ",sos + arr[idx],tar);
        printTargetSumSubsets(arr,idx+1,set,sos,tar);
    }

}
