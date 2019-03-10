package cn.waggag.service.impl;

import cn.waggag.mapper.TbItemMapper;
import cn.waggag.pojo.TbItem;
import cn.waggag.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Auther: 王港
 * @Date: 2019/3/11 1:42
 * @Description: cn.waggag.service.impl
 * @version: 1.0
 */
@Service
public class ItemServiceImpl implements ItemService {
    @Autowired
    private TbItemMapper itemMapper;

    //根据ID获取Item对象
    @Override
    public TbItem getItemById(long id) {
        return itemMapper.selectByPrimaryKey(id);
    }
}
