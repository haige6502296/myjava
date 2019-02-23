package com.lct;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class BeforeAdvisor implements MethodBeforeAdvice {
  @Override
  public void before(Method method, Object[] args, Object target) {
    System.out.println("真实业务逻辑前附加关注点:");
    System.out.println("方法的有关信息: " + method.getName() + "," + method.getModifiers());
    System.out.println("参数相关的信息: ");
    for (Object o : args) {
      System.out.println(o);
    }
    System.out.println("目的对象:  " + target);
    System.out.println("目的对象类名: " + target.getClass().getName());
  }
}
