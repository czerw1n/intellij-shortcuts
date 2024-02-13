package org.example;

import java.util.List;

public class Draft {

  private final List<Player> players;

  public Draft() {
    var wembanyama = new Player("Victor", "Wembanyama", 20, null);
    var miller = new Player("Brandon", "Miller", 29, null);
    this.players = List.of(wembanyama, miller);
  }

  Player getPick() {
    return players.getFirst();
  }
}
