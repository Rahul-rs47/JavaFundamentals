class Time{
	int hours;
	int minutes;
	int seconds;

	public void getTime(){
		System.out.println("Enter the time in hours");
		hours = Helper.getI();
		System.out.println("Enter the time in minutes");
		minutes = Helper.getI();
		System.out.println("Enter the time in seconds");
		seconds = Helper.getI();

	}

	public void displayTime(){
		/*System.out.println("Hours :" + hours);
		System.out.println("Minutes: " +minutes);
		System.out.println("Seconds :" + seconds);*/
		System.out.println(hours + " Hours "+ minutes + " Minutes " + seconds +  " Seconds ");

	}

	public Time addTime(Time t2){

		Time time3 = new Time();

		time3.hours = this.hours + t2.hours;
		time3.minutes = this.minutes + t2.minutes;
		time3.seconds = this.seconds + t2.seconds;

		if (time3.seconds > 59 ){
			time3.minutes ++;
			time3.seconds -= 60;
		}
		if (time3.minutes > 59 ){
			time3.hours ++;
			time3.minutes -= 60;
		}



		return time3;

	}


	public Time diffTime(Time t2){

		Time time4 = new Time();
		
		int seconds1 = (this.hours * 60 * 60) + (this.minutes*60) + this.seconds ;
		int seconds2 = (t2.hours * 60 * 60) + (t2.minutes * 60) + t2.seconds;
		int secondsDiffernece =Math.abs(seconds1 -seconds2);
		time4.hours  =(secondsDiffernece / 3600);
		// int minutes1 = 
		time4.minutes = (secondsDiffernece % 3600)/60;
		time4.seconds = (secondsDiffernece % 3600)%60;

		return time4;	
	}
}