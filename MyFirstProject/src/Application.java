
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String firstName = "Andrew";
		String middleName = "J.";
		String lastName = "Liam";
		int age = 29;
		String product1 = "office chair";
		float itemPrice = (100.00F);
		int amtOfFriends = 50;
		
		float InmoneyWallet = 100;
		float OutmoneyWallet = 20;
		float CurrentwalletAmt= (InmoneyWallet - OutmoneyWallet);
		
		System.out.println("My full name is: " + firstName + " " + middleName + " " + lastName);
		
		System.out.println("I am " + age + " years old and my current friend count is " + amtOfFriends);
		
		System.out.println("I just bought an " + product1 + " on Amazon for $" + itemPrice);
		
		System.out.println("The current balance in my wallet $" + CurrentwalletAmt);
		
	}

}
