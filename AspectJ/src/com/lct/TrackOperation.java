package com.lct;
//必须添加aspectjrt.jar文件到libraries

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;


@Aspect
public class TrackOperation {

  @Pointcut ("execution(* Operation.msg(..))")
  public void m(){}//pointcut name

  @Before("m()")//applying pointcut on before advice
  public  void  myAdvice(){
    System.out.println("额外的关注点被打印在希望出现的地方------------------------- ");
    //System.out.println("Method Signature: "  + jp.getSignature());
  }
}
