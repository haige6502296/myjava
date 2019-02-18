package com.lct;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by amau at 2019-02-18 21:13 PM;
 * Description: SpirngMap学习,注意Answer类参数日期的格式如果写成2019-02-18比如这种格式将无法通过运行;
 */
public class MainApp {
  public static void main(String[] args) {
    ApplicationContext ac = new ClassPathXmlApplicationContext("spring-config.xml");
    Question q = (Question) ac.getBean("q");
    q.dispInfo();
  }
}
