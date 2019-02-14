import java.util.NoSuchElementException;

public class Queue {
    private class QueueNode{
        private int value;
        private QueueNode next;

        public QueueNode(int n){
            this.value = n;
        }
    }

    private QueueNode front;
    private QueueNode end;

    public boolean isEmpty(){
        return front==null;
    }

    public void enqueue(int n){
        if(isEmpty()){
            front = new QueueNode(n);
            end = front;
        }
        else{
            end.next = new QueueNode(n);
            end = end.next;
        }
    }

    public int dequeue(){
        if (isEmpty()){
            throw new NoSuchElementException("Queue is empty");
        }
        int data = front.value;
        front = front.next;
        if(front==null){
            end=null;
        }
        return data;
    }

    public int front(){
        if (isEmpty()){
            throw new NoSuchElementException("Queue is empty");
        }
        return front.value;
    }

    public void print(){
        if(isEmpty()){
            System.out.println("Queue is empty");
        }
        int counter = 0;
        QueueNode temp = front;
        while(temp!=null){
            System.out.println(counter+": "+temp.value);
            temp=temp.next;
        }
    }

}