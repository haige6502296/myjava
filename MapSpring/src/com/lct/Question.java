package com.lct;

import java.util.Map;
import java.util.Set;

public class Question {
  private int id;
  private String name;
  private Map<String, String> answers;

  public Question() {
  }

  public Question(int id, String name, Map<String, String> answers) {
    this.id = id;
    this.name = name;
    this.answers = answers;
  }

   void dipInfo() {
    System.out.println("Question is: " + id + " ," + name);
    System.out.println("The answers are...");
/*     Set<Entry<String, String>> set=answers.entrySet();
    Iterator<Entry<String, String>> itr=set.iterator();
      while(itr.hasNext()){
       Entry<String,String> entry=itr.next();
            System.out.println("Answer:"+entry.getKey()+" Posted By:"+entry.getValue());*/

//注意这里学习如何使用foreach循环输出Map.Entry entry的键值对
for (Map.Entry<String, String> entry : answers.entrySet()) {
      System.out.println("Answer:"+entry.getKey() + " posted by: " + entry.getValue());
    }
  }
}
