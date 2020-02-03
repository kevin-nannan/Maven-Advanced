package com.turtle.demo.service;

import com.turtle.demo.domain.Items;

public interface ItemsService {

    /**
     * 通过id来查询对应的物品信息
     * @param id
     * @return
     */
    public Items findById(Integer id);
}
