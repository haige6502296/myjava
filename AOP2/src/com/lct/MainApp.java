package com.lct;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainApp {

  public static void main(String[] args) {
    ApplicationContext ac = new ClassPathXmlApplicationContext("spring-config.xml");
    A a = ac.getBean("proxy", A.class);
    System.out.println("代理的类名  : " + a.getClass().getName());
    a.m();
    a.n();
  }
}
