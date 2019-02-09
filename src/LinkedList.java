public class LinkedList {

    class Node{
        int value;
        Node next;

        public Node(int val){
            this.value = val;
        }
    }

    private Node head;

    public void add(int val){
        if(head==null){
            head = new Node(val);
            return;
        }
        Node node = head;
        while(node.next!=null){
            node = node.next;
        }
        node.next = new Node(val);
    }

    public void add(int index, int val){
        if(index<0){
            throw new IndexOutOfBoundsException();
        }
        if(index==0){
            addFirst(val);
            return;
        }
        Node node = head;
        for(int i = 0; i<index-1; i++){
            if(node.next==null){
                throw new IndexOutOfBoundsException();
            }
            node = node.next;
        }
        if(node.next==null){
            throw new IndexOutOfBoundsException();
        }
        Node newNode = new Node(val);
        newNode.next = node.next;
        node.next = newNode;
    }

    public void addFirst(int val){
        Node newNode = new Node(val);
        if(head==null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public int get(int index){
        if(index<0){
            throw new IndexOutOfBoundsException();
        }
        Node node = head;
        for(int i = 0; i<index; i++){
            if(node.next==null){
                throw new IndexOutOfBoundsException();
            }
            node = node.next;
        }
        return node.value;
    }

    public void remove(int index){
        if(index<0){
            throw new IndexOutOfBoundsException();
        }
        if(index==0){
            head = head.next;
            return;
        }
        Node node = head;
        for(int i = 0; i<index-1; i++){
            if(node.next==null){
                throw new IndexOutOfBoundsException();
            }
            node = node.next;
        }
        node.next = node.next.next;
    }


    public void print(){
        if(head==null){
            System.out.println("Linked list is empty");
            return;
        }
        Node node = head;
        int index = 0;
        while(node!=null){
            System.out.println(index+": "+node.value);
            node = node.next;
            index++;
        }
    }

}
