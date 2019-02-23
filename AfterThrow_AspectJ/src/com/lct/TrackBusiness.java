package com.lct;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;


@Aspect//声明切面类
public class TrackBusiness {
  @AfterThrowing
          (pointcut = "execution(* Business.*(..))",
                  throwing = "Errormsg")

//这里犯了错误写掉了void导致@AfterThrowing块无法通过编译
  public void myAdvice(JoinPoint jp, Throwable Errormsg) {//如果没有异常这个方法不会执行!
    System.out.println("额外的关注点");
    System.out.println("方法签名: " + jp.getSignature());
    System.out.println("异常为: " + Errormsg);
    System.out.println("异常抛出后输出!!!");
  }
}
