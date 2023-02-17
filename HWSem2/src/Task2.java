import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Random;
import java.util.logging.Logger;

//Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
public class Task2 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            int num = random.nextInt(0, 10);
            arr[i] = num;
        }
        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.toString(bubbleSort(arr)));

    }
    static int[] bubbleSort(int[] originalArray) {

        for (int j = 0; j < originalArray.length; j++) {
            for (int i = 0; i < originalArray.length - 1; i++) {
                if (originalArray[i] > originalArray[i+1]) {
                    int temp = originalArray[i];
                    originalArray[i] = originalArray[i+1];
                    originalArray[i+1] = temp;

                    loggin(Arrays.toString(originalArray));
                }
            }
        }

        return originalArray;
    }
    static void loggin(String text){
        try (FileWriter fw = new FileWriter("log.txt", true)) {
            fw.write(text);
            fw.append('\n');
            fw.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
