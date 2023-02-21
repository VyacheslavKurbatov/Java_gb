import java.util.*;

//1) Написать метод, который принимает массив элементов, помещает их в стэк и выводит на консоль содержимое стэка.
//2) Написать метод, который принимает массив элементов, помещает их в очередь и выводит на консоль содержимое очереди.
public class Task3 {
    public static void main(String[] args) {
        int[] array = createArray();
//        showStak(addToStak(array));

        showLinkedList(addToQueue(array));

    }
    public static Stack<Integer> addToStak(int[] array) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < array.length; i++) {
            stack.push(array[i]);
        }
        return stack;
    }
    public static void showStak(Stack<Integer> stack) {
        System.out.println(stack);
        System.out.println();
        for (Integer item: stack) {
            System.out.print(item + " | ");
        }
        System.out.println();
        while (stack.size()>0){
            System.out.print(stack.pop() + " ");
        }
    }
    public static int[] createArray() {
        int[] myIntArr = new int[10];
        for (int i = 0; i < myIntArr.length; i++) {
            myIntArr[i] = i;
        }
        return myIntArr;
    }

    public static LinkedList<Integer> addToQueue(int[] array) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int item: array) {
            linkedList.addLast(item);
        }
        return linkedList;
    }
    public static void showLinkedList(LinkedList<Integer> linkedList) {
        System.out.println(linkedList);
        System.out.println();

        for (Integer item: linkedList) {
            System.out.print(item + " | ");
        }
        System.out.println();
        while (linkedList.size()>0){
            System.out.print(linkedList.poll() + " ");
        }
    }
}
