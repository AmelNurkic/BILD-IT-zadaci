package zadaci_06_02_2016;

public class TimeTest {

	public static void main(String[] args) {
		Time time1 = new Time();
	    Time time2 = new Time(555550000L);
	    
	    //time2.setTime(555550000L);
	    
	System.out.println("First Time: "+time1.getHour()+":"+time1.getMinute()+":"+time1.getSecond());
	System.out.println("Second Time: "+time2.getHour()+":"+time2.getMinute()+":"+time2.getSecond());

	}

}
