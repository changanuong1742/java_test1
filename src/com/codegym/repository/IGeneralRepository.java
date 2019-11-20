package com.codegym.repository;

import java.util.List;

public interface IGeneralRepository <E>{

    List<E> findAll();
    void add(E e);
    void edit(int id, E e);
    void delete(int id);
    void findByName(String name);
    Boolean check(Object o);
}
