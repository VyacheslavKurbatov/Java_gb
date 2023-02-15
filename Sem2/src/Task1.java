public class Task1 {
    public static void main(String[] args) {
        // Дано четное число N (>0) и символы c1 и c2.
        // Написать метод, который вернет строку длины N, которая состоит из чередующихся символов c1 и c2, начиная с c1.
        int number = 8;
        String str1 = "c1";
        String str2 = "c2";

        String newString = takeString(number, str1, str2);
        System.out.println(newString);
    }
    static String takeString(int number, String str1, String str2) {
        StringBuilder sd = new StringBuilder();
        for (int i = 0; i < number; i++) {
            if (i % 2 == 0) sd.append(str1);
            else sd.append(str2);
        }
        return String.join("", sd);
    }
}
