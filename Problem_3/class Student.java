import java.util.ArrayList;
public class Student {
	private String name;
	private String id;

	//one student attends many courses so i use ArrayList
	private ArrayList<Course> courses = new ArrayList<Course>(); 	
	
	//creating a public method that associates students with courses they attend to
	public void addCourse(Course aCourse) {
		courses.add(aCourse);
		aCourse.addStudent(this); //i am using "this" because i need to indicate the object i am creating in current class (Student)
	}
	
	//student's constructor (we can't create a student without name and id)
	public Student(String aName, String anID) {
		name = aName;
		id = anID;
	}
	
	//2nd constructor for transferred students, they can be created without id
	public Student(String aName) {
		name = aName;
		id = "";
	}
	
	//creating a public method to add transferred's student ID
	public void setID(String anID){
		if(id.equals("")) //checking if the student is transferred
			id = anID;
		else
			System.out.println("Student already has ann ID");
	}
	
	//creating a method that returns student's name
	public String getName() {
		return name;
	}
	
	//creating a method that returns student's ID
	public String getID() {
		return id;
	}
	
	//creating a method to print student's data: name, ID, courses he attends
	public void printData() {
		System.out.println("Student Data: ");
		System.out.println("Name: " + name);
		System.out.println("ID: " + id);
	    System.out.println("Enrolled in: ");
        for(int i=0; i<courses.size(); i++) { //size is a method that returns the number of elements i filled in the array 
            Course c = courses.get(i); 
		    System.out.println(c.getName()); 
	  }
    }
}