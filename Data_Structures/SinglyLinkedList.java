package Data_Structures;

public class SinglyLinkedList {
    Node head;
    Node tail;
    SinglyLinkedList(){
        Node head=null;
        Node tail=null;
    }
    class Node{
        int data;
        Node next;
        Node(int value){
            data=value;
            next=null;
        }
    }
    public void insertAtBeginning(int value) {
        Node newNode = new Node(value);
        if(head==null){
            head=newNode;
        }
        else{
            newNode.next=head;
            head=newNode;
        }        
    }
    public Node reverseLinkedList(Node head){
        if(head==null || head.next==null){
            return head;
        }
        else{
            Node temp=reverseLinkedList(head.next);
            head.next.next=head;
            head.next=null;
            return temp;
        }
    }
    public void rdisplay(Node temp){
        if(temp.next==null){
            System.out.print(temp.data+"->null");
        }
        else{
            System.out.print(temp.data+"->"); 
            rdisplay(temp.next);
        }
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public void insertAtPosition(int position,int value){
        if(position==0){
            insertAtBeginning(value);
            return;
        }
        Node newNode = new Node(value);
        Node temp=head;
        int temp_position=0;
        while(temp!=null){
            if(temp_position==(position-1)){
                newNode.next=temp.next;
                temp.next=newNode;
                return;
            }
            temp_position++;
            temp=temp.next;
        }
        if(position>temp_position){
            System.out.println("Invalid Position");
        }
    }
    public void deleteAtBeginning(){
        head=head.next;
    }
    public void deleteAtPosition(int position){
        if(head==null){
            System.out.println("Empty list");
            return;
        }
        if(position==0){
            deleteAtBeginning();
            return;
        }
        Node temp=head;
        for(int i=0;i<position-1;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        return;
    }
    public int get(int index){
        Node temp=head;
        for(int i=0;i<index;i++){
           temp=temp.next;
        }
        return temp.data;
    }
    public void update(int index,int value){
        Node temp=head;
        for(int i=0;i<index;i++){
           temp=temp.next;
        }
        temp.data=value;
    }
    public void reverse(){
        Node prevNode=null;
        Node currNode=head;
        Node nxtNode=head.next;
        while(currNode!=null){
            nxtNode=currNode.next;
            currNode.next=prevNode;
            prevNode=currNode;
            currNode=nxtNode;
        }
        head=prevNode;
    }
}
