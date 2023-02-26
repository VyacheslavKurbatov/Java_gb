import java.util.LinkedList;
import java.util.Random;

/*Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке. Используйте итератор*/
public class Task3 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList = fillList(linkedList, 3);
        int sum = sum(linkedList);
        System.out.println(linkedList);
        System.out.println(sum);
    }
    public static int sum(LinkedList<Integer> linkedList){
        int result = 0;
        for (int item: linkedList) {
            result += item;
        }
        return result;
    }
    public static LinkedList<Integer> fillList(LinkedList<Integer> linkedList, Integer size) {
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            int num = random.nextInt(0, 10);
            linkedList.add(num);
        }
        return linkedList;
    }
}
