package com.clairvoyant.project3;

// import com.clairvoyant.project.PrivatePackage; -> Error: Cannot be accessed from outside package

/*
 * Summarize
 * Class with modifier:
 * 1. Private-Package only accessible from any class in the same package
 * 2. Public are accessible from any class in any package
 * Constructor/Attribute/Method with modifier:
 * 1. Private-Package only accessible from any class in the same package
 * 2. Public are accessible from any class in any package
 * 3. Protected only accessible from:
 *    - The class itself
 *    - Any subclass in the same package
 *    - An instance of subclass (in different package) that created within the subclass itself
 * 4. Private only accessible from the class itself
 */
public class AccessModifier2 {
  public static void main(String[] args) {
  }
}