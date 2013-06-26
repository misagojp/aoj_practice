package com.gmail.misagojp.aoj.itp1.n8.c;

import java.util.Scanner;

/**
 * Course ITP1 # 8 C
 *
 * Counting Characters
 *
 * @author misago_jp
 */
public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] c = new int['z' - 'a' + 1];
		while (s.hasNext()) {
			char[] chars = s.next().toLowerCase().toCharArray();
			for (char ch : chars) {
				if (Character.isLetter(ch)) {
					c[ch - 'a']++;
				}
			}
		}
		for (int i = 0; i < c.length; ++i) {
			System.out.printf("%c : %d\n", (char) ('a' + i), c[i]);
		}
	}
}