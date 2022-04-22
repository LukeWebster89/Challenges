package personal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PrimeNumber {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		long number = scan.nextLong();
		
		List<Long> factors = new ArrayList<>();
		
		for(long i = 1; i < number -1; i++ ) {
			
			if(number % i == 0) {
				factors.add(i);				
			}
		}
		if(factors.size()>1) {
		System.out.println(number + " is not a Prime number." + " \nIt is divisible by " + factors + 
				" \nThe highest possible factor is " + Collections.max(factors));
	}else {
		System.out.println(number + " is a Prime number");
	}
		
	}

}
	
