import java.util.*;
class arrayList {
    public static void main(String args[])
    {
        ArrayList<Integer> list=new ArrayList<>();
        //adding elements in an arrayList
        list.add(10);
        list.add(50);
        list.add(70);
        list.add(40);
        list.add(14);
        System.out.println(list);
        int n=list.get(2);//to get an array element using its index in ArrayList
        System.out.println(n);
        list.add(1,15);//to add an elemnt between two elements (index,element)
        System.out.println(list);
        list.remove(2);//removes elemnt from arraylist
        Collections.sort(list);//sorts the ArrayList
       
        System.out.println(list);
        System.out.println(list.size());//prints size of ArrayList
        
    }
}
