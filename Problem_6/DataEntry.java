import java.util.ArrayList;
import javax.swing.*; //graphic interface 

public class DataEntry {
	
	//parameters of readData method are students and their courses
	public static void readData(ArrayList<Student> students, ArrayList<Course> courses) {
		
		boolean more = true;
		
		while(more) {
			
			//we open a pop-up window and asking if the user wants to add graduate or postgraduate student
			String type = JOptionPane.showInputDialog("Student Type, 1: Stud, 2: Grad");
			int selection =  Integer.parseInt(type); //we convert a string to integer
			
			String name = JOptionPane.showInputDialog("Name");
			String id = JOptionPane.showInputDialog("ID");
			
			//if the student is postgraduate we open a pop-up asking the name of the supervisor 
			String supervisor = null;
			if(selection == 2) {
				supervisor = JOptionPane.showInputDialog("Supervisor");
			}
			
			//depending on the user's choice (student or postgraduate) I keep in the variable student the data of the student that user inserted
			Student student;
			if(selection == 1)
				student = new Student(name, id);
			else
				student = new GraduateStudent(name, id, supervisor);
			
			//we open a pop-up window asking which course the student wants to enroll in
			String courseName = JOptionPane.showInputDialog("Enter course name");
			for(Course course: courses) {
				//to add the actual course and not only its' name i need to access it through getname()
				//if i don't use getname() i only have the course's reference
				ara mesw tou getname pairnw to onoma tou mathimatos (string) kai to sigkrinw me to coursename (string)
				if(course.getName().equals(courseName))
					//adding course on student
					student.addCourse(course);
			}
			
			//adding student inserted by the user in students ArrayList
			students.add(student);
			
			//we open a pop-up window to check if the user wants to add more students
			String answer = JOptionPane.showInputDialog("More Students? (Y/N)");
			
			if(answer.equals("N") || answer.equals("n") )
				more = false;
			
		}
		
	}

	
}