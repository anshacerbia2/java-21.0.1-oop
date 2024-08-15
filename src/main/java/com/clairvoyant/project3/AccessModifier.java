package com.clairvoyant.project3;

// import com.clairvoyant.project2.PrivatePackage; -> Error: Cannot be accessed from outside package

import com.clairvoyant.project2.Public;

public class AccessModifier {
  public static void main(String[] args) {
    /*
     * For a, b, c, d, e, f, g, h, i, j, k, l, m:
     *
     * Static Attribute/Method (via class):
     * - Private-Package -> Not Accessible
     * - Public          -> Accessible
     * - Protected       -> Not Accessible
     * - Private         -> Not Accessible
     *
     * Static Attribute/Method (via instance):
     * - Private-Package -> Not Accessible
     * - Public          -> Accessible
     * - Protected       -> Not Accessible
     * - Private         -> Not Accessible
     */

    /*
     * Each class of instances (a, b, c, d, e, f, g): Different package with this class
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
     * - Protected       -> Not Accessible
     * - Private         -> Not Accessible
     *   Note: Accessible via getter
     */
    var a = new com.clairvoyant.project2.Public("");
    // NON-STATIC
    // Attributes
    System.out.println(a.lname); // Returns "Cerbia"
    // Methods
    a.test2(); // Returns "On public class, public method"

    // STATIC
    // Attributes via instance
    System.out.println(a.b); // Returns 2
    // Attributes via class
    System.out.println(com.clairvoyant.project2.Public.b); // Returns 2
    // Methods via instance
    a.b(); // Returns "On public class, public static method"
    // Methods via class
    com.clairvoyant.project2.Public.b(); // Returns "On public class, public static method"

    var b = new com.clairvoyant.project2.DirectSubClass("");
    // NON-STATIC
    // Attributes
    System.out.println(b.lname); // Returns "Cerbia"
    // Methods
    b.test2(); // Returns "On public class, public method"

    // STATIC
    // Attributes via instance
    System.out.println(b.b); // Returns 2
    // Attributes via class
    System.out.println(com.clairvoyant.project2.DirectSubClass.b); // Returns 2
    // Methods via instance
    b.b(); // Returns "On public class, public static method"
    // Methods via class
    com.clairvoyant.project2.DirectSubClass.b(); // Returns "On public class, public static method"

    var c = new com.clairvoyant.project2.IndirectSubClass("");
    // NON-STATIC
    // Attributes
    System.out.println(c.lname); // Returns "Cerbia"
    // Methods
    c.test2(); // Returns "On public class, public method"

    // STATIC
    // Attributes via instance
    System.out.println(c.b); // Returns 2
    // Attributes via class
    System.out.println(com.clairvoyant.project2.IndirectSubClass.b); // Returns 2
    // Methods via instance
    c.b(); // Returns "On public class, public static method"
    // Methods via class
    com.clairvoyant.project2.IndirectSubClass.b(); // Returns "On public class, public static method"

    var d = new com.clairvoyant.project2.AnotherIndirectSubClass1("");
    // NON-STATIC
    // Attributes
    System.out.println(d.lname); // Returns "Cerbia"
    // Methods
    d.test2(); // Returns "On public class, public method"

    // STATIC
    // Attributes via instance
    System.out.println(d.b); // Returns 2
    // Attributes via class
    System.out.println(com.clairvoyant.project2.AnotherIndirectSubClass1.b); // Returns 2
    // Methods via instance
    d.b(); // Returns "On public class, public static method"
    // Methods via class
    com.clairvoyant.project2.AnotherIndirectSubClass1.b(); // Returns "On public class, public static method"

    var e = new com.clairvoyant.project2.AnotherIndirectSubClass2("");
    // NON-STATIC
    // Attributes
    System.out.println(e.lname); // Returns "Cerbia"
    // Methods
    e.test2(); // Returns "On public class, public method"

    // STATIC
    // Attributes via instance
    System.out.println(e.b); // Returns 2
    // Attributes via class
    System.out.println(com.clairvoyant.project2.AnotherIndirectSubClass2.b); // Returns 2
    // Methods via instance
    e.b(); // Returns "On public class, public static method"
    // Methods via class
    com.clairvoyant.project2.AnotherIndirectSubClass2.b(); // Returns "On public class, public static method"

    var f = new com.clairvoyant.project2.AnotherIndirectSubClass3("");
    // NON-STATIC
    // Attributes
    System.out.println(f.lname); // Returns "Cerbia"
    // Methods
    f.test2(); // Returns "On public class, public method"

    // STATIC
    // Attributes via instance
    System.out.println(f.b); // Returns 2
    // Attributes via class
    System.out.println(com.clairvoyant.project2.AnotherIndirectSubClass3.b); // Returns 2
    // Methods via instance
    f.b(); // Returns "On public class, public static method"
    // Methods via class
    com.clairvoyant.project2.AnotherIndirectSubClass3.b(); // Returns "On public class, public static method"

    var g = new com.clairvoyant.project2.AnotherIndirectSubClass4("");
    // NON-STATIC
    // Attributes
    System.out.println(g.lname); // Returns "Cerbia"
    // Methods
    g.test2(); // Returns "On public class, public method"

    // STATIC
    // Attributes via instance
    System.out.println(g.b); // Returns 2
    // Attributes via class
    System.out.println(com.clairvoyant.project2.AnotherIndirectSubClass4.b); // Returns 2
    // Methods via instance
    g.b(); // Returns "On public class, public static method"
    // Methods via class
    com.clairvoyant.project2.AnotherIndirectSubClass4.b(); // Returns "On public class, public static method"

    /*
     * Each class of instances (h, i, j, k, l, m): Same package with this class
     *
     * Constructor:
     * - Private-Package -> Accessible
     * - Public          -> Accessible
     * - Protected       -> Accessible
     * - Private         -> Not Accessible
     *
     * Non-Static Attribute/Method:
     * - Private-Package -> Not Accessible
     * - Public          -> Accessible
     * - Protected       -> Not Accessible
     * - Private         -> Not Accessible
     *   Note: Accessible via getter
     */
    var h = new DirectSubClass();
    // NON-STATIC
    // Attributes
    System.out.println(h.lname); // Returns "Cerbia"
    // Methods
    h.test2(); // Returns "On public class, public method"

    // STATIC
    // Attributes via instance
    System.out.println(h.b); // Returns 2
    // Attributes via class
    System.out.println(DirectSubClass.b); // Returns 2
    // Methods via instance
    h.b(); // Returns "On public class, public static method"
    // Methods via class
    DirectSubClass.b(); // Returns "On public class, public static method"

    var i = new IndirectSubClass();
    // NON-STATIC
    // Attributes
    System.out.println(i.lname); // Returns "Cerbia"
    // Methods
    i.test2(); // Returns "On public class, public method"

    // STATIC
    // Attributes via instance
    System.out.println(i.b); // Returns 2
    // Attributes via class
    System.out.println(IndirectSubClass.b); // Returns 2
    // Methods via instance
    i.b(); // Returns "On public class, public static method"
    // Methods via class
    IndirectSubClass.b(); // Returns "On public class, public static method"

    var j = new AnotherIndirectSubClass1();
    // NON-STATIC
    // Attributes
    System.out.println(j.lname); // Returns "Cerbia"
    // Methods
    j.test2(); // Returns "On public class, public method"

    // STATIC
    // Attributes via instance
    System.out.println(j.b); // Returns 2
    // Attributes via class
    System.out.println(AnotherIndirectSubClass1.b); // Returns 2
    // Methods via instance
    j.b(); // Returns "On public class, public static method"
    // Methods via class
    AnotherIndirectSubClass1.b(); // Returns "On public class, public static method"

    var k = new AnotherIndirectSubClass2();
    // NON-STATIC
    // Attributes
    System.out.println(k.lname); // Returns "Cerbia"
    // Methods
    k.test2(); // Returns "On public class, public method"

    // STATIC
    // Attributes via instance
    System.out.println(k.b); // Returns 2
    // Attributes via class
    System.out.println(AnotherIndirectSubClass2.b); // Returns 2
    // Methods via instance
    k.b(); // Returns "On public class, public static method"
    // Methods via class
    AnotherIndirectSubClass2.b(); // Returns "On public class, public static method"

    var l = new AnotherIndirectSubClass3();
    // NON-STATIC
    // Attributes
    System.out.println(l.lname); // Returns "Cerbia"
    // Methods
    l.test2(); // Returns "On public class, public method"

    // STATIC
    // Attributes via instance
    System.out.println(l.b); // Returns 2
    // Attributes via class
    System.out.println(AnotherIndirectSubClass3.b); // Returns 2
    // Methods via instance
    l.b(); // Returns "On public class, public static method"
    // Methods via class
    AnotherIndirectSubClass3.b(); // Returns "On public class, public static method"

    var m = new AnotherIndirectSubClass4();
    // NON-STATIC
    // Attributes
    System.out.println(m.lname); // Returns "Cerbia"
    // Methods
    m.test2(); // Returns "On public class, public method"

    // STATIC
    // Attributes via instance
    System.out.println(m.b); // Returns 2
    // Attributes via class
    System.out.println(AnotherIndirectSubClass4.b); // Returns 2
    // Methods via instance
    m.b(); // Returns "On public class, public static method"
    // Methods via class
    AnotherIndirectSubClass4.b(); // Returns "On public class, public static method"

    // NESTED CLASS
    var x = new Public.SIPExample();
    // NON-STATIC
    // Attributes
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
    // Attributes via class
    System.out.println(Public.SIPExample.SIPExampleChild.SIPExampleGrandChild.b); // Returns 2
    // Methods via instance
    y.b(); // Returns "On public static nested class, public method"
    // Methods via class
    Public.SIPExample.SIPExampleChild.SIPExampleGrandChild.b(); // Returns "On public static nested class, public method"

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
     * - Protected       -> Not Accessible
     * - Private         -> Not Accessible
     *
     * Static Attribute/Method (via instance):
     * - Private-Package -> Not Accessible
     * - Public          -> Accessible
     * - Protected       -> Not Accessible
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
     * - Protected       -> Not Accessible
     * - Private         -> Not Accessible
     *   Note: Accessible via getter
     */
    var aa = new com.clairvoyant.project2.SubclassOfNestedClass("");
    // NON-STATIC
    // Attributes
    System.out.println(aa.lname); // Returns "Cerbia"
    // Methods
    aa.test2(); // Returns "On public inner class, public method"

    // STATIC
    // Attributes via instance
    System.out.println(aa.b); // Returns 2
    // Attributes via class
    System.out.println(com.clairvoyant.project2.SubclassOfNestedClass.b); // Returns 2
    // Methods via instance
    aa.b(); // Returns "On public inner class, public method"
    // Methods via class
    com.clairvoyant.project2.SubclassOfNestedClass.b(); // Returns "On public inner class, public method"

    var bb = new com.clairvoyant.project2.SubclassOfNestedClass2("");
    // NON-STATIC
    // Attributes
    System.out.println(bb.lname); // Returns "Cerbia"
    // Methods
    bb.test2(); // Returns "On public inner class, public method"

    // STATIC
    // Attributes via instance
    System.out.println(bb.b); // Returns 2
    // Attributes via class
    System.out.println(com.clairvoyant.project2.SubclassOfNestedClass2.b); // Returns 2
    // Methods via instance
    bb.b(); // Returns "On public inner class, public method"
    // Methods via class
    com.clairvoyant.project2.SubclassOfNestedClass2.b(); // Returns "On public inner class, public method"

    var cc = new com.clairvoyant.project2.SubclassOfNestedClass3("");
    // NON-STATIC
    // Attributes
    System.out.println(cc.lname); // Returns "Cerbia"
    // Methods
    cc.test2(); // Returns "On public inner class, public method"

    // STATIC
    // Attributes via instance
    System.out.println(cc.b); // Returns 2
    // Attributes via class
    System.out.println(com.clairvoyant.project2.SubclassOfNestedClass3.b); // Returns 2
    // Methods via instance
    cc.b(); // Returns "On public inner class, public method"
    // Methods via class
    com.clairvoyant.project2.SubclassOfNestedClass3.b(); // Returns "On public inner class, public method"

    /*
     * Each class of instances (d, e, f): Same package with this class
     *
     * Constructor:
     * - Private-Package -> Accessible
     * - Public          -> Accessible
     * - Protected       -> Accessible
     * - Private         -> Not Accessible
     *
     * Non-Static Attribute/Method:
     * - Private-Package -> Not Accessible
     * - Public          -> Accessible
     * - Protected       -> Not Accessible
     * - Private         -> Not Accessible
     *   Note: Accessible via getter
     */
    var dd = new SubclassOfNestedClass();
    // NON-STATIC
    // Attributes
    System.out.println(dd.lname); // Returns "Cerbia"
    // Methods
    dd.test2(); // Returns "On public inner class, public method"

    // STATIC
    // Attributes via instance
    System.out.println(dd.b); // Returns 2
    // Attributes via class
    System.out.println(SubclassOfNestedClass.b); // Returns 2
    // Methods via instance
    dd.b(); // Returns "On public inner class, public method"
    // Methods via class
    SubclassOfNestedClass.b(); // Returns "On public inner class, public method"

    var ee = new SubclassOfNestedClass2();
    // NON-STATIC
    // Attributes
    System.out.println(ee.lname); // Returns "Cerbia"
    // Methods
    ee.test2(); // Returns "On public inner class, public method"

    // STATIC
    // Attributes via instance
    System.out.println(ee.b); // Returns 2
    // Attributes via class
    System.out.println(SubclassOfNestedClass2.b); // Returns 2
    // Methods via instance
    ee.b(); // Returns "On public inner class, public method"
    // Methods via class
    SubclassOfNestedClass2.b(); // Returns "On public inner class, public method"

    var ff = new SubclassOfNestedClass3();
    // NON-STATIC
    // Attributes
    System.out.println(ff.lname); // Returns "Cerbia"
    // Methods
    ff.test2(); // Returns "On public inner class, public method"

    // STATIC
    // Attributes via instance
    System.out.println(ff.b); // Returns 2
    // Attributes via class
    System.out.println(SubclassOfNestedClass3.b); // Returns 2
    // Methods via instance
    ff.b(); // Returns "On public inner class, public method"
    // Methods via class
    SubclassOfNestedClass3.b(); // Returns "On public inner class, public method"
  }
}