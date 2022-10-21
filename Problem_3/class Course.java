import java.util.ArrayList;
public class Course {
	//class attributes
	private String name;
	//many students attend one course so i use ArrayList
	private ArrayList<Student> students = new ArrayList<Student>();
	
	//creating a public method that associates courses with students 
	public void addStudent (Student aStudent) {
		students.add(aStudent);
	}
	
	//creating a public method to print course's name and students attending to it
	public void printInformation(){
		System.out.println("Course name: " + name);
		System.out.println("has students: " );
		for(Student s: students)
			System.out.println(s.getName());
	}
	
	//course's constructor (we can't create a course without name)
	public Course(String aName){
		name = aName;
	}
}