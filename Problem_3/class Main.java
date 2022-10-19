public class Main {

	public static void main(String[] args) {
		
		public Student() {
			//kalw tin klasi student, pragma pou mporei na ginei kai xwris constructor
			//an den ipirxe constructor tha ftiaxnotan o default constructor pou den kanei tipota mono arxikopoiei oti mporei na arxikopoiithei
			//edw exw kataskeuasti mesa stin klasi Student - ara afou exw constructor stamataei na uparxei o default constructor
			//S1, S2 einai anafores(references) tou antikeimenou Student, praktika 2 metavlites deixnoun to antikeimeno student
			Student S1 = new Student("Babis", "1014");
			
			Student S2 = new Student("Takis"); //metegrafentas
			//meta apo ligo kairo omos o metagrafentas exei ID
			//den mporo na to allaksw etsi: S1.id = "1514" giati to attribute einai private
			//opote gia auto stin klasi Student ftiaxnw mia public methodo pou ekxwrei timi sto ID kai tha exw:
			S2.setID("1514");		
			
			//i anafora S3 einai null, den deixnei pouthena, se kanena antikeimen
			//Student S3;
			//dio diaforetikes anafores pou deixnoun to idio antikeimeno
			//H S3 twra den einai null deixnei sto antikeimeno Student
			//S3 = S1;
			
			//tipwnw ta stoixeia tou foititi
			System.out.println("Student Data: ");
			System.out.println("Name: " + S1.getname());
			System.out.println("ID: " + S1.getID());
			
			//tropos 2 gia na tipwsw stoixeia-exw ftiaksei ti methodo printInfo stin klasi Student
			//S1.printInfo();
			
			//ftiaxnw tin anafora C1 gia to Course
			Course C1 = new Course("Java");
			
		}
		
	}


}