package Data_Structures;

public class DoublyLinkedList {
    Node head;
    Node tail; 
    class Node{
        int data;
        Node previous;
        Node next;
        Node(int value){
            data=value;
            previous=null;
            next=null;
        }
    }
    public void insertAtBeginning(int value){
        Node newNode=new Node(value);
        if(head==null){
           head=newNode;
           tail=newNode;
        }
        else{
            newNode.next=head;
            head.previous=newNode;
            head=newNode;
        }
    }
    public void display(){
        Node temp=head;
        System.out.print("null<->");
        while(temp!=null){
            System.out.print(temp.data+"<->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public void insertAtPosition(int position,int value){
        Node newNode =new Node(value);
        if(position==0){
            insertAtBeginning(value);
            return;
        }
        Node temp=head;
        for(int i=0;i<position-1;i++){
            temp=temp.next;
        }
        if(temp.next==null){
            newNode.previous=tail;
            tail.next=newNode;
            tail=newNode;
            return;
        }
        newNode.next=temp.next;
        newNode.previous=temp;
        temp.next.previous=newNode;
        temp.next=newNode; 
    }
    public void deleteAtBeginning(){
        head=head.next;
        head.previous=null;
    }
    public void deleteAtPosition(int index){
        Node temp=head;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        if(temp.next==null){
            tail=temp.previous;
            temp.previous.next=null;
            return;
        }
        temp.previous.next=temp.next;
        temp.next.previous=temp.previous;
    }
}
