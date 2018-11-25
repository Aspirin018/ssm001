package cn.itcast.service.impl;

import cn.itcast.dao.ItemsMapper;
import cn.itcast.domain.Items;
import cn.itcast.service.ItemsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by liyu on 2018/1/28.
 */
@Service
public class ItemsServiceImpl implements ItemsService {

    @Resource
    private ItemsMapper itemsMapper;
    @Override
    public List<Items> findAll() {
        List<Items> list = itemsMapper.findAll();
        return list;
    }

    @Override
    public Items findById(Integer id) {
        Items items = itemsMapper.selectByPrimaryKey(id);
        return items;
    }

    @Override
    public void saveOrUpdate(Items items) {
        itemsMapper.updateByPrimaryKey(items);
    }

    @Override
    public void deleteById(Integer id) {
        itemsMapper.deleteByPrimaryKey(id);
    }
}
