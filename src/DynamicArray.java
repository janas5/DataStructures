public class DynamicArray {
    private int array[];
    private int size=0;

    public DynamicArray(){
        array = new int[10];
    }

    public DynamicArray(int capacity){
        array = new int[capacity];
    }

    public void add(int n){
        if(size==array.length){
            resize();
        }
        array[size]=n;
        size++;
    }

    public void add(int index, int n){
        if(index<0||index>size){
            throw new ArrayIndexOutOfBoundsException();
        }
        if(size==array.length){
            resize();
        }
        for(int i = size-1;i>=index;i--){
            array[i+1] = array[i];
        }
        array[index]=n;
        size++;
    }

    public void remove(int index){
        if(index<0||index>size-1){
            throw new ArrayIndexOutOfBoundsException();
        }
        for(int i = index; i<size-1;i++){
            array[index] = array[index+1];
        }
        size--;
    }

    public void print(){
        System.out.println("capacity: "+array.length);
        System.out.println("size: "+size);
        for(int i = 0; i<size;i++){
            System.out.println(i+": "+array[i]);
        }
    }

    public boolean isEmpty(){
        return size==0;
    }

    public int getSize(){
        return size;
    }

    public void clear(){
        size = 0;
    }

    private void resize(){
        int newArray[] = new int[array.length*2];
        for(int i = 0;i<array.length;i++){
            newArray[i]=array[i];
        }
        array = newArray;
    }
}
