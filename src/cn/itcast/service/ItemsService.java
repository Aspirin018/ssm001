package cn.itcast.service;

import cn.itcast.domain.Items;

import java.util.List;

/**
 * Created by liyu on 2018/1/28.
 */
public interface ItemsService {
    List<Items> findAll();
    Items findById(Integer id);
    void saveOrUpdate(Items items);
    void deleteById(Integer id);
}
