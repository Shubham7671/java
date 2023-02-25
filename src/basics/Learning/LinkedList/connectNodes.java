package src.basics.Learning.LinkedList;


import java.util.*;




 class connectNodes {
     Node head;
    class Node{
        int data;
        Node next;
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

     public  void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node cur=head;
        while (cur.next!=null){
            cur=cur.next;
        }
         cur.next=newNode;

     }
     public  void printList(){

        Node cur=head;

        while (cur!=null){
            System.out.print(cur.data);
            cur=cur.next;
        }
     }
     public  void deleteFirst(){
        if(head==null){
            return;
        }
        head=head.next;
     }
     public void deleteLast(){
        if(head==null){
            return;
        }
        if(head.next==null){
            head=null;
            return;
        }
        Node cur=head;
        while(cur.next.next !=null){
            cur=cur.next;
        }
        cur.next=null;
     }

    public static   void main(String[] args) {
       connectNodes list=new connectNodes();
            list.addFirst(1);
            list.addFirst(2);
            list.addFirst(3);
            list.addFirst(4);
            list.addFirst(5);
            list.addLast(0);
            list.deleteFirst();
            list.deleteLast();
            list.deleteLast();
            list.printList();
    }
}
