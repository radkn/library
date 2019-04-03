package com.firstlibrary.model.dao;

import java.util.List;

public interface GenericDao<T> extends AutoCloseable{
    void create(T t);
    T findById(int id);
    List<T> findAll();
    void update(T t);
    void delete(T t);
}
