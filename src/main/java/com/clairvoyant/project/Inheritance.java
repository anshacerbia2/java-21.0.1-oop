package com.clairvoyant.project;

/*
 * Inheritance in Java Object-Oriented Programming (OOP) is a mechanism where a new class (subclass or derived class)
 * inherits attributes and methods from an existing class (superclass or base class). It allows for code reuse (reusable)
 * and the creation of a hierarchical relationship between classes.
 *
 * Key Points:
 * Superclass: The class being inherited from.
 * Subclass: The class that inherits from the superclass.
 * extends Keyword: Used to indicate that one class is inheriting from another.
 *
 * Important:
 * Subclass could only have 1 Superclass. However, Superclass may have many Subclass
 */
public class Inheritance {
  public static void main(String[] args) {
    SubClass sub = new SubClass();
    System.out.println(sub.name); // Returns "Ansha"
    System.out.println(sub.email); // Returns "l.anshacerbia@gmail.com"
    sub.greeting(); // Returns "Hello World!"
  }
}

class SuperClass {
  String name = "Ansha";
  String email = "l.anshacerbia@gmail.com";
}

class SubClass extends SuperClass {
  void greeting() {
    System.out.println("Hello World!");
  }
}
