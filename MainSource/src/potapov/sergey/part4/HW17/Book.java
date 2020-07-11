package potapov.sergey.part4.HW17;

import java.io.Serializable;

public class Book implements Serializable {

    public static final long serialVersionUID = 5608196888249390607L;

    String title;
    String author;
    String publicationDate;

    Book(String title, String author, String publicationDate){
        this.title = title;
        this.author = author;
        this.publicationDate = publicationDate;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

}
