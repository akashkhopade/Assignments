class Patternhww3{
   public static void main(String args[]){
      for(int i=9;i>=0;i--)
	  {
	     
		 for(int j=1;j<=i;j++)
		 {
		    System.out.print(" ");
         }
		 for(int k=1;k<=9-i;k++)
		 {
		    System.out.print("*"+" ");
	     }
		 System.out.println();
	  }
}
}