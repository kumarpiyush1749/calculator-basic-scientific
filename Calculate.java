package calculator;
interface iCalc
{
	public void doCalculation();
	public void getResult();
}

 class Calculate  implements iCalc{
	private char Operator;
	private int ifnum, isnum;
	private Double db1number=new Double(0);
	private Double db1result=new Double(0);
	private int iresult=0;
	private boolean typeDouble=false;
	private boolean typeInt =false;
	
    public Calculate()
    {}
    public Calculate (Double db1num, char cOperator)
    {
    	db1number=db1num;
    	Operator=cOperator;
    	typeDouble=true;
    }
    public Calculate(int ifirstnum,char cOperator,int isecondnum)
    {
    	ifnum=ifirstnum;
    	isnum=isecondnum;
    	Operator=cOperator;
    	typeInt=true;
    }
    public void doCalculation()
    {
    	iresult=0;
    	db1result=0.0;
    	switch(Operator)
    	{
    	  case '+':
    		  checkInt();
    		  iresult=ifnum+isnum;
    		  break;
    	  case '-':
    		  checkInt();
    		  iresult=ifnum-isnum;
    		  break;
    	  case '*':
    		  checkInt();
    		  iresult=ifnum*isnum;
    		  break;
    	  case '/':
    		  checkInt();
    		  if(!checksecondnum())
    		  {
    			  iresult=ifnum/isnum;
    			  break;
    		  }
    	  case 'S':
    	  case 's':
    		  checkDouble();
    		  db1result=Math.sin(db1number);
    		  break;
    	  case 'C':
    	  case 'c':
    		  checkDouble();
    		  db1result=Math.cos(db1number);
    		  break;
    	  case 'T':
    	  case 't':
    		  checkDouble();
    		  db1result=Math.tan(db1number);
    		  break;
    	  case 'L':
    	  case 'l':
    		  checkDouble();
    		  db1result=Math.sin(db1number);
    		  break;
    	default:
    		iresult=0;
    		db1result=0.0;
    		System.out.println(" ***operation not available.select any options.***");
    		break;
    		  
    	}
    }
	public void getResult()
	{
		if(typeInt)
		{
	        System.out.println("result is:"+iresult);
		}
		else if(typeDouble)
		{
			System.out.println("result is :"+db1result);
		}
	}
	public boolean checksecondnum()
	{
		if(isnum==0)
		{
			System.out.println("zero not allowed");
			System.exit(0);
			return true;
		}
		else
		{
			return false;
		}
	}
	public void checkInt()
	{
		if(!typeInt)
		{
			iresult=0;
			System.out.println(" ***operation not available.select any options.*** ");
			System.exit(0);
		}
	}
	public void checkDouble()
	{
		if(!typeDouble)
		{
			db1result=0.0;
			System.out.println(" ***operation not available.select any options.*** ");
			System.exit(0);
		}
		
	}   

 }
