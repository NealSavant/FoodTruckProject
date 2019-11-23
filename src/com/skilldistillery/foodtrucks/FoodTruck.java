package com.skilldistillery.foodtrucks;

public class FoodTruck {
	// F I E L D S
	private String name;
	private String foodType;
	private int rating;
	private static int id;

	// C O N S T R U C T O R
	public FoodTruck(String name, String foodType, int rating, int id) {
		this.name = name;
		this.foodType = foodType;
		this.rating = rating;
		FoodTruck.id = id;
	}

	// M E T H O D S
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@SuppressWarnings("static-access")
	public int getId() {
		return this.id;
	}

	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Food Truck: ");
		builder.append(name);
		builder.append(", Food Type = ");
		builder.append(foodType);
		builder.append(", Rating = ");
		builder.append(rating);
		builder.append(", ID: ");
		builder.append(this.getId());
		return builder.toString();
	}

}
