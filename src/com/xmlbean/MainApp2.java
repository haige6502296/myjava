package com.xmlbean;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class MainApp2 {
  public static void main(String[] args) {
    XmlBeanFactory beanFactory=new XmlBeanFactory(new ClassPathResource("Bean.xml"));
    SayGood obj2=(SayGood)beanFactory.getBean("a");//a为类对象

    obj2.getWords();
  }
}
