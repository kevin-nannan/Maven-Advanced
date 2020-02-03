package com.turtle.demo.controller;

import com.turtle.demo.domain.Items;
import com.turtle.demo.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 针对于商品的控制层
 */
@RequestMapping("/items")
@Controller
public class ItemsController {

    @Autowired
    private ItemsService itemsService;

    @RequestMapping("/showItemsById")
    public String showItemsById(Model model,Integer id){

        // 测试用例，当做id不存在异常情况
        Items items = itemsService.findById(id);
        model.addAttribute("item",items);

        // 已经对跳转路径做了前、后缀的匹配操作了
        return "itemDetail";
    }
}
