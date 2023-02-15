import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        // сумма чисел от 1 до n, n!
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите число n: ");
        int n = iScanner.nextInt();
        // System.out.println(n);
        iScanner.close();


        int res_sum = 0;
        for (int i = 0; i <= n; i++) {
            res_sum += i;
        }
        System.out.printf("sum = %d", res_sum);
        System.out.println();

        int res_fact = 1;
        for (int index = 1; index <= n; index++) {
            res_fact *= index;
        }
        System.out.printf("fact = %d", res_fact);
    }
}
