package net.ed;

// tutorial - https://technologyconversations.com/2013/12/20/test-driven-development-tdd-example-walkthrough/

public class StringCalculator {

	public static void add(String numbers) {
		
		System.out.println("9. inside add()");
		// TODO Auto-generated method stub
		String[] numbersArray = numbers.split(",");
		System.out.println(numbersArray.length);
		if (numbersArray.length > 2) {
			throw new RuntimeException("Up to 2 numbers separated by comma (,) are allowed");
		} else {
			for (String number : numbersArray) {
				Integer.parseInt(number); // If it is not a number, parseInt will throw an exception
				System.out.println(Integer.parseInt(number));
			}
		}
		
	}



}
