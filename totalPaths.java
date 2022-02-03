//find total number of paths to travel from (0,0) to (n,m)
import java.util.*;
public class totalPaths {
    public static void main(String args[])
    {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the number of rows and columns");
        int n=in.nextInt();
        int m=in.nextInt();
        
        int totalpaths = count(0, 0, n, m);
        System.out.println("Total number of paths= " + totalpaths);
    }
    public static int count(int i,int j,int n,int m)
    {
        if(i==n||j==m)
        {
            return 0;
        }
            if(i==n-1 && j==m-1)
            {
                return 1;
            }
        
        int downpaths=count(i+1, j, n, m);
        int rightpath=count(i, j+1, n, m);
        return downpaths+rightpath;
    }
}
