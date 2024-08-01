package com.clairvoyant.project;

// The meaning of Encapsulation, is to make sure that "sensitive" data is hidden from users
public class Encapsulation {
  public static void main(String[] args) {
    User instance = new User( "anshacerbia");

    System.out.println(instance.username); // Returns "anshacerbia"
    // System.out.println(instance.password); -> produces an error
    System.out.println(instance.getPassword()); // Returns null
    // instance.password = "password"; -> produces an error
    instance.setPassword("password");
    System.out.println(instance.getPassword()); // Returns "password"
    instance.setPassword("nopassword");
    System.out.println(instance.getPassword()); // Returns "nopassword"
  }
}

class User {
  String username;
  private String password;

  User(String username) {
    this.username = username;
  }

  String getPassword() {
    return this.password;
  }

  void setPassword(String password) {
    this.password = password;
  }

  public static void main(String[] args) {
    User instance = new User("anshacerbia");

    System.out.println(instance.username); // Returns "anshacerbia"
    // Password will return null, it is still accessible because we are accessing it within the same class
    System.out.println(instance.password);
  }
}





