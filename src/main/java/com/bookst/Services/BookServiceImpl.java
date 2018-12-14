package com.bookst.Services;

import com.bookst.Entities.Book;
import com.bookst.Repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    BookRepository bookRepository;

    @Override
    public List<Book> findAll() {

        return bookRepository.findAll();
    }

    @Override
    public Book findById(Long id){
        return bookRepository.getOne(id);
    }

    @Override
    public List<Book> findByCategory(String category) {
        List<Book> bookList = bookRepository.findByCategory(category);
        return bookList;
    }

    @Override
    public List<Book> blurrySearch(String title) {
        List<Book> bookList = bookRepository.findByTitleContaining(title);
        return bookList;
    }

    private List<Book> bookList(List<Book> bookList) {
        List<Book> activeBookList = new ArrayList<Book>();

        for (Book book: bookList) {
            if(book.isActive()) {
                activeBookList.add(book);
            }
        }
        return activeBookList;
    }


}
