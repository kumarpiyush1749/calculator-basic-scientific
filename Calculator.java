package calculator;
import java.io.*;

public class Calculator {
	public void Calc()throws java.io.InvalidObjectException{
		boolean next;
		do
		{
			Integer ifirstnumber=new Integer(0);
			Integer isecondnumber=new Integer(0);
			 BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
			 System.out.println("please enter first number:");
			 System.out.flush();
			 try 
			 {
				 ifirstnumber=Integer.parseInt(buffer.readLine());
			 }
			 catch(NumberFormatException e)
			 {
				 System.out.println("***provide numeric values*** ");
				 System.exit(0);
			 }
			 System.out.println("please enter the operation (add:+,minus:-,product:*,divide:/):");
			 System.out.flush();
			 String option=buffer.readLine();
			 System.out.println(" please enter second no:");
			 System.out.flush();
             try 
             {
            	 isecondnumber=Integer.parseInt(buffer.readLine(),10);
             }
             catch(NumberFormatException e)
			 {
				 System.out.println("***provide numeric values*** ");
				 System.exit(0);
			 }
             if(option.length()==1)
             {
            	 Calculate c=new Calculate(ifirstnumber,option.charAt(0),isecondnumber);
            	 c.doCalculation();
            	 c.getResult();
             }
             else
             {
            	 System.out.println(" ***operation not available.select any options.*** ");
             }
             System.out.println("would you calculate again(y/n)?");
             System.out.flush();
             char response=(char)buffer.read();
             if((response=='y')||(response=='Y'))
             {
            	 next=false;
             }
             else
             {
            	 next=true;
             }
		}
		while(!next);
	}

}
