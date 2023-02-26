import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Stack;

//Написать программу, определяющую правильность расстановки скобок в выражении.
//        Пример 1: a+(d*3) - истина
//        Пример 2: [a+(1*3) - ложь
//        Пример 3: [6+(3*3)] - истина
//        Пример 4: {a}[+]{(d*3)} - истина
//        Пример 5: <{a}+{(d*3)}> - истина
//        Пример 6: {a+]}{(d*3)} - ложь
public class Task2 {
    public static void main(String[] args) {
        System.out.println(ex0("<{a}+{(d*3)}>"));
    }
    static boolean ex0(String s){
        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('<', '>');
        map.put('{', '}');

        char[] chars = s.toCharArray();
        LinkedList<Character> list = new LinkedList<>();
        for (int i = 0; i < chars.length; i++) {
            if (map.containsKey(chars[i])){
                list.push(chars[i]);
            }
            if (map.containsValue(chars[i])){
                if (list.isEmpty() || chars[i] != map.get(list.pop())){
                    return false;
                }
            }
        }
        return list.isEmpty();
    }
}
