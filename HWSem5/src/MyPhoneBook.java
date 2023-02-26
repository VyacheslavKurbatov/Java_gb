import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class MyPhoneBook {
    private Map<String, LinkedList<String>> map = new HashMap<>();

    void add(String name, String phone) {
        LinkedList<String> list = new LinkedList<>();
        list.add(phone);
        map.put(name, list);
    }
    void printall(){
        for (Map.Entry<String, LinkedList<String>> entry: map.entrySet()){
            System.out.println(entry);
        }
    }
    void print(String name){
        for (Map.Entry<String, LinkedList<String>> entry: map.entrySet()){
            if (entry.getKey().equals(name)){
                System.out.println(entry);
            }
        }
    }
    void addNewPhone(String name, String phone){
        for (Map.Entry<String, LinkedList<String>> entry: map.entrySet()){
            if (entry.getKey().equals(name)){
                map.get(name).add(phone);
            }
        }
    }
    void dellPhone(String name, String phone){
        for (Map.Entry<String, LinkedList<String>> entry: map.entrySet()){
            if (entry.getKey().equals(name)){
                map.get(name).remove(phone);
            }
        }
    }
    void dellContact(String name){
        for (Map.Entry<String, LinkedList<String>> entry: map.entrySet()){
            if (entry.getKey().equals(name)){
                map.remove(name);
            }
        }
    }
}
