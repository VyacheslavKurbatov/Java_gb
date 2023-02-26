//Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
public class Task1 {
    public static void main(String[] args) {
        MyPhoneBook myPhoneBook = new MyPhoneBook();

        myPhoneBook.add("Ivanov", "98765432121");
        myPhoneBook.add("Petrov", "98765432");
        myPhoneBook.add("Sidorov", "987");

        myPhoneBook.printall();

        System.out.println();
        myPhoneBook.addNewPhone("Ivanov", "2121");
        myPhoneBook.addNewPhone("Ivanov", "1212");
        myPhoneBook.addNewPhone("Ivanov", "3569");
        myPhoneBook.print("Ivanov");

        System.out.println();
        myPhoneBook.printall();

        System.out.println();
        myPhoneBook.dellPhone("Ivanov", "2121");
        myPhoneBook.print("Ivanov");

        System.out.println();
        myPhoneBook.dellContact("Sidorov");
        myPhoneBook.printall();
    }
}
