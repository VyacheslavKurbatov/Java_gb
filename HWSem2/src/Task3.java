/*
Дана json строка (можно сохранить в файл и читать из файла)
[{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},{"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]

Написать метод(ы), который распарсит json и,
используя StringBuilder, создаст строки вида:

Студент [фамилия] получил [оценка] по предмету [предмет].

Пример вывода:
Студент Иванов получил 5 по предмету Математика.
Студент Петрова получил 4 по предмету Информатика.
Студент Краснов получил 5 по предмету Физика.
*/
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Task3 {
    public static void main(String[] args) {
        JSONObject json1 = new JSONObject();
        JSONObject json2 = new JSONObject();
        JSONObject json3 = new JSONObject();
        List jsonList = new ArrayList();

        json1.put("фамилия", "Иванов");
        json1.put("оценка", "5");
        json1.put("предмет", "Математика");

        json2.put("фамилия", "Петрова");
        json2.put("оценка", "4");
        json2.put("предмет", "Информатика");

        json3.put("фамилия", "Краснов");
        json3.put("оценка", "5");
        json3.put("предмет", "Физика");

        jsonList.add(json1);
        jsonList.add(json2);
        jsonList.add(json3);

        System.out.println(jsonList);

        jsonPars(jsonList);
    }
    static void jsonPars(List listJson){

        for (int i = 0; i < listJson.size(); i++) {
            StringBuilder result = new StringBuilder("");
            JSONObject json = (JSONObject) listJson.get(i);

            result.append("Студент ").append(json.get("фамилия"))
                    .append(" получил ").append(json.get("оценка"))
                    .append(" по предмету ").append(json.get("предмет"));
            System.out.println(result);
        }

    }
}
