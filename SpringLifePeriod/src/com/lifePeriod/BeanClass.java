package com.lifePeriod;

public class BeanClass {
  private String msg;
  public void  setMsg(String msg){
    this.msg=msg;
  }
  public  void  getMsg(){
    System.out.println("It's a getMsg Method from the Bean:   "+msg);
  }
  public  void  initBean(){
    System.out.println("Attention: the bean is going to initialize!");
  }
  public  void  destroyBean(){
    System.out.println("The time  to destory the bean is coming!");
  }
}
