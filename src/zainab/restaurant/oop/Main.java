package zainab.restaurant.oop;

// Class representing a Restaurant.

class Restaurant
{
	// Instance variables (Attributes)

	private String name;
	private String address;
	private String phoneNumber;
	
	// Constructor to initialize restaurant data.
	Restaurant(String name, String address, String phoneNumber)
	{
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}
	
	// Class methods.
	public void openRestaurant()
	{
		System.out.println("The restaurant is now OPEN. Welcome! and Enjoy your meal!\n");
	}
	
	public void closeRestaurant() 
	{
		System.out.println("\nThe restaurant is now CLOSED. See you tomorrow! and Thank you for visiting!\n");
	}
	
	// Getters and Setters (Encapsulation).
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setAddress(String address)
	{
		this.address = address;
	}
	
	public String getAddress()
	{
		return address;
	}
	
	public void setPhoneNumber(String phoneNumber)
	{
		this.phoneNumber = phoneNumber;
	}
	
	public String getPhoneNumber()
	{
		return phoneNumber;
	}
	
	// Display restaurant information.
	public void dispalyInfo()
	{
		System.out.println("----------------------------------");
		System.out.println("----- Restaurant Information -----");
		System.out.println("Restaurant Name: " + name);
		System.out.println("Address: " + address);
		System.out.println("Phone Number: " + phoneNumber);
		System.out.println("----------------------------------");
	}
	
}

//Class representing a Person.
class Person
{
	// Instance variables (Attributes)
	private String name;
	private int id;
	
	// Constructor to initialize person data.
	Person(String name, int id)
		{
			this.name = name;
			this.id = id;
		}
	// Getters and Setters (Encapsulation).
		public void setName(String name)
		{
			this.name = name;
		}
		
		public String getName()
		{
			return name;
		}
		
		public void setId(int id)
		{
			this.id = id;
		}
		
		public int getId()
		{
			return id;
		}
		
		public String role()
		{
			return "I'm a person.";
		}
		
}

//Class representing a customer inherited from Person.
class Customer extends Person
{
	// Instance variables (Attributes)
	private String phoneNumber;
	private String email;

	// Constructor to initialize customer data.
	Customer(String name, int id, String phoneNumber, String email) 
	{
		super(name, id);
		this.phoneNumber = phoneNumber;
		this.email = email;
	}

	// Getters and Setters (Encapsulation).
	public String getPhoneNumber() 
	{
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) 
	{
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() 
	{
		return email;
	}

	public void setEmail(String email) 
	{
		this.email = email;
	}
	
	@Override
	public String role()
	{
		return "I'm a customer.";
	}
}

//Class representing an Employee inherited from Person.
class Employee extends Person
{
	// Instance variables (Attributes)
	private String jobTitle;
	private double salary;

	// Constructor to initialize customer data.
	Employee(String name, int id, String jobTitle, double salary) 
	{
		super(name, id);
		this.jobTitle = jobTitle;
		this.salary = salary;
		
	}

	// Getters and Setters (Encapsulation).
	public String getJobTitle() 
	{
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) 
	{
		this.jobTitle = jobTitle;
	}

	public double getSalary() 
	{
		return salary;
	}

	public void setSalary(double salary) 
	{
		if (salary > 0)
		{
			this.salary = salary;
		}
	}

	@Override
	public String role()
	{
		return "I'm an employee.";
	}
}


public class Main 
{

	public static void main(String[] args) 
	{
		Restaurant r = new Restaurant("Zainab Restaurant", "Palestine Ramallah - Main Street","0598771804");
		
		// Calling class methods.
		r.openRestaurant();
		
		r.setName(" Italy Restaurant ");
		r.getName();
		//System.out.println(r.getName());
		r.setAddress(" Palestine Ramallah - Jaffa Street");
		r.getAddress();
		//System.out.println(r.getAddress());
		r.setPhoneNumber(" 0598771804 ");
		r.getPhoneNumber();
		//System.out.println(r.getPhoneNumber());
		
		r.dispalyInfo();
		
		// Applying Polymorphism.
		Person p1 = new Customer("Layan", 101, "0597523079", "layan@gmail.com");
		Person p2 = new Employee("Ahmad", 202, "Waiter", 2500);
		
		System.out.println("\n" + p1.role() );
		System.out.println(p2.role());
		
		r.closeRestaurant();
		
		
	}

}
