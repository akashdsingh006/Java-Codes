import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int chess[][]=new int[n][n];
        printNQueens(chess,"",0);
    }

    public static void printNQueens(int[][] chess, String qsf, int row) 
    {
        if(row==chess.length)
        {
            System.out.println(qsf +".");
            return;
        }
        for(int col=0;col<chess.length;col++)
        {
            if(isSafePlace(chess,row,col)==true)
            {
                chess[row][col]=1;
                printNQueens(chess,qsf + row +"-"+col +", ",row+1);
                chess[row][col]=0;
            }
        }
    }
    public static boolean isSafePlace(int chess[][],int row, int col)
    {
        for(int r=row-1,c=col;r>=0;r--)//vertical
        {
            if(chess[r][c]==1)
                return false;
        }
        for(int r=row-1,c=col-1;r>=0 && c>=0;r--,c--)
        {
            if(chess[r][c]==1)
                return false;
        }
        for(int r=row-1,c=col+1;r>=0 && c<chess.length;r--,c++)
        {
            if(chess[r][c]==1)
                return false;
        }

        return true;
    }
}
