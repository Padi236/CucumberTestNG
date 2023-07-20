package stepDefinition;

import java.util.Scanner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefMath {

	@Given("I am trying to do addition of two numbers")
	public void i_am_trying_to_do_addition_of_two_numbers() {
	    System.out.println("Addition Operation Execution");
	}

	@When("I check for the addition of {int} and {int} is equal to {int}")
	public void i_check_for_the_addition_of_and_is_equal_to(Integer int1, Integer int2, Integer int3) {
	   
		System.out.println("Enter two numbers:");
		Scanner sc = new Scanner(System.in);
		int value1 = sc.nextInt();
		int value2 = sc.nextInt();
		int result = value1 + value2;
		System.out.println(result);
	}

	
	
	
}
