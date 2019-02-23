package com.lct;

public class Operation {
public void valiAge(int age) throws  Exception{
  if(age<18){
    throw new IllegalArgumentException("未满18岁,不能投票!!!!!!!!!");
  }else{
    System.out.println("你已满18岁,谢谢你的投票!!!!!!");
  }
}
}
