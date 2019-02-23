package com.lct;

/**
 * Created by amau at 2019-02-20 16:03 PM;
 * Description: Spring release5.1.5 ,Java release 1.8.0_202;
 * learning about ThrowAdvisor
 */
class Validator {
  void validate(int age) throws Exception {
    if (age < 18) {
      throw new ArithmeticException("非法年龄!");
    } else {
      System.out.println("投票有效.");
    }
  }
}
