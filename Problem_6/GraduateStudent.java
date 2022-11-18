public class GraduateStudent extends Student {
    
	//adding the extra attribute in the subclass
    private String supervisor;
    
    public GraduateStudent(String aName, String anID, String aSupervisor) {
        super(aName, anID);
		supervisor = aSupervisor;
    }   
	
    public void printInfo() {
		super.printInfo();
		System.out.println("Supervisor: " + supervisor);
		System.out.println("Student Name: " + name);
		System.out.println("Student ID: " + id);
    }
}
	