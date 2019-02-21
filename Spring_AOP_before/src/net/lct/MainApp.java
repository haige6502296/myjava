package net.lct;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// 着重理解配置文件xml

public class MainApp {
  public static void main(String[] args) {
    ApplicationContext ac=new ClassPathXmlApplicationContext("spring-config.xml");
    Business b=ac.getBean("b", Business.class);
    System.out.println("开始调用msg()方法-----------------:");
    b.msg();
    System.out.println("开始调用m()方法-------------------:");
    b.m();
    System.out.println("开始调用n()方法--------------------:");
    b.n();
  }
}
