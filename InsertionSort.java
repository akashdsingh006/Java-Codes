import java.util.*;
public class InsertionSort {
    public static void main(String args[]) {
        System.out.println("Enter the number of array elements");
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=in.nextInt();

        }
        for(int i=1;i<arr.length;i++)
        {
            int current= arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>current)
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print( arr[i] +" ");

        } 
}
}
