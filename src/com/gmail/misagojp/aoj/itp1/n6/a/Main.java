package com.gmail.misagojp.aoj.itp1.n6.a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Course ITP1 # 6 A
 *
 * Reversing Numbers
 *
 * @author misago_jp
 */
public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		ArrayList<Integer> l = new ArrayList<Integer>();
		for (int i = 0; i < n; ++i) {
			l.add(s.nextInt());
		}
		Collections.reverse(l);
		for (int i = 0; i < n; ++i) {
			if (i != 0) System.out.print(' ');
			System.out.print(l.get(i));
		}
		System.out.println();
	}
}