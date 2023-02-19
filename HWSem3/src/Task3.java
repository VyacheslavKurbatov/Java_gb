import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое этого списка.
public class Task3 {
    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<Integer>();

        rndFillList(arrList, 10);
        System.out.println(arrList);

        System.out.println(Collections.max(arrList));
        System.out.println(Collections.min(arrList));
        System.out.println(average(arrList));
    }
    static void rndFillList(ArrayList list, int size) {
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            int num = random.nextInt(0, 10);
            list.add(num);
        }
    }
    static double average(ArrayList list){
        double sum = 0;
        for (Object o : list) {
            sum += o.hashCode();
        }
        return sum/list.size();
    }
}
