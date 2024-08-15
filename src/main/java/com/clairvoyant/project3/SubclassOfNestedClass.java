package com.clairvoyant.project3;

import com.clairvoyant.project2.Public;

public class SubclassOfNestedClass extends Public.SIPExample.SIPExampleChild.SIPExampleGrandChild {
  /*
   * Constructor:
   * - Private-package: Not Accessible -> super()
   * - Public         : Accessible     -> super("a")
   * - Protected      : Accessible     -> super("a", "b")
   * - Private        : Not Accessible -> super("a", "b", "c")
   */
  SubclassOfNestedClass() {
    /*
     * super(); -> Error: SIPExampleGrandChild() is not public in com.clairvoyant.project2.Public.SIPExample.
     *                    SIPExampleChild.SIPExampleGrandChild. Cannot be accessed from outside package
     * Since the superclass parameterless constructor not accessible from here, and there are still another constructor
     * with params on parent, you need to call super within this constructor or error will occur: There is no
     * parameterless constructor available in com.clairvoyant.project2.Public.SIPExample.SIPExampleChild.SIPExampleGrandChild
     */
    super("a");
  }

  public SubclassOfNestedClass(String a) {
    super("a");
  }

  protected SubclassOfNestedClass(String a, String b) {
    this("a", "b", "c");
  }

  private SubclassOfNestedClass(String a, String b, String c) {
    /*
     * super("a", "b", "c"); -> Error: SIPExampleGrandChild(String a, String b, String c) in com.clairvoyant.project2.
     *                                 Public.SIPExample.SIPExampleChild.SIPExampleGrandChild has private access
     * Since the superclass parameterless constructor not accessible from here, and there are still another constructor
     * with params on parent, you need to call super within this constructor or error will occur: There is no
     * parameterless constructor available in com.clairvoyant.project2.Public.SIPExample.SIPExampleChild.SIPExampleGrandChild
     */
    super("a", "b");
  }

  void accessingNestedClass() {
    var xxx = this.new XXX();
    /*
     * This way will throw an error:
     * var yyy = new this.XXX.YYY();
     * var zzz = new this.ZZZ();
     * var www = new this.ZZZ.WWW();
     */
    var yyy = new XXX.YYY();
    var zzz = new ZZZ();
    var www = new ZZZ().new WWW();
  }

