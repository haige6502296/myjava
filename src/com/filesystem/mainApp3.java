package com.filesystem;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
public class mainApp3 {
  //  创建一个ApplicationContext容器的另一种方法
  public static void main(String[] args) {
    ApplicationContext context3 = new FileSystemXmlApplicationContext
            ("E:/workspace/ideaWorkspace/HelloSpring/src/Bean.xml");
    helloSpring3 helloSpring = (helloSpring3) context3.getBean("helloS3");
    helloSpring.getMsg();

  }
}
