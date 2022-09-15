class Patternhw13{
   public static void main(String args[]){
      for(int i=0;i<5;i++)
	  {
		   for(int j=5;j>i;j--)
		   {
			   System.out.print(" ");
		   }
		   for(int k=0;k<=i;k++)
		   {
		       int n=65;
			   System.out.print((char)(i+n)+" ");
		   }
		   System.out.println();
	  }
   }
}