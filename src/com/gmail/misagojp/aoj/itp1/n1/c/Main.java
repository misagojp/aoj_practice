package com.gmail.misagojp.aoj.itp1.n1.c;

import java.util.Scanner;

/**
 * Course ITP1 # 1 C
 *
 * Rectangle
 *
 * @author misago_jp
 */
public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();

		System.out.printf("%d %d\n", a * b, (a + b) * 2);
	}
}