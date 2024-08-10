package com.clairvoyant.project2;

/*
 * SUMMARIZE
 *
 * Class with access modifier:
 * 1. Private-Package only accessible from any class in the same package
 * 2. Public are accessible from any class in any package
 *
 * Constructor with access modifier:
 * 1. Private-Package accessible by:
 *    - Any classes in same package with the class of the constructor
 * 2. Public accessible by:
 *    - Any classes in any package
 * 3. Protected accessible in:
 *    - Any classes in same package with the class of the constructor
 * 4. Private only accessible from within the class of the constructor
 * Note: Constructor are not inherited
 *
 * Non-Static Attribute/Method of an instance with access modifier:
 * 1. Private-Package accessible by:
 *    - Any classes in same package with the class that inherits the accessed attribute/method of the instance
 * 2. Public accessible by:
 *    - Any classes in any package
 * 3. Protected accessible by:
 *    - Neither class of the instance nor class ancestor of the instance (in same package with the class that inherits
 *      the accessed attribute/method)
 *    - Either class of the instance or class ancestor of the instance (in any package)
 * 4. Private accessible:
 *    - With setter and getter (by any classes in any package)
 *    - Without setter and getter (within the class that inherits the accessed attribute/method)
 * Note: Non-Static Attribute/Method always accessed through instance reference
 *
 * Attribute/Method with non-access modifier:
 * 1. Final   : Cannot be overridden/modified
 * 2. Static  : Belongs to the class, rather than an object
 *
 * Static Attribute/Method (via class/instance reference) with access modifier:
 * 1. Private-Package accessible by:
 *    - Any classes in same package with the reference (class/class of the instance)
 *      Important: The reference should not extend any classes outside the package
 * 2. Public accessible by:
 *    - Any classes in any package
 * 3. Protected accessible by:
 *    - Any subclasses of the class that inherits the accessed attribute/method of the reference (class/class of the
 *      instance) in any package
 *    - Any classes in same package with the class that inherits the accessed attribute/method of the reference
 *      (class/class of the instance)
 * 4. Private accessible:
 *    - With setter and getter (by any classes in any package)
 *    - Without setter and getter (within the class that inherits the accessed attribute/method)
 * Note: The class ancestors of the instance package will be considered, because accessing through the instance reference
 *
 * Static Attribute/Method (via class reference) with access modifier:
 * 1. Private-Package accessible by:
 *    - Any class in same package with the accessed class
 *      Important: The accessed class should not extend any classes outside the package
 * 2. Public accessible by:
 *    - Any classes in any package
 * 3. Protected accessible by:
 *    - Any Subclasses (direct/indirect) in different package from the accessed class
 *    - Any classes in same package with the accessed class
 * 4. Private accessible by:
 *    - Its own class
 * Note: The class ancestors of the accessed class package will be considered, because directly accessing the class reference
 *
 * Explanation:
 * Static Attributes (Class Variables): Static attributes are shared among all instances of a class. They are stored at
 *                                      the class level, meaning there is only one copy of the attribute regardless of
 *                                      how many instances of the class exist.
 * Instance Attributes                : Instance attributes are unique to each instance of the class. Each instance has
 *                                      its own copy of these attributes.
 * When you change the value of a static attribute, that change is reflected across all instances of the class.
 *
 * The class bellow accessed by class AccessModifier on package com.clairvoyant.project2 and AccessModifier2 on package
 * com.clairvoyant.project3
 */
public class Public {
  String fname = "Ansha";
  public String lname = "Cerbia";
  protected int age = 17;
  private String country = "Indonesia";

  static final int a = 1;
  public static final int b = 2;
  protected static final int c = 3;
  private static final int d = 4;

  Public() {
  }

  public Public(String a) {
  }

  protected Public(String a, String b) {
    this("a", "b", "c"); // Private Constructor only invokable within the class itself
  }

  private Public(String a, String b, String c) {
  }

  public String getCountry() {
    return this.country;
  }

  public void setCountry(String country) {
    this.country = country;
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
    System.out.println("On public class, private-package static method");
  }

  public static void b() {
    System.out.println("on public class, public static method");
  }

