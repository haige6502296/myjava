package com.lct;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
  public static void main(String[] args) {
    //开始把配置文件名写错了
    ApplicationContext ac = new ClassPathXmlApplicationContext("spring-config.xml");
    Business b = ac.getBean("business", Business.class);
    System.out.println("调用methodB方法：");
    try {
      b.methodB(11);
    } catch (Exception e) {
      System.out.println("@年龄非法!!!!");
      //e.printStackTrace();
    }
    System.out.println("再次调用methodB方法__________________________________");
    try {
      b.methodB(19);
    } catch (Exception e) {
      System.out.println("@非法年龄!!!!");
      //e.printStackTrace();
    }
  }
}
