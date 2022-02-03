// Program to find the total no. of pairs to call n guests in party (in pairs or single)
public class friendspairing {
    public static void main(String args[])
    {
        int n=4;
        System.out.println(callGuest(n));
    }
    public static int callGuest(int n)
    {
        if (n<=1)
        {
            return 1;
        }
        int single= callGuest(n-1);
        int pairs= (n-1)*callGuest(n-2);
        return single + pairs;
    }
}
