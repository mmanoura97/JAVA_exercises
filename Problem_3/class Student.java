public class Student {
	private String name;
	private String id;
	
	
	//o constructor mou exei orismata pragma pou simainei oti DEN mporei na dimiourgithei antikeimeno foititis xwris na exei KAI onoma (aName) KAI ID (anID)
	public Student(String aName, String anID) {
		//aName = parametros, name = idiotita klasis
		name = aName;
		ID = anID;
	
	}
	
	//ftiaxnw deutero constructor gia na mporw na ftiaxnw antikeimena gia tous metegrafentes foitites
	//oi metegrafentes exoun onoma alla oxi ID
	//oloi oi constructors exoun to onoma tis klasis alla prepei na exoun diaforetikes parametrous/diaforetiko arithmo parametrwn
	public Student(String aName) {
		name = aName;
		id = "9999";
	}
	
	//ftiaxnw mia methodo gia na ekxwrw timi sto ID twn metegrafantwn otan einai diathesimo
	//epomenws to zitoumeno ID to vazw stin parametro anID
	public void setID(String anID){
		id = anID;
	}
	
	
	//ftiaxnw methodo i opoia epistrefei to onoma tou foititi
	public String getName() {
		return name;
	}
	
	
	//ftiaxnw methodo i opoia epistrefei to ID tou foititi
	public String getID() {
		return id;
	}
	
	//tropos 2 gia na tipwsw stoixeia
	//i an exw polla pragmata na tipwsw  ftiaxnw mia methodo printInfo
	//public void printInfo() {
	//	System.out.println("Student Data: ");
	//	System.out.println("Name: " + name);
	//	System.out.println("ID: " id);
	//}
	
	
	//ftiaxnw trito kataskeuasti pou den pairnei parametrous
	//public Student() {
	//	name = "No name given";
	//	ID = "9999";
	//}
}
