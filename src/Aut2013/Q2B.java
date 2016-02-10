package Aut2013;

import java.util.Stack;

public class Q2B {

	public static void main(String args[] )
	{
		System.out.println(CheckBrackets("({[]})"));

	}
	public static boolean CheckBrackets(String s1)
	{
		if (s1.isEmpty())
			return true;

		Stack<Character> mystack = new Stack<Character>();
		for (int i = 0; i < s1.length(); i++)
		{
			char current = s1.charAt(i);
			if (current == '{' || current == '(' || current == '[')
			{
				mystack.push(current);
			}


			if (current == '}' || current == ')' || current == ']')
			{
				if (mystack.isEmpty())
					return false;

				char last = mystack.peek();
				if (current == '}' && last == '{' || current == ')' && last == '(' || current == ']' && last == '[')
					mystack.pop();
				else 
					return false;
			}

		}

		return mystack.isEmpty();
	}

}
