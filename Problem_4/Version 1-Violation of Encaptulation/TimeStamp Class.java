public class TimeStamp{
	//violation of encapsulation
	//public attributes
	public int hour;
	public int minute;
	public int second;
	
	
	//constructor
	public TimeStamp(int h, int m, int s) {
		hour = h;
		minute = m;
		second = s;	
	}
	
	//method for printing meeting time
	public void printTime(){
	System.out.println(hour + ":" + minute + ":" + second);
	}
}

