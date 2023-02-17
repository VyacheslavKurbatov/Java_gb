import java.util.*;

//Заполнить список десятью случайными числами.
//Отсортировать список методом sort() и вывести его на экран.
public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(10);

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int num = random.nextInt(0, 10);
            list.add(num);
        }
        System.out.println(list);

        Collections.sort(list);

        System.out.println(list);
    }
}
