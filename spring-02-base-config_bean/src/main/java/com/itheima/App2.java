package com.itheima;

import com.itheima.dao.BookDao;
import com.itheima.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Mendy
 * @create 2023-06-16 9:21
 */
public class App2 {

    public static void main(String[] args) {
        //1. acquire IoC container
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        
        //2. acquired bean
        BookDao bookDao = (BookDao)ctx.getBean("bookDao");
        bookDao.save();

        BookService bookService = (BookService) ctx.getBean("bookService");
        bookService.save();


    }

}
