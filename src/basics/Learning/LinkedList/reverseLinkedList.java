package src.basics.Learning.LinkedList;

public class reverseLinkedList {
    Node head;
    class Node{
        Node next;
        int data;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public void addFirst(int data){
        Node newNode =new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public  void printList(){

        Node cur=head;

        while (cur!=null){
            System.out.print(cur.data);
            cur=cur.next;
        }
    }
    public void reverse(Node head ){
        Node cur=head;
        Node prev = null;
        while(cur.next !=null){
            Node temp=cur.next;
            cur.next=prev;
            prev=cur;
            cur=temp;
            System.out.println(cur.data);
        }
        head=prev;

    }
    


    public static void main(String[] args) {
        reverseLinkedList list=new reverseLinkedList();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        list.addFirst(5);
//        list.printList();
        list.reverse(list.head);
        list.printList();
    }

}
