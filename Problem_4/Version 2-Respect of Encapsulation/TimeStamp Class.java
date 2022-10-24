public class TimeStamp{
	//respect of encapsulation
	//private attributes
	private int hour;
	private int minute;
	private int second;
	
	
	//constructor
	public TimeStamp(int h, int m, int s) {
		hour = h;
		minute = m;
		second = s;	
	}
	
	//method to enable users to increase the time according to the time zone
	public void increaseHour() {
	hour++; //even if the properties are private, the objects of the class itself have access to the properties
	if(hour == 24) //limitation to ensure that the time after 23 is set to 0
		hour = 0;
	}
	
	//method for printing meeting time
	public void printTime(){
	System.out.println(hour + ":" + minute + ":" + second);
	}
	

}


