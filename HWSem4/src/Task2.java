import java.util.Arrays;
import java.util.LinkedList;
import java.util.Objects;

/*Реализуйте очередь с помощью LinkedList со следующими методами:
enqueue() - помещает элемент в конец очереди,
dequeue() - возвращает первый элемент из очереди и удаляет его,
first() - возвращает первый элемент из очереди, не удаляя.*/
public class Task2 {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();

        myQueue.enqueue(4);
        myQueue.enqueue(3);
        myQueue.enqueue(2);
        myQueue.enqueue(1);

        myQueue.print();

        System.out.println();
        System.out.println(myQueue.dequeue());
        myQueue.print();

        System.out.println();
        System.out.println(myQueue.first());
        myQueue.print();
    }
}
