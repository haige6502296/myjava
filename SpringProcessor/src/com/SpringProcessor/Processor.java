package com.SpringProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class Processor implements BeanPostProcessor {
  public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {//重写接口的方法
    System.out.println("Bean初始化之前:" + beanName);
    return bean;
  }

  public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
    System.out.println("Bean初始化之后:" + beanName);
    return bean;
  }
}
