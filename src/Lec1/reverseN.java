package Lec1;

import java.util.Scanner;

public class reverseN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int ans = 0;
		while (n > 0) {

			int rem = n % 10;
			ans = ans * 10 + rem;

			n = n / 10;
		}

		System.out.println(ans);
	}

}
