package com.gmail.misagojp.aoj.itp1.n3.b;

import java.util.Scanner;

/**
 * Course ITP1 # 3 B
 *
 * Print Test Cases
 *
 * @author misago_jp
 */
public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int i = 1;
		while (s.hasNextInt()) {
			int n = s.nextInt();
			if (n == 0) break;
			System.out.printf("Case %d: %d\n", i, n);
			i++;
		}
	}
}