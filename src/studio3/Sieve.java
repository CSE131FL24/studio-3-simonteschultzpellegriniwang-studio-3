package studio3;

import java.util.Arrays;
import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("This is the Sieve of Eratosthenes. It will sort out prime number from composite ones.");
		System.out.println("Up to what integer do you wish to use the sieve on? (Input integer, inclusive): ");
		
		int num = in.nextInt();
		
		int[] allnum = new int[num + 1];
		int[] compnum = new int[num + 1];
			
		for (int i = 2; i <= num; i++) {
			allnum[i-2] = i;
		}
		
		for (int i = 0; i <= num; i++) {
			if (allnum[i] != 0) {
				for (int j = 2; j * allnum[i] <= num; j++) {
					allnum[j * allnum[i] - 2] = 0;				
				}
			}
		}
		
		System.out.println(Arrays.toString(allnum));
			
	}

}
