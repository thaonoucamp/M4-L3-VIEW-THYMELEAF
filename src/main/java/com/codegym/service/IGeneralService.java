package com.codegym.service;


import java.util.List;

public interface IGeneralService<T> {
    List<T> findAll();

    void save(T t);

    T findById(int id);

    void update(int id, T t);

    void remove(int id);
}
