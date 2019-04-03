package com.firstlibrary.model.dao;

import com.firstlibrary.model.entity.Book;

import java.util.List;

public interface BookDao extends GenericDao<Book>{
    Book findByTitle(String title);
    List<Book> findByAuthor(String author);
    List<Book> findByTag(String tag);
    List<Book> findBookInUse();
}
