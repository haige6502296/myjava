package com.lct;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
  public static void main(String[] args) {
    ApplicationContext ac = new ClassPathXmlApplicationContext("spring-config.xml");
    Validator v = ac.getBean("proxy", Validator.class);
    try {
      v.validate(21);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
