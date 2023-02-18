import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Logger;

//К калькулятору из предыдущего дз добавить логирование.
public class Task4 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите 1ое число: ");
        double a = iScanner.nextInt();

        Scanner in = new Scanner(System.in);
        System.out.print("Введите операцию: ");
        String oper = in.nextLine().trim();

        System.out.print("Введите 2ое число: ");
        double b = iScanner.nextInt();

        iScanner.close();

        Date date = new Date();
        loggin(date + " Начало работы");


        try {
            double res = 0;

            if (oper.equals("+")) res = a + b;
            if (oper.equals("-")) res = a - b;
            if (oper.equals("*")) res = a * b;
            if (oper.equals("/")) res = a / b;
            StringBuilder result = new StringBuilder();
            String resultStr = result.append(a).append(oper).append(b).append("=").append(res).toString();
            loggin(resultStr);
        } catch (Error er){
            loggin(er.toString());
        }




//        System.out.printf("Ответ: %f", res);
    }
    static void loggin(String text){
        try (FileWriter fw = new FileWriter("logCalc.txt", true)) {
            fw.write(text);
            fw.append('\n');
            fw.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
