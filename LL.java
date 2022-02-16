public class LL {
    Node head;
    private int size;
  
    LL () {
        size = 0;
    }
 
    class Node
    {
        String data;
        Node next;
    
    Node(String data)
    {
        this.data=data;
        this.next=null;
        size++;
    }
}
// add First
    public void addFirst(String data)
{
    Node newNode=new Node(data);
    if(head == null)
    {
        head=newNode;
        return;
    }
    newNode.next=head;
    head=newNode;
}
//add Last
public void addLast(String data)
{
    Node newNode=new Node(data);
    if(head == null)
    {
        head=newNode;
        return;
    }
    Node currNode=head;
    while(currNode.next != null)
    {
        currNode=currNode.next;
        
    }
    currNode.next=newNode;
}
//Add in between
public void addInMiddle(int index, String data) {
    if(index > size || index < 0) {
        System.out.println("Invalid Index value");
        return;
    }
    size++;

    Node newNode = new Node(data);
    if(head == null || index == 0) {
        newNode.next = head;
        head = newNode;
        return;
    }
     Node currNode = head;
    for(int i=1; i<size; i++) {
        if(i == index) {
            Node nextNode = currNode.next;
            currNode.next = newNode;
            newNode.next = nextNode;
            break;
        }
        currNode = currNode.next;
    }
}

//Print List
public void printList()
{
    if(head ==null)
    {
        System.out.println("List is empty");
        return;
    }
    
    Node currNode=head;
    while(currNode!= null)
    {
        System.out.print(currNode.data + "->" );
        currNode=currNode.next;
        
    }
    System.out.println("NULL");
}
//delete First
public void deleteFirst()
{
    if (head ==null)
    {
        System.out.println("The listis empty");
        return;
    }
    size++;
    head=head.next;

}
//delete Last
public void deleteLast()
{
    if (head ==null)
    {
        System.out.println("The list is empty");
        return;
    }
    size++;
    if(head.next==null)
    {
        head=null;
        return;
    }
    Node currNode=head;
    Node lastNode=head.next;
    while(lastNode.next != null)
    {
        currNode=currNode.next;
        lastNode=lastNode.next;
    }
    currNode.next=null;
}
//Get Size
public int getSize()
{
    return size;
}
public static void main(String args[])
{
    LL list=new LL(); 
    list.addFirst("Akash");
    list.addLast("Anand");
    list.addLast("Boy");
    list.printList();
    System.out.println(list.getSize());
    list.deleteLast();
    list.addInMiddle(2, "Man");
    list.printList();
    list.getSize();
    
}
}
