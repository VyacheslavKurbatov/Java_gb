import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//Пусть дан произвольный список целых чисел, удалить из него четные числа
public class Task2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();

        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int num = random.nextInt(0, 10);
            list.add(num);
        }
        System.out.println(list);

        list.removeIf(n -> (n % 2 == 0));

        System.out.println(list);
    }
}
