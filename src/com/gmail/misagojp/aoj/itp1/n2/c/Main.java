package com.gmail.misagojp.aoj.itp1.n2.c;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Course ITP # 2 C
 *
 * Sorting Three Numbers
 *
 * @author misago_jp
 */
public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ArrayList<Integer> n = new ArrayList<Integer>();
		for (int i = 0; i < 3; ++i) {
			n.add(s.nextInt());
		}
		Collections.sort(n);
		System.out.printf("%d %d %d\n", n.get(0), n.get(1), n.get(2));
	}
}