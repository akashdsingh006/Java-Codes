import javax.swing.plaf.synth.SynthOptionPaneUI;

public class towerOfHanoi {
    public static void main(String args[])
    {
     int n=3;  
     towerofHanoi(n, "S", "H", "D"); 
    }
    public static void towerofHanoi(int n, String source,String helper,String dest)
    {
        if(n==1)
        {
            System.out.println("Transfer Disk " + n+"from " + source+" to "+dest);
            return;
        }
        towerofHanoi(n-1, source, dest, helper);
        System.out.println("Transfer Disk " + n+" from " + source+" to "+dest);
        towerofHanoi(n-1,helper,source,dest);
    }
}
