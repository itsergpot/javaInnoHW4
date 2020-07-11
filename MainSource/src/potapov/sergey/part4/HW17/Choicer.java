package potapov.sergey.part4.HW17;

import java.util.Scanner;

public class Choicer {
    static boolean exit = false;

    public static void choice(Lib lib){
        Scanner incChoice = new Scanner(System.in);

        do {
            switch (incChoice.nextInt()) {
                case 1:
                    System.out.println("Введите Название книги");
                    String title = incChoice.next();
                    System.out.println("Введите Автора книги");
                    String author = incChoice.next();
                    System.out.println("Введите год издания книги");
                    String publicationDate = incChoice.next();
                    lib.addBook(new BookWrapper(title, author, publicationDate));
                    System.out.println();
                    Displayer.mainMenu();
                    break;
                case 2:
                    lib.getListOfBooks();
                    System.out.println();
                    Displayer.mainMenu();
                    break;
                case 3:
                    System.out.println("Введите название для сохранения библиотеки книг");
                    lib.saveBookLib(incChoice.next());
                    System.out.println();
                    Displayer.mainMenu();
                    break;
                case 4:
                    System.out.println("Введите название для загрузки библиотеки книг");
                    lib.loadBookLib(incChoice.next());
                    System.out.println();
                    Displayer.mainMenu();
                    break;
                case 5:
                    System.out.println("Вы вышли из программы");
                    exit = true;
                    break;
            }
        } while (!exit);
        incChoice.close();
    }
}
