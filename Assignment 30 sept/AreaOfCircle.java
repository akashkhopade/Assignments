import java.util.Scanner;
import java.lang.Math;
class AreaofCircle{
	public static void main(String args[]){
	int choice;
	double radius,circumference,diameter,area;
	Scanner sc=new Scanner(System.in);
	System.out.println("1. if the radius is known");
	System.out.println("2. of the diameter is known");
	System.out.println("3.If the circumference is known");
	System.out.println("Enter your choice");
	choice=sc.nextInt();
	switch(choice)
	{
		case 1:
			System.out.print("Enter the radius of circle: ");
			radius=sc.nextDouble();
			area=(Math.PI*(radius*radius));
			System.out.print("The area of the circle is :"+area);
			break;
		case 2:
			System.out.print("Enter the diameter of the circle :");
			diameter=sc.nextDouble();
			area=Math.PI*(diameter*diameter)/4;
			System.out.println("THe area of the circle is:"+area);
			break;
		case 3:
			System.out.println("Enter the Circumference of the circle: ");
			circumference=sc.nextDouble();
			area=(circumference+circumference)/(4*Math.PI);
			System.out.print("The area of the circle is: "+area);
			break;
		default :
			System.out.println("invalid choice!");
}
}
}
			
	
	