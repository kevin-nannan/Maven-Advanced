package com.turtle.demo.service.impl;

import com.turtle.demo.dao.ItemsMapper;
import com.turtle.demo.domain.Items;
import com.turtle.demo.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemsServiceImpl implements ItemsService {

    @Autowired
    private ItemsMapper itemsMapper;

    @Override
    public Items findById(Integer id) {
        Items items = null;
        if(itemsMapper != null){
            items = itemsMapper.findById(id);
        }
        return items;
    }
}
