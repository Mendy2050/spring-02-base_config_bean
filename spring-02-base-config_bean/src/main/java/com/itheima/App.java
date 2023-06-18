package com.itheima;

import com.itheima.service.BookService;
import com.itheima.service.impl.BookServiceImpl;

/**
 * @author Mendy
 * @create 2023-06-16 8:14
 */
public class App {

    public static void main(String[] args) {
        BookService bookService = new BookServiceImpl();
        bookService.save();
    }

}
