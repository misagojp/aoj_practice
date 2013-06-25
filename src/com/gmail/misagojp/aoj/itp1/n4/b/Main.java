package com.gmail.misagojp.aoj.itp1.n4.b;

import java.util.Scanner;

/**
 * Course ITP1 # 4 B
 *
 * Circle
 *
 * @author misago_jp
 */
public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double r = s.nextDouble();
		System.out.printf("%f %f\n", Math.PI * Math.pow(r, 2), 2 * Math.PI * r);
	}
}