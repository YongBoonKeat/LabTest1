import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of items: ");
	    int item1 = input.nextInt();
	    if(item1==1)
	    	oneItem();
	    else if(item1==2)
	    	twoItem();
	    else if(item1==3)
	    	threeItem();
	    else
	    	 System.out.print("Invalid number !!!");
	}
		
public static void oneItem() {
	    	double discount;
	    	double totalpaid;
	    	Scanner input = new Scanner(System.in);
	    	 System.out.print("Enter price of first item: ");
	    	    double price1 = input.nextInt();
	    	    System.out.print("Enter quantity of first item: ");
	    	    double quantity1 = input.nextInt();
	    	    
	    	    double totalprice = price1*quantity1;
	    	    		
	    	    if (totalprice >=100)
	    	    {
	    	    	discount=totalprice*20/100;
	    	    	totalpaid=totalprice-discount;
	    	    }
	    	    else 
	    	    {
	    	    	discount=totalprice*10/100;
	    	    	totalpaid=totalprice-discount;
	    	    }
	    	    
	    	    
	    	    System.out.println("Total price:" + totalprice);
	    	    System.out.println("Discount received:" + discount);
	    	    System.out.println("Price to be paid:" + totalpaid);
	    	
	    }

	    public static void twoItem() {
	    	double discount;
	    	double totalpaid;
	    	Scanner input = new Scanner(System.in);
	    	 System.out.print("Enter price of first item: ");
	    	 double price1 = input.nextInt();
	    	 System.out.print("Enter quantity of first item: ");
	    	 double quantity1 = input.nextInt();
	    	 
	    	 double total1 = price1*quantity1;
	    			 
	    	 System.out.print("Enter price of second item: ");
	    	 double price = input.nextInt();
	    	 System.out.print("Enter quantity of second item: ");
	    	 double quantity = input.nextInt();
	    	 
	    	 
	    	 double total2=price*quantity;
	    	 double totalprice = total1+total2;
	    	 
	    	    if (totalprice >=100)
	    	    {
	    	    discount=totalprice*20/100;
	    	    totalpaid=totalprice-discount;
	    	    }
	    	    else 
	    	    {
	    	    discount=totalprice*10/100;
	    	    totalpaid=totalprice-discount;
	    	    }
	    	    
	    	    
	    	    
	    	    System.out.println("Total price:" + totalprice);
	    	    System.out.println("Discount received:" + discount);
	    	    System.out.println("Price to be paid:" + totalpaid);
	    	
	    }

	    public static void threeItem() {
	    	double discount;
	    	double totalpaid;
	    	Scanner input = new Scanner(System.in);
	    	 System.out.print("Enter price of first item: ");
	    	 double price1 = input.nextInt();
	    	    System.out.print("Enter quantity of first item: ");
	    	    double quantity1 = input.nextInt();
	    	    
	    	    double total1 =+ price1*quantity1;
	    	    		
	    	    System.out.print("Enter price of second item: ");
	    	    double price2 = input.nextInt();
	    		 System.out.print("Enter quantity of second item: ");
	    		 double quantity2 = input.nextInt();
	    		 
	    		 double total2 =+ price2*quantity2;
	    		 
	    		 System.out.print("Enter price of third item: ");
	    		 double price3 = input.nextInt();
	    		 System.out.print("Enter quantity of third item: ");
	    		 double quantity3 = input.nextInt();
	    		 
	    		double total3 =+ price3*quantity3;
	    		 
	    		double totalprice = total1+total2+total3;
	    		
	    	    if (totalprice >=100)
	    	    {
	    	    discount=totalprice*20/100;
	    	    totalpaid=totalprice-discount;
	    	    }
	    	    else 
	    	    {
	    	    discount=totalprice*10/100;
	    	    totalpaid=totalprice-discount;
	    	    }
	    	    
	    	    System.out.println("Total price:" + totalprice);
	    	    System.out.println("Discount received:" + discount);
	    	    System.out.println("Price to be paid:" + totalpaid);
	    		
	}


	}

