package com.clairvoyant.project;

/*
 * Default or Private-Package Access Modifier:
 * - Accessible by classes in the same package/folder
 *
 * The class bellow accessed by class AccessModifier on package com.clairvoyant.project and AccessModifier2 on package
 * com.clairvoyant.project2
 */
class PrivatePackage {
  String fname = "Ansha";
  public String lname = "Cerbia";
  protected int age = 17;
  private String country = "Indonesia";

  void test() {
    System.out.println("On private-package class, private-package method");
  }

  public void test2() {
    System.out.println("On private-package class, public method");
  }

  protected void test3() {
    System.out.println("On private-package class, protected method");
  }

  private void test4() {
    System.out.println("On private-package class, private method");
  }
}


class PrivatePackageChild extends Public {
}

class PrivatePackageGrandChild extends PublicChild {
}
