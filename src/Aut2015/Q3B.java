package Aut2015;

public class Q3B {

	public static void main(String[] args) {
		
		
		System.out.println(unique("hello all the peoples we love Zoos and x rays machines lottery and unicorn babies in this queen run state kids helps juice the oranges and catch fish")); 

	}
	public static int unique(String s){
		
		int count = 0;
		
		for(int i=0;i<s.length();i++)
		{
			
			if(s.charAt(i)!=' ')
			{
				count++;
				for (int j = i+1; j < s.length(); j++) {
					
					if(s.charAt(i)==s.charAt(j)){
						
						s=s.replace(s.charAt(i), ' ');
						
					}


					
					
				}
			}
		}
		
		
		return count;
	}

}
