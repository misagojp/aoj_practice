package com.gmail.misagojp.aoj.itp1.n10.a;

import java.util.Scanner;

/**
 * Course ITP1 # 10 A
 *
 * Distance
 *
 * @author misago_jp
 */
public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double x1 = s.nextDouble();
		double y1 = s.nextDouble();
		double x2 = s.nextDouble();
		double y2 = s.nextDouble();
		System.out.println(Math.hypot(x2 - x1, y2 - y1));
	}
}