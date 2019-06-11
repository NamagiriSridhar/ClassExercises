import java.util.*;
public class test 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		arrayList();
		hashMap();
	}
	public static void arrayList()
	{
		ArrayList <Integer> userNumbers = new ArrayList <Integer>(5);
		int min = 0;
		int max = 0;
		do
		{
			System.out.print("Please enter a number ");
		    int input = sc.nextInt();
		    userNumbers.add(input);
		    if(userNumbers.size()==1)
		    {
		    	min = input;
		    	max = input;
		    }
		    else
		    {
		    	if(input < min) min = input;
		    	if(input > max) max = input;
		    }
		}while (userNumbers.size()<5);
		int sum = 0;
		int product =1;
		for (Integer number : userNumbers){
			sum +=number;
			product *= number;			
		}
		System.out.println("The numbers entered are " + userNumbers);
		System.out.println("Sum is " + sum);
		System.out.println("Product is " + product);
		System.out.println("Minimum number is " + min);
		System.out.println("Minimum number is " + Collections.min(userNumbers));
		System.out.println("Maximum number is " + max);
		System.out.println("Maximum number is " + Collections.max(userNumbers));
	}
	public static void hashMap()
	{
		HashMap<String, String> car = new HashMap<>();// Model is key ,Make is value
		car.put("Civic", "Honda");
		car.put("Camry", "Toyota");
		car.put("Corolla", "Toyota");
		car.put("Accord", "Honda");
		car.put("Escape", "Ford");
		car.put("Altima", "Nissan");
		car.put("Beetle", "volkswagen");
		car.put("Camaro","Chevy");
		car.put("Mustang","Ford");
		car.put("Tundra","Toyota");
		char ask;
		String carModel;
		String carMake;
		do
		{
		    System.out.println("What car model you are looking for?");
		    carModel = sc.next();
		    if(car.containsKey(carModel)==true)
		    {	
		    	carMake  = car.get(carModel);
		    	System.out.println("Oh, you're looking for a "+carModel +"? Our " + carMake + " selection is right over here...");
		    }
		    else
		    {
		    	System.out.println("Sorry we dont have that model ...");
		    }
			System.out.print("Do you want to look for a different model (y/n)? ");
			 ask = sc.next().charAt(0);		   
		}while(ask =='y');
	}
}
