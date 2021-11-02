package com.zx.bookms.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zx.bookms.bean.Book;
import com.zx.bookms.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BookServiceImplTest {
    @Autowired
    private BookService bookService;

    @Test
    public void findAllPage() {
        Page<Book> page = new Page<Book>(1, 3);
        Page<Book> pageInfo = bookService.page(page);
        System.out.println(pageInfo);
    }

}