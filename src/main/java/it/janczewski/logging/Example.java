package it.janczewski.logging;

import java.util.Arrays;
import java.util.Random;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Example {
  private static Logger LOGGER = LoggerFactory.getLogger(Example.class);
  private static int [] array;

  public static void main(String... args) {
    LOGGER.info("Hello from {} program.", Example.class.getName());
    prepareArray();
    Arrays.stream(array).forEach(i ->LOGGER.info("Generated {}", i));
  }

  private static void prepareArray() {
    Random rd = new Random();
    array = new int[5];
    for (int i = 0; i < array.length; i++) {
      array[i] = rd.nextInt();
    }
  }

}
