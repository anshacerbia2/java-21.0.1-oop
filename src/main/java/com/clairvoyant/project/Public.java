package com.clairvoyant.project;

/*
 * Public Access Modifier:
 * - Accessible by any other class either in the same package/folder or not
 *
 * The class bellow accessed by class AccessModifier on package com.clairvoyant.project and AccessModifier2 on package
 * com.clairvoyant.project2
 */
public class Public {
  String fname = "Ansha";
  public String lname = "Cerbia";
  protected int age = 17;
  private String country = "Indonesia";
  void test() {
    System.out.println("On public class, private-package method");
  }

  public void test2() {
    System.out.println("On public class, public method");
  }

  protected void test3() {
    System.out.println("On public class, protected method");
  }

  private void test4() {
    System.out.println("On public class, private method");
  }

  public static void main(String[] args) {
    PublicGrandChild a = new PublicGrandChild() ;
    System.out.println(a.age);
  }
}

class PublicChild extends Public {
}

class PublicGrandChild extends PublicChild {
  public static void main(String[] args) {
    var a =  new PublicGrandChild();
    System.out.println(a.age);
  }
}