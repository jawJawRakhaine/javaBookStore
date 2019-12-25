import java.util.Scanner;

public class BookStore {
	
	static Scanner myScanner = new Scanner(System.in);
	static String []books = {"Java","C","Python"};
	static final double []price = {520,320,450}; //Java=>520,C=>320,Python=>450
	static double javaBookPrice,cBookPrice,pythonBookPrice;
	static final double studentDiscount = 0.3;
	static final double teacherDiscount = 0.4;
	static final double alientDiscount = 0.0;
		
	public static void main(String[] args) {
		
		prln("\t----------WELCOME TO OUR BOOKSTORE----------");
		prln("\t\tWhich book do you want?");
		pr("\t\tBook Name: ");
		String userChoice = myScanner.nextLine();
		
		if (books[0].toLowerCase().equals(userChoice.toLowerCase())) {
			
			prln("\t\tYou opted for: "+books[0]+" Book\n");
			calculatePrice(userChoice);
			
		}
		else if (books[1].toLowerCase().equals(userChoice.toLowerCase())) {
			
			prln("\t\tYou opted for: "+books[1]+" Book\n");
			calculatePrice(userChoice);
		}
		else if (books[2].toLowerCase().equals(userChoice.toLowerCase())) {
			
			prln("\t\tYou opted for: "+books[2]+" Book\n");
			calculatePrice(userChoice);
		}
		else {
			prln("\t\tSorry! We don't have "+userChoice+" Book\n");
		}
		
		
	}
	
	public static void calculatePrice(String userChoice) {
		
		prln("\t\tAre you Student,Teacher or Alien?");
		pr("\t\tOccupation: ");
		String answer = myScanner.nextLine();
		
		if (answer.toLowerCase().equals("teacher")) {
//			price = price-(price*teacherDiscount);
//			showPrice(price);
			if (books[0].toLowerCase().equals(userChoice.toLowerCase())) {
				prln("\t\tJava book actual price: "+price[0]);
				javaBookPrice = price[0]-(price[0]*teacherDiscount);
				showPrice(javaBookPrice);
			}
			else if (books[1].toLowerCase().equals(userChoice.toLowerCase())) {
				prln("\t\tC book actual price: "+price[1]);
				cBookPrice = price[1]-(price[1]*teacherDiscount);
				showPrice(cBookPrice);
			}
			else if (books[2].toLowerCase().equals(userChoice.toLowerCase())) {
				prln("\t\tPython book actual price: "+price[2]);
				pythonBookPrice = price[2]-(price[2]*teacherDiscount);
				showPrice(pythonBookPrice);
			}
		}
		else if (answer.toLowerCase().equals("student")) {
//			price = price-(price*studentDiscount);
//			showPrice(price);
			
			if (books[0].toLowerCase().equals(userChoice.toLowerCase())) {
				prln("\t\tJava book actual price: "+price[0]);
				javaBookPrice  = price[0]-(price[0]*studentDiscount);
				showPrice(javaBookPrice);
			}
			else if (books[1].toLowerCase().equals(userChoice.toLowerCase())) {
				prln("\t\tC book actual price: "+price[1]);
				cBookPrice = price[1]-(price[1]*studentDiscount);
				showPrice(cBookPrice);
			}
			else if (books[2].toLowerCase().equals(userChoice.toLowerCase())) {
				prln("\t\tPython book actual price: "+price[2]);
				pythonBookPrice = price[2]-(price[2]*studentDiscount);
				showPrice(pythonBookPrice);
			}
			
			
		}
		else if (answer.toLowerCase().equals("alien")) {
//			price = price-(price*alientDiscount);
//			showPrice(price);
			
			if (books[0].toLowerCase().equals(userChoice.toLowerCase())) {
				prln("\t\tJava book actual price: "+price[0]);
				prln("\t\tYou are alien. So, you don't get any discount");
				javaBookPrice = price[0]-(price[0]*alientDiscount);
				showPrice(javaBookPrice);
			}
			else if (books[1].toLowerCase().equals(userChoice.toLowerCase())) {
				prln("\t\tC book actual price: "+price[1]);
				prln("\t\tYou are alien. So, you don't get any discount");
				cBookPrice = price[1]-(price[1]*alientDiscount);
				showPrice(cBookPrice);
			}
			else if (books[2].toLowerCase().equals(userChoice.toLowerCase())) {
				prln("\t\tPython book actual price: "+price[2]);
				prln("\t\tYou are alien. So, you don't get any discount");
				pythonBookPrice = price[2]-(price[2]*alientDiscount);
				showPrice(pythonBookPrice);
			}
		}
		else {
			prln("\t\tSorry! We can't serve you..!");
		}
	}
	
	
	public static void showPrice(double price) {
		prln("\t\tYour total payable amount: "+price+" taka");
		prln("\t-------THANK YOU FOR SHOPPING FROM OUR BOOKSTORE-------");
	}
	
	public static void prln(Object anyObject) {
		System.out.println(anyObject);
	}
	
	public static void pr(Object anyObject) {
		System.out.print(anyObject);
	}

}

