package org.example;

import java.util.ArrayList;
import java.util.List;

class Team {
  private final String name;
  private final List<Player> players;

  public Team(String name) {
    this.name = name;
    this.players = new ArrayList<>();
  }

  public List<Player> getPlayers() {
    return players;
  }

  public void addPlayer(Player player) {
    players.add(player);
  }

  public String getName() {
    return name;
  }
}