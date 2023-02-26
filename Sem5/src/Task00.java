import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
//Создать структуру для хранения Номеров паспортов и Фамилий сотрудников организации.
//        123456 Иванов
//        321456 Васильев
//        234561 Петрова
//        234432 Иванов
//        654321 Петрова
//        345678 Иванов
//        Вывести данные по сотрудникам с фамилией Иванов.
public class Task00 {
    public static void main(String[] args) {
//        Map<Integer, String> map = new HashMap<>();
//        map.put(1, "safa");
//        map.put(1, map.get(1) + "s;djv");
//
//        System.out.println(map);
//
//        Map<Integer, List<String>> map2 = new HashMap<>();
//        List<String> list = new ArrayList<>();
//        list.add("asdasd");
//        map.put(1, list);

        Passports passports = new Passports();
        passports.add("123456", "Иванов");
        passports.add("321456", "Васильев");
        passports.add("234561", "Петрова");
        passports.add("234432", "Иванов");
        passports.add("654321", "Петрова");
        passports.add("345678", "Иванов");

        passports.print("Иванов");
    }
}