  public static void main(String[] args) {
    // NON-STATIC
    // Attributes
    var x = new Public.SIPExample();
    System.out.println(x.lname); // Returns "Cerbia"
    // Methods
    x.test2(); // Returns "On public static nested class, public method"

    // STATIC
    // Attributes via instance
    System.out.println(x.b); // Returns 2
    // Attributes via class
    System.out.println(Public.SIPExample.b); // Returns 2
    // Methods via instance
    x.b(); // Returns "On public static nested class, public method"
    // Methods via class
    Public.SIPExample.b(); // Returns "On public static nested class, public method"

    var y = new Public.SIPExample.SIPExampleChild.SIPExampleGrandChild("");
    // NON-STATIC
    // Attributes
    System.out.println(y.lname); // Returns "Cerbia"
    // Methods
    y.test2(); // Returns "On public static nested class, public method"

    // STATIC
    // Attributes via instance
    System.out.println(y.b); // Returns 2
    System.out.println(y.c); // Returns 3
    // Attributes via class
    System.out.println(Public.SIPExample.SIPExampleChild.SIPExampleGrandChild.b); // Returns 2
    System.out.println(Public.SIPExample.SIPExampleChild.SIPExampleGrandChild.c); // Returns 3
    // Methods via instance
    y.b(); // Returns "On public static nested class, public method"
    y.c(); // Returns "On public static nested class, protected method"
    // Methods via class
    Public.SIPExample.SIPExampleChild.SIPExampleGrandChild.b(); // Returns "On public static nested class, public method"
    Public.SIPExample.SIPExampleChild.SIPExampleGrandChild.c(); // Returns "On public static nested class, protected method"

    // Instance of SIPExampleChild through instance of Public
    var z = new Public.SIPExample().new SIPExampleChild("");
    // NON-STATIC
    // Attributes
    System.out.println(z.lname); // Returns "Cerbia"
    // Methods
    z.test2(); // Returns "On public inner class, public method"

    // STATIC
    // Attributes via instance
    System.out.println(z.b); // Returns 2
    // Attributes via class
    System.out.println(Public.SIPExample.SIPExampleChild.b); // Returns 2
    // Methods via instance
    z.b(); // Returns "On public inner class, public method"
    // Methods via class
    Public.SIPExample.SIPExampleChild.b(); // Returns "On public inner class, public method"

    /*
     * For a, b, c, d, e, f:
     *
     * Static Attribute/Method (via class):
     * - Private-Package -> Not Accessible
     * - Public          -> Accessible
     * - Protected       -> Accessible
     * - Private         -> Not Accessible
     *
     * Static Attribute/Method (via instance):
     * - Private-Package -> Not Accessible
     * - Public          -> Accessible
     * - Protected       -> Accessible
     * - Private         -> Not Accessible
     */

    /*
     * Each class of instances (a, b, c): Different package with this class
     *
     * Constructor:
     * - Private-Package -> Not Accessible
     * - Public          -> Accessible
     * - Protected       -> Not Accessible
     * - Private         -> Not Accessible
     *
     * Non-Static Attribute/Method:
     * - Private-Package -> Not Accessible
     * - Public          -> Accessible
     * - Protected       -> Not Accessible (Except c)
     * - Private         -> Not Accessible
     *   Note: Accessible via getter
     */
    var a = new com.clairvoyant.project2.SubclassOfNestedClass("");
    // NON-STATIC
    // Attributes
    System.out.println(a.lname); // Returns "Cerbia"
    // Methods
    a.test2(); // Returns "On public inner class, public method"

    // STATIC
    // Attributes via instance
    System.out.println(a.b); // Returns 2
    System.out.println(a.c); // Returns 3
    // Attributes via class
    System.out.println(com.clairvoyant.project2.SubclassOfNestedClass.b); // Returns 2
    System.out.println(com.clairvoyant.project2.SubclassOfNestedClass.c); // Returns 3
    // Methods via instance
    a.b(); // Returns "On public inner class, public method"
    a.c(); // Returns "On public inner class, protected method"
    // Methods via class
    com.clairvoyant.project2.SubclassOfNestedClass.b(); // Returns "On public inner class, public method"
    com.clairvoyant.project2.SubclassOfNestedClass.c(); // Returns "On public inner class, protected method"

    var b = new com.clairvoyant.project2.SubclassOfNestedClass2("");
    // NON-STATIC
    // Attributes
    System.out.println(b.lname); // Returns "Cerbia"
    // Methods
    b.test2(); // Returns "On public inner class, public method"

    // STATIC
    // Attributes via instance
    System.out.println(b.b); // Returns 2
    System.out.println(b.c); // Returns 3
    // Attributes via class
    System.out.println(com.clairvoyant.project2.SubclassOfNestedClass2.b); // Returns 2
    System.out.println(com.clairvoyant.project2.SubclassOfNestedClass2.c); // Returns 3
    // Methods via instance
    b.b(); // Returns "On public inner class, public method"
    b.c(); // Returns "On public inner class, protected method"
    // Methods via class
    com.clairvoyant.project2.SubclassOfNestedClass2.b(); // Returns "On public inner class, public method"
    com.clairvoyant.project2.SubclassOfNestedClass2.c(); // Returns "On public inner class, protected method"

    var c = new com.clairvoyant.project2.SubclassOfNestedClass3("");
    // NON-STATIC
    // Attributes
    System.out.println(c.lname); // Returns "Cerbia"
    System.out.println(c.age); // Returns 17
    // Methods
    c.test2(); // Returns "On public inner class, public method"
    c.test3(); // Returns "On public inner class, protected method"

    // STATIC
    // Attributes via instance
    System.out.println(c.b); // Returns 2
    System.out.println(c.c); // Returns 3
    // Attributes via class
    System.out.println(com.clairvoyant.project2.SubclassOfNestedClass3.b); // Returns 2
    System.out.println(com.clairvoyant.project2.SubclassOfNestedClass3.c); // Returns 3
    // Methods via instance
    c.b(); // Returns "On public inner class, public method"
    c.c(); // Returns "On public inner class, protected method"
    // Methods via class
    com.clairvoyant.project2.SubclassOfNestedClass3.b(); // Returns "On public inner class, public method"
    com.clairvoyant.project2.SubclassOfNestedClass3.c(); // Returns "On public inner class, protected method"

    /*
     * Each class of instances (d, e, f): Same package with this class
     *
     * Constructor:
     * - Private-Package -> Accessible
     * - Public          -> Accessible
     * - Protected       -> Accessible
     * - Private         -> Not Accessible (Except d)
     *
     * Non-Static Attribute/Method:
     * - Private-Package -> Not Accessible
     * - Public          -> Accessible
     * - Protected       -> Accessible (Except d and e)
     * - Private         -> Not Accessible
     *   Note: Accessible via getter
     */
    var d = new SubclassOfNestedClass();
    // NON-STATIC
    // Attributes
    System.out.println(d.lname); // Returns "Cerbia"
    System.out.println(d.age); // Returns 17
    // Methods
    d.test2(); // Returns "On public inner class, public method"
    d.test3(); // Returns "On public inner class, protected method"

    // STATIC
    // Attributes via instance
    System.out.println(d.b); // Returns 2
    System.out.println(d.c); // Returns 3
    // Attributes via class
    System.out.println(SubclassOfNestedClass.b); // Returns 2
    System.out.println(SubclassOfNestedClass.c); // Returns 3
    // Methods via instance
    d.b(); // Returns "On public inner class, public method"
    d.c(); // Returns "On public inner class, protected method"
    // Methods via class
    SubclassOfNestedClass.b(); // Returns "On public inner class, public method"
    SubclassOfNestedClass.c(); // Returns "On public inner class, protected method"

    var e = new SubclassOfNestedClass2();
    // NON-STATIC
    // Attributes
    System.out.println(e.lname); // Returns "Cerbia"
    System.out.println(e.age); // Returns 17
    // Methods
    e.test2(); // Returns "On public inner class, public method"
    e.test3(); // Returns "On public inner class, protected method"

    // STATIC
    // Attributes via instance
    System.out.println(e.b); // Returns 2
    System.out.println(e.c); // Returns 3
    // Attributes via class
    System.out.println(SubclassOfNestedClass2.b); // Returns 2
    System.out.println(SubclassOfNestedClass2.c); // Returns 3
    // Methods via instance
    e.b(); // Returns "On public inner class, public method"
    e.c(); // Returns "On public inner class, protected method"
    // Methods via class
    SubclassOfNestedClass2.b(); // Returns "On public inner class, public method"
    SubclassOfNestedClass2.c(); // Returns "On public inner class, protected method"

    var f = new SubclassOfNestedClass3();
    // NON-STATIC
    // Attributes
    System.out.println(f.lname); // Returns "Cerbia"
    // Methods
    f.test2(); // Returns "On public inner class, public method"

    // STATIC
    // Attributes via instance
    System.out.println(f.b); // Returns 2
    System.out.println(f.c); // Returns 3
    // Attributes via class
    System.out.println(SubclassOfNestedClass3.b); // Returns 2
    System.out.println(SubclassOfNestedClass3.c); // Returns 3
    // Methods via instance
    f.b(); // Returns "On public inner class, public method"
    f.c(); // Returns "On public inner class, protected method"
    // Methods via class
    SubclassOfNestedClass3.b(); // Returns "On public inner class, public method"
    SubclassOfNestedClass3.c(); // Returns "On public inner class, protected method"
  }
}