  protected static void c() {
    System.out.println("On public class, protected static method");
  }

  private static void d() {
    System.out.println("On public class, private static method");
  }

  public static void main(String[] args) {
    /*
     * Condition Belows (a, b, c, d, e, f, g): Same package with this class
     *
     * Constructor:
     * - Private-Package -> Accessible
     * - Public          -> Accessible
     * - Protected       -> Accessible
     * - Private         -> Not Accessible (Except a)
     *
     * Non-Static Attribute/Method,
     * Static Attribute/Method (via instance):
     * - Private-Package -> Accessible
     *                      - Except for f and g, because one of their ancestor (direct parent) is from different package
     * - Public          -> Accessible
     * - Protected       -> Accessible
     * - Private         -> Not Accessible (Except a)
     *   Note: Accessible via getter
     *
     * Static Attribute/Method (via superclass. e.g. Public.a):
     * - Private-Package -> Accessible
     * - Public          -> Accessible
     * - Protected       -> Accessible
     * - Private         -> Accessible
     */
    var a = new Public();
    System.out.println(a.fname); // Returns "Ansha"
    System.out.println(a.lname); // Returns "Cerbia"
    System.out.println(a.age); // Returns 17
    System.out.println(a.country); // Returns 17

    var b = new DirectSubClass();
    System.out.println(b.fname); // Returns "Ansha"
    System.out.println(b.lname); // Returns "Cerbia"
    System.out.println(b.age); // Returns 17

    var c = new IndirectSubClass();
    System.out.println(c.fname); // Returns "Ansha"
    System.out.println(c.lname); // Returns "Cerbia"
    System.out.println(c.age); // Returns 17

    var d = new AnotherIndirectSubClass1();
    System.out.println(d.fname); // Returns "Ansha"
    System.out.println(d.lname); // Returns "Cerbia"
    System.out.println(d.age); // Returns 17

    var e = new AnotherIndirectSubClass2();
    System.out.println(e.fname); // Returns "Ansha"
    System.out.println(e.lname); // Returns "Cerbia"
    System.out.println(e.age); // Returns 17

    var f = new AnotherIndirectSubClass3();
    System.out.println(f.lname); // Returns "Cerbia"
    System.out.println(f.age); // Returns 17

    var g = new AnotherIndirectSubClass4();
    System.out.println(g.lname); // Returns "Cerbia"
    System.out.println(g.age); // Returns 17

    /*
     * Condition Belows (h, i, j, k, l, m): Different package with this class
     *
     * Constructor:
     * - Private-Package -> Not Accessible
     * - Public          -> Accessible
     * - Protected       -> Not Accessible
     * - Private         -> Not Accessible
     *
     * Non-Static Attribute/Method,
     * Static Attribute/Method (via instance):
     * - Private-Package -> Not Accessible
     * - Public          -> Accessible
     * - Protected       -> Accessible
     * - Private         -> Not Accessible
     *   Note: Accessible via getter
     */
    var h = new com.clairvoyant.project3.DirectSubClass("");
    System.out.println(h.lname); // Returns "Cerbia"
    System.out.println(h.age); // Returns 17

    var i = new com.clairvoyant.project3.IndirectSubClass("");
    System.out.println(i.lname); // Returns "Cerbia"
    System.out.println(i.age); // Returns 17

    var j = new com.clairvoyant.project3.AnotherIndirectSubClass1("");
    System.out.println(j.lname); // Returns "Cerbia"
    System.out.println(j.age); // Returns 17

    var k = new com.clairvoyant.project3.AnotherIndirectSubClass2("");
    System.out.println(k.lname); // Returns "Cerbia"
    System.out.println(k.age); // Returns 17

    var l = new com.clairvoyant.project3.AnotherIndirectSubClass3("");
    System.out.println(l.lname); // Returns "Cerbia"
    System.out.println(l.age); // Returns 17

    var m = new com.clairvoyant.project3.AnotherIndirectSubClass4("");
    System.out.println(m.lname); // Returns "Cerbia"
    System.out.println(m.age); // Returns 17
  }
}
