import java.util.*;
public class BubbleSort {
    public static void main(String args[])
    {
        Scanner in=new Scanner (System.in);
        System.out.println("Enter your array size");
        int n=in.nextInt();
        int arr[]=new int[n];//Bubble Sort

        for(int a=0;a<n;a++)
        {
        arr[a]=in.nextInt();
        }
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length-1;j++)
            {
                if(arr[j]>arr[j+1])//Comparing for ascending order
                {
                    int temp=arr[j];//Swapping
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
                
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
