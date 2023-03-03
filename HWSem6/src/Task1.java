/*
Создать множество ноутбуков.
Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации
и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map.
Например: “Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет

Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
Отфильтровать ноутбуки из первоначального множества и вывести проходящие по условиям.
*/
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task1 {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("ASUS",
                "TUF Gaming",
                8,
                1024,
                "Windows",
                "Черный");
        Laptop laptop2 = new Laptop("Dell",
                "Inspiron",
                8,
                1024,
                "Linux",
                "Серый");
        Laptop laptop3 = new Laptop("Acer",
                "Aspire",
                8,
                512,
                "Windows",
                "Серый");
        Laptop laptop4 = new Laptop("Lenovo",
                "Ideapad",
                8,
                512,
                "Linux",
                "Синий");
        Laptop laptop5 = new Laptop("MSI",
                "Titan",
                64,
                2048,
                "Windows",
                "Красный");
        Laptop laptop6 = new Laptop("Apple",
                "MacBook",
                64,
                8192,
                "Macintosh",
                "Серебристый");

        List<Laptop> laptopArrayList = new ArrayList<>();
        laptopArrayList.add(laptop1);
        laptopArrayList.add(laptop2);
        laptopArrayList.add(laptop3);
        laptopArrayList.add(laptop4);
        laptopArrayList.add(laptop5);
        laptopArrayList.add(laptop6);


        List<Laptop> result = searchFilter(laptopArrayList);
//        System.out.println(result);
        System.out.println("По вашему запросу найден(ы): ");
        for (Laptop res: result) {
            res.print();
        }
        if (result.size() < 1){
            System.out.println("По вашему запросу ничего не найдено");
        }
    }

    public static List<Laptop> searchFilter(List<Laptop> laptopList) {
        boolean flag = false;
        var ref = new Object() {
            Map<Integer, String> map = new HashMap<>();
        };

        while (!flag){
            clearsScreen();
            int numFirstMenu = mainMenu();

            ref.map = fillFindMap(numFirstMenu, ref.map);
            String question = inputDataString("Добавить критерий поиска? Y/N : ");

            boolean flag2 = false;
            while (!flag2) {
                if (question.equals("N") || question.equals("n")) {
                    flag = true;
                    flag2 = true;
                } else if (question.equals("Y") || question.equals("y")) {
                    flag2 = true;
                } else {
                    System.out.println("Введите Y если ДА\n" + "Введите N если НЕТ");
                    question = inputDataString("Добавить критерий поиска? Y/N : ");
                }
            }
        }
//        System.out.println(map);
//        List<Laptop> result = new LinkedList<>();

        List<Laptop> result = new LinkedList<>();

        for (Map.Entry entry: ref.map.entrySet())
        {
            int key = (Integer)entry.getKey();

            if (key == 1) {
                result = laptopList.stream()
                        .filter(elment -> elment.getRam() == Integer.parseInt(ref.map.get(1).trim()))
                        .collect(Collectors.toList());
            } else if (key == 2){
                if (result.size() > 0){
                    result = result.stream()
                            .filter(elment -> elment.getHd() == Integer.parseInt(ref.map.get(2).trim()))
                            .collect(Collectors.toList());
                } else {
                    result = laptopList.stream()
                            .filter(elment -> elment.getHd() == Integer.parseInt(ref.map.get(2).trim()))
                            .collect(Collectors.toList());
                }
            } else if (key == 3){
                if (result.size() > 0){
                    result = result.stream()
                            .filter(elment -> elment.getOperatingSystem().equals(ref.map.get(3).trim()))
                            .collect(Collectors.toList());
                } else {
                    result = laptopList.stream()
                            .filter(elment -> elment.getOperatingSystem().equals(ref.map.get(3).trim()))
                            .collect(Collectors.toList());
                }
            } else if (key == 4) {
                if (result.size() > 0){
                    result = result.stream()
                            .filter(elment -> elment.getOperatingSystem().equals(ref.map.get(4).trim()))
                            .collect(Collectors.toList());
                } else {
                    result = laptopList.stream()
                            .filter(elment -> elment.getOperatingSystem().equals(ref.map.get(4).trim()))
                            .collect(Collectors.toList());
                }
            }
        }

        return result;
    }
    public static Integer inputDataInt(String text1, String text2, int maxValue){
        Scanner iScanner = new Scanner(System.in);
        boolean flag = false;
        int inputData = 0;
        while (!flag){
            System.out.print(text1);

            inputData = iScanner.nextInt();
            if (inputData <= 0 || inputData > maxValue){
                System.out.println(text2);
            } else {
                flag = true;
            }
        }
        return inputData;
    }
    public static String inputDataString(String text){
        Scanner iScanner = new Scanner(System.in);
        System.out.print(text);
        String inputData = iScanner.nextLine();
        return inputData;
    }
    public static Map<Integer, String> fillFindMap(int num, Map<Integer, String> map){
        switch (num){
            case 1:
                int numSecondMenu1 = inputDataInt("Введите объем ОЗУ для поиска: ", "", 1000);
                map.put(1, Integer.toString(numSecondMenu1));
                break;
            case 2:
                int numSecondMenu2 = inputDataInt("Введите объем ЖД для поиска: ", "", 1000);
                map.put(2, Integer.toString(numSecondMenu2));
                break;
            case 3:
                System.out.println("1 - Windows\n" +
                        "2 - Linux\n" +
                        "3 - Macintosh");
                int numSecondMenu3 = inputDataInt("Выберите операционную систему: ", "",3);

                switch (numSecondMenu3){
                    case 1:
                        map.put(3, "Windows");
                        break;
                    case 2:
                        map.put(3, "Linux");
                        break;
                    case 3:
                        map.put(3, "Macintosh");
                        break;
                }

                break;
            case 4:
                String inputSecondMenu4 = inputDataString("Введите цвет: ");
                map.put(4, inputSecondMenu4);
                break;
        }
        return map;
    }
    public static Integer mainMenu(){
        int num = inputDataInt("1 - ОЗУ\n" +
                "2 - Объем ЖД\n" +
                "3 - Операционная система\n" +
                "4 - Цвет\n" +
                "\n" +
                "Выберите параметр поиска: ", "Такого параметра нет\n" +
                "---------------------", 4);
        return num;
    }
    public static void clearsScreen(){
        try {
            if (System.getProperty("os.name").contains("Windows"))
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            else
                Runtime.getRuntime().exec("clear");
        } catch (IOException | InterruptedException ex) {}
    }
}
