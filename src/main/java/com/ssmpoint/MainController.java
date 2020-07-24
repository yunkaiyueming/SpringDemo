package com.ssmpoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainController {
    public static void main(String[] args) {
        String xmlPath = "ssm/applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        UserController uc = (UserController) applicationContext.getBean("userController");
        //uc.test();

        ItemController itemc = (ItemController) applicationContext.getBean("itemController");
        itemc.test();
    }
}