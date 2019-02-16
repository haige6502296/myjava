package com.springTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class OneMain {
  public static void main(String[] args) {
    ApplicationContext context=new ClassPathXmlApplicationContext("Spring.xml");
 One oneA=(One)context.getBean("a");
 oneA.setMessage("设置一个字符串参数！");
 oneA.getMessage();
 One oneB=(One)context.getBean("a");
 oneB.getMessage();
  }
}
