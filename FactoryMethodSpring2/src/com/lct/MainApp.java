package com.lct;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
  public static void main(String[] args) {
    ApplicationContext ac = new ClassPathXmlApplicationContext("spring-config.xml");
    FactoryInterface f = (FactoryInterface) ac.getBean("factoryObj");
    f.print();
  }
}
