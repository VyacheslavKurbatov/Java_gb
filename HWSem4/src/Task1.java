import java.util.LinkedList;
import java.util.Random;

/*Пусть дан LinkedList с несколькими элементами.
Реализуйте метод, который вернет “перевернутый” список.
Постараться не обращаться к листу по индексам.
*/
public class Task1 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList = fillList(linkedList, 10);
        System.out.println(linkedList);

        linkedList = revers(linkedList);
        System.out.println(linkedList);

    }
    public static LinkedList<Integer> revers(LinkedList<Integer> linkedList) {
        LinkedList<Integer> newLinkdList = new LinkedList<>();
        for (Integer item: linkedList) {
            newLinkdList.addFirst(item);
        }

        return newLinkdList;
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
