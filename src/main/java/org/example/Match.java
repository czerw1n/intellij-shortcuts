package org.example;

class Match {
  final Sport sport;
  final Team homeTeam;
  final Team awayTeam;

  public Match(Sport sport, Team homeTeam, Team awayTeam) {
    this.sport = sport;
    this.homeTeam = homeTeam;
    this.awayTeam = awayTeam;
  }

  public Sport getSport() {
    return sport;
  }

  public Team getAwayTeam() {
    return awayTeam;
  }

  public Team getHomeTeam() {
    return homeTeam;
  }
}
