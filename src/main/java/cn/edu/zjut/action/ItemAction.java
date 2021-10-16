package cn.edu.zjut.action;

import cn.edu.zjut.service.ItemService;

import java.util.List;

public class ItemAction
{
    private List items;

    public List getItems()
    {
        return items;
    }

    public void setItems(List items)
    {
        this.items = items;
    }

    public String getAllItems()
    {
        ItemService itemServ = new ItemService();
        items = itemServ.getAllItems();
        System.out.println("ItemAction excuted!");
        return "success";
    }
}
