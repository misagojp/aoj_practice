package com.gmail.misagojp.aoj.itp1.n5.c;

import java.util.Scanner;

/**
 * Course ITP1 # 5 C
 *
 * Chessboard
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
					System.out.print(((i + j) % 2 == 0) ? '#' : '.');
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}