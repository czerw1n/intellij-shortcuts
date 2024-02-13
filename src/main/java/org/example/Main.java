package org.example;

import java.util.Random;

public class Main {
  public static void main(String[] args) {
    Player james = new Player("LeBron", "James", 40, "KingJames");
    Player tatum = new Player("Jason", "Tatum", 29, null);

    Team lakers = new Team("Lakers");
    Team celtics = new Team("Celtics");

    lakers.addPlayer(james);
    celtics.addPlayer(tatum);

    Draft draft = new Draft();

    Match match = new Match(Sport.BASKETBALL, lakers, celtics);
  }

  public static void overlyComplicatedMethod() {
    try {
      int count = 5;
      int[] numbers = new int[count];
      Random rand = new Random();
      for (int i = 0; i < count; i++) {
        numbers[i] = rand.nextInt(100);
      }

      for (int number : numbers) {
        if (number % 2 == 0) {
          System.out.println("Number " + number + " is even.");
          try {
            if (number == 0) {
              throw new IllegalArgumentException("Number cannot be zero.");
            } else {
              System.out.println("Reciprocal of " + number + " is " + (1.0 / number));
              for (int j = 2; j <= Math.sqrt(number); j++) {
                if (number % j == 0) {
                  throw new RuntimeException("Number " + number + " is not prime.");
                }
              }
              System.out.println("Number " + number + " is prime.");
            }
          } catch (IllegalArgumentException e) {
            System.err.println("Caught IllegalArgumentException: " + e.getMessage());
          } catch (RuntimeException e) {
            System.err.println("Caught RuntimeException: " + e.getMessage());
          }
        } else {
          System.out.println("Number " + number + " is odd.");
        }
      }
    } catch (Exception e) {
      System.err.println("Caught Exception: " + e.getMessage());
    }
  }
}
