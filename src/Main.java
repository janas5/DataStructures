
public class Main {

    public static void main(String[] args) {
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
}
