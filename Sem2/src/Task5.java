import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
// import java.lang.System.Logger;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.ConsoleHandler;
import java.util.logging.SimpleFormatter;

import java.util.logging.*;
// Напишите метод, который вернет содержимое текущей папки в виде
// массива строк.

// Напишите метод, который запишет массив, возвращенный предыдущим
// методом в файл.

// Обработайте ошибки с помощью try-catch конструкции. В случае
// возникновения исключения, оно должно записаться в лог-файл.
public class Task5 {
    public static void main(String[] args) throws IOException{


        try {
            List<String> list = folderContains(System.getProperty("user.dir"));
            saveFile("text5.txt", list);
        } catch (Exception e) {
            Logger logger = Logger.getLogger(Task5.class.getName());
            logger.setLevel(Level.INFO);
            ConsoleHandler ch = new ConsoleHandler();
            FileHandler fh = new FileHandler("log.txt");
            logger.addHandler(ch);
            SimpleFormatter sFormat = new SimpleFormatter();
            ch.setFormatter(sFormat);
            logger.log(Level.WARNING, "Тестовое логирование");
            logger.info("Тестовое логирование");

        }

    }
    static List<String> folderContains(String pathName) {
        final File folder = new File(pathName);
        List<String> list = new ArrayList<String>();

        for (final File file : folder.listFiles()){
            list.add(file.getName());
        }
        return list;
    }
    static void saveFile(String fileName, List<String> list) throws IOException{
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, StandardCharsets.UTF_8));

        for (String string : list) {
            writer.write(string+"\n");
        }

        writer.close();
    }
}
