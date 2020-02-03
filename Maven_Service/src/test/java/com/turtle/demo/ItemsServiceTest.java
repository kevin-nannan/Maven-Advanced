package com.turtle.demo;

import com.turtle.demo.dao.ItemsMapper;
import com.turtle.demo.domain.Items;
import com.turtle.demo.service.ItemsService;
import com.turtle.demo.service.impl.ItemsServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ItemsServiceTest {

    @Test
    public void testFindItemsById() {
        //获取 spring 容器
        ApplicationContext applicationContext = new
                ClassPathXmlApplicationContext("classpath*:applicationContext-*.xml");
        //获取 Mapper
        ItemsService itemsService = applicationContext.getBean(ItemsService.class);
        //调用 Mapper 方法
        Items items = itemsService.findById(1);
        System.out.println(items.getName());
    }
}
