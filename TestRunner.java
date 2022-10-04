import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import java.util.Scanner;
import static org.junit.Assert.assertEquals;
class TestRunner{
	
    public static void TestRunner(String[] args) {
    	Result result=JUnitCore.runClasses(TestMessage.class);
    	 for(Failure failure:result.getFailures())
    	 {
    	 System.out.println(failure.toString());
    	 }
    	 System.out.println(result.wasSuccessful());
    	 
    	Scanner s=new Scanner (System.in);
        System.out.println("Welcome to the store");
        System.out.println("1:Purchase an item \n2:Discount List\n3:Exit");
        int choice=s.nextInt();
        switch(choice)
        {
        case 1 :
        System.out.println("Enter the number of items");
        int items=s.nextInt();
        TestMessage s1=new TestMessage();
        int[] arr=new int[items];
       
        if(items<=3)
        {
        	
            System.out.println("items should be more than 3");
            assertEquals("items should be more than 3","items should be more than 3");
        break;
        }
        System.out.println("Please enter the amount of each item");
        for(int i=0;i<items;i++)
        {
            arr[i]=s.nextInt();
        s1.sum+=arr[i];
        }
        int bill=s1.sum;
        if(bill==0)
        {
            System.out.println("Bill cannot be zero");
            break;
        }
        if(bill>0 && bill<=2500)
        {
            System.out.println("Discount not available.\nYour total bill is "+bill);
            break;
        }
        TestMessage s2=new TestMessage();
       
        System.out.println("Total bill :- "+s1.sum+"\nCongrats you will get an discount.\nYour final bill is "+s2.calculation(bill));
        break;
        
        case 2:
            System.out.println("Discount List \nIf total bill is less than 2500 then there is no discount. \nIf total bill is less than 5000 then there is 25% discount.\nIf total bill is less than 10000 then there is 50% discount. ");
            break;
        case 3:
            System.out.println("Successfully exit");
            break;
    default:
    System.out.println("Choice not available");
    assertEquals("Choice not available","Choice not available");
            break;
            
        }
}
    
}
//public class TestRunner {
// public static void main(String[] args)
// {
// Result result=JUnitCore.runClasses(TestMessgae.class);
// for(Failure failure:result.getFailures())
// {
// System.out.println(failure.toString());
// }
// System.out.println(result.wasSuccessful());
// }
//}
