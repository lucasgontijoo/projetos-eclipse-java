package entities;

public class Student {
	public String name;
	public double trimesterOne;
	public double trimesterTwo;
	public double trimesterThree;

	public double totalPointsYear() {
		return trimesterOne + trimesterTwo + trimesterThree;
	}

	public boolean isApproved(double totalPointsYear) {
		if (totalPointsYear >= 60) {
			return true;
		}

		return false;
	}

	public double pointsToApproved(double totalPointsYear) {
		return 60.0 - totalPointsYear;
	}
}
