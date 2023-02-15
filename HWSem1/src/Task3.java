import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите 1ое число: ");
        double a = iScanner.nextInt();

        Scanner in = new Scanner(System.in);
        System.out.print("Введите операцию: ");
        String oper = in.nextLine().trim(); // trim() для удаления \n в конце строки

        System.out.print("Введите 2ое число: ");
        double b = iScanner.nextInt();

        iScanner.close();
        // if (oper.equals("+")) System.out.println("вошел"); // строки нельзя сравнивать чере ==, только через метод .eqals(s) s-та строка с которйо сравнивают

        double res = 0;

        if (oper.equals("+")) res = a + b;
        if (oper.equals("-")) res = a - b;
        if (oper.equals("*")) res = a * b;
        if (oper.equals("/")) res = a / b;


        System.out.printf("Ответ: %f", res);
    }
}
