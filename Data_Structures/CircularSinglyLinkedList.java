package Data_Structures;

public class CircularSinglyLinkedList {
    Node head;
    Node tail; 
    class Node{
        int data;
        Node next;
        Node(int value){
            data=value;
            next=null;
        }
    }
    public void insertAtBeginning(int value){
        Node newNode=new Node(value);
        if(head==null){
            head=newNode;
            tail=newNode;
            tail.next=head;
        }
        else{
            newNode.next=head;
            head=newNode;
            tail.next=head;
        }
    }
    public void display(){
        Node temp = head;
        System.out.print(temp.data+"->");
        temp=temp.next;
        while(temp!=head){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println();
    }
    public void deleteAtBeginning(){
        head=head.next;
        tail.next=head;
    }
    public void delete(int value){
        Node temp=head;
        if(head.data==value){
            deleteAtBeginning();
            return;
        }
        Node tempNext=temp.next;
        while(tempNext.data!=value){
            temp=temp.next;
            tempNext=temp.next;
        }
        temp.next=tempNext.next;
    }
}
