package calculator;
import java .io.*;
public class UseCalculator {
	public static void main(String[] args )throws java.io.IOException
	{
		BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("select the calculator :basic-B or scientific -S");
		System.out.flush();
		String option=buffer.readLine();
		if(option.length()==1)
		{
			if(option.equals("B")|| option.equals("b"))
			{
				Calculator c=new Calculator();	
				c.Calc();
			}
			else if(option.equals("S")|| option.equals("s"))
			{
				ScientificCalculator sc=new ScientificCalculator();
				sc.Calc();
			}
			else
			{
				System.out.println(" ***please enter optopn 'B'or 'S'.***");
			}
			
		}
		else
		{
			System.out.println(" ***please enter optopn 'B'or 'S'.***");
		}
	}

}
