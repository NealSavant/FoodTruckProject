package com.skilldistillery.foodtrucks;

import java.util.Scanner;

public class FoodTruckApp {
	public Scanner kb = new Scanner(System.in);
	public FoodTruck[] trucks = new FoodTruck[5];

	public void run() {
		System.out.println("\t-Welcome to Food Trucks-");
		System.out.println("\tYou can identify and rate up to 5 food trucks!");

		userInput();
		System.out.println("That's all the trucks you can add! Thank you.");
		listMenu();
	}

	public void userInput() {
		boolean isInputting = true;
		int counter = 0;
		while (isInputting && counter != 5) {

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
				FoodTruck truck = new FoodTruck(name, foodType, rating, i);
				trucks[i] = truck;
				System.out.println("Thank you, the truck has been added.");
				counter++;
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
			int menuChoice = kb.nextInt();

			switch (menuChoice) {
			case 1:
				listTrucks();
				break;
			case 2:
				averageRating();
				break;
			case 3:
				highestRating();
				break;
			case 4:
				inMenu = false;
				break;
			default:
				System.out.println("Command not recognized.");

			}
		}
	}

	// returns number of trucks in array
	public int howManyTrucks() {
		// how many trucks are in the array?
		int truckNum = 0;
		for (int i = 0; i < 5; i++) {
			if (trucks[i] != null) {
				truckNum++;
			} else
				break;
		}
		return truckNum;
	}

	public void listTrucks() {
		int truckNum = howManyTrucks();
		// list trucks
		for (int i = 0; i < truckNum; i++) {
			System.out.println(trucks[i].toString());
		}
		if(truckNum == 0) {
			System.out.println("There are no trucks in the system.");
		}
	}

	public void averageRating() {
		int truckNum = howManyTrucks();
		// get average rating
		double ratingTotal = 0;

		for (int i = 0; i < truckNum; i++) {
			ratingTotal += trucks[i].getRating();
		}
		if (truckNum > 0) {
			System.out.println("The average truck rating is : " + (ratingTotal / truckNum));
		} else {
			System.out.println("There are no trucks in the system.");
		}
	}

	public void highestRating() {
		int truckNum = howManyTrucks();
		int highestRating = 0;

		FoodTruck highestRatedTruck = null;
		for (int i = 0; i < truckNum; i++) {

			if (trucks[i].getRating() > highestRating) {
				highestRatedTruck = trucks[i];
				highestRating = highestRatedTruck.getRating();
			}
		}
		if (highestRatedTruck != null) {
			System.out.println(highestRatedTruck.getName() + " is the highest rated truck at "
					+ highestRatedTruck.getRating() + " stars!\n Its staff is serving delicious " + highestRatedTruck.getFoodType()
					+ " on a street corner near you!");
		} else {
			System.out.println("There are no trucks in the system.");
		}
	}

	public static void main(String[] args) {
		FoodTruckApp start = new FoodTruckApp();
		start.run();
	}
}
