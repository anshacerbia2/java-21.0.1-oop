package com.clairvoyant.project;

/*
 * Inheritance lets us inherit attributes and methods from another class. Polymorphism uses those methods to perform
 * different ways.
 *
 * Polymorphism:
 * Concerns methods and their behaviors, allowing different classes to be treated through a common interface, typically
 * involving method overriding.
 * - Run-Time Polymorphism     : Achieved through method overriding, where a subclass provides a specific implementation
 *                               for a method already defined in its superclass.
 * - Compile-Time Polymorphism : Achieved through method overloading, where multiple methods have the same name but
 *                               different parameters within the same class.
 *
 * Note:
 * Adding attributes in a subclass that do not exist in the superclass is an aspect of inheritance and extending class
 * functionality, not polymorphism.
 */
public class Polymorphism {
  public static void main(String[] args) {
    Employee employee = new Employee("Ansha Cerbia");
    Manager ansha = new Manager("Ansha");
    Leader cerbia = new Leader("Cerbia", 17);
    Leader other = new Leader("Other", 20);

    employee.greeting("Ansha 1"); // Returns "Ansha 1"
    ansha.greeting("Ansha 2"); // Returns "Ansha 2"
    cerbia.greeting("Ansha 3"); // Returns "Ansha 3"
    other.greeting("Ansha 4"); // Returns "Ansha 4"

    // Type Check
    if (cerbia instanceof Leader leader) {
      leader.test(); // Returns "This is just testing"
      System.out.println(leader.name); // Returns "Cerbia"
      System.out.println(leader.age); // Returns 17

      leader.age += 1;
      System.out.println(leader.age); // Returns 18

    }

    // Type Check
    if (other instanceof Leader leader) {
      leader.test(); // "This is just testing"
      System.out.println(leader.name); // Returns "Other"
      System.out.println(leader.age); // Returns 20
    }

    employee.greeting(); // Returns "Hello Ansha Cerbia"
    ansha.greeting(); // Returns "Hello Manager Ansha"
    cerbia.greeting(); // Returns "Hello Leader Cerbia"

    Employee.typeCheck(employee); // Returns "Hello Ansha Cerbia"
    Employee.typeCheck(ansha); // Returns "Hello Manager Ansha"
    Employee.typeCheck(cerbia); // Returns "Hello Leader Cerbia"

    Employee.typeCheck2(employee); // Returns "Hello Ansha Cerbia"
    Employee.typeCheck2(ansha); // Returns "Hello Manager Ansha"
    Employee.typeCheck2(cerbia); // Returns "Hello Leader Cerbia"
  }
}


class Employee {
  String name;

  Employee(String name) {
    this.name = name;
  }

  /*
   * Compile-Time Polymorphism:
   * There is method overloading on superclass.
   * Overloading on subclass also considered as Compile-Time Polymorphism.
   */
  void greeting() {
    System.out.println("Hello " + this.name);
  }

  void greeting(String name) {
    System.out.println("Hello " + name);
  }

  /*
   * Type Check:
   * Important to prevent compile-time error because the method in subclass not defined in superclass. If there are
   * many subclasses with diverse methods different each other, make sure by using type check before calling it.
   */
  static void typeCheck(Employee instance) {
    if (instance instanceof Manager) {
      Manager manager = (Manager) instance;
      System.out.println("Hello Manager " + manager.name);
    } else if (instance instanceof Leader) {
      Leader leader = (Leader) instance;
      System.out.println("Hello Leader " + leader.name);
    } else {
      System.out.println("Hello " + instance.name);
    }
  }

  // Type check using "Pattern Variable"
  static void typeCheck2(Employee instance) {
    if (instance instanceof Manager manager) {
      System.out.println("Hello Manager " + manager.name);
    } else if (instance instanceof Leader leader) {
      System.out.println("Hello Leader " + leader.name);
    } else {
      System.out.println("Hello " + instance.name);
    }
  }
}

class Manager extends Employee {
  Manager(String name) {
    super(name);
  }

  // Run-Time Polymorphism
  void greeting() {
    System.out.println("Hello Manager " + this.name);
  }
}


class Leader extends Employee {
  // Additional attribute only on class Leader
  int age; // Not polymorphism

  Leader(String name, int age) {
    super(name);
    this.age = age;
  }

  // Run-Time Polymorphism
  void greeting() {
    System.out.println("Hello Leader " + this.name);
  }

  // Additional method only on class Leader
  void test() {
    System.out.println("This is just testing");
  }
}