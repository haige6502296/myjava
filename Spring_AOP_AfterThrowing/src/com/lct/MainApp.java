package com.lct;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp{
  public static void main(String[] args) {
    System.out.println("\n\n注意:没有异常将不会有额外的切入点----------------------------------------\n\n");
    ApplicationContext ac=new ClassPathXmlApplicationContext("spring-config.xml");
    Operation operation=ac.getBean("operation",Operation.class);
    System.out.println("调用业务逻辑方法valiAge()如下:");
    try {
      operation.valiAge(18);
    } catch (Exception e) {
      //System.out.println(e);//这个输出可以不用,已经被TrackClass追踪到了,否则内容重复了.
      //e.printStackTrace();
    }
    System.out.println("再次调用业务逻辑方法valiAge()如下:");
    try {
      operation.valiAge(16);
    } catch (Exception e) {
      //System.out.println(e);//这个输出可以不用,已经被TrackClass追踪到了,否则内容重复了.
      //e.printStackTrace();
    }
  }
}