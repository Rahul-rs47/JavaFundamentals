class TimeApp{
	public static void main(String args[]){
		
		
		Time time1 = new Time();
		Time time2 = new Time();
		Time time3 = new Time();
		
		System.out.println("Enter the Time 1  details ");
		time1.getTime();
		System.out.println("Enter the Time 2  details ");
		time2.getTime();
		
		time3 = time1.addTime(time2);
		
	Time	time4 = time1.diffTime(time2);




		System.out.println("The Entered Time is :");
		time1.displayTime();
		System.out.println("The Entered Time is :");
		time2.displayTime();
		System.out.println("Time Sum:");
		time3.displayTime();
		System.out.println("Time difference:");
		time4.displayTime();



	}
}