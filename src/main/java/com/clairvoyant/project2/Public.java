package com.clairvoyant.project2;

/*
 * Summarize
 * Class with access modifier:
 * 1. Private-Package only accessible from any class in the same package
 * 2. Public are accessible from any class in any package
 *
 * Constructor with access modifier:
 * 1. Private-Package only accessible from any class in the same package
 * 2. Public are accessible from any class in any package
 * 3. Protected are accessible from:
 *    - The class itself
 *    - The instance of the class itself that created on the class itself
 *    - Any subclass in the same package
 *    - An instance of subclass (in different package) that created within the subclass itself
 * 4. Private only accessible from the class itself and the instance of the class itself that created on the class itself
 *
 * Note: Constructor are not inherited, So subclass can only invoke constructor of its direct parent.
 *
 * Attribute/Method with access modifier:
 * 1. Private-Package only accessible from any class in the same package. If it becomes an object Constructor/Attribute/
 *    Method, it only invokable if where none of its ancestors come from different
 *    package, even if its superclass root or direct parent are in the same package.
 * 2. Public are accessible from any class in any package
 * 3. Protected are accessible from:
 *    - The class itself
 *    - The instance of the class itself that created on the class itself
 *    - Any subclass in the same package
 *    - An instance of subclass (in different package) that created within the subclass itself
 * 4. Private only accessible from the class itself and the instance of the class itself that created on the class itself
 *
 * Attribute/Method with non-access modifier:
 * 1. Final: Attributes and methods cannot be overridden/modified
 * 2. Static: Attributes and methods belongs to the class, rather than an object
 *
 * Explanation:
 * Static Attributes (Class Variables): Static attributes are shared among all instances of a class. They are stored at
 *                                      the class level, meaning there is only one copy of the attribute regardless of
 *                                      how many instances of the class exist.
 * Instance Attributes                : Instance attributes are unique to each instance of the class. Each instance has
 *                                      its own copy of these attributes.
 * When you change the value of a static attribute, that change is reflected across all instances of the class.
 *
 * The class bellow accessed by class AccessModifier on package com.clairvoyant.project and AccessModifier2 on package
 * com.clairvoyant.project2
 */
public class Public {
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

  Public() {
  }

  public Public(String a) {
  }

  protected Public(String a, String b) {
    this("a", "b", "c"); // Private Constructor only invokable within the class itself
  }

  private Public(String a, String b, String c) {
  }

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

  //  public static void main(String[] args) {
//    /*
//     * Changing static attribute will implicate to the whole value of the instance
//     */
//    Public.a += 1;
//    Public.b += 1;
//    Public.c += 1;
//    Public.d += 1;
//
//    var a = new Public();
//    System.out.println(a.fname); // Returns "Ansha"
//    System.out.println(a.lname); // Returns "Cerbia"
//    System.out.println(a.age); // Returns 17
//    System.out.println(a.country); // Returns "Indonesia"
//
//    /*
//     * Final Modifier prevent Constructor/Attribute/Method to be reasign
//     * a.e += 1; -> Error: Cannot assign a value to final variable "e"
//     * a.f += 1; -> Error: Cannot assign a value to final variable "f"
//     * a.g += 1; -> Error: Cannot assign a value to final variable "g"
//     * a.h += 1; -> Error: Cannot assign a value to final variable "h"
//     */
//
//    System.out.println(a.a); // Returns 2
//    System.out.println(a.b); // Returns 3
//    System.out.println(a.c); // Return 4
//    System.out.println(a.d); // Returns 5
//    System.out.println(a.e); // Returns 1
//    System.out.println(a.f); // Returns 2
//    System.out.println(a.g); // Returns 3
//    System.out.println(a.h); // Returns 4
//
//    a.a += 1;
//    a.b += 1;
//    a.c += 1;
//    a.d += 1;
//
//    System.out.println(a.a); // Returns 3
//    System.out.println(a.b); // Returns 4
//    System.out.println(a.c); // Return 5
//    System.out.println(a.d); // Returns 6
//    System.out.println(Public.a); // Returns 3
//    System.out.println(Public.b); // Returns 4
//    System.out.println(Public.c); // Return 5
//    System.out.println(Public.d); // Returns 6
//
//    System.out.println(a.a); // Returns 2
//    System.out.println(a.b); // Returns 3
//    System.out.println(a.c); // Return 4
//    System.out.println(a.d); // Returns 5
//
//    a.test(); // Returns "On public class, private-package method"
//    a.test2(); // Returns "On public class, public method"
//    a.test3(); // Returns "On public class, protected method"
//    a.test4(); // Returns "On public class, private method"
//
//    a.a(); // Returns "Private-package static on public class, private method"
//    a.b(); // Returns "Public static on public class, private method"
//    a.c(); // Returns "Protected static on public class, private method"
//    a.d(); // Returns "Private static on public class, private method"
//
//  }

