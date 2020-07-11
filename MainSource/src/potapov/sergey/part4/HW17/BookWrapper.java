package potapov.sergey.part4.HW17;

public class BookWrapper extends Book{

    public static final long serialVersionUID = 3403259263069604821L;

    @Override
    public String getTitle() {
        return "Название книги: " + super.getTitle();
    }

    @Override
    public String getAuthor() {
        return "Автор: " + super.getAuthor();
    }

    @Override
    public String getPublicationDate() {
        return "Дата публикации: " + super.getPublicationDate();
    }

    BookWrapper(String title, String author, String publicationDate) {
        super(title, author, publicationDate);
    }


}
