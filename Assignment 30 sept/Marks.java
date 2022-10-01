import java.util.Scanner;
public class Marks{
	public static void main(String args[]){
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the marks of 5 subject");
			float english=sc.nextFloat();
			float maths=sc.nextFloat();
			float marathi=sc.nextFloat();
			float hindi=sc.nextFloat();
			float science=sc.nextFloat();
			Percentgrade(english,maths,marathi,hindi,science);
			}
			static void Percentgrade(float english,float maths,float marathi,float hindi,float science)
			{
				float total;
				float average;
				float percentage;
				char grade;
				total=english+maths+marathi+hindi+science;
				average=(float)(total/5.0);
				percentage=(float)((total/500.0)*100);
				if(average>=90)
					grade='A';
				else if(average>=80 && average<90)
					grade='B';
				else if(average>=70 && average<80)
					grade='C';
				else if(average>=60 && average<70)
					grade='D';
				else
					grade='E';
					System.out.println("\n The total marks  + "+total+"/500.0");
					System.out.println("the average marks="+average);
					System.out.println("the percentage="+percentage+"%");
					System.out.println("the grade = "+grade+ " ");
			}
}
			
						