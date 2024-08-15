package com.clairvoyant.project2;

public class SubclassOfNestedClass extends Public.SIPExample.SIPExampleChild.SIPExampleGrandChild {
  /*
   * Constructor:
   * - Private-package: Accessible     -> super()
   * - Public         : Accessible     -> super("a")
   * - Protected      : Accessible     -> super("a", "b")
   * - Private        : Not Accessible -> super("a", "b", "c")
   */
  SubclassOfNestedClass() {
    super();
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
     */
  }

  public static void main(String[] args) {
    var x = new Public.SIPExample();
    // NON-STATIC
    // Attributes
    System.out.println(x.fname); // Returns "Ansha"
    System.out.println(x.lname); // Returns "Cerbia"
    System.out.println(x.age); // Returns 17
    // Methods
    x.test(); // Returns "On public static nested class, private-package method"
    x.test2(); // Returns "On public static nested class, public method"
    x.test3(); // Returns "On public static nested class, protected method"

    // STATIC
    // Attributes via instance
    System.out.println(x.a); // Returns 1
    System.out.println(x.b); // Returns 2
    System.out.println(x.c); // Returns 3
    // Attributes via class
    System.out.println(Public.SIPExample.a); // Returns 1
    System.out.println(Public.SIPExample.b); // Returns 2
    System.out.println(Public.SIPExample.c); // Returns 3
    // Methods via instance
    x.a(); // Returns "On public static nested class, private-package method"
    x.b(); // Returns "On public static nested class, public method"
    x.c(); // Returns "On public static nested class, protected method"
    // Methods via class
    Public.SIPExample.a(); // Returns "On public static nested class, private-package method"
    Public.SIPExample.b(); // Returns "On public static nested class, public method"
    Public.SIPExample.c(); // Returns "On public static nested class, protected method"

    var y = new Public.SIPExample.SIPExampleChild.SIPExampleGrandChild();
    // NON-STATIC
    // Attributes
    System.out.println(y.fname); // Returns "Ansha"
    System.out.println(y.lname); // Returns "Cerbia"
    System.out.println(y.age); // Returns 17
    // Methods
    y.test(); // Returns "On public static nested class, private-package method"
    y.test2(); // Returns "On public static nested class, public method"
    y.test3(); // Returns "On public static nested class, protected method"

    // STATIC
    // Attributes via instance
    System.out.println(y.a); // Returns 1
    System.out.println(y.b); // Returns 2
    System.out.println(y.c); // Returns 3
    // Attributes via class
    System.out.println(Public.SIPExample.SIPExampleChild.SIPExampleGrandChild.a); // Returns 1
    System.out.println(Public.SIPExample.SIPExampleChild.SIPExampleGrandChild.b); // Returns 2
    System.out.println(Public.SIPExample.SIPExampleChild.SIPExampleGrandChild.c); // Returns 3
    // Methods via instance
    y.a(); // Returns "On public static nested class, private-package method"
    y.b(); // Returns "On public static nested class, public method"
    y.c(); // Returns "On public static nested class, protected method"
    // Methods via class
    Public.SIPExample.SIPExampleChild.SIPExampleGrandChild.a(); // Returns "On public static nested class, private-package method"
    Public.SIPExample.SIPExampleChild.SIPExampleGrandChild.b(); // Returns "On public static nested class, public method"
    Public.SIPExample.SIPExampleChild.SIPExampleGrandChild.c(); // Returns "On public static nested class, protected method"

    var z = new Public.SIPExample().new SIPExampleChild();
    // NON-STATIC
    // Attributes
    System.out.println(z.fname); // Returns "Ansha"
    System.out.println(z.lname); // Returns "Cerbia"
    System.out.println(z.age); // Returns 17
    // Methods
    z.test(); // Returns "On public inner class, private-package method"
    z.test2(); // Returns "On public inner class, public method"
    z.test3(); // Returns "On public inner class, protected method"

    // STATIC
    // Attributes via instance
    System.out.println(z.a); // Returns 1
    System.out.println(z.b); // Returns 2
    System.out.println(z.c); // Returns 3
    // Methods via instance
    System.out.println(Public.SIPExample.SIPExampleChild.a); // Returns 1
    System.out.println(Public.SIPExample.SIPExampleChild.b); // Returns 2
    System.out.println(Public.SIPExample.SIPExampleChild.c); // Returns 3
    z.a(); // Returns "On public inner class, private-package method"
    z.b(); // Returns "On public inner class, public method"
    z.c(); // Returns "On public inner class, protected method"
    // Methods via class
    Public.SIPExample.SIPExampleChild.a(); // Returns "On public inner class, private-package method"
    Public.SIPExample.SIPExampleChild.b(); // Returns "On public inner class, public method"
    Public.SIPExample.SIPExampleChild.c(); // Returns "On public inner class, protected method"

    /*
     * For a, b, c, d, e, f:
     *
     * Static Attribute/Method (via class):
     * - Private-Package -> Not Accessible (Except a and b)
     * - Public          -> Accessible
     * - Protected       -> Accessible
     * - Private         -> Not Accessible
     *
     * Static Attribute/Method (via instance):
     * - Private-Package -> Not Accessible (Except a and b)
     * - Public          -> Accessible
     * - Protected       -> Accessible
     * - Private         -> Not Accessible
     */

    /*
     * Each class of instances (a, b, c): Same package with this class
     *
     * Constructor:
     * - Private-Package -> Accessible
     * - Public          -> Accessible
     * - Protected       -> Accessible
     * - Private         -> Not Accessible (Except a)
     *
     * Non-Static Attribute/Method:
     * - Private-Package -> Accessible (Except c)
     * - Public          -> Accessible
     * - Protected       -> Accessible
     * - Private         -> Not Accessible
     *   Note: Accessible via getter
     */
    var a = new SubclassOfNestedClass();
    // NON-STATIC
    // Attributes
    System.out.println(a.fname); // Returns "Ansha"
    System.out.println(a.lname); // Returns "Cerbia"
    System.out.println(a.age); // Returns 17
    // Methods
    a.test(); // Returns "On public inner class, private-package method"
    a.test2(); // Returns "On public inner class, public method"
    a.test3(); // Returns "On public inner class, protected method"

    // STATIC
    // Attributes via instance
    System.out.println(a.a); // Returns 1
    System.out.println(a.b); // Returns 2
    System.out.println(a.c); // Returns 3
    // Attributes via class
    System.out.println(SubclassOfNestedClass.a); // Returns 1
    System.out.println(SubclassOfNestedClass.b); // Returns 2
    System.out.println(SubclassOfNestedClass.c); // Returns 3
    // Methods via instance
    a.a(); // Returns "On public inner class, private-package method"
    a.b(); // Returns "On public inner class, public method"
    a.c(); // Returns "On public inner class, protected method"
    // Methods via class
    SubclassOfNestedClass.a(); // Returns "On public inner class, private-package method"
    SubclassOfNestedClass.b(); // Returns "On public inner class, public method"
    SubclassOfNestedClass.c(); // Returns "On public inner class, protected method"

    var b = new SubclassOfNestedClass2();
    // NON-STATIC
    // Attributes
    System.out.println(b.fname); // Returns "Ansha"
    System.out.println(b.lname); // Returns "Cerbia"
    System.out.println(b.age); // Returns 17
    // Methods
    b.test(); // Returns "On public inner class, private-package method"
    b.test2(); // Returns "On public inner class, public method"
    b.test3(); // Returns "On public inner class, protected method"

    // STATIC
    // Attributes via instance
    System.out.println(b.a); // Returns 1
    System.out.println(b.b); // Returns 2
    System.out.println(b.c); // Returns 3
    // Attributes via class
    System.out.println(SubclassOfNestedClass2.a); // Returns 1
    System.out.println(SubclassOfNestedClass2.b); // Returns 2
    System.out.println(SubclassOfNestedClass2.c); // Returns 3
    // Methods via instance
    b.a(); // Returns "On public inner class, private-package method"
    b.b(); // Returns "On public inner class, public method"
    b.c(); // Returns "On public inner class, protected method"
    // Methods via class
    SubclassOfNestedClass2.a(); // Returns "On public inner class, private-package method"
    SubclassOfNestedClass2.b(); // Returns "On public inner class, public method"
    SubclassOfNestedClass2.c(); // Returns "On public inner class, protected method"

    var c = new SubclassOfNestedClass3();
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
    System.out.println(SubclassOfNestedClass3.b); // Returns 2
    System.out.println(SubclassOfNestedClass3.c); // Returns 3
    // Methods via instance
    c.b(); // Returns "On public inner class, public method"
    c.c(); // Returns "On public inner class, protected method"
    // Methods via class
    SubclassOfNestedClass3.b(); // Returns "On public inner class, public method"
    SubclassOfNestedClass3.c(); // Returns "On public inner class, protected method"

    /*
     * Each class of instances (d, e, f): Different package with this class
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
     * - Protected       -> Accessible
     * - Private         -> Not Accessible
     *   Note: Accessible via getter
     */
    var d = new com.clairvoyant.project3.SubclassOfNestedClass("");
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
    System.out.println(com.clairvoyant.project3.SubclassOfNestedClass.b); // Returns 2
    System.out.println(com.clairvoyant.project3.SubclassOfNestedClass.c); // Returns 3
    // Methods via instance
    d.b(); // Returns "On public inner class, public method"
    d.c(); // Returns "On public inner class, protected method"
    // Methods via class
    com.clairvoyant.project3.SubclassOfNestedClass.b(); // Returns "On public inner class, public method"
    com.clairvoyant.project3.SubclassOfNestedClass.c(); // Returns "On public inner class, protected method"

    var e = new com.clairvoyant.project3.SubclassOfNestedClass2("");
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
    System.out.println(com.clairvoyant.project3.SubclassOfNestedClass2.b); // Returns 2
    System.out.println(com.clairvoyant.project3.SubclassOfNestedClass2.c); // Returns 3
    // Methods via instance
    e.b(); // Returns "On public inner class, public method"
    e.c(); // Returns "On public inner class, protected method"
    // Methods via class
    com.clairvoyant.project3.SubclassOfNestedClass2.b(); // Returns "On public inner class, public method"
    com.clairvoyant.project3.SubclassOfNestedClass2.c(); // Returns "On public inner class, protected method"

    var f = new com.clairvoyant.project3.SubclassOfNestedClass3("");
    // NON-STATIC
    // Attributes
    System.out.println(f.lname); // Returns "Cerbia"
    System.out.println(f.age); // Returns 17
    // Methods
    f.test2(); // Returns "On public inner class, public method"
    f.test3(); // Returns "On public inner class, protected method"

    // STATIC
    // Attributes via instance
    System.out.println(f.b); // Returns 2
    System.out.println(f.c); // Returns 3
    // Attributes via class
    System.out.println(com.clairvoyant.project3.SubclassOfNestedClass3.b); // Returns 2
    System.out.println(com.clairvoyant.project3.SubclassOfNestedClass3.c); // Returns 3
    // Methods via instance
    f.b(); // Returns "On public inner class, public method"
    f.c(); // Returns "On public inner class, protected method"
    // Methods via class
    com.clairvoyant.project3.SubclassOfNestedClass3.b(); // Returns "On public inner class, public method"
    com.clairvoyant.project3.SubclassOfNestedClass3.c(); // Returns "On public inner class, protected method"
  }
}
