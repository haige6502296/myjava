package net.lct;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
  public static void main(String[] args) {
    ApplicationContext ac=new ClassPathXmlApplicationContext("spring-config.xml");
    Business b=ac.getBean("business", Business.class);
    System.out.println("开始调用m方法了...");
    System.out.println(b.m());
    System.out.println("开始调用n方法了...");
    System.out.println(b.n());
  }
}
