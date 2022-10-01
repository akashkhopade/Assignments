import java.util.Scanner;
class Fahrenheit{
	public static void main(String args[]){
		double celcius,fahrenheit;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter temprature in Fahrenheit:");
		fahrenheit=sc.nextDouble();
		celcius=5*((fahrenheit-32)/9);
		System.out.println("Temprature in Ceelcius:"+celcius);
		}
}
		