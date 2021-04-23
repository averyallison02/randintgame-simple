package bin.method;

import java.util.Random;

public class RandInt {
	
	public static int randInt(int min, int max) {
		
		int[] numbers = new int[(max - min) + 1];
		
		int spotInArray = 0;
		
		while (min <= max) {
			
			numbers[spotInArray] = min;
			
			min++;
			spotInArray++;
		} 
		
		int generated = new Random().nextInt(numbers.length);
		return numbers[generated];
	}
}		

