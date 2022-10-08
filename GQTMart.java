package NewJavaProjects;

import java.util.Scanner;
class Automobile {
	int auto_choice=0;
	void list() {
		System.out.println("Fetching Available Items");
		System.out.println("1. Cars");
		System.out.println("2. Bikes");
		System.out.println("3. Scooters");
		System.out.println("4. Bicycle"); 
		Automobile a = new Automobile();
		a.choice();
		}
	void choice() {
		 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Choice");
		int choice1 = sc.nextInt();
		Automobile a = new Automobile();
		if(choice1 == 1) {
			System.out.println("Car Details : ");
			a.Product_Details1();
		}
		if(choice1 == 2) {
			System.out.println("Bikes Details : ");
			a.Product_Details2();
		}
		if(choice1 == 3) {
			System.out.println("Scooters Details : ");
			a.Product_Details3();
		}
		if(choice1 == 4) {
			System.out.println("Bicycle Details : ");
			a.Product_Details4();
		}
	}		
	void Product_Details1() {
		Automobile a = new Automobile();
		System.out.println("Make - Audi");
		System.out.println("Model - Audi Q7");
		System.out.println("Engine - 5000 cc");
		System.out.println("Capacity - 3+1");
		System.out.println("Colour - Black/White");
		System.out.println("Cost - 4800000");
		a.buypage();
	}
	void Product_Details2() {
		Automobile a = new Automobile();
		System.out.println("Make - Royal Enfield");
		System.out.println("Model - Classic 500");
		System.out.println("Engine - 500 cc");
		System.out.println("Capacity - 2");
		System.out.println("Colour - Black/Desert Storm/Maroon");
		System.out.println("Cost - 223000");
		a.buypage();
	}
	void Product_Details3() {
		Automobile a = new Automobile();
		System.out.println("Make - Honda");
		System.out.println("Model - Activa 6G");
		System.out.println("Engine - 109 cc");
		System.out.println("Capacity - 2");
		System.out.println("Colour - Black/White/Maroon/Blue");
		System.out.println("Cost - 102000");
		a.buypage();
	}
	void Product_Details4() {
		Automobile a = new Automobile();
		System.out.println("Make - Ranger");
		System.out.println("Model - AXN DX");
		System.out.println("Colour - White/Black");
		System.out.println("Capacity - 2");
		System.out.println("Other Details - With 5 gears");
		System.out.println("Cost - 12000");
		a.buypage();
	}
	void buypage() {
		System.out.println("Do You want to Buy this Product ?, Say Y or N ");
		Automobile a = new Automobile();
		Scanner sc = new Scanner(System.in);
		String st=sc.next();
		if(st.equalsIgnoreCase("Y")) {
			a.Payment();
			}
		else {
			System.out.println("Thank You");
		}
		ContinueShopping cs = new ContinueShopping();
		cs.Recall();
	}
	void Payment() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Make your Payment.  Y or N ");
		String st=sc.next();
		if(st.equalsIgnoreCase("Y")) {
			ModeofPayment pm = new ModeofPayment();
			try {
				pm.Methods();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("You Purchased this item");
			}
		else {
			System.out.println("Payment Unsuccessful you did not Purchase the Product");
		}
		ContinueShopping cs = new ContinueShopping();
		cs.Recall();
	}

}
class Electronics {
	int auto_choice=0;
	void list() {
		System.out.println("Fetching Available Items");
		System.out.println("1. Mobile Phones");
		System.out.println("2. Televisions");
		System.out.println("3. Computers");
		System.out.println("4. Fans");
		Electronics e = new Electronics();
		e.choice();
		}
	void choice() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Choice");
		int choice1 = sc.nextInt();
		Electronics e = new Electronics();
		if(choice1 == 1) {
			System.out.println("Mobile Phone Details : ");
			e.Product_Details1();
		}
		if(choice1 == 2) {
			System.out.println("Televisions Details : ");
			e.Product_Details2();
		}
		if(choice1 == 3) {
			System.out.println("Computers Details : ");
			e.Product_Details3();
		}
		if(choice1 == 4) {
			System.out.println("Fans Details : ");
			e.Product_Details4();
		}
	}		
	void Product_Details1() {
		Electronics e = new Electronics();
		System.out.println("Company - Samsung");
		System.out.println("Model - Galaxy 15S");
		System.out.println("RAM/Storage - 8GB/128GB");
		System.out.println("Colour - Pearl white/Matte Black/Rose Pink");
		System.out.println("Cost - 32999");
		e.buypage();
	}
	void Product_Details2() {
		Electronics e = new Electronics();
		System.out.println("Company - Sony");
		System.out.println("Model - Bravia 1258BTS");
		System.out.println("Type - Smart TV");
		System.out.println("Dimensions - 48 inch/52 inch/32 inch");
		System.out.println("Cost - 32999");
		e.buypage();
	}
	void Product_Details3() {
		Electronics e = new Electronics();
		System.out.println("Company - Dell");
		System.out.println("Model - Inspiron 800");
		System.out.println("RAM/Storage - 8GB/2TB HDD/512GB SSD");
		System.out.println("Colour-Silver/Black/Blue");
		System.out.println("Cost - 52499");
		e.buypage();
	}
	void Product_Details4() {
		Electronics e = new Electronics();
		System.out.println("Company - Orient");
		System.out.println("Model - PSPO");
		System.out.println("Type - Cealing Fan");
		System.out.println("Colour-White/Maroon");
		System.out.println("Cost - 2499");
		e.buypage();
	}
	void buypage() {
		System.out.println("Do You want to Buy this Product ?, Say Y or N ");
		Electronics e = new Electronics();
		Scanner sc = new Scanner(System.in);
		String st=sc.next();
		if(st.equalsIgnoreCase("Y")) {
			e.Payment();
			}
		else {
			System.out.println("Thank You");
			ContinueShopping cs = new ContinueShopping();
			cs.Recall();
		}
	}
	void Payment() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Make your Payment.  Y or N ");
		String st=sc.next();
		if(st.equalsIgnoreCase("Y")) {
			ModeofPayment pm = new ModeofPayment();
			try {
				pm.Methods();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("You Purchased this item");
			}
		else {
			System.out.println("Payment Unsuccessful you did not Purchase the Product");
		}
		ContinueShopping cs = new ContinueShopping();
		cs.Recall();
	}
}
class Clothings {
	int auto_choice=0;
	void list() {
		System.out.println("Fetching Available Items");
		System.out.println("1. Shirts");
		System.out.println("2. Trousers");
		System.out.println("3. Hoodies");
		System.out.println("4. Sweaters");
		Clothings c = new Clothings();
		c.choice();
		}
	void choice() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Choice");
		int choice1 = sc.nextInt();
		Clothings c = new Clothings();
		if(choice1 == 1) {
			System.out.println("Shirts Details : ");
			c.Product_Details1();
		}
		if(choice1 == 2) {
			System.out.println("Trousers Details : ");
			c.Product_Details2();
		}
		if(choice1 == 3) {
			System.out.println("Hoodies Details : ");
			c.Product_Details3();
		}
		if(choice1 == 4) {
			System.out.println("Sweaters Details : ");
			c.Product_Details4();
		}
	}		
	void Product_Details1() {
		Clothings c = new Clothings();
		System.out.println("Material - Cotton");
		System.out.println("Fabric - Cotton Linen");
		System.out.println("Size - S/M/L/XL/XXL");
		System.out.println("Cost - 1200");
		c.buypage();
	}
	void Product_Details2() {
		Clothings c = new Clothings();
		System.out.println("Material - Jeans");
		System.out.println("Fabric - Denims");
		System.out.println("Size - 28/30/32/34/36");
		System.out.println("Cost - 900");		
		c.buypage();
	}
	void Product_Details3() {
		Clothings c = new Clothings();
		System.out.println("Material - Mixed");
		System.out.println("Fabric - Cotton");
		System.out.println("Size - S/M/L/XL/XXL");
		System.out.println("Cost - 400");
		c.buypage();
	}
	void Product_Details4() {
		Clothings c = new Clothings();
		System.out.println("Material - Woolen");
		System.out.println("Fabric - Pure Wool");
		System.out.println("Size - S/M/L/XL/XXL");
		System.out.println("Cost - 699");
		c.buypage();
	}
	void buypage() {
		System.out.println("Do You want to Buy this Product ?, Say Y or N ");
		Clothings c = new Clothings();
		Scanner sc = new Scanner(System.in);
		String st=sc.next();
		if(st.equalsIgnoreCase("Y")) {
			c.Payment();
			}
		else {
			System.out.println("Thank You");
			ContinueShopping cs = new ContinueShopping();
			cs.Recall();
		}
	}
	void Payment() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Make your Payment.  Y or N ");
		String st=sc.next();
		if(st.equalsIgnoreCase("Y")) {
			ModeofPayment pm = new ModeofPayment();
			try {
				pm.Methods();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("You Purchased this item");
			}
		else {
			System.out.println("Payment Unsuccessful you did not Purchase the Product");
		}
		ContinueShopping cs = new ContinueShopping();
		cs.Recall();
	}
}
class HouseholdItems {
	int auto_choice=0;
	void list() {
		System.out.println("Fetching Available Items");
		System.out.println("1. Utensils");
		System.out.println("2. Furnitures");
		System.out.println("3. Carpets");
		System.out.println("4. Detergents");
		HouseholdItems h = new HouseholdItems();
		h.choice();
		}
	void choice() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Choice");
		int choice1 = sc.nextInt();
		HouseholdItems h = new HouseholdItems();
		if(choice1 == 1) {
			System.out.println("Utensils Details : ");
			h.Product_Details1();
		}
		if(choice1 == 2) {
			System.out.println("Furnitures Details : ");
			h.Product_Details2();
		}
		if(choice1 == 3) {
			System.out.println("Carpets Details : ");
			h.Product_Details3();
		}
		if(choice1 == 4) {
			System.out.println("Detergent Details : ");
			h.Product_Details4();
		}
	}		
	void Product_Details1() {
		HouseholdItems h = new HouseholdItems();
		System.out.println("Material - Steel");
		System.out.println("High Quality Stainless Steel");
		System.out.println("Available in Many Different Sizes");
		System.out.println("Cost - Depends on Size");
		h.buypage();
	}
	void Product_Details2() {
		HouseholdItems h = new HouseholdItems();
		System.out.println("Material - Wooden");
		System.out.println("Type - Sofa Set");
		System.out.println("Available in Many Different Designs");
		System.out.println("Cost - 17000");
		h.buypage();
	}
	void Product_Details3() {
		HouseholdItems h = new HouseholdItems();
		System.out.println("Material - Cotten+Polyster");
		System.out.println("Type - Floor Carpet");
		System.out.println("Colour - Red/Blue/Orange/Maroon");
		System.out.println("Cost - 999");
		h.buypage();
	}
	void Product_Details4() {
		HouseholdItems h = new HouseholdItems();
		System.out.println("Company - SurfExcel");
		System.out.println("Type - Washing Detergent");
		System.out.println("Features - Can be used fot all type of Fabrics");
		System.out.println("Pack - 1Kg");
		System.out.println("Cost - 550");;
		h.buypage();
	}
	void buypage() {
		System.out.println("Do You want to Buy this Product ?, Say Y or N ");
		HouseholdItems h = new HouseholdItems();
		Scanner sc = new Scanner(System.in);
		String st=sc.next();
		if(st.equalsIgnoreCase("Y")) {
			h.Payment();
			}
		else {
			System.out.println("Thank You");
			ContinueShopping cs = new ContinueShopping();
			cs.Recall();
		}
	}
	void Payment() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Make your Payment.  Y or N ");
		String st=sc.next();
		if(st.equalsIgnoreCase("Y")) {
			ModeofPayment pm = new ModeofPayment();
			try {
				pm.Methods();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("You Purchased this item");
			}
		else {
			System.out.println("Payment Unsuccessful you did not Purchase the Product");
		}
		ContinueShopping cs = new ContinueShopping();
		cs.Recall();
	}
}
class Restore {
	void Refresh () {
		System.out.println("Welcome to GQT Shopping Mart");
		System.out.println("Available Product Categories are : ");
		System.out.println("1. Automobiles 2. Electronics Gadgets 3. Clothing 4. Household items");
		System.out.println("Enter your choice : ");
		Scanner sc = new Scanner(System.in);
		int choice1 = sc.nextInt();
		if (choice1==1) {
			System.out.println("Welcome to the world of Automobiles");
			Automobile a = new Automobile();
			a.list();
	}
		else if (choice1==2) {
			System.out.println("Welcome to the world of Electronics");
			Electronics e = new Electronics();
			e.list();
			
		}
		else if (choice1==3) {
			System.out.println("Welcome to the world of Fashion and Styling");
			Clothings c = new Clothings();
			c.list();
	}
		else if (choice1==4) {
			System.out.println("Welcome to the world of Household Items");
			HouseholdItems h = new HouseholdItems();
			h.list();
		}
	}
}
class ContinueShopping {
	void Recall() {
		System.out.println("Do you want to Continue with your Shopping ? Say Y or N");
		Restore r = new Restore();
		Scanner sc = new Scanner(System.in);
		String st = sc.next();
		if(st.equalsIgnoreCase("Y")) {
			r.Refresh();
		}
			else {
				System.out.println("Thank You !!!");
				System.out.println("Visit Again..!");
				System.exit(0);
		}
	}
}
class ModeofPayment {
	void Methods() throws InterruptedException {
		System.out.println("The available Payment Methods are : ");
		System.out.println("1. Credit/Debit Card");
		System.out.println("2. UPI");
		System.out.println("3. Internet Banking");
		System.out.println("4. Cash");
		System.out.println("Enter your Choice : ");
		Scanner sc = new Scanner(System.in);
		int choice2 = sc.nextInt();
		if (choice2==1) {
			System.out.println("Please Enter your Card Number");
			long cardno = sc.nextLong();
			System.out.println("Verifying your Card Details....");
			Thread.sleep(2000);
			System.out.println("Please Enter Expiry Month and Year");
			String exp=sc.next();
			Thread.sleep(2000);
			System.out.println("Please Enter the CVV");
			int cvv = sc.nextInt();
			Thread.sleep(2000);
			System.out.println("Please Enter the OTP received on your registered Mobile number");
			int otp = sc.nextInt();
			Thread.sleep(2000);
	}
		else if (choice2==2) {
			System.out.println("Please enter your UPI registered Mobile Number");
			long num = sc.nextLong();
			System.out.println("Verifying the Mobile Number....");
			Thread.sleep(2000);
			System.out.println("Please approve your transaction from the UPI Application");
			Thread.sleep(5000);
			System.out.println("UPI Transaction Approved Successfully");
		}
		else if (choice2==3) {
			System.out.println("Please enter your bank name");
			String bn=sc.next();
			Thread.sleep(2000);
			System.out.println("Please enter your INB user name");
			String un=sc.next();
			System.out.println("Confirming User with the Bank....");
			Thread.sleep(2000);
			System.out.println("Please enter your INB Password");
			String pw=sc.next();
			Thread.sleep(2000);
			System.out.println("Please Enter the OTP received on your registered Mobile number");
			int otp=sc.nextInt();
			Thread.sleep(2000);
		}
		else if (choice2==4) {
			System.out.println("Please pay your cash");
			Thread.sleep(3000);
			System.out.println("Cash Received. Thank You!!!");
		}
	}
	
}
public class GQTMart {
	public static void main(String[] args) {
		Restore r = new Restore();
		r.Refresh();
	}
}

