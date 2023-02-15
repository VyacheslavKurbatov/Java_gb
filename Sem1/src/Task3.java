// Напишите метод, который находит самую длинную строку общего префикса среди массива строк.
// Если общего префикса нет, вернуть пустую строку "".

public class Task3 {
    public static void main(String[] args) {
        String[] text = new String[] { "Мороз и солнце", "солнце", "Мороз и солнце, день чудесный" };
        int max = 0;
        for (int i = 0; i < text.length-1; i++) {
            if (text[i+1].contains(text[i])) {
                if (text[i].length() > text[i + 1].length()) {
                    max = i;
                }
                else
                    max = i+1;
            }
        }
        if (max == 0) {
            System.out.println("Пустая строка");
        }
        else System.out.println(text[max]);
    }
}