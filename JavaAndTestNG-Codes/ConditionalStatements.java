import java.util.Scanner;

import org.testng.Assert;
import org.testng.annotations.Test;


public class ConditionalStatements {

	@Test
	public void testFunctionalityName(){
		boolean isPassed = false;
		boolean expected = true;
	//public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the First Number");
		int firstNumber= scanner.nextInt();
		System.out.println("Enter the Second Number");
		int secondNumber = scanner.nextInt();
		System.out.println("Enter the Third Number");
		int thirdNumber = scanner.nextInt();
		
		if(firstNumber>secondNumber && firstNumber>thirdNumber){
			isPassed = true;
			System.out.println("First Number is Greater");
		}
		else
		if(secondNumber>firstNumber && secondNumber>thirdNumber){	
			System.out.println("Second Number is Greater");
		}
		else
		{
			System.out.println("Third Number is Greater");
		}
		
		Assert.assertEquals(isPassed, expected);
		
		/*if(firstNumber>secondNumber){
			if(firstNumber>thirdNumber){
				System.out.println("First Number is Greater");
			}
			else
			{
				
			}
		}*/
		
		
		/*if(firstNumber>secondNumber){
			System.out.println("First Number is Greater");
		}
		else
		if(firstNumber==secondNumber){
			System.out.println("Both Numbers are Same");
		}
		else
		{
			System.out.println("Second Number is Greater");
		}*/
		scanner.close();

	}

}
