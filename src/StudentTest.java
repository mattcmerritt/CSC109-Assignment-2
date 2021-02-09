
public class StudentTest {
	
	// This class is intended to check if everything is working with Student.java

	public static void main(String[] args) {
		Student matt = new Student("Matthew", "matt@example.com", 1);
		
		System.out.println("Starting average: " + matt.getCurrentAverage());
		
		matt.addGrade(100, 100);
		System.out.println(matt);
		
		System.out.println("Name: " + matt.getName());
		System.out.println("Email: " + matt.getEmail());
		System.out.println("Year: " + matt.getYear());
		System.out.println("Points Earned: " + matt.getPointsEarned());
		System.out.println("Total Points: " + matt.getTotalPoints());
		
		matt.addGrade(92, 100);
		matt.addGrade(48, 50);
		
		System.out.println("Final average: " + matt.getCurrentAverage());
	}

}
