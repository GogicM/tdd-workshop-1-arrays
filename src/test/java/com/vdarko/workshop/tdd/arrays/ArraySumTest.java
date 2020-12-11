package com.vdarko.workshop.tdd.arrays;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArraySumTest {

  /**
   * <b>GIVEN</b> array of integer values</br>
   * <b>WHEN</b> sum is calculated</br>
   * <b>THEN</b> sum value is as expected</br>
   */
  @Test
  public void testSum() {

    // GIVEN
    Integer[] numbers = new Integer[] {1,2,3,4,5};

    // WHEN
    ArraySum arraySum = new ArraySum();
    Integer actual = arraySum.sum(numbers);

    // THEN
    Assertions.assertThat(actual).isEqualTo(15);
  }

  /**
   * <b>GIVEN</b> null </br>
   * <b>WHEN</b> sum is calculated</br>
   * <b>THEN</b> throw {@code InvalidArgumetException} </br>
   */
  @Test
  public void testSumForNull() {

    // GIVEN
    Integer[] numbers = null;

    // WHEN
    ArraySum arraySum = new ArraySum();

    Throwable throwable = Assertions.catchThrowable(() -> arraySum.sum(numbers));

    // THEN
    Assertions.assertThat(throwable) //
    .isInstanceOf(IllegalArgumentException.class) //
    .hasMessage("Array can not be null.");
  }

  /**
   * <b>GIVEN</b> Array with large numbers </br>
   * <b>WHEN</b> sum is calculated</br>
   * <b>THEN</b> throw ArithmeticException </br>
   */
  @Test
  public void testSumForLargeNumber() {
    // GIVEN
    Integer[] numbers = new Integer[]{Integer.MAX_VALUE, 1};

    // WHEN
    ArraySum arraySum = new ArraySum();

    Throwable throwable = Assertions.catchThrowable(() -> arraySum.sum(numbers));

    // THEN
    Assertions.assertThat(throwable) //
        .isInstanceOf(ArithmeticException.class) //
        .hasMessage("integer overflow");
  }

}
