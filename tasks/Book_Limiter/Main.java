package tasks.Book_Limiter;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        TreeSet<Book> books = new TreeSet<Book>();

        Book b1 = new Book(1, "Sefiller-Victor Hugo",500);
        Book b2 = new Book(2, "Vadideki Zambak - Honore de Balzac",650);
        Book b3 = new Book(3, "Ana - Maksim Gorki",450);
        Book b4 = new Book(4, "Karamazov Kardeşler - Fyodor Dostoyevski",750);
        Book b5 = new Book(5, "Gazap Üzümleri - John Steinbeck",300);

        books.add(b1);
        books.add(b2);
        books.add(b3);
        books.add(b4);
        books.add(b5);

        for (Book bookName: books) {
            System.out.println(bookName.getBook_name());
        }

        TreeSet<Book> book = new TreeSet<Book>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                if (o1.getPage_number() == o2.page_number){
                    return 0;
                } else if (o1.getPage_number() > o2.page_number) {
                    return 1;
                }else {
                    return -1;
                }
            }
        });

        book.add(b1);
        book.add(b2);
        book.add(b3);
        book.add(b4);
        book.add(b5);

        for (Book bookPage: book) {
            System.out.println(bookPage.getPage_number());
        }


    }
}
