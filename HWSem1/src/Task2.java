public class Task2 {
    public static void main(String[] args) {

        for (int i = 1; i <= 1000; i++) {
            for (int j = 2; j <= i; j++) {
                //System.out.println(j);
                if (i == j){
                    System.out.println(i);
                }
                if (i % j == 0 && i != j) break;

            }
        }
    }
}
