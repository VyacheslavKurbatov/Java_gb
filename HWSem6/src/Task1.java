/*
Создать множество ноутбуков.
Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации
и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map.
Например: “Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет

Выберите параметр поиска:

Такого параметра нет
---------------------

Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
Отфильтровать ноутбуки из первоначального множества и вывести проходящие по условиям.
*/

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("ASUS",
                "TUF Gaming",
                16,
                1024,
                "Windows",
                "Черный");
        Laptop laptop2 = new Laptop("Dell",
                "Inspiron",
                8,
                1024,
                "linux",
                "Серый");
        Laptop laptop3 = new Laptop("Acer",
                "Aspire",
                32,
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

//        System.out.println(laptopLinkedList);
        searchFilter(laptopArrayList);
    }

    public static void searchFilter(List<Laptop> laptopList) {
        int numFirstMenu = inputDataMainMenu("1 - ОЗУ\n" +
                "2 - Объем ЖД\n" +
                "3 - Операционная система\n" +
                "4 - Цвет\n" +
                "\n" +
                "Выберите параметр поиска: ", "Такого параметра нет\n" +
                "---------------------");


        switch (numFirstMenu){
            case 1:
                int numSecondMenu = inputDataSecondMenu("Введите объем ОЗУ для поиска: ");
                System.out.println(numSecondMenu);
                break;
            case 2:

                break;

            case 3:

                break;
            case 4:

                break;
        }

//        System.out.println(numSecondMenu);
    }
    public static Integer inputDataMainMenu(String text1, String text2){
        Scanner iScanner = new Scanner(System.in);
        boolean flag = false;
        int inputData = 0;
        while (!flag){
            System.out.print(text1);

            inputData = iScanner.nextInt();
            if (inputData <= 0 || inputData > 4){
                System.out.println(text2);
            } else {
                flag = true;
            }
        }

        iScanner.close();
        return inputData;
    }
    public static int inputDataSecondMenu(String text){
        Scanner scan = new Scanner(System.in);
        System.out.print(text);
        int inputData = scan.nextInt();
        scan.close();
        return inputData;

    }
}
