/*
 * Avery Walwyn | Section 002
 *
 * This java file contains several simple tree problems that need to be
 * codified. These routines  must use the TreeMap and TreeSet library
 * classes from the Java Collection Framework.
 *
 */

import java.util.*;

public class TreeProblems {

  /**
   * Method different()
   *
   * Given two TreeSets of integers, return a TreeSet containing all elements 
   * that are NOT in both sets. In other words, return a TreeSet of all the
   * elements that are in one set but not the other.
   */
  
  public static Set<Integer> different(Set<Integer> setA, Set<Integer> setB) {
    //create a set to hold all elements from A and B
    Set<Integer> allElements = new TreeSet<>(setA);
    //use addAll method to add set B elements to full set
    allElements.addAll(setB);

    //create a set to hold common elements between the two sets
    Set<Integer> commonElements = new TreeSet<>(setA);
    //retain all to get shared elem.
    commonElements.retainAll(setB);

    //take out all common from set of all
    allElements.removeAll(commonElements);

    return allElements;
  }


  /**
   * Method removeEven()
   *
   * Given a treeMap with the key as an integer, and the value as a String,
   * remove all <key, value> pairs where the key is even. 
   */

  public static void removeEven(Map<Integer, String> treeMap) {

    //new list to store even keys
    List<Integer> evens = new ArrayList<>();

    //loop through keys and store evens in new list
    for (Integer key : treeMap.keySet()) {
      if (key % 2 == 0) {
        evens.add(key);
      }
    }

    for (Integer key : evens) {
      treeMap.remove(key);
    }
  }


  /**
   * Method treesEqual()
   *
   * Given two treeMaps, each with the key as an integer, and the value as a String,
   * return a boolean value indicating if the two trees are equal or not.
   */

  public boolean treesEqual(Map<Integer, String> tree1,Map<Integer, String> tree2 ) {
    //establish boolean for return statement
    boolean isEqual = false;

    //cmake sure tree sizes same 
    if (tree1.size() != tree2.size()) {
      return isEqual;
    }
    for (Integer key : tree1.keySet()) {
      if (tree2.containsKey(key) && tree1.get(key).equals(tree2.get(key))) {
        isEqual = true;
      }
    }

    return isEqual;

  }

} // end treeProblems class
