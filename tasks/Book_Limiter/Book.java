package tasks.Book_Limiter;

import java.security.PublicKey;

public class Book implements Comparable<Book>{

    String book_name;
    int id;

    int page_number;


    public Book(int id, String book_name, int page_number){
        this.id = id;
        this.book_name = book_name;
        this.page_number = page_number;
    }
    @Override
    public int compareTo(Book o) {
        if (book_name.charAt(0) == o.book_name.charAt(0)){
            return 0;
        } else if (book_name.charAt(0) > o.book_name.charAt(0)) {
            return 1;
        }else {
            return -1;
        }
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPage_number() {
        return page_number;
    }

    public void setPage_number(int page_number) {
        this.page_number = page_number;
    }
}
