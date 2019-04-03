package com.firstlibrary.model.dao;

import com.firstlibrary.model.entity.Book;
import com.firstlibrary.model.entity.User;

import java.util.List;

public interface UserDao extends GenericDao<User> {
    boolean isActive(User user);
    List<User> findByBook(Book book);

}
