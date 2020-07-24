package com.ssmpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import java.util.List;

@Controller("itemController")
public class ItemController {

    @Autowired
    public ItemMapper itemDao;

    public void test() {
        // 查询一个道具
        MyItem auser = itemDao.selectItemById(1);
        System.out.println("select : "+auser);
        System.out.println("============================");

        // 添加一个道具
        MyItem addmu = new MyItem();
        addmu.setItemId("1001");
        addmu.setNum("20");
        int add = itemDao.addItem(addmu);
        System.out.println("添加了" + add + "条记录");
        System.out.println("============================");

        // 修改一个道具
        MyItem updatemu = new MyItem();
        updatemu.setId(1);
        updatemu.setItemId("1002");
        updatemu.setNum("100");
        int up = itemDao.updateItem(updatemu);
        System.out.println("修改了" + up + "条记录");
        System.out.println("============================");

        // 删除一个道具
        int dl = itemDao.deleteItem(9);
        System.out.println("删除了" + dl + "条记录");
        System.out.println("============================");

        // 查询所有道具
        List<MyItem> list = itemDao.selectAllItem();
        for (MyItem MyItem : list) {
            System.out.println(MyItem);
        }
    }
}