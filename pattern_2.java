public class pattern_2
{
	public static void main(String[] args) 
	{   
		int alphabet = 65;
		for(int i=0; i<5; i++)
    		{


       			 for(int j=2*(5-i); j>=0; j--)
       			 {
            
           				 System.out.print(" ");
      			  }
      
        			for(int j=0; j<=i; j++)
       			 {
           
           				 System.out.print((char) alphabet + " ");
            				 alphabet++;
        			}         
       		        System.out.println();
  		  }


	}
}