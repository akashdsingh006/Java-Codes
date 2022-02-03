import java.util.*;


public class placeTiles {
    public static void main(String args[])
    {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the number of rows and columns");
        int n=in.nextInt();
        int m=in.nextInt();
        
        System.out.println("Total ways ="+place(n,m));
    }
    public static int place(int n,int m)
    {
        if(n<m)
        {
            return 1;
        }
        if (n==m)
        {
            return 2;
        }
        int verticalPath= place(n-m,m);
        int horizontalPath=place(n-1,m);
        return verticalPath+horizontalPath;
    }
}
