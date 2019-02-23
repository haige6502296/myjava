package com.lct;

public class Answers {
  private int id;
  private String name;
  private String by;

  public Answers() {
  }

  public Answers(int id, String name, String by) {
    this.id = id;
    this.name = name;
    this.by = by;
  }

  public String toString() {
    return id + ":" + name + "---" + by;
  }
}
