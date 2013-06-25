package com.gmail.misagojp.aoj.itp1.n4.a;

import java.util.Scanner;

/**
 * Course ITP1 # 4 A
 *
 * A/B Problem
 *
 * @author misago_jp
 */
public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();

		System.out.printf("%d %d %f", a / b, a % b, (double) a / b);
	}
}