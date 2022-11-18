import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
	    
	    Student S1 = new Student("Babis", "11214");
	    
	    Course C1 = new Course("Java", 5);
		Course C2 = new Course("Math", 5);
		
		//adding courses on an ArrayList
		ArrayList<Course> courses = new ArrayList<Course>();
		courses.add(C1);
		courses.add(C2);
		
	    S1.addCourse(C1);
	    S1.addCourse(C2);
	    
	    S1.printInfo();
		
		GraduateStudent GS1 = new GraduateStudent("Takis", "11010", "Papadopoulos");
		GS1.addCourse(C1);
		GS1.addCourse(C2);
		
		GS1.printInfo();
		
		//adding students on an ArrayList
		ArrayList<Student> students = new ArrayList<Student>();
		
			
		DataEntry.readData(students, courses);
		//printing the students and their courses inserted by the user
		for(Student student: students) {
			student.printInfo();
		}
		
	}
}
