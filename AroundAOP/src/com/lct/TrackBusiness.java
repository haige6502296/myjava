package com.lct;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class TrackBusiness {

  @Pointcut("execution(* Business.*(..))")
  public void  abcPointcut(){}//为什么要加入这个方法？？？？？

  @Around("abcPointcut()")
  public Object myadvice(ProceedingJoinPoint pjp) throws Throwable{
    {
      System.out.println("实际业务方法调用前输出额外的关注点");
      Object obj=pjp.proceed();
      System.out.println("实际业务方法调用后输出额外的关注点");
      return obj;
    }
  }
}
