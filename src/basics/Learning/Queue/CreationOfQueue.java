package src.basics.Learning.Queue;

public class CreationOfQueue {

    class  Node{
        Node next;
        int data;
         Node (int data){
             this.data=data;

         }
    }
    Node rear,front;
    public void enqueue(int data){
        Node newNode=new Node(data);
        if(front==null){
            front=rear=newNode;
        }
        rear.next=newNode;
        rear=newNode;
        rear=newNode;

    }
    public int dequeue(){
       if(front==null){
           return -1;
       }
       int ans= front.data;
       front=front.next;
        return ans;
    }
    public int peek(){
        return front.data;
    }

    public static void main(String[] args) {
        CreationOfQueue q=new CreationOfQueue();
        q.enqueue(10);
        q.enqueue(40);
        q.enqueue(50);
        q.dequeue();
        System.out.println(q.peek());
    }
}
