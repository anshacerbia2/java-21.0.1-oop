package com.clairvoyant.project2;

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

  class NSIP {
    static class NSIPChild {
    }
  }

  class NSIP2 {
    class NSIP2Child {
      static class NSIP2GrandChild {
      }
    }
  }

  static class SIP {
    class SIPChild {
      class SIPGrandChild {
      }
    }
  }

  static class SIP2 {
    static class SIP2Child {
      class SIP2GrandChild {
      }
    }
  }

  public static class SIPExample {
    String fname = "Ansha";
    public String lname = "Cerbia";
    protected int age = 17;
    private String country = "Indonesia";

    static final int a = 1;
    public static final int b = 2;
    protected static final int c = 3;
    private static final int d = 4;

    void test() {
      System.out.println("On public static nested class, private-package method");
    }

    public void test2() {
      System.out.println("On public static nested class, public method");
    }

    protected void test3() {
      System.out.println("On public static nested class, protected method");
    }

    private void test4() {
      System.out.println("On public static nested class, private method");
    }

    static void a() {
      System.out.println("On public static nested class, private-package static method");
    }

    public static void b() {
      System.out.println("on public static nested class, public static method");
    }

    protected static void c() {
      System.out.println("On public static nested class, protected static method");
    }

    private static void d() {
      System.out.println("On public static nested class, private static method");
    }

    public class SIPExampleChild {
      String fname = "Ansha";
      public String lname = "Cerbia";
      protected int age = 17;
      private String country = "Indonesia";

      static final int a = 1;
      public static final int b = 2;
      protected static final int c = 3;
      private static final int d = 4;

      SIPExampleChild() {
      }

      public SIPExampleChild(String a) {
      }

      protected SIPExampleChild(String a, String b) {
        this("a", "b", "c"); // Private Constructor only invokable within the class itself
      }

      private SIPExampleChild(String a, String b, String c) {
      }

      void test() {
        System.out.println("On public inner class, private-package method");
      }

      public void test2() {
        System.out.println("On public inner class, public method");
      }

      protected void test3() {
        System.out.println("On public inner class, protected method");
      }

      private void test4() {
        System.out.println("On public inner class, private method");
      }

      static void a() {
        System.out.println("On public inner class, private-package static method");
      }

      public static void b() {
        System.out.println("on public inner class, public static method");
      }

      protected static void c() {
        System.out.println("On public inner class, protected static method");
      }

      private static void d() {
        System.out.println("On public inner class, private static method");
      }

      public static class SIPExampleGrandChild {
        String fname = "Ansha";
        public String lname = "Cerbia";
        protected int age = 17;
        private String country = "Indonesia";

        static final int a = 1;
        public static final int b = 2;
        protected static final int c = 3;
        private static final int d = 4;

        SIPExampleGrandChild() {
        }

        public SIPExampleGrandChild(String a) {
        }

        protected SIPExampleGrandChild(String a, String b) {
          this("a", "b", "c"); // Private Constructor only invokable within the class itself
        }

        private SIPExampleGrandChild(String a, String b, String c) {
        }

        void test() {
          System.out.println("On public static nested class, private-package method");
        }

        public void test2() {
          System.out.println("On public static nested class, public method");
        }

        protected void test3() {
          System.out.println("On public static nested class, protected method");
        }

        private void test4() {
          System.out.println("On public static nested class, private method");
        }

        static void a() {
          System.out.println("On public static nested class, private-package static method");
        }

        public static void b() {
          System.out.println("on public static nested class, public static method");
        }

        protected static void c() {
          System.out.println("On public static nested class, protected static method");
        }

        private static void d() {
          System.out.println("On public static nested class, private static method");
        }

        public class XXX {
          public static class YYY {
          }
        }

        public static class ZZZ {
          public class WWW {
          }
        }
      }
    }
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
     * For a, b, c, d, e, f, g, h, i, j, k, l, m:
     *
     * Static Attribute/Method (via class):
     * - Private-Package -> Accessible (Except f, g, h, i, j, k, l and m)
     * - Public          -> Accessible
     * - Protected       -> Accessible
     * - Private         -> Not Accessible (Except a)
     *
     * Static Attribute/Method (via instance):
     * - Private-Package -> Accessible (Except f, g, h, i, j, k, l and m)
     * - Public          -> Accessible
     * - Protected       -> Accessible
     * - Private         -> Not Accessible (Except a)
     */

    /*
     * Each class of instances (a, b, c, d, e, f, g): Same package with this class
     *
     * Constructor:
     * - Private-Package -> Accessible
     * - Public          -> Accessible
     * - Protected       -> Accessible
     * - Private         -> Not Accessible (Except a)
     *
     * Non-Static Attribute/Method:
     * - Private-Package -> Accessible (Except f and g)
     * - Public          -> Accessible
     * - Protected       -> Accessible
     * - Private         -> Not Accessible (Except a)
     *   Note: Accessible via getter
     */
    var a = new Public();
    // NON-STATIC
    // Attributes
    System.out.println(a.fname); // Returns "Ansha"
    System.out.println(a.lname); // Returns "Cerbia"
    System.out.println(a.age); // Returns 17
    System.out.println(a.country); // Returns 17
    // Methods
    a.test(); // Returns "On public class, private-package method"
    a.test2(); // Returns "On public class, public method"
    a.test3(); // Returns "On public class, protected method"
    a.test4(); // Returns "On public class, protected method"

    // STATIC
    // Attributes via instance
    System.out.println(a.a); // Returns 1
    System.out.println(a.b); // Returns 2
    System.out.println(a.c); // Returns 3
    System.out.println(a.d); // Returns 3
    // Attributes via class
    System.out.println(Public.a); // Returns 1
    System.out.println(Public.b); // Returns 2
    System.out.println(Public.c); // Returns 3
    System.out.println(Public.d); // Returns 3
    // Methods via instance
    a.a(); // Returns "On public class, private-package static method"
    a.b(); // Returns "On public class, public static method"
    a.c(); // Returns "On public class, protected static method"
    a.d(); // Returns "On public class, protected static method"
    // Methods via class
    Public.a(); // Returns "On public class, private-package static method"
    Public.b(); // Returns "On public class, public static method"
    Public.c(); // Returns "On public class, protected static method"
    Public.d(); // Returns "On public class, protected static method"

    var b = new DirectSubClass();
    // NON-STATIC
    // Attributes
    System.out.println(b.fname); // Returns "Ansha"
    System.out.println(b.lname); // Returns "Cerbia"
    System.out.println(b.age); // Returns 17
    // Methods
    b.test(); // Returns "On public class, private-package method"
    b.test2(); // Returns "On public class, public method"
    b.test3(); // Returns "On public class, protected method"

    // STATIC
    // Attributes via instance
    System.out.println(b.a); // Returns 1
    System.out.println(b.b); // Returns 2
    System.out.println(b.c); // Returns 3
    // Attributes via class
    System.out.println(DirectSubClass.a); // Returns 1
    System.out.println(DirectSubClass.b); // Returns 2
    System.out.println(DirectSubClass.c); // Returns 3
    // Methods via instance
    b.a(); // Returns "On public class, private-package static method"
    b.b(); // Returns "On public class, public static method"
    b.c(); // Returns "On public class, protected static method"
    // Methods via class
    DirectSubClass.a(); // Returns "On public class, private-package static method"
    DirectSubClass.b(); // Returns "On public class, public static method"
    DirectSubClass.c(); // Returns "On public class, protected static method"

    var c = new IndirectSubClass();
    // NON-STATIC
    // Attributes
    System.out.println(c.fname); // Returns "Ansha"
    System.out.println(c.lname); // Returns "Cerbia"
    System.out.println(c.age); // Returns 17
    // Methods
    c.test(); // Returns "On public class, private-package method"
    c.test2(); // Returns "On public class, public method"
    c.test3(); // Returns "On public class, protected method"

    // STATIC
    // Attributes via instance
    System.out.println(c.a); // Returns 1
    System.out.println(c.b); // Returns 2
    System.out.println(c.c); // Returns 3
    // Attributes via class
    System.out.println(IndirectSubClass.a); // Returns 1
    System.out.println(IndirectSubClass.b); // Returns 2
    System.out.println(IndirectSubClass.c); // Returns 3
    // Methods via instance
    c.a(); // Returns "On public class, private-package static method"
    c.b(); // Returns "On public class, public static method"
    c.c(); // Returns "On public class, protected static method"
    // Methods via class
    IndirectSubClass.a(); // Returns "On public class, private-package static method"
    IndirectSubClass.b(); // Returns "On public class, public static method"
    IndirectSubClass.c(); // Returns "On public class, protected static method"

    var d = new AnotherIndirectSubClass1();
    // NON-STATIC
    // Attributes
    System.out.println(d.fname); // Returns "Ansha"
    System.out.println(d.lname); // Returns "Cerbia"
    System.out.println(d.age); // Returns 17
    // Methods
    d.test(); // Returns "On public class, private-package method"
    d.test2(); // Returns "On public class, public method"
    d.test3(); // Returns "On public class, protected method"

    // STATIC
    // Attributes via instance
    System.out.println(d.a); // Returns 1
    System.out.println(d.b); // Returns 2
    System.out.println(d.c); // Returns 3
    // Attributes via class
    System.out.println(AnotherIndirectSubClass1.a); // Returns 1
    System.out.println(AnotherIndirectSubClass1.b); // Returns 2
    System.out.println(AnotherIndirectSubClass1.c); // Returns 3
    // Methods via instance
    d.a(); // Returns "On public class, private-package static method"
    d.b(); // Returns "On public class, public static method"
    d.c(); // Returns "On public class, protected static method"
    // Methods via class
    AnotherIndirectSubClass1.a(); // Returns "On public class, private-package static method"
    AnotherIndirectSubClass1.b(); // Returns "On public class, public static method"
    AnotherIndirectSubClass1.c(); // Returns "On public class, protected static method"

    var e = new AnotherIndirectSubClass2();
    // NON-STATIC
    // Attributes
    System.out.println(e.fname); // Returns "Ansha"
    System.out.println(e.lname); // Returns "Cerbia"
    System.out.println(e.age); // Returns 17
    // Methods
    e.test(); // Returns "On public class, private-package method"
    e.test2(); // Returns "On public class, public method"
    e.test3(); // Returns "On public class, protected method"

    // STATIC
    // Attributes via instance
    System.out.println(e.a); // Returns 1
    System.out.println(e.b); // Returns 2
    System.out.println(e.c); // Returns 3
    // Attributes via class
    System.out.println(AnotherIndirectSubClass2.a); // Returns 1
    System.out.println(AnotherIndirectSubClass2.b); // Returns 2
    System.out.println(AnotherIndirectSubClass2.c); // Returns 3
    // Methods via instance
    e.a(); // Returns "On public class, private-package static method"
    e.b(); // Returns "On public class, public static method"
    e.c(); // Returns "On public class, protected static method"
    // Methods via class
    AnotherIndirectSubClass2.a(); // Returns "On public class, private-package static method"
    AnotherIndirectSubClass2.b(); // Returns "On public class, public static method"
    AnotherIndirectSubClass2.c(); // Returns "On public class, protected static method"

    var f = new AnotherIndirectSubClass3();
    // NON-STATIC
    // Attributes
    System.out.println(f.lname); // Returns "Cerbia"
    System.out.println(f.age); // Returns 17
    // Methods
    f.test2(); // Returns "On public class, public method"
    f.test3(); // Returns "On public class, protected method"

    // STATIC
    // Attributes via instance
    System.out.println(f.b); // Returns 2
    System.out.println(f.c); // Returns 3
    // Attributes via class
    System.out.println(AnotherIndirectSubClass3.b); // Returns 2
    System.out.println(AnotherIndirectSubClass3.c); // Returns 3
    // Methods via instance
    f.b(); // Returns "On public class, public static method"
    f.c(); // Returns "On public class, protected static method"
    // Methods via class
    AnotherIndirectSubClass3.b(); // Returns "On public class, public static method"
    AnotherIndirectSubClass3.c(); // Returns "On public class, protected static method"

    var g = new AnotherIndirectSubClass4();
    // NON-STATIC
    // Attributes
    System.out.println(g.lname); // Returns "Cerbia"
    System.out.println(g.age); // Returns 17
    // Methods
    g.test2(); // Returns "On public class, public method"
    g.test3(); // Returns "On public class, protected method"

    // STATIC
    // Attributes via instance
    System.out.println(g.b); // Returns 2
    System.out.println(g.c); // Returns 3
    // Attributes via class
    System.out.println(AnotherIndirectSubClass4.b); // Returns 2
    System.out.println(AnotherIndirectSubClass4.c); // Returns 3
    // Methods via instance
    g.b(); // Returns "On public class, public static method"
    g.c(); // Returns "On public class, protected static method"
    // Methods via class
    AnotherIndirectSubClass4.b(); // Returns "On public class, public static method"
    AnotherIndirectSubClass4.c(); // Returns "On public class, protected static method"

    /*
     * Each class of instances (h, i, j, k, l, m): Different package with this class
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
    var h = new com.clairvoyant.project3.DirectSubClass("");
    // NON-STATIC
    // Attributes
    System.out.println(h.lname); // Returns "Cerbia"
    System.out.println(h.age); // Returns 17
    // Methods
    h.test2(); // Returns "On public class, public method"
    h.test3(); // Returns "On public class, protected method"

    // STATIC
    // Attributes via instance
    System.out.println(h.b); // Returns 2
    System.out.println(h.c); // Returns 3
    // Attributes via class
    System.out.println(com.clairvoyant.project3.DirectSubClass.b); // Returns 2
    System.out.println(com.clairvoyant.project3.DirectSubClass.c); // Returns 3
    // Methods via instance
    h.b(); // Returns "On public class, public static method"
    h.c(); // Returns "On public class, protected static method"
    // Methods via class
    com.clairvoyant.project3.DirectSubClass.b(); // Returns "On public class, public static method"
    com.clairvoyant.project3.DirectSubClass.c(); // Returns "On public class, protected static method"

    var i = new com.clairvoyant.project3.IndirectSubClass("");
    // NON-STATIC
    // Attributes
    System.out.println(i.lname); // Returns "Cerbia"
    System.out.println(i.age); // Returns 17
    // Methods
    i.test2(); // Returns "On public class, public method"
    i.test3(); // Returns "On public class, protected method"

    // STATIC
    // Attributes via instance
    System.out.println(i.b); // Returns 2
    System.out.println(i.c); // Returns 3
    // Attributes via class
    System.out.println(com.clairvoyant.project3.IndirectSubClass.b); // Returns 2
    System.out.println(com.clairvoyant.project3.IndirectSubClass.c); // Returns 3
    // Methods via instance
    i.b(); // Returns "On public class, public static method"
    i.c(); // Returns "On public class, protected static method"
    // Methods via class
    com.clairvoyant.project3.IndirectSubClass.b(); // Returns "On public class, public static method"
    com.clairvoyant.project3.IndirectSubClass.c(); // Returns "On public class, protected static method"

    var j = new com.clairvoyant.project3.AnotherIndirectSubClass1("");
    // NON-STATIC
    // Attributes
    System.out.println(j.lname); // Returns "Cerbia"
    System.out.println(j.age); // Returns 17
    // Methods
    j.test2(); // Returns "On public class, public method"
    j.test3(); // Returns "On public class, protected method"

    // STATIC
    // Attributes via instance
    System.out.println(j.b); // Returns 2
    System.out.println(j.c); // Returns 3
    // Attributes via class
    System.out.println(com.clairvoyant.project3.AnotherIndirectSubClass1.b); // Returns 2
    System.out.println(com.clairvoyant.project3.AnotherIndirectSubClass1.c); // Returns 3
    // Methods via instance
    j.b(); // Returns "On public class, public static method"
    j.c(); // Returns "On public class, protected static method"
    // Methods via class
    com.clairvoyant.project3.AnotherIndirectSubClass1.b(); // Returns "On public class, public static method"
    com.clairvoyant.project3.AnotherIndirectSubClass1.c(); // Returns "On public class, protected static method"

    var k = new com.clairvoyant.project3.AnotherIndirectSubClass2("");
    // NON-STATIC
    // Attributes
    System.out.println(k.lname); // Returns "Cerbia"
    System.out.println(k.age); // Returns 17
    // Methods
    k.test2(); // Returns "On public class, public method"
    k.test3(); // Returns "On public class, protected method"

    // STATIC
    // Attributes via instance
    System.out.println(k.b); // Returns 2
    System.out.println(k.c); // Returns 3
    // Attributes via class
    System.out.println(com.clairvoyant.project3.AnotherIndirectSubClass2.b); // Returns 2
    System.out.println(com.clairvoyant.project3.AnotherIndirectSubClass2.c); // Returns 3
    // Methods via instance
    k.b(); // Returns "On public class, public static method"
    k.c(); // Returns "On public class, protected static method"
    // Methods via class
    com.clairvoyant.project3.AnotherIndirectSubClass2.b(); // Returns "On public class, public static method"
    com.clairvoyant.project3.AnotherIndirectSubClass2.c(); // Returns "On public class, protected static method"

    var l = new com.clairvoyant.project3.AnotherIndirectSubClass3("");
    // NON-STATIC
    // Attributes
    System.out.println(l.lname); // Returns "Cerbia"
    System.out.println(l.age); // Returns 17
    // Methods
    l.test2(); // Returns "On public class, public method"
    l.test3(); // Returns "On public class, protected method"

    // STATIC
    // Attributes via instance
    System.out.println(l.b); // Returns 2
    System.out.println(l.c); // Returns 3
    // Attributes via class
    System.out.println(com.clairvoyant.project3.AnotherIndirectSubClass3.b); // Returns 2
    System.out.println(com.clairvoyant.project3.AnotherIndirectSubClass3.c); // Returns 3
    // Methods via instance
    l.b(); // Returns "On public class, public static method"
    l.c(); // Returns "On public class, protected static method"
    // Methods via class
    com.clairvoyant.project3.AnotherIndirectSubClass3.b(); // Returns "On public class, public static method"
    com.clairvoyant.project3.AnotherIndirectSubClass3.c(); // Returns "On public class, protected static method"

    var m = new com.clairvoyant.project3.AnotherIndirectSubClass4("");
    // NON-STATIC
    // Attributes
    System.out.println(m.lname); // Returns "Cerbia"
    System.out.println(m.age); // Returns 17
    // Methods
    m.test2(); // Returns "On public class, public method"
    m.test3(); // Returns "On public class, protected method"

    // STATIC
    // Attributes via instance
    System.out.println(m.b); // Returns 2
    System.out.println(m.c); // Returns 3
    // Attributes via class
    System.out.println(com.clairvoyant.project3.AnotherIndirectSubClass4.b); // Returns 2
    System.out.println(com.clairvoyant.project3.AnotherIndirectSubClass4.c); // Returns 3
    // Methods via instance
    m.b(); // Returns "On public class, public static method"
    m.c(); // Returns "On public class, protected static method"
    // Methods via class
    com.clairvoyant.project3.AnotherIndirectSubClass4.b(); // Returns "On public class, public static method"
    com.clairvoyant.project3.AnotherIndirectSubClass4.c(); // Returns "On public class, protected static method"

    // NESTED CLASS
    var x = new SIPExample();
    // NON-STATIC
    // Attributes
    System.out.println(x.fname); // Returns "Ansha"
    System.out.println(x.lname); // Returns "Cerbia"
    System.out.println(x.age); // Returns 17
    System.out.println(x.country); // Returns "Indonesia"
    // Methods
    x.test(); // Returns "On public static nested class, private-package method"
    x.test2(); // Returns "On public static nested class, public method"
    x.test3(); // Returns "On public static nested class, protected method"
    x.test4(); // Returns "On public static nested class, private method"

    // STATIC
    // Attributes via instance
    System.out.println(x.a); // Returns 1
    System.out.println(x.b); // Returns 2
    System.out.println(x.c); // Returns 3
    System.out.println(x.d); // Returns 4
    // Attributes via class
    System.out.println(SIPExample.a); // Returns 1
    System.out.println(SIPExample.b); // Returns 2
    System.out.println(SIPExample.c); // Returns 3
    System.out.println(SIPExample.d); // Returns 4
    // Methods via instance
    x.a(); // Returns "On public static nested class, private-package method"
    x.b(); // Returns "On public static nested class, public method"
    x.c(); // Returns "On public static nested class, protected method"
    x.d(); // Returns "On public static nested class, private method"
    // Methods via class
    SIPExample.a(); // Returns "On public static nested class, private-package method"
    SIPExample.b(); // Returns "On public static nested class, public method"
    SIPExample.c(); // Returns "On public static nested class, protected method"
    SIPExample.d(); // Returns "On public static nested class, private method"

    var y = new SIPExample.SIPExampleChild.SIPExampleGrandChild();
    // NON-STATIC
    // Attributes
    System.out.println(y.fname); // Returns "Ansha"
    System.out.println(y.lname); // Returns "Cerbia"
    System.out.println(y.age); // Returns 17
    System.out.println(y.country); // Returns "Indonesia"
    // Methods
    y.test(); // Returns "On public static nested class, private-package method"
    y.test2(); // Returns "On public static nested class, public method"
    y.test3(); // Returns "On public static nested class, protected method"
    y.test4(); // Returns "On public static nested class, private method"

    // STATIC
    // Attributes via instance
    System.out.println(y.a); // Returns 1
    System.out.println(y.b); // Returns 2
    System.out.println(y.c); // Returns 3
    System.out.println(y.d); // Returns 4
    // Attributes via class
    System.out.println(SIPExample.SIPExampleChild.SIPExampleGrandChild.a); // Returns 1
    System.out.println(SIPExample.SIPExampleChild.SIPExampleGrandChild.b); // Returns 2
    System.out.println(SIPExample.SIPExampleChild.SIPExampleGrandChild.c); // Returns 3
    System.out.println(SIPExample.SIPExampleChild.SIPExampleGrandChild.d); // Returns 4
    // Methods via instance
    y.a(); // Returns "On public static nested class, private-package method"
    y.b(); // Returns "On public static nested class, public method"
    y.c(); // Returns "On public static nested class, protected method"
    y.d(); // Returns "On public static nested class, private method"
    // Methods via class
    SIPExample.SIPExampleChild.SIPExampleGrandChild.a(); // Returns "On public static nested class, private-package method"
    SIPExample.SIPExampleChild.SIPExampleGrandChild.b(); // Returns "On public static nested class, public method"
    SIPExample.SIPExampleChild.SIPExampleGrandChild.c(); // Returns "On public static nested class, protected method"
    SIPExample.SIPExampleChild.SIPExampleGrandChild.d(); // Returns "On public static nested class, private method"

    var z = new SIPExample().new SIPExampleChild();
    // NON-STATIC
    // Attributes
    System.out.println(z.fname); // Returns "Ansha"
    System.out.println(z.lname); // Returns "Cerbia"
    System.out.println(z.age); // Returns 17
    System.out.println(z.country); // Returns "Indonesia"
    // Methods
    z.test(); // Returns "On public inner class, private-package method"
    z.test2(); // Returns "On public inner class, public method"
    z.test3(); // Returns "On public inner class, protected method"
    z.test4(); // Returns "On public inner class, private method"

    // STATIC
    // Attributes via instance
    System.out.println(z.a); // Returns 1
    System.out.println(z.b); // Returns 2
    System.out.println(z.c); // Returns 3
    System.out.println(z.d); // Returns 4
    // Attributes via class
    System.out.println(SIPExample.SIPExampleChild.a); // Returns 1
    System.out.println(SIPExample.SIPExampleChild.b); // Returns 2
    System.out.println(SIPExample.SIPExampleChild.c); // Returns 3
    System.out.println(SIPExample.SIPExampleChild.d); // Returns 4
    // Methods via instance
    z.a(); // Returns "On public inner class, private-package method"
    z.b(); // Returns "On public inner class, public method"
    z.c(); // Returns "On public inner class, protected method"
    z.d(); // Returns "On public inner class, private method"
    // Methods via class
    SIPExample.SIPExampleChild.a(); // Returns "On public inner class, private-package method"
    SIPExample.SIPExampleChild.b(); // Returns "On public inner class, public method"
    SIPExample.SIPExampleChild.c(); // Returns "On public inner class, protected method"
    SIPExample.SIPExampleChild.d(); // Returns "On public inner class, private method"

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
     * - Private         -> Not Accessible
     *
     * Non-Static Attribute/Method:
     * - Private-Package -> Accessible (Except c)
     * - Public          -> Accessible
     * - Protected       -> Accessible
     * - Private         -> Not Accessible
     *   Note: Accessible via getter
     */
    var aa = new SubclassOfNestedClass();
    // NON-STATIC
    // Attributes
    System.out.println(aa.fname); // Returns "Ansha"
    System.out.println(aa.lname); // Returns "Cerbia"
    System.out.println(aa.age); // Returns 17
    // Methods
    aa.test(); // Returns "On public inner class, private-package method"
    aa.test2(); // Returns "On public inner class, public method"
    aa.test3(); // Returns "On public inner class, protected method"

    // STATIC
    // Attributes via instance
    System.out.println(aa.a); // Returns 1
    System.out.println(aa.b); // Returns 2
    System.out.println(aa.c); // Returns 3
    // Attributes via class
    System.out.println(SubclassOfNestedClass.a); // Returns 1
    System.out.println(SubclassOfNestedClass.b); // Returns 2
    System.out.println(SubclassOfNestedClass.c); // Returns 3
    // Methods via instance
    aa.a(); // Returns "On public inner class, private-package method"
    aa.b(); // Returns "On public inner class, public method"
    aa.c(); // Returns "On public inner class, protected method"
    // Methods via class
    SubclassOfNestedClass.a(); // Returns "On public inner class, private-package method"
    SubclassOfNestedClass.b(); // Returns "On public inner class, public method"
    SubclassOfNestedClass.c(); // Returns "On public inner class, protected method"

    var bb = new SubclassOfNestedClass2();
    // NON-STATIC
    // Attributes
    System.out.println(bb.fname); // Returns "Ansha"
    System.out.println(bb.lname); // Returns "Cerbia"
    System.out.println(bb.age); // Returns 17
    // Methods
    bb.test(); // Returns "On public inner class, private-package method"
    bb.test2(); // Returns "On public inner class, public method"
    bb.test3(); // Returns "On public inner class, protected method"

    // STATIC
    // Attributes via instance
    System.out.println(bb.a); // Returns 1
    System.out.println(bb.b); // Returns 2
    System.out.println(bb.c); // Returns 3
    // Attributes via class
    System.out.println(SubclassOfNestedClass2.a); // Returns 1
    System.out.println(SubclassOfNestedClass2.b); // Returns 2
    System.out.println(SubclassOfNestedClass2.c); // Returns 3
    // Methods via instance
    bb.a(); // Returns "On public inner class, private-package method"
    bb.b(); // Returns "On public inner class, public method"
    bb.c(); // Returns "On public inner class, protected method"
    // Methods via class
    SubclassOfNestedClass2.a(); // Returns "On public inner class, private-package method"
    SubclassOfNestedClass2.b(); // Returns "On public inner class, public method"
    SubclassOfNestedClass2.c(); // Returns "On public inner class, protected method"

    var cc = new SubclassOfNestedClass3();
    // NON-STATIC
    // Attributes
    System.out.println(cc.lname); // Returns "Cerbia"
    System.out.println(cc.age); // Returns 17
    // Methods
    cc.test2(); // Returns "On public inner class, public method"
    cc.test3(); // Returns "On public inner class, protected method"

    // STATIC
    // Attributes via instance
    System.out.println(cc.b); // Returns 2
    System.out.println(cc.c); // Returns 3
    // Attributes via class
    System.out.println(SubclassOfNestedClass3.b); // Returns 2
    System.out.println(SubclassOfNestedClass3.c); // Returns 3
    // Methods via instance
    cc.b(); // Returns "On public inner class, public method"
    cc.c(); // Returns "On public inner class, protected method"
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
    var dd = new com.clairvoyant.project3.SubclassOfNestedClass("");
    // NON-STATIC
    // Attributes
    System.out.println(dd.lname); // Returns "Cerbia"
    System.out.println(dd.age); // Returns 17
    // Methods
    dd.test2(); // Returns "On public inner class, public method"
    dd.test3(); // Returns "On public inner class, protected method"

    // STATIC
    // Attributes via instance
    System.out.println(dd.b); // Returns 2
    System.out.println(dd.c); // Returns 3
    // Attributes via class
    System.out.println(com.clairvoyant.project3.SubclassOfNestedClass.b); // Returns 2
    System.out.println(com.clairvoyant.project3.SubclassOfNestedClass.c); // Returns 3
    // Methods via instance
    dd.b(); // Returns "On public inner class, public method"
    dd.c(); // Returns "On public inner class, protected method"
    // Methods via class
    com.clairvoyant.project3.SubclassOfNestedClass.b(); // Returns "On public inner class, public method"
    com.clairvoyant.project3.SubclassOfNestedClass.c(); // Returns "On public inner class, protected method"

    var ee = new com.clairvoyant.project3.SubclassOfNestedClass2("");
    // NON-STATIC
    // Attributes
    System.out.println(ee.lname); // Returns "Cerbia"
    System.out.println(ee.age); // Returns 17
    // Methods
    ee.test2(); // Returns "On public inner class, public method"
    ee.test3(); // Returns "On public inner class, protected method"

    // STATIC
    // Attributes via instance
    System.out.println(ee.b); // Returns 2
    System.out.println(ee.c); // Returns 3
    // Attributes via class
    System.out.println(com.clairvoyant.project3.SubclassOfNestedClass2.b); // Returns 2
    System.out.println(com.clairvoyant.project3.SubclassOfNestedClass2.c); // Returns 3
    // Methods via instance
    ee.b(); // Returns "On public inner class, public method"
    ee.c(); // Returns "On public inner class, protected method"
    // Methods via class
    com.clairvoyant.project3.SubclassOfNestedClass2.b(); // Returns "On public inner class, public method"
    com.clairvoyant.project3.SubclassOfNestedClass2.c(); // Returns "On public inner class, protected method"

    var ff = new com.clairvoyant.project3.SubclassOfNestedClass3("");
    // NON-STATIC
    // Attributes
    System.out.println(ff.lname); // Returns "Cerbia"
    System.out.println(ff.age); // Returns 17
    // Methods
    ff.test2(); // Returns "On public inner class, public method"
    ff.test3(); // Returns "On public inner class, protected method"

    // STATIC
    // Attributes via instance
    System.out.println(ff.b); // Returns 2
    System.out.println(ff.c); // Returns 3
    // Attributes via class
    System.out.println(com.clairvoyant.project3.SubclassOfNestedClass3.b); // Returns 2
    System.out.println(com.clairvoyant.project3.SubclassOfNestedClass3.c); // Returns 3
    // Methods via instance
    ff.b(); // Returns "On public inner class, public method"
    ff.c(); // Returns "On public inner class, protected method"
    // Methods via class
    com.clairvoyant.project3.SubclassOfNestedClass3.b(); // Returns "On public inner class, public method"
    com.clairvoyant.project3.SubclassOfNestedClass3.c(); // Returns "On public inner class, protected method"
  }
}
