package com.clairvoyant.project3;

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

  Public(String a) {
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
}
