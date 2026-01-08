package zainab.restaurant;

class Restaurant
{
	String name;
	String address;
	String phoneNumber;
	
	public void openRestaurant()
	{
		System.out.println("The restaurant is now OPEN. Welcome! and Enjoy your meal!");
	}
	
	public void closeRestaurant() 
	{
		System.out.println("The restaurant is now CLOSED. See you tomorrow! and Thank you for visiting!");
	}
	
	public void displyInfo()
	{
		System.out.println("----- Restaurant Information -----");
		System.out.println("Restaurant Name: " + name);
		System.out.println("Address: " + address);
		System.out.println("Phone Number: " + phoneNumber);
		System.out.println("----------------------------------");
	}
}

public class Main 
{

	public static void main(String[] args) 
	{
		Restaurant r = new Restaurant();
		r.name = "Zainab Restaurant";
		r.address = "Palestine Ramallah - Main Street";
		r.phoneNumber = "0598771804";
		
		r.openRestaurant();
		r.displyInfo();
		r.closeRestaurant();
	}
}