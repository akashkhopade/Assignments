import java.util.Scanner;
class Salary{
	public static void main(String args[]){
		double bs,gs,da,hra;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter basic Salary");
		bs=sc.nextDouble();
		if(bs<10000)
		{
			hra=((bs/100)*10);
			da=((bs/100)*90);
		}
		else
		{
			hra=2000;
			da=((bs/100)*98);
		}
		gs=bs+hra+da;
        System.out.println("BAsic salary :"+bs);
		System.out.println("HRA rs."+hra);
		System.out.println("DA :"+da);
		System.out.println("Gross salary Rs "+gs);
    }
}
	