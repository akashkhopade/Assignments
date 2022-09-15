class patternhw9{
   public static void main(String args[]){
      for(int i=5;i>=0;i--)
	  {
	     int n=65;
		 for(int j=0;j<=i;j++)
		 {
		    System.out.print(" ");
         }
		 for(int k=0;k<=5-i;k++)
		 {
		    System.out.print((char)(n+k)+" ");
	     }
		 System.out.println();
	  }
}
}
	  