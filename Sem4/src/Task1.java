import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//1) Замерьте время, за которое в ArrayList добавятся 10000 элементов. 
//2) Замерьте время, за которое в LinkedList добавятся 10000 элементов. Сравните с предыдущим.
public class Task1 {
    public static void main(String[] args) {

        ArrayList<Integer> arrList = new ArrayList<>();
        LinkedList<Integer> linkList = new LinkedList<>();
        long timeStart1 = System.currentTimeMillis();
        fillList(arrList);
        System.out.println(System.currentTimeMillis() - timeStart1);

        long timeStart2 = System.currentTimeMillis();
        fillList(linkList);
        System.out.println(System.currentTimeMillis() - timeStart2);
    }
    public static void fillList (List<Integer> arrList){
        for (int i = 0; i < 100000; i++) {
            arrList.add(0, i); //добавление на первую позицию
        }
    }
    public static void fillLinkedList (LinkedList<Integer> arrList){
        for (int i = 0; i < 100000; i++) {
            arrList.addFirst(i);
        }
    }
}
