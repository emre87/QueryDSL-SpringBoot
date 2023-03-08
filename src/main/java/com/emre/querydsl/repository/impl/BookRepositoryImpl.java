package com.emre.querydsl.repository.impl;

import com.emre.querydsl.repository.BookRepository;
import com.emre.querydsl.entity.Book;

import javax.persistence.EntityManager;

public class BookRepositoryImpl extends BaseRepositoryImpl<Book,Integer> implements BookRepository {


    public BookRepositoryImpl( EntityManager em) {
        super(Book.class, em);
    }
}
