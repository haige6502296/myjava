package com.lct;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class TrackBusiness {
  @AfterReturning(

        pointcut = "execution(* Business.*(..))",//*和Business之间有空格
        returning = "result")

//import org.aspectj.lang.JoinPoint;不是import org.aopalliance.intercept.Joinpoint;
  public void myAdvice(JoinPoint jp,Object result){//it is advice (after returning advice)
  System.out.println("额外的关注点！");
  System.out.println("方法签名："+jp.getSignature()+"________________________");
    System.out.println("%%%%%%%---------"+jp.getKind());
    System.out.println("通知中的结果: "+result);
    System.out.println("在returning advice的末尾...");
  }
}
