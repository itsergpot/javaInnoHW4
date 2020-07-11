package potapov.sergey.part4.HW17;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Lib {

    private List<BookWrapper> bookArrayList = new ArrayList<>();

    public void addBook(BookWrapper book){
        bookArrayList.add(book);
    }

    public void getListOfBooks(){
        if (bookArrayList != null) {
            for (Book book : bookArrayList
            ) {
                System.out.printf("%s %s %s\n", book.getTitle(), book.getAuthor(), book.getPublicationDate());
            }
        } else {
            System.out.println("Библиотека книг пуста");
        }
    }

    public void saveBookLib(String bookLibName){
        bookLibName = "C:\\Users\\itser\\IdeaProjects\\javaInnoHW4\\MainSource\\src\\potapov\\sergey\\part4\\HW17\\" + bookLibName + ".dat";
        try (OutputStream os = new FileOutputStream(bookLibName);
             ObjectOutputStream oos = new ObjectOutputStream(os)) {
            oos.writeObject(bookArrayList);
            System.out.println("Сохранение библиотеки книг прошло успешно");
        } catch (IOException ex) {
            System.out.println("Не удалось сохранить библиотеку книг");
        }
    }

    public List<BookWrapper> loadBookLib(String bookLibName){
        bookLibName = "C:\\Users\\itser\\IdeaProjects\\javaInnoHW4\\MainSource\\src\\potapov\\sergey\\part4\\HW17\\" + bookLibName + ".dat";
        if (new File(bookLibName).exists()){
            try (InputStream is = new FileInputStream(bookLibName); ObjectInputStream ois = new ObjectInputStream(is)) {
                System.out.println("Библиотека книг прочитана");
                return bookArrayList = (List<BookWrapper>) ois.readObject();
            } catch (IOException ex){
                System.out.println("Не удалось считать библиотеку книг");
            }
            catch (ClassNotFoundException ex) {
                System.out.println("Данные библиотеки книг не поддерживаются");
            }
            catch (Exception ex){
                System.out.println("Возникла непредвиденная ошибка");
            }
        }
            System.out.println("Файл не найден. Инициализируем пустым списком");
            return bookArrayList = new ArrayList<>();
        }
}
