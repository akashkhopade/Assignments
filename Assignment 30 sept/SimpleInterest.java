import java.util.Scanner;
class SimpleInterest{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the principal amount");
		double principal=sc.nextDouble();
		System.out.println("Enter the rate: ");
		double rate=sc.nextDouble();
		System.out.println("Enter the time :");
		double time=sc.nextDouble();
		double interest=(principal*time*rate)/100;
		System.out.println("Principal: "+principal);
		System.out.println("Interst Rate :"+rate);
		System.out.println("Time Duration: "+time);
		System.out.println("Simple Interest: "+interest);
		}
	}	