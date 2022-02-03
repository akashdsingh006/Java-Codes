import java.util.*;

public class SearchArray
{
public static void main(String args[])
{
    int r,c;
    Scanner in=new Scanner(System.in);
    r=in.nextInt();
    c=in.nextInt();
    int num[][]= new int[r][c];
    for(int i=0;i<r;i++)
    {
        for(int j=0;j<c;j++)
        {
            num[i][j]=in.nextInt();
        }
    }
    System.out.println("Enter the number to be searched");
    int n=in.nextInt();
    for(int i=0;i<r;i++)
    {
        for(int j=0;j<c;j++)
        {
            if(n==num[i][j]){
            System.out.println("Found at "+i+","+j);
            }
                                  
        }
    }
}
}

