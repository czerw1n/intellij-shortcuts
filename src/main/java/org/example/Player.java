package org.example;


import java.util.Objects;
import java.util.Optional;

final class Player {
  private final String firstName;
  private final String lastName;
  private final int age;
  private final String nickName;

  Player(String firstName, String lastName, int age, String nickName) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.nickName = nickName;
  }

  public String firstName() {
    return firstName;
  }

  public String lastName() {
    return lastName;
  }

  public int age() {
    return age;
  }

  public Optional<String> nickName() {
    return Optional.of(nickName);
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == this) return true;
    if (obj == null || obj.getClass() != this.getClass()) return false;
    var that = (Player) obj;
    return Objects.equals(this.firstName, that.firstName)
        && Objects.equals(this.lastName, that.lastName)
        && this.age == that.age
        && Objects.equals(this.nickName, that.nickName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, age, nickName);
  }

  @Override
  public String toString() {
    return "Player["
        + "firstName="
        + firstName
        + ", "
        + "lastName="
        + lastName
        + ", "
        + "age="
        + age
        + ", "
        + "nickName="
        + nickName
        + ']';
  }
}
