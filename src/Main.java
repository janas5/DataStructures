
public class Main {

    public static void main(String[] args) {
        queue();
    }

    private static void dynamicArray(){
        DynamicArray dynamicArray = new DynamicArray();
        System.out.println(dynamicArray.isEmpty());
        for(int i = 0;i<10;i++){
            dynamicArray.add(i);
        }
        dynamicArray.add(10, 100);
        dynamicArray.print();
        dynamicArray.remove(0);
        dynamicArray.print();
        dynamicArray.remove(dynamicArray.getSize()-1);
        dynamicArray.print();
        System.out.println(dynamicArray.isEmpty());
        dynamicArray.clear();
        System.out.println(dynamicArray.isEmpty());
        dynamicArray.print();
    }

    private static void linkedList(){
        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(1,0);
        linkedList.print();

        for(int i = 0; i<3; i++){
            System.out.println(i+": "+linkedList.get(i));
        }

        linkedList.remove(0);
        linkedList.print();

        linkedList.add(0, 3);
        linkedList.print();

        linkedList.remove(1);
        linkedList.print();

        linkedList.remove(1);
        linkedList.print();
    }

    private static void stack(){
        Stack stack = new Stack();
        System.out.println("stack isEmpty: "+stack.isEmpty());
        stack.push(0);
        stack.push(1);
        stack.push(2);
        System.out.println("stack isEmpty: "+stack.isEmpty());
        System.out.println("stack pop: "+stack.pop());
        stack.print();
        System.out.println("stack top: "+stack.top());
        stack.print();
    }

    private static void queue(){
        Queue queue = new Queue();
        queue.print();
        queue.enqueue(0);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.print();
        System.out.println("dequeue: "+queue.dequeue());
        queue.print();
        System.out.println("dequeue: "+queue.dequeue());
        System.out.println("dequeue: "+queue.dequeue());
        queue.print();
        queue.enqueue(21);
        queue.enqueue(22);
        queue.enqueue(23);
        System.out.println("dequeue: "+queue.dequeue());
        System.out.println("dequeue: "+queue.dequeue());
        System.out.println("front: "+queue.front());
        System.out.println("dequeue: "+queue.dequeue());
        System.out.println("dequeue: "+queue.dequeue());
        queue.print();
        System.out.println("dequeue: "+queue.dequeue());
    }
}
