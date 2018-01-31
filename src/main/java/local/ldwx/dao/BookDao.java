package local.ldwx.dao;

import local.ldwx.model.Book;

import java.util.List;

public interface BookDao {
    void addBook(Book book);

    void updateBook(Book book);

    void removeBook(int id);

    void makeRead(Book book);

    Book getBookById(int id);

    List<Book> listBooks();

    List<Book> searchBooks(String searchParameter, Object searchText);
}
