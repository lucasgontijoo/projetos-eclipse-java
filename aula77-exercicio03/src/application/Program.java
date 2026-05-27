package application;

import java.util.Scanner;
import java.util.Locale;
import entities.Student;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Student std = new Student();
		std.name = sc.nextLine();
		std.trimesterOne = sc.nextDouble();
		std.trimesterTwo = sc.nextDouble();
		std.trimesterThree = sc.nextDouble();

		double totalPointsYear = std.totalPointsYear();

		System.out.printf("FINAL GRADE = %.2f %n", totalPointsYear);
		if (std.isApproved(totalPointsYear)) {
			System.out.println("PASS");
		} else {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS", std.pointsToApproved(totalPointsYear));
		}

		sc.close();
	}
}
