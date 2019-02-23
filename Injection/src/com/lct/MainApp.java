package com.lct;


//import org.springframework.beans.factory.BeanFactory;
//import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.core.io.ClassPathResource;
public class MainApp {
  public static void main(String[] args) {
  ApplicationContext ac=new ClassPathXmlApplicationContext("spring-config.xml");
    Employee s=(Employee)ac.getBean("e");
//XmlBeanFactory xbf=new XmlBeanFactory(new ClassPathResource("spring-config.xml"));
// Employee s=(Employee) xbf.getBean("e");
    s.show();
  }
}
