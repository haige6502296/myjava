package com.lct;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by amau at 2019-02-19 8:19 AM;
 * Description: Autowiring feature of spring framework enables you to inject the object dependency implicitly.
 * It internally uses setter or constructor injection.
 * Autowiring can't be used to inject primitive and string values. It works with reference only.;nead autowirer
 * <bean id="a" class="org.sssit.A" autowire="byName"></bean>
 */
public class MainApp {
  public static void main(String[] args) {
    ApplicationContext ac = new ClassPathXmlApplicationContext("spring-config.xml");
    A a = ac.getBean("a", A.class);
    a.diplay();
  }
}
