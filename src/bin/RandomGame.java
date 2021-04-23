package bin;

import java.util.Scanner;

import bin.method.RandInt;

public class RandomGame {
	
	public static void main(String[] args) {
		
		int min = 1;
		int max = 99;
		int tries = 6;
		
		int current = 0;
		int ans = bin.method.RandInt.randInt(min, max);
		
		while (current != ans) {
			
			boolean isError = false;
			
			if (tries > 1) {System.out.println("Enter a number from " + min + " to " + max + "\n" + tries + " tries remaining");}
			else {System.out.println("Enter a number from " + min + " to " + max + "\n" + tries + " try remaining");}
			
			Scanner input = new Scanner(System.in);
			try {current = input.nextInt();}
			
			catch (Exception e) {
				System.out.println("Invalid integer");
				isError = true;
			}
			
			if ((current < min || current > max) && isError == false) {
				
				System.out.println("Guess is outside the range");
				isError = true;
			}
			
			if (current > ans && tries > 0 && isError == false) {
				
				System.out.println("Too high");
				tries--;
				
			} if (current < ans && tries > 0 && isError == false) {
				
				System.out.println("Too low");
				tries--;
				
			} if (tries == 0 && current != ans && isError == false) {
				
				System.out.println("you lost lmao the number was " + ans);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					
				}
				System.out.println("terminated");
				System.exit(0);
			}
			
			if (isError == true) {input.reset();}
		}
		
		System.out.println("Number is a match");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
		}
		System.out.println("terminated");
		System.exit(0);
	}
}
