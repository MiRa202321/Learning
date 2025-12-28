package generics;

import java.util.Arrays;
import java.util.List;

//Wildcard: https://docs.oracle.com/javase/tutorial/java/generics/wildcards.html
//Refer ORACLE DOCS: https://docs.oracle.com/javase/tutorial/java/generics/index.html
// Restrictions on Generics: https://docs.oracle.com/javase/tutorial/java/generics/restrictions.html
public class WildcardExample<T extends Number> { // WIldCard: restrict the value variable can have
//Only numbers allowed: Integer, Float, Decimal, etc
//    Here, T should be number or its subclasses
    private Object[]  data;
    private static int DEFAULT_SIZE =10;
    private int size = 0;

    public WildcardExample(){

        this.data = new Object[DEFAULT_SIZE];
    }

    public void getList(List<? extends Number> list){
        // do something

        // here you can only paass number type not subclasses: (List<Number> list)
//        Use Wildcard(?) for its subclasses: (List<? extends Number> list)
    }

    public void add(T num){
        if(isFull()){
            resize();
        }
        data[size++] =num;
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];

        // copy the current items in the new array
        for (int i=0;i< data.length; i++){
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }

    public T remove(){
        T removed = (T) data[--size];      //Type casting allowed but redundant fo some case
        //override the old value whenever we add a new item
        return removed;
   }

   public T get(int index){
        return (T) data[index];
   }

   public int size(){
        return size;
   }

   public void set(int index, T value){
        data[index] =  value;
   }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
//        CustomGenArrayList<Integer> list = new CustomGenArrayList();
//        list.add(3);
//        list.add(5);
//        list.add(7);

//        for (int i = 0; i < 14; i++) {
//            list.add(2*i);
//        }
//
//        System.out.println(list);


        WildcardExample<Integer> list2 = new WildcardExample<>();
        for (int i = 0; i < 14;i++) {
            list2.add(2*i);
        }
        System.out.println(list2);
    }
}

