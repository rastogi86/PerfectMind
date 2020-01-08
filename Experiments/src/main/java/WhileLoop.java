import org.testng.ITestContext;
import org.testng.annotations.Test;

public class WhileLoop 
	{
	ITestContext it;
	
	@Test
	public void MyMethod()
		{
			int i=1;
			int j=11 ;
			while(i<=10)
				{
					System.out.println(i);
					i++;
				}
				
			do
				{
					System.out.println(j);
					j++;
				}while(j<=10);
		}
	}	
