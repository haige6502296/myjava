package com.lct;

public class Business {
  void methodB(int age) throws Exception {//写漏了throws Exception
    if (age < 18) {
      throw new IllegalArgumentException("无效的投票年龄!!");
    } else {
      System.out.println("谢谢你的投票!");
    }
  }
}
