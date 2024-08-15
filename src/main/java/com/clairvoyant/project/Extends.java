package com.clairvoyant.project;

import com.clairvoyant.project2.Public;

public class Extends extends Public {
  Extends() {
    super("");
  }

  public static void main(String[] args) {
    // We can access any static attributes/methods of the extended class
    SIPExample.b();
    b();
    System.out.println(b);
  }
}
