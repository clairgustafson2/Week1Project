
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//price of items
		double itemPrice1 = 88.95;
		double itemPrice2 = 9.76;
		System.out.println("The price of the black purse is" + " " + "$" + itemPrice1);
		System.out.println("The price of the movie ticket is" + " " + "$" + itemPrice2);
		
		//amount of money in wallet
		int walletAmount1 = 100;
		int walletAmount2 = 25;
		System.out.println("I have" + " " + "$" + walletAmount1 + " " + "in my wallet.");
		System.out.println("My husabnd has" + " " + "$" + walletAmount2 + " " + "in his wallet.");
				
		//A. amount of money in wallet after item is purchased
		double total = walletAmount1 - itemPrice1;
		double roundoff = Math.round(total*100.0)/100.0;
		System.out.println("I bought a purse and now have" + " " + "$" + roundoff + " " + "in my wallet.");
		
		//number of friends
		int numberOfFriends2019 = 13;
		int numberOfFriends2020 = 15;
		System.out.println("In 2019 I had" + " " + numberOfFriends2019 + " " + "friends.");
		System.out.println("In 2020 I had" + " " + numberOfFriends2020 + " " + "friends.");
		
		//age in years
		int age1 = 29;
		int age2 = 30;
		System.out.println("I am" + " " + age1 + " " + "years old.");
		System.out.println("I will be" + " " + age2 + " " + "years old in December.");
		
		//B. number of friends I've made each year based on my age variable and my number of friends variable
		System.out.println("The total number of friends I make each year is" + " " + age1 / numberOfFriends2019);
		
		//first names
		String firstName1 = "Clair";
		String firstName2 = "Derek";
		System.out.println("My first name is" + " " + firstName1);
		System.out.println("My husband's first name is" + " " + firstName2);
		
		//last names
		String lastName1 = "Gustafson";
		String lastName2 = "Jackson";
		System.out.println("My last name is" + " " + lastName1);
		System.out.println("My maiden name is" + " " + lastName2);
		
		//middle initials
		char middleInitial1 = 'J';
		char middleInitial2 = 'M';
		System.out.println("My middle initial is" + " " + middleInitial1);
		System.out.println("My husband's middle initial is" + " " + middleInitial2);
		
		//C. Full name
		System.out.println("My name is" + ' ' + firstName1 + ' ' + middleInitial1 + ' ' + lastName1);
	}

}
