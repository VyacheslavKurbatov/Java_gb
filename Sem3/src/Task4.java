import java.util.ArrayList;
import java.util.Iterator;

//Создать список типа ArrayList<String>.
//        Поместить в него как строки, так и целые числа.
//        Пройти по списку, найти и удалить целые числа
public class Task4 {
    public static void main(String[] args) {
        ArrayList<String> alist = new ArrayList<>();
        alist.add("1");
        alist.add("Привет Земля");
        alist.add("28");
        alist.add("Hello");


//        Iterator<String> aiiterator = alist.iterator();
//        while (aiiterator.hasNext()) {
//            if (aiiterator.next().chars().allMatch(Character::isDigit)){
//                aiiterator.remove();
//            }
//        }

        alist.removeIf(s -> s.chars().allMatch(Character::isDigit));
        System.out.println(alist);
    }
}
