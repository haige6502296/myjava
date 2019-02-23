package com.lct;

public class Users {
  private int id;
  private String name, email;

  public Users() {
  }

  public Users(int id, String name, String email) {
    super();
    this.id = id;
    this.name = name;
    this.email = email;
  }

  public String toString() {
    return "UserID:" + id + ";" + "UserName:" + name + ";" + "E-mail:" + email;
  }
}
