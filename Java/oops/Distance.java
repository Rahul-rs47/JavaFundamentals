class Distance{
	int feet;
	int inches;
	
	


	public void getDistance(){
		System.out.println("Enter the feet: ");
		feet =Helper.getI();
		System.out.println("Enter the inches: ");
		inches =getInches();

	}
	public static int getInches(){
		boolean isValid = false;
		int inches;
		do{	
			inches =Helper.getI();
			if(inches >= 0 && inches < 12 ){
				isValid = true;
			}else {
				System.out.println("Inches should be between (0-12) ");
				
			}
		}while(!isValid);

		return inches;
	}


	public void displayDistance(){
		System.out.println("Feet : " + feet );
		System.out.println("Inches : " + inches );


	}

	public Distance addDistance(Distance d2){

		Distance d3 = new Distance();


		d3.feet = this.feet + d2.feet;
		d3.inches = this.inches + d2.inches;

		if(d3.inches >= 12){
			d3.feet += 1;
			d3.inches -= 12;
		}
		return d3;
	}

	public Distance diffDistance(Distance d2){
		Distance d4 = new Distance();

		int inches1,inches2,inches3;
		inches1 = (this.feet * 12)+ this.inches;
		inches2 = (d2.feet *12) + d2.inches;
		inches3 = Math.abs(inches1 -inches2);
		d4.feet =inches3 / 12 ;
		d4.inches = inches3 % 12;

		
		return d4;



	}



}