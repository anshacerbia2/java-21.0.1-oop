package com.clairvoyant.project;

// If you are about to use public modifier on class, then it will match the filename
public class ClassAndObject {
  // Attributes/field
  String name = "Ansha";
  int age = 17;

  // Method
  void sayHello() {
    System.out.println("Hello World!");
  }

  public static void main(String[] args) {
    ClassAndObject instance = new ClassAndObject(); // Object creation

    System.out.println(instance.name); // Access object attribute, returns "Ansha"
    System.out.println(instance.age); // Returns 17

    instance.sayHello(); // Invoking object method, returns "Hello World!"
    instance.age += 1; // Modifying object attribute

    System.out.println(instance.age); // Returns 18
  }
}

/*
 * Class:
 * A class is a blueprint for creating objects. It defines a set of attributes (fields)
 * and methods that the created objects can use. Every class in java are subclass of class Object
 *
 * Object:
 * An object is an instance of a class. It represents a specific example of the class,
 * with its own values for the attributes defined by the class.
 */
