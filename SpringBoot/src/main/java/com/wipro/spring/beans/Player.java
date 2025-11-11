package com.wipro.spring.beans;



public class Player {
private String playerId;
private String playerName;
private Country country;


public Player(String playerId, String playerName, Country country) {
	super();
	this.playerId = playerId;
	this.playerName = playerName;
	this.country = country;
}
public Player() {
	super();
}
public String getPlayerId() {
	return playerId;
}
public void setPlayerId(String playerId) {
	this.playerId = playerId;
}
public String getPlayerName() {
	return playerName;
}
public void setPlayerName(String playerName) {
	this.playerName = playerName;
}
public Country getCountry() {
	return country;
}
public void setCountry(Country country) {
	this.country = country;
}


}