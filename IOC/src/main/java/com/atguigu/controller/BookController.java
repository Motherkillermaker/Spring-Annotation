package com.atguigu.controller;

import com.atguigu.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author CJYong
 * @create 2021-10-26 13:53
 */
@Controller
public class BookController {

    @Autowired
    private BookService bookService;
}
