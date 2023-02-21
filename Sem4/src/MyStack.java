import java.util.Arrays;

//size(), empty(), push(), peek(), pop()
public class MyStack {

    private int[] arr = new int[10];
    private int length = 0;

//    MyStack(){
//        arr = new int[10];
//        length = 0;
//    }

    int size(){
        return length;
    }

    boolean empty(){
        return length == 0;
    }

    void push(int item){
        if (length >= arr.length){
            int[] arr1 = new int[arr.length + 10];
            System.arraycopy(arr, 0, arr1, 0, arr.length);
            arr = arr1;
        }
        arr[length] = item;
        length++;
    }

    Integer peek(){
        if (!empty()){
            return arr[length-1];
        }
        return null;
    }

    Integer pop(){
        if (!empty()){
            return arr[--length];
        }
        return null;
    }
}
