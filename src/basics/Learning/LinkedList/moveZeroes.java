package src.basics.Learning.LinkedList;

public class moveZeroes {
    class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }
    public Node moveZeroes(Node head)
    {
        Node cur=head;
        Node dummy1=new Node(-1);
        Node dummy2=new Node(-1);
        Node ptr1=dummy1;
        Node ptr2=dummy2;
        int count=0;
        while(cur!=null){
            if(cur.data==0){
                Node newN=new Node(0);
                ptr1.next=newN;
                ptr1=ptr1.next;
                count++;
            }
            else{
                Node newN2=new Node(cur.data);
                ptr2.next=newN2;
                ptr2=ptr2.next;
            }
            cur=cur.next;
        }
        ptr1.next=dummy2.next;

        return dummy1.next;
    }
//    public static void main(String[] args) {
//
//    }
}

