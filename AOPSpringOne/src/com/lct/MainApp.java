package com.lct;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
  public static void main(String[] args) {
    ApplicationContext ac = new ClassPathXmlApplicationContext("spring-config.xml");
    A a = ac.getBean("proxyA", A.class);
    a.m();
    B b = ac.getBean("proxyB", B.class);
    b.methodTest();
  }
}
