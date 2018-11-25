package cn.itcast.controller;

import cn.itcast.domain.Items;
import cn.itcast.service.ItemsService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.*;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * Created by liyu on 2018/1/28.
 */
@Controller
@RequestMapping("/items")
public class ItemsController {

    @Resource
    private ItemsService itemsService;

    @RequestMapping("list")
    public String list(Model model){
        List<Items> list = itemsService.findAll();
        model.addAttribute("itemsList", list);
        return "itemsList";
    }

    @RequestMapping("edit")
    public String edit(Model model, Integer id){
        Items items = itemsService.findById(id);
        model.addAttribute("item", items);
        return "editItem";
    }

    @RequestMapping("saveOrUpdate")
    public String saveOrUpdate(Items items){
        itemsService.saveOrUpdate(items);
        return "redirect:list.do";
    }

    @RequestMapping("deleteById")
    public String deleteById(Integer id){
        itemsService.deleteById(id);
        return "redirect:list.do";
    }

    @Test
    public void testThread(){
        List l = null;

        ArrayList al = null;

        Collections c = null;

        List a =  new ArrayList();
        a.add("a");
        a.add("b");
        a.add("c");
        List sub = a.subList(0,1);
        sub.clear();
        sub.add("x");
        System.out.println(a);


        AbstractCollection ac = null;

        AbstractList aa = null;






    }


}
