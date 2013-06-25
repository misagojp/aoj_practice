package com.gmail.misagojp.aoj.itp1.n8.b;

import java.util.Scanner;

/**
 * Course ITP1 # 8 B
 *
 * Sum of Numbers
 *
 * @author misago_jp
 */
public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while (s.hasNext()) {
			char[] chars = s.next().toCharArray();
			if (chars[0] == '0') return;
			int sum = 0;
			for (char ch : chars) {
				sum += Character.getNumericValue(ch);
			}
			System.out.println(sum);
		}
	}
}