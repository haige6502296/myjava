package com.lct;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
  public static void main(String[] args) {
    ApplicationContext ac = new ClassPathXmlApplicationContext("spring-config.xml");
    Business b = ac.getBean("business", Business.class);
    System.out.println("即将调用msg()方法:");
    b.msg();
    System.out.println("即将调用display()方法");
    b.display();
  }
}
