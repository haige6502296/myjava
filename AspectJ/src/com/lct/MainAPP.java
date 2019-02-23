package com.lct;
//必须加入aspectjrt.jar、aspectjtools.jar、aspectjweaver.jar和aspectj.matcher.jar文件
//Spring5.1.5,java1.8.0_202
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAPP {
  public static void main(String[] args) {
    ApplicationContext ac=new ClassPathXmlApplicationContext("spring-config.xml");
    Operation o=ac.getBean("opbean",Operation.class);
    System.out.println("调用 msg()...");
    o.msg();
    System.out.println("调用 m()...");
    o.m();
    System.out.println("调用 k()...");
    o.k();
  }
}
