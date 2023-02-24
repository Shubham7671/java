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
         Node newnode=new Node(data);

         if(head==null){
             head=newnode;
             return;
         }
         newnode.next=head;
         head=newnode;
     }

     public  void addLast(int data){
        Node newnode=new Node(data);

     }


//    void traverse(Node head){
//        Node cur=head;
//        while(cur!=null){
//            System.out.println(cur.data);
//            cur=cur.next;
//        }
//    }



    public static   void main(String[] args) {
       connectNodes list=new connectNodes();
            list.addFirst(10);
        System.out.println(list);
    }
}
