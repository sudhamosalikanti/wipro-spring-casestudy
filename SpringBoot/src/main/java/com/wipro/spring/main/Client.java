package com.wipro.spring.main;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import com.wipro.spring.beans.*;

@SpringBootApplication
public class Client {

private static List<Player> players;
private static List<Country> countries;

public static void main(String[] args) {
SpringApplication.run(Client.class, args);

// Setup countries and players
setupData();

// Display all players and their country details
displayAllPlayers();

// Display players for a specific country
displayPlayersByCountryName("India");
displayPlayersByCountryName("Australia");
}

private static void setupData() {
// Create countries
Country country1 = new Country("C001", "India");
Country country2 = new Country("C002", "Australia");

countries = new ArrayList<>();
countries.add(country1);
countries.add(country2);

// Create players
players = new ArrayList<>();
players.add(new Player("P001", "Sachin", country1)); // India
players.add(new Player("P002", "Dravid", country1)); // India
players.add(new Player("P003", "Ponting", country2)); // Australia
players.add(new Player("P004", "Smith", country2)); // Australia
players.add(new Player("P005", "Warner", country2)); // Australia
}

private static void displayAllPlayers() {
System.out.println("--- Displaying All Player Details ---");
players.forEach(player ->
System.out.println("Player ID: " + player.getPlayerId() +
", Name: " + player.getPlayerName() +
", Country: " + player.getCountry().getCountryName() +
" (ID: " + player.getCountry().getCountryId() + ")"));
System.out.println();
}

private static void displayPlayersByCountryName(String countryName) {
System.out.println("--- Displaying Players from " + countryName + " ---");
List<String> playerNames = players.stream()
.filter(player -> player.getCountry().getCountryName().equalsIgnoreCase(countryName))
.map(Player::getPlayerName)
.collect(Collectors.toList());

if (playerNames.isEmpty()) {
System.out.println("No players found for country: " + countryName);
} else {
playerNames.forEach(System.out::println);
}
System.out.println();
}
}