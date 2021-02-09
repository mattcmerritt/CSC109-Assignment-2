
public class Student {
	
	// This class will represent a student in a classroom with an unweighted grading system

	private String name;
	private String email;
	private int year;
	private int pointsEarned;
	private int totalPoints;
	
	public Student(String name, String email, int year) {
		this.name = name;
		this.email = email;
		this.year = year;
		
		pointsEarned = 0;
		totalPoints = 0;
	}
	
	// adding grades into data
	public void addGrade(int receivedPoints, int possiblePoints) {
		pointsEarned += receivedPoints;
		totalPoints += possiblePoints;
	}
	
	// getting grade as number
	public double getCurrentAverage() {
		if (totalPoints == 0) 
			return 0;
		else 
			return (pointsEarned / (double) totalPoints) * 100;
	}
	
	// toString to return name, email, and currentAverage
	public String toString() {
		return name + " (Email: " + email + "), Year " + year + ", Average: " + getCurrentAverage();
	}
	
	// simple mutator methods
	public void setName(String name) {
		this.name = name;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	// simple accessor methods
	public String getName() {
		return name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public int getYear() {
		return year;
	}
	
	public int getPointsEarned() {
		return pointsEarned;
	}
	
	public int getTotalPoints() {
		return totalPoints;
	}
	
}
