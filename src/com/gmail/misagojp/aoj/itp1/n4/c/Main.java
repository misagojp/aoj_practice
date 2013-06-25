package com.gmail.misagojp.aoj.itp1.n4.c;

import java.util.Scanner;

/**
 * Course ITP1 # 4 C
 *
 * Simple Calculator
 *
 * @author misago_jp
 */
public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while (s.hasNext()) {
			int a = Integer.parseInt(s.next());
			char op = s.next().charAt(0);
			int b = Integer.parseInt(s.next());
			switch (op) {
				case '+':
					a += b;
					break;
				case '-':
					a -= b;
					break;
				case '*':
					a *= b;
					break;
				case '/':
					a /= b;
					break;
				case '?':
					return;
			}
			System.out.println(a);
		}
	}
}