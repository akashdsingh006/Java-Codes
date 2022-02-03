//print all permutations of a string
public class perString{
    public static void main(String args[])
    {
        String str= "abc";
        permute(str," ");
    }
    public static void permute(String str,String perm)
    {
        if(str.length()==0)
        {
            
            System.out.println(perm);
            return;
        }
        for(int i=0;i<str.length();i++)
        {
           char currChar=str.charAt(i);
           String newStr=str.substring(0,i)+str.substring(i+1);
           permute(newStr,perm+currChar);
        }
    }
}