  public static void main(String[] args) {
    var a = new Public();
    System.out.println(a.fname); // Returns "Ansha"
    System.out.println(a.lname); // Returns "Cerbia"
    System.out.println(a.age); // Returns 17
    System.out.println(a.country); // Returns 17

    var b = new DirectSubClass();
    System.out.println(b.fname); // Returns "Ansha"
    System.out.println(b.lname); // Returns "Cerbia"
    System.out.println(b.age); // Returns 17
    System.out.println(b.country); // Returns 17

    var c = new IndirectSubClass();
    System.out.println(c.fname); // Returns "Ansha"
    System.out.println(c.lname); // Returns "Cerbia"
    System.out.println(c.age); // Returns 17
    System.out.println(c.country); // Returns 17

    var d = new AnotherIndirectSubClass1();
    System.out.println(d.fname); // Returns "Ansha"
    System.out.println(d.lname); // Returns "Cerbia"
    System.out.println(d.age); // Returns 17
    System.out.println(d.country); // Returns 17

    var e = new AnotherIndirectSubClass2();
    System.out.println(e.fname); // Returns "Ansha"
    System.out.println(e.lname); // Returns "Cerbia"
    System.out.println(e.age); // Returns 17
    System.out.println(e.country); // Returns 17

    var f = new AnotherIndirectSubClass3();
    System.out.println(f.fname); // Returns "Ansha"
    System.out.println(f.lname); // Returns "Cerbia"
    System.out.println(f.age); // Returns 17
    System.out.println(f.country); // Returns 17

    var g = new AnotherIndirectSubClass4();
    System.out.println(g.fname); // Returns "Ansha"
    System.out.println(g.lname); // Returns "Cerbia"
    System.out.println(g.age); // Returns 17
    System.out.println(g.country); // Returns 17

    var h = new com.clairvoyant.project3.DirectSubClass();
    System.out.println(h.fname); // Returns "Ansha"
    System.out.println(h.lname); // Returns "Cerbia"
    System.out.println(h.age); // Returns 17
    System.out.println(h.country); // Returns 17

    var i = new com.clairvoyant.project3.IndirectSubClass();
    System.out.println(i.fname); // Returns "Ansha"
    System.out.println(i.lname); // Returns "Cerbia"
    System.out.println(i.age); // Returns 17
    System.out.println(i.country); // Returns 17

    var j = new com.clairvoyant.project3.AnotherIndirectSubClass1();
    System.out.println(j.fname); // Returns "Ansha"
    System.out.println(j.lname); // Returns "Cerbia"
    System.out.println(j.age); // Returns 17
    System.out.println(j.country); // Returns 17

    var k = new com.clairvoyant.project3.AnotherIndirectSubClass2();
    System.out.println(k.fname); // Returns "Ansha"
    System.out.println(k.lname); // Returns "Cerbia"
    System.out.println(k.age); // Returns 17
    System.out.println(k.country); // Returns 17

    var l = new com.clairvoyant.project3.AnotherIndirectSubClass3();
    System.out.println(l.fname); // Returns "Ansha"
    System.out.println(l.lname); // Returns "Cerbia"
    System.out.println(l.age); // Returns 17
    System.out.println(l.country); // Returns 17

    var m = new com.clairvoyant.project3.AnotherIndirectSubClass4();
    System.out.println(m.fname); // Returns "Ansha"
    System.out.println(m.lname); // Returns "Cerbia"
    System.out.println(m.age); // Returns 17
    System.out.println(m.country); // Returns 17
  }
}