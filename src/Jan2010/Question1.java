package Jan2010;
import java.util.*;

public class Question1 {

	public static void main(String[] args) {	

		int found = 1;		
		boolean[] prime= new boolean[10000000];
		Arrays.fill(prime, true);

		for(int i = 2;i<prime.length;i++)
		{
			if(prime[i]==true)
			{
				for(int j = i*2;j<prime.length;j = j +i)
				{
					prime[j]=false;

				}
				//System.out.println(i);
			}
		}
		for(int k = 2;k<prime.length;k++)
		{
			if(prime[k]==true)
			{
				found++;
			}
			if(found==78500)
			{
				System.out.println(k);
				break;
			}
			
		}

	}
}



