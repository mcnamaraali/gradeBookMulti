public class GradeBookTest {

	public static void main(String[] args) {
		int[][] gradesArray = {{70, 68, 69}, 
							   {44, 40, 39},
							   {64, 65, 66},
							   {70, 31, 46},
							   {27, 70, 44},
							   {35, 21, 42},
							   {55, 31, 55},
							   {60, 41, 66},
							   {40, 41, 68}};
							   
		
		GradeBook gradeBook = new GradeBook("Welcome to learn computers with Ali, Java Programming", 
				gradesArray);
		System.out.printf("Welcome to the grade book for %n%s%n%n",gradeBook.getCourseName());

		gradeBook.processGrades();
	}

}
