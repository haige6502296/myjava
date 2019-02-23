package com.lct;

import java.util.Map;

public class Question {
  private int id;
  private String question;
  private Map<Answers, Users> answersUsersMap;

  public Question() {
  }

  public Question(int id, String question, Map<Answers, Users> answersUsersMap) {
    super();
    this.id = id;
    this.question = question;
    this.answersUsersMap = answersUsersMap;
  }

  void dispInfo() {
    System.out.println("Question id :" + id);
    System.out.println("Question name:" + question);
    System.out.println("Answers.... ");

    for (Map.Entry<Answers, Users> entry : answersUsersMap.entrySet()) {
      System.out.println("Answer: " + entry.getKey());
      System.out.println("User: " + entry.getValue());
    }
  }
}
