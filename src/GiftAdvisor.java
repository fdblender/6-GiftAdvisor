/* Your task is to develop a program that will prompt the user for the recipient's gender. 
 * You'll also ask for the giver's price range. Use high, medium or low.
 * Also prompt for the age. * 
 */
import java.util.Scanner;

public class GiftAdvisor {
	
	public static void main(String[] args) {
		String gender;
		String priceRange;
		String age;
		int GIFT = 0;
		int GENDER = 1;
		int PRICE = 2;
		int AGE = 3;
		boolean foundgifts = false;
		
		String[][] gifts = {
				{"weekend getaway", "F", "high", "adult"},
				{"wine", "F", "low", "adult"},
				{"selfie stick", "F", "low", "adult"},
				{"Perfume", "F", "med", "adult"},
				{"smart TV", "M", "high", "adult"},
				{"Apple watch", "M", "high", "adult"},
				{"books", "M", "low", "adult"},
				{"shoes", "M", "low", "adult"},
				{"guitar", "M", "med", "teen"},
				{"stuffed animal", "F", "low", "child"},
				{"legos", "M", "low", "child"},
				{"computer", "F", "high", "child"},
				{"bicycle", "M", "med", "child"},
				{"car", "M", "high", "teen"},
				{"car", "F", "high", "teen"},
		};
		
	
		// prompt for gender, price range, age
	Scanner scan = new Scanner(System.in);
	System.out.print("Enter the gender (M/F): ");
	gender = scan.next();
	gender = gender.toUpperCase();
	System.out.print("Enter the price range (high/med/low): ");
	priceRange = scan.next();
	priceRange = priceRange.toLowerCase();
	System.out.print("Enter the age (adult/teen/child): ");
	age = scan.next();
	age = age.toLowerCase();
	
	for (int i=0;i<=gifts.length-1;i++) {		
			
		if ((gifts[i][GENDER].equals(gender)) && (gifts[i][PRICE].equals(priceRange))
				&& (gifts[i][AGE].equals(age))){
			
			System.out.println(gifts[i][GIFT] + " " +gifts[i][GENDER] + " "
					+ gifts[i][PRICE] + " " + gifts[i][AGE]);
			foundgifts = true;
		}	
	
	}
	if (!foundgifts) {
		System.out.println("No gift ideas available. Get them a gift certificate!");	
		
	}
	System.out.println("Exiting program...");	
	
	}

}
