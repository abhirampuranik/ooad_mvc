package com.example.handlingformsubmission;

public class Car {

	private long id;
	private String OwnerName;
	private String CarName;
	private String color;


	Car(){}

	Car(long id, String OwnerName, String CarName, String color)
	{
		this.id = id;
		this.OwnerName = OwnerName;
		this.CarName = CarName;
		this.color = color;
	}


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getOwnerName() {
		return OwnerName;
	}

	public void setOwnerName(String OwnerName) {
		this.OwnerName = OwnerName;
	}

	public String getCarName() {
		return CarName;
	}

	public void setCarName(String CarName) {
		this.CarName = CarName;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return String.format(
				"Car --> id=%s, OwnerName='%s', CarName='%s', Color='%s' ",
				id, OwnerName, CarName, color);
	}


}
