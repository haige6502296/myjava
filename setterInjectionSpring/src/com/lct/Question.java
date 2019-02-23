package com.lct;


import java.util.List;

public class Question {
  private int id;
  private String name;
  private List<String> answers;

  //setters
  public void setId(int id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAnswers(List<String> answers) {
    this.answers = answers;
  }

  //getters
  void displayInfo() {
    System.out.println(id + " " + name);
    System.out.println("answers are:");
    for (String s : answers) {
      System.out.println(s);
    }
  }

}