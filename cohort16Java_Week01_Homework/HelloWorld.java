package cohort16Java_Week01_Homework;

public class HelloWorld {

	public static void main(String[] args) {
		// ## 2. Write a java program to store the employee information
		/*
		 * name companyName ----- camelCase jobTitle gender --- char M/F salary ---
		 * double employeeID -- int hasBenefits(Y/N) --- boolean true/false isMarried
		 * --- char Y/N
		 */

		String name = "Ahsan";
		System.out.println(name);

		String CompanyName = "TechCircle";
		System.out.println(CompanyName);

		String JobTitle = "Teaching";
		System.out.println(JobTitle);

		char Gender = 'M';
		System.out.println(Gender);

		double Salary = 100.00;
		System.out.println(Salary);

		int EmployeeID = 12345;
		System.out.println(EmployeeID);

		boolean hasBenefits = true;
		System.out.println(hasBenefits);

		char isMarried = 'Y';
		System.out.println(isMarried);

//		3. Write a Java program to print 'Hello' on screen and then print your
//		name on a separate line

		String input = "Hello";
		System.out.println(input);
		System.out.println("Rabiqa");

		// ## 4. Write a Java program to print the sum of two numbers

		int a = 1;
		int b = 2;
		int result = a + b;
		System.out.println(result);

		// # 5. Write a Java program to divide two numbers and print on the screen

		int A = 4;
		int B = 2;
		int Result = A / B;
		System.out.println(Result);

		// ## 6. Write a Java program to print the sum (addition), multiply,
		// subtract, divide and remainder of two numbers.

		int c = 9;
		int d = 3;
		int result1 = c + d;
		int result2 = c - d;
		int result3 = c * d;
		int result4 = c / d;
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);

		// ## 7. Write a program to swap two number without using a temporary
		// variable.
		// ```
		// input:
		//
		// int x = 10;
		// int y = 20:
		// expected output:
		// x = 20;
		// y = 10;

		int x = 10;
		int y = 20;
		System.out.println("before swapping : \nX= " + x + "\nY=" + y);
		x = x + y; // 10+20=30
		y = x - y; // 30-20=10
		x = x - y; // 30-10=20
		System.out.println("after swapping : \nX = " + x + "\nY =" + y);

		// ## 8 Primitive Types Challenge
		//
		// ### Your challenge is to create four new variables:
		// 1. A byte variable, set it to any valid byte number, it doesn't matter.
		// 2. A short variable, set it to any valid short number.
		// 3. An int variable, set it to any valid integer number.
		// 4. Lastly, create a variable of type long. Make it equal to 50,000 plus 10
		// times the sum of the values of the first 3 variables (your byte, your short
		// and your int values).
		// In other words, use the variable names in your expression to calculate the
		// sum.
		//
		byte byteVariable = 100;
		short shortVariable = 3172;
		int intVariable = 49740704;
		long longVariable = 50000 + 10 * (byteVariable + shortVariable + intVariable);
		System.out.println(longVariable);

	}

}
