import java.util.*;
public class SelectionSort {
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
        for(int i=0;i<n-1;i++)
        {
            int smallest=i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[smallest]>arr[j])
                {
                    smallest=j;
                }
            }
        int temp=arr[smallest];
        arr[smallest]=arr[i];
        arr[i]=temp;
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print( arr[i] +" ");

        } 
    }
}
