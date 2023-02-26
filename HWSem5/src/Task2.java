import java.util.*;

/*Пусть дан список сотрудников:

Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
Отсортировать по убыванию популярности. Для сортировки использовать TreeMap.*/
public class Task2 {
    public static void main(String[] args) {
        sort("Иван Иванов\n" +
                "Светлана Петрова\n" +
                "Кристина Белова\n" +
                "Анна Мусина\n" +
                "Анна Крутова\n" +
                "Иван Юрин\n" +
                "Петр Лыков\n" +
                "Павел Чернов\n" +
                "Петр Чернышов\n" +
                "Мария Федорова\n" +
                "Марина Светлова\n" +
                "Мария Савина\n" +
                "Мария Рыкова\n" +
                "Марина Лугова\n" +
                "Анна Владимирова\n" +
                "Иван Мечников\n" +
                "Петр Петин\n" +
                "Иван Ежов");


    }
    public static void sort(String names) {
        TreeMap<String, List<String>> treeMap = new TreeMap<>();
        TreeMap<Integer, List<String>> sortedTreeMap = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o2, o1);
            }
        });
        String[] name = names.split("\n");

        for (String valueName: name) {
            LinkedList<String> list = new LinkedList<>();

            String keyName = valueName.split(" ")[0];


            if (treeMap.containsKey(keyName)){
                treeMap.get(keyName).add(valueName);
            }else {
                list.add(valueName);
                treeMap.put(keyName, list);
            }
        }

        for (Map.Entry entry: treeMap.entrySet()){
            System.out.println(entry);
        }

        Set<Map.Entry<String, List<String>>> entrySet = treeMap.entrySet();
        Map.Entry<String, String>[] entryArray = entrySet.toArray(new Map.Entry[entrySet.size()]);

        for (int i = 0; i < treeMap.size(); i++) {
            String nameForSort = entryArray[i].getKey();
            LinkedList<String> someList = new LinkedList<>();
            int key = treeMap.get(nameForSort).size();

            if (sortedTreeMap.containsKey(key)){
                sortedTreeMap.get(key).add(nameForSort);
            } else {
                someList.add(nameForSort);
                sortedTreeMap.put(key, someList);
            }
        }
        System.out.println();

        for (Map.Entry entry: sortedTreeMap.entrySet()){
            System.out.println(entry);
        }
    }
}
