package src.basics.Learning.Stack;

import org.w3c.dom.Node;

public class creationOfStack {
    Node head;

      class Node{
          Node next;
          int data;

         Node(int data){
             this.data=data;
             this.next=null;
         }
      }
    public void push(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;

        }
        newNode.next=head;
        head=newNode;
    }
    public Node pop(){
          if(head==null){
              return null;
          }
          head=head.next;
          return head;
    }
    public int peek(){
          if(head==null){
             return -1;
          }
          int ans= head.data;
          return ans;
    }

    public static void main(String[] args) {
        creationOfStack s=new creationOfStack();
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(60);
        s.push(50);
        s.pop();
        s.pop();
        System.out.println(s.peek());
    }
}
