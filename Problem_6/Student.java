import java.util.*;

public class Student {
    
    protected String name;
    protected String id;
	//adding the courses students are registered
    private ArrayList<Course> courses = new ArrayList<Course>();

    public Student(String aName, String anID) {
        name = aName;
        id = anID;
    }   
    
    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        //accesing courses and credits via public methods in Course class
		for(Course course : courses) {
            System.out.println(course.getName());
            System.out.println(course.getCredits());
        }
    }
    
	//adding the courses in courses ArrayList
    public void addCourse(Course aCourse) {
		courses.add(aCourse);
	}

}

