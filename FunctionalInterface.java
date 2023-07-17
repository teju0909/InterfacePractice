package in.ineuron;

import java.util.function.Function;

public class FunctionalInterface {

  public static void main(String[] args) {
    Function<String, Integer> lengthFunction = (s) -> s.length();
    System.out.println(lengthFunction.apply("Hello, world!")); // 13

    Function<Integer, String> stringFunction = (i) -> String.valueOf(i);
    System.out.println(stringFunction.apply(123)); // 123
  }
}