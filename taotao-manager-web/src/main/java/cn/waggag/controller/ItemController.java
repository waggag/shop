package cn.waggag.controller;

import cn.waggag.pojo.TbItem;
import cn.waggag.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 商品管理
 *
 * @Auther: 王港
 * @Date: 2019/3/11 1:46
 * @Description: cn.waggag.controller
 * @version: 1.0
 */
@Controller
public class ItemController {

    @Autowired
    private ItemService itemService;

    @RequestMapping("/item/{itemId}")
    @ResponseBody
    public TbItem getItemById(@PathVariable Long itemId) {
        return itemService.getItemById(itemId);
    }
    
}
