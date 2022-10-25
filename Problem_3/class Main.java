public class Main {

	public static void main(String[] args) {
		
			//setting name and ID for student 1
			Student S1 = new Student("Babis", "1014");
			
			//setting name for student 2
			Student S2 = new Student("Takis"); //transferred student
			//adding the id of the transferred student
			S2.setID("1514");		
			
			//setting the names of the 3 courses
			Course C1 = new Course("Java");
			Course C2 = new Course("Python");
			Course C3 = new Course("Ruby");
			
			//adding students 1 and 2 on course 1
			S1.addCourse(C1);
			S2.addCourse(C1);
			

			//adding student 1 on courses 2 and 3
			S1.addCourse(C2);
			S1.addCourse(C3);
			
			//printing student's 1 name, id and courses he attends
			S1.printData();
				
			//printing course's 1 name and the names of the students attend to it
			C1.printInformation();	
		
	}
}
