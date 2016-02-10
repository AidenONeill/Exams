package Aut2015;

public class Q3C {

	public static void main(String[] args) {

		int x = 2520;
		
		while (true)
		{
		    boolean all = true;
		    for (int i = 11; i < 21; i++)
		    {
		         if ( x % i != 0 )
		        {
		            all = false;
		            break;
		        }
		    }
		    if (all==true)
		    {
		        System.out.println( x );
		        System.exit(0);
		    }

		    x++;
		}
		
		
			
			
			

		
		
	}

}
