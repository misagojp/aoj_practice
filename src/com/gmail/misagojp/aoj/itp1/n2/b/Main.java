package com.gmail.misagojp.aoj.itp1.n2.b;

import java.util.Scanner;

/**
 * Course ITP1 # 1 B
 *
 * Range
 *
 * @author misago_jp
 */
public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		System.out.println(((a < b) && (b < c)) ? "Yes" : "No");
	}
}