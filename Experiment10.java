import java.util.Scanner;
import java.io.*;
public class Experiment10 {
	private int numerator;
	private int denominator;

	public Experiment10(int n, int d) {
		numerator = n;
		denominator = d;
		if (denominator == 0) {
			throw new RuntimeException("Denominator is zero");
		}
	}

	public void findExperiment10() {
		int g = gcd(numerator, denominator);
		if (g == 1) {
			System.out.println("No Common Divisor for Numerator and Denominator");
		} else {
			numerator = numerator / g;
			denominator = denominator / g;
		}
	}

	private int gcd(int m, int n) {
		int d;
		while (m % n != 0) {
			d = m % n;
			m = n;
			n = d;
		}
		return n;
	}

	public String toString() {
		return numerator + "/" + denominator;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Numerator : ");
		int numerator = scanner.nextInt();
		System.out.print("Enter Denominator : ");
		int denominator = scanner.nextInt();
		Experiment10 Experiment10 = new Experiment10(numerator, denominator);
		Experiment10.findExperiment10();
		System.out.println("The Rational number :" + Experiment10.toString());
	}
}
