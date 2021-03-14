import java.util.*;
public class Question_2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("User GO with following question");
		System.out.print("Enter Your budget : ");
		int n = s.nextInt();
		ArrayList<String> name = new ArrayList<String>();
		ArrayList<String> quant = new ArrayList<String>();
		ArrayList<Integer> price = new ArrayList<Integer>();
		int sum = n;
		int choice;
		do{
			System.out.println("1.Add an item");		
		    System.out.println("2.Exit");
		    System.out.println("Enter your choice : ");
		    choice = s.nextInt();
		    if(choice == 1 && sum > 0)
		    {
		    	System.out.println("Enter Product");
		    	String a = s.next();
		    	System.out.println("Enter quantity");
		    	String b = s.next();
		    	System.out.println("Enter Price");
		    	int c = s.nextInt();
		    	if(sum < c)
			    {
			    	System.out.println("Over Price");
			    	
			    }
		    	else if(name.contains(a))
		    	{
		    		int ind = name.indexOf(a);
		    		quant.set(ind,b);
		    		price.set(ind,c);
		    		sum = (n - sum(price));
		    		System.out.println("Amount left " + sum);
		    	}
		    	else
		    	{
		    		name.add(a);
		    		quant.add(b);
		    		price.add(c);
		    		sum = (n - sum(price));
		    		System.out.println("Amount left " + sum);
		    	}	    	
		    	
		    }
		    else
		    {
		    	break;
		    }
		    
		    }while(choice!=2);
		if(price.contains(sum))
		{
			System.out.println("Amount left can buy you"+""+name.get(price.indexOf(sum)));
		}
		int g = name.size();
		System.out.println("Product name"+ " " + "Price" + " " + "Quantity");
	    for(int j = 0;j<g;j++)
	    {
	    	System.out.println(name.get(j)+ " " + price.get(j) + " " + quant.get(j));
	    }
		

	}
	public static int sum(List<Integer> list)
	{
		int s = 0;
		for (int i :list)
		{
			s+=i;
		}
		return s;
	}

}
