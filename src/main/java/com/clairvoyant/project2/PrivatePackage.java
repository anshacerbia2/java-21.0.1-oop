package com.clairvoyant.project2;

/*
 * Summarize
 * Class with access modifier:
 * 1. Private-Package only accessible from any class in the same package
 * 2. Public are accessible from any class in any package
 * Constructor/Attribute/Method with access modifier:
 * 1. Private-Package only accessible from any class in the same package
 * 2. Public are accessible from any class in any package
 * 3. Protected are accessible from:
 *    - The class itself
 *    - The instance of the class itself that created on the class itself
 *    - Any subclass in the same package
 *    - An instance of subclass (in different package) that created within the subclass itself
 * 4. Private only accessible from the class itself and the instance of the class itself that created on the class itself
 *
 * The class bellow accessed by class AccessModifier on package com.clairvoyant.project and AccessModifier2 on package
 * com.clairvoyant.project2
 */
class PrivatePackage {
  String fname = "Ansha";
  public String lname = "Cerbia";
  protected int age = 17;
  private String country = "Indonesia";

  static int a = 1;
  public static int b = 2;
  protected static int c = 3;
  private static int d = 4;

  static final int e = 1;
  public static final int f = 2;
  protected static final int g = 3;
  private static final int h = 4;

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

  static void a() {
    System.out.println("Private-package static on public class, private method");
  }

  public static void b() {
    System.out.println("Public static on public class, private method");
  }

  protected static void c() {
    System.out.println("Protected static on public class, private method");
  }

  private static void d() {
    System.out.println("Private static on public class, private method");
  }

  public static void main(String[] args) {
    var a = new PrivatePackage();
    System.out.println(a.fname); // Returns "Ansha"
    System.out.println(a.lname); // Returns "Cerbia"
    System.out.println(a.age); // Returns 17
    System.out.println(a.country); // Returns "Indonesia"

    a.a += 1;
    a.b += 1;
    a.c += 1;
    a.d += 1;

    /*
     * Final Modifier prevent Constructor/Attribute/Method to be reasign
     * a.e += 1; -> Error: Cannot assign a value to final variable "e"
     * a.f += 1; -> Error: Cannot assign a value to final variable "f"
     * a.g += 1; -> Error: Cannot assign a value to final variable "g"
     * a.h += 1; -> Error: Cannot assign a value to final variable "h"
     */

    System.out.println(a.a); // Returns 2
    System.out.println(a.b); // Returns 3
    System.out.println(a.c); // Return 4
    System.out.println(a.d); // Returns 5
    System.out.println(a.e); // Returns 1
    System.out.println(a.f); // Returns 2
    System.out.println(a.g); // Returns 3
    System.out.println(a.h); // Returns 4

  }
}
