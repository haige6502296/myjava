package com.springTest;

/*Created by  at 2019-02-16 19:01 PM;
Description: 学习bean 的scope属性为prototype;
Others:Spring版本：5.1.5.Release,java 版本1.8*/

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
