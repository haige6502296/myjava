package com.SpringProcessor;

public class BeanClass {
  private String msg;

  public void setMsg(String msg) {
    this.msg = msg;
  }

  public void getMsg() {
    System.out.println("getMsg方法的调用结果:"+msg);
  }

  public void initBean() {
    System.out.println("初始化Bean的方法");
  }

  public void destoryBean() {
    System.out.println("销毁Bean的方法");
  }
}

