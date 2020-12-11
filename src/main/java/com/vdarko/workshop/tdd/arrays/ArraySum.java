package com.vdarko.workshop.tdd.arrays;

public class ArraySum {

  /**
   * Calculates sum of array
   *
   * @param numbers array of integer numbers
   *
   * @return sum of array or <code>null</code> if array is <code>null</code>
   */
  public Integer sum(Integer[] numbers) {
    if (numbers == null) {
      throw new IllegalArgumentException("Array can not be null.");
    }

    Integer sum = new Integer(0);

    for(int i = 0; i < numbers.length; i++) {
      if (numbers[i] == null) {
        throw new IllegalArgumentException("Array is not valid, it contains null element at index=" + i);
      }
      sum = Math.addExact(sum, numbers[i]);
    }
    return sum;
  }
}
