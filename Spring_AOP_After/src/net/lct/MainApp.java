package net.lct;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
  public static void main(String[] args) {
    ApplicationContext ac = new ClassPathXmlApplicationContext("config.xml");
    Business b = ac.getBean("b", Business.class);
    System.out.println("准备调用Business的show方法_________!!!");
    b.show();
    System.out.println("准备调用Business的m方法____________!!!");
    b.m();
    System.out.println("准备调用Business的n方法____________!!!");
    b.n();
  }
}
