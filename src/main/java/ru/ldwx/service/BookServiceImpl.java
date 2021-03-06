package ru.ldwx.service;

import ru.ldwx.dao.BookDao;
import ru.ldwx.model.Book;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    private BookDao bookDao;

    private static final String YEAR_SEARCH = "printYear";

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Override
    @Transactional
    public void addBook(Book book) {
        this.bookDao.addBook(book);
    }

    @Override
    @Transactional
    public void updateBook(Book book) {
        this.bookDao.updateBook(book);
    }

    @Override
    @Transactional
    public void removeBook(int id) {
        this.bookDao.removeBook(id);
    }


    @Override
    @Transactional
    public void makeRead(Book book) {
        this.bookDao.makeRead(book);
    }

    @Override
    @Transactional
    public Book getBookById(int id) {
        return this.bookDao.getBookById(id);
    }

    @Override
    @Transactional
    public List<Book> listBooks() {
        return this.bookDao.listBooks();
    }


    @Override
    @Transactional
    public List<Book> searchBooks(String searchParameter, String searchText) {
        if(searchParameter.equals(YEAR_SEARCH)) {
            return this.bookDao.searchBooks(searchParameter, Integer.parseInt(searchText));
        }
        return this.bookDao.searchBooks(searchParameter, searchText);
    }
}
