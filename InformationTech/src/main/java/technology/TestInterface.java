package technology;

public class TestInterface extends MyInterface {

	@Override
	public void get_userId() 
	{
	System.out.println("I need my user id");	
		
	}

	@Override
	public void get_Password() 
	{
	System.out.println("I need my password ");	
		
	}

	@Override
	public void get_Browser() 
	{
	System.out.println("I am browsing google chrome");	
		
	}
	public static void main(String[] args) 
	{
	
		TestInterface obj=new  TestInterface();
		obj.get_Password();
		obj.get_Browser();
		obj.get_userId();
		
		
	}
	

	

	
	
	
	
}
