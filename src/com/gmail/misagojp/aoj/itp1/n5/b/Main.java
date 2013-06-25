package com.gmail.misagojp.aoj.itp1.n5.b;

import java.util.Scanner;

/**
 * Course ITP1 # 5 B
 *
 * Print a Frame
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
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					System.out.print((0 < i && i < h - 1) && (0 < j && j < w - 1) ? '.' : '#');
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}