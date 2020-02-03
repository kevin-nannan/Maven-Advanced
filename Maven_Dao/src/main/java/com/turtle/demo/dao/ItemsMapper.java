package com.turtle.demo.dao;

import com.turtle.demo.domain.Items;

public interface ItemsMapper {
    /**
     * 通过id来查找对应的item对象
     * @param id
     * @return
     */
    public Items findById(Integer id);
}
