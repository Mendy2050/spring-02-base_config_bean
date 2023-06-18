package com.itheima.service.impl;

import com.itheima.dao.BookDao;
import com.itheima.dao.impl.BookDaoImpl;
import com.itheima.service.BookService;

/**
 * @author Mendy
 * @create 2023-06-16 8:12
 */
public class BookServiceImpl implements BookService {

    private BookDao bookDao;

    public void save(){
        System.out.println("book service save...");
        bookDao.save();
    }


    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }
}
