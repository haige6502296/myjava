/**
Created by  amau at 2019-02-16 21:24 PM;
Description: String Bean 后置处理器,可以在初始化Bean前后做一些想做的事;
犯了两个错误:把spring-config.xml写成string-config.xml,getBean()方法把名字(id)BeanIdOrName 在spring-config.xml中
错写成beanIdOrName
 */
package com.SpringProcessor ;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainBean {
  public static void main(String[] args) {
    ApplicationContext ac=new ClassPathXmlApplicationContext("spring-config.xml");
    BeanClass beanClass=(BeanClass)ac.getBean("BeanIdOrName");
    beanClass.getMsg();
    ((ClassPathXmlApplicationContext) ac).registerShutdownHook();
  }
}
