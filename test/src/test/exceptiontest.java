package test;

import java.awt.Transparency;

public class exceptiontest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int i=10/0;
		//System.out.println(Hi);
		//Thread.sleep(1000);
try
{
	new exceptiontest().a(); 
} 
catch (Exception e)
{
	e.printStackTrace();
}
}
	
	void a() throws Exception
	{
		b();
	}
	void b() throws Exception
	{
		c();
			
	}
	
	void c() throws Exception
	{
		int i=10/0;
	}
	
}
	
	


