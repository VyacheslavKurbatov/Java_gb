import java.util.LinkedList;
import java.util.Map;

public class MyQueue {
    LinkedList<Integer> linkedList = new LinkedList<>();
    private int length = 0;

//    enqueue() - помещает элемент в конец очереди
    void enqueue(int element){
        linkedList.addLast(element);
    }
    void print(){
        System.out.print("[");
        for (int i = 0; i < linkedList.size(); i++) {
            if (i == linkedList.size() - 1){
                System.out.print(linkedList.get(i));
            } else {
                System.out.print(linkedList.get(i));
                System.out.print(" , ");
            }

        }
        System.out.print("]");
    }

//    dequeue() - возвращает первый элемент из очереди и удаляет его
    int dequeue(){
       int firstElement = linkedList.pop();
       return firstElement;
    }

//    first() - возвращает первый элемент из очереди, не удаляя
    int first(){
        int firstElement = linkedList.get(0);
        return firstElement;
    }
}
