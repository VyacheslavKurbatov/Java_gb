// Заполнить список названиями планет Солнечной
// системы в произвольном порядке с повторениями.
// Вывести название каждой планеты и количество его
// повторений в списке.

import java.util.*;

import static java.util.Arrays.*;
import static java.util.Collection.*;


public class Task3 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        List<String> plannets = new ArrayList<>();
        plannets.add("Земля");
        plannets.add("Меркурий");
        plannets.add("Марс");
        plannets.add("Меркурий");
        plannets.add("Земля");
        plannets.add("Марс");
        plannets.add("Венера");
        plannets.add("Земля");
//        for (int i = 0; i < 10; i++) {
//            System.out.println("Введитет название планеты: ");
//            String planet = iScanner.nextLine().trim();
//            planet.add(planet);
//        }
        int count = 1;
        Map<String, Integer> plannetDic = new HashMap<>();

        for (String plannet : plannets) {
            if (plannetDic.get(plannet) == null) {
                plannetDic.put(plannet, 1);
            } else {
                int new_count = plannetDic.get(plannet) + 1;
                plannetDic.put(plannet, new_count);
            }
        }

        System.out.println(plannetDic);

//        Пройти по списку из предыдущего задания и удалить
//        повторяющиеся элементы.

        Collections.sort(plannets);
        
        for (Map.Entry<String, Integer>  entry : plannetDic.entrySet()) {
            if (entry.getValue() > 1){
                System.out.println(entry.getKey() + " " + entry.getValue());
                plannets.removeIf(n-> (n.equals(entry.getKey())));
                plannets.add(entry.getKey());

            }
        }
        System.out.println(plannets);
        
    }

}
