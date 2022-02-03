public class RevString {
    public static void main(String args[])
    {
        String s="abcd";
        Rev(s,s.length()-1);
    }
    public static void Rev(String str,int i)
    {
        if(i==0)
        {
            System.out.print(str.charAt(i));
            return;
        }
        
        System.out.print(str.charAt(i));
        Rev(str,i-1);
    }
}
