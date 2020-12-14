import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter sales : ");
		double sales = input.nextDouble();
		System.out.print("Enter hours worked : ");
		double hour = input.nextDouble();
		
		
		if(sales < 150) {
			double commission = 0;
			System.out.println("Commission:" + commission);
			System.out.println("Daily wages:" + (commission + (5*hour)));
		}
		else if (sales <= 300) {
			double commission = (sales*5/100);
			System.out.println("Commission:" + commission);
			System.out.println("Daily wages:" + (commission + (5*hour)));
		}
		else if (sales <= 500) {	
			double commission = (sales*10/100);
			System.out.println("Commission:" + commission);
			System.out.println("Daily wages:" + (commission + (5*hour)));
		}
		else if (sales >500) {
			double commission = (sales*15/100);
			System.out.println("Commission:" + commission);
			System.out.println("Daily wages:" + (commission + (5*hour)));
		}
		
	
		
	}
	}

