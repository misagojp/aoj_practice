package com.gmail.misagojp.aoj.itp1.n5.a;

import java.util.Scanner;

/**
 * Course ITP1 # 5 A
 *
 * Print a Rectangle
 *
 * @author misago_jp
 */
public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while (s.hasNextInt()) {
			int h = s.nextInt();
			int w = s.nextInt();
			if (h == 0 && w == 0) return;
			for (int i = 0; i < h; ++i) {
				for (int j = 0; j < w; ++j) {
					System.out.print('#');
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}