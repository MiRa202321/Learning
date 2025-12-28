package generics;

import java.util.ArrayList;
import java.util.Arrays;
//Refer ORACLE DOCS: https://docs.oracle.com/javase/tutorial/java/generics/index.html
// Restrictions on Generics: https://docs.oracle.com/javase/tutorial/java/generics/restrictions.html
public class CustomGenArrayList<T> {
//Creating our own arraylist
    private Object[]  data;
    private static int DEFAULT_SIZE =10;
    private int size = 0;

    public CustomGenArrayList(){

        this.data = new Object[DEFAULT_SIZE];
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


        CustomGenArrayList<Integer> list2 = new CustomGenArrayList<>();
        for (int i = 0; i < 14;i++) {
            list2.add(2*i);
        }
        System.out.println(list2);
    }
}

