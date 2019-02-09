
public class Main {

    public static void main(String[] args) {
        linkedList();
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
}
