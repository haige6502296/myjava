package com.lct;

import java.util.Date;

public class Answers {
  private int id;
  private String answer;
  private Date postedDate;

  public Answers() {
  }

  public Answers(int id, String answer, Date postedDate) {
    super();
    this.id = id;
    this.answer = answer;
    this.postedDate = postedDate;
  }

  public String toString() {
    return "ID:" + id + ";" + "Answer:" + answer + ";" + "PostDate:" + postedDate;
  }
}
