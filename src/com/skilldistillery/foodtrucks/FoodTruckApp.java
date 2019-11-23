package com.skilldistillery.foodtrucks;

import java.util.Scanner;

public class FoodTruckApp {
	public Scanner kb = new Scanner(System.in);

	public void run() {
		System.out.println("\t-Welcome to Food Trucks-");
		System.out.println("\tYou can identify and rate up to 5 food trucks!");

		userInput();
		listMenu();
	}

	public void userInput() {
		FoodTruck[] trucks = new FoodTruck[5];

		boolean isInputting = true;
		while (isInputting) {

			for (int i = 0; i < 5; i++) {
				System.out.println("Enter the name for a food truck.");
				String name = kb.nextLine();
				// user wants to stop creating trucks.
				if (name.equals("quit")) {
					isInputting = false;
					break;
				}
				System.out.println("Enter the food type.");
				String foodType = kb.nextLine();
				System.out.println("What do you rate the truck from 1-10?");
				int rating = kb.nextInt();
				// solution to nextLine being called after integer but not on new line
				// this puts scanner onto a new line
				kb.nextLine();
				// put into array
				FoodTruck truck = new FoodTruck(name, foodType, rating);
				trucks[i] = truck;
				System.out.println("Thank you, the truck has been added.");
			}
		}
	}

	public void listMenu() {
		boolean inMenu = true;
		while (inMenu) {
			System.out.println("1. List all food trucks.");
			System.out.println("2. See the average rating of food trucks.");
			System.out.println("3. Display the highest-rated food truck.");
			System.out.println("4. Quit");
		}
	}

	public static void main(String[] args) {
		FoodTruckApp start = new FoodTruckApp();
		start.run();
	}
}
