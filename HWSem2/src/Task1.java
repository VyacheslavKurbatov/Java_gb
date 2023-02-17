/*
Дана строка sql-запроса "select * from students where ".
Сформируйте часть WHERE этого запроса, используя StringBuilder.
Данные для фильтрации приведены ниже в виде json строки.
Если значение null, то параметр не должен попадать в запрос.
Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
*/

//select * from Customers where Country = 'Germany' AND City not in ('Berlin', 'Aachen') AND CustomerID > 15

import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Task1 {
    public static void main(String[] args) {
    String request = "select * from students where ";
    JSONObject json = new JSONObject();
    json.put("name", "Ivanov");
    json.put("country", "Russia");
    json.put("city", "Moscow");
    json.put("age", "null");

    StringBuilder sqlRequest = createRequest(request, json);
    System.out.println(sqlRequest);

    }
    static StringBuilder createRequest(String request, JSONObject jsonstr) {
        StringBuilder requestSB = new StringBuilder(request);

        Set<String> coll = jsonstr.keySet();
        List<String> keysList = convertToList(coll);

        String key = "";
        String value = "";

        for (int i = 0; i < jsonstr.length(); i++) {
            key = keysList.get(i);
            value = jsonstr.get(key).toString();
            if (value.equals("null")){
                continue;
            } else {
                requestSB.append(key).append("=").append(value).append(" AND ");
            }
        }

        StringBuilder result = requestSB.replace(requestSB.length() - 5, requestSB.length() - 1 , "");

        return result;
    }
    static <T> List<T> convertToList(Set<T> set)
    {
        List<T> items = new ArrayList<>();

        for (T e: set) {
            items.add(e);
        }

        return items;
    }
}
