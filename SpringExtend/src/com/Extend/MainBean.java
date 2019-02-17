package com.Extend;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainBean {
/**
Created by amau at 2019-02-17 22:17 PM;
Description: Spring Bean的继承;
*/
public static void main(String[] args) {
  ApplicationContext ac=new ClassPathXmlApplicationContext("spring-config.xml");
          BeanClass beanClass=(BeanClass)ac.getBean("bean");
          beanClass.getMsgOne();
          beanClass.getMsgTwo();

          ChildBean childBean=(ChildBean)ac.getBean("childBean");
          childBean.getMsgOne();
          childBean.getMsgTwo();
          childBean.getMsgThree();

}
}
