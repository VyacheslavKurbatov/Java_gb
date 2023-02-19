import java.util.Arrays;
import java.util.Random;

//Реализовать алгоритм сортировки слиянием
public class Task1 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            int num = random.nextInt(0, 10);
            arr[i] = num;
        }
        System.out.println(Arrays.toString(arr));

        mergeArraySort(arr, arr.length);

        System.out.println(Arrays.toString(arr));

    }

    public static void mergeArraySort(int[] a, int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = a[i];
        }
        mergeArraySort(l, mid);
        mergeArraySort(r, n - mid);

        merge(a, l, r, mid, n - mid);
    }

    public static void merge(
            int[] a, int[] l, int[] r, int left, int right) {

        int i = 0, j = 0, k = 0;

        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            }
            else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }
}
