package com.lifePeriod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mainStart {
  public static void main(String[] args) {
    ApplicationContext ac=new ClassPathXmlApplicationContext("spring-config.xml");
    BeanClass bc=(BeanClass)ac.getBean("beanIDOrName");
    bc.getMsg();
    ((ClassPathXmlApplicationContext) ac).registerShutdownHook();
  }
}
