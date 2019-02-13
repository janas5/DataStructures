import java.util.ArrayList;

public class Stack {
    private ArrayList<Integer> list = new ArrayList<>();

    public boolean isEmpty(){
        return list.isEmpty();
    }

    public int top(){
        if(isEmpty()){
            throw new IndexOutOfBoundsException("Stack is empty");
        }
        return list.get(list.size()-1);
    }

    public int pop(){
        if(isEmpty()){
            throw new IndexOutOfBoundsException("Stack is empty");
        }
        return list.remove(list.size()-1);
    }

    public void push(int n){
        list.add(n);
    }

    public void print(){
        for(int i = 0; i<list.size();i++){
            System.out.println(i+": "+list.get(i));
        }
    }
}
