import java.util.*;

/*
Взять набор строк, например,

Мороз и солнце день чудесный
Еще ты дремлешь друг прелестный
Еще ты дремлешь друг прелестный
Пора красавица проснись.

Написать метод, который отсортирует эти строки по длине с помощью TreeMap.
Строки с одинаковой длиной не должны “потеряться”.
*/
public class Task3 {
    public static void main(String[] args) {
        ex1("a\n" +
                "Мороз и солнце день чудесный\n" +
                "Еще ты дремлешь друг прелестный\n" +
                "Еще ты дремлешь день прелестный\n" +
                "Пора красавица проснись.");
    }
    static void ex1(String s){
        TreeMap<Integer, List<String>> treeMap = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o2, o1);
            }
        });
        String[] s1 = s.split("\n");

        for (String s2: s1){
            if (treeMap.containsKey(s2.length())){
                List<String> list = treeMap.get(s2.length());
                list.add(s2);
            } else {
                List<String> list = new ArrayList<>();
                list.add(s2);
                treeMap.put(s2.length(), list);
            }
        }

        System.out.println(treeMap);
        for (Map.Entry entry: treeMap.entrySet()){
            System.out.println(entry);
        }
    }
}
