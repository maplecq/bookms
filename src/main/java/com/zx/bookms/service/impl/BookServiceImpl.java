package com.zx.bookms.service.impl;

import com.zx.bookms.bean.Book;
import com.zx.bookms.mapper.BookMapper;
import com.zx.bookms.service.BookService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author cqmaple
 * @since 2021-11-02
 */
@Service
public class BookServiceImpl extends ServiceImpl<BookMapper, Book> implements BookService {

}
