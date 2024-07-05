class Test1{

	public static void main(String args[]){
	int i =getInches();
	System.out.println(i);


	}
	public static int getInches(){
		boolean isValid = false;
		int inches;
		do{	
			inches =Helper.getI();
			if(inches >= 0 && inches < 12 ){
				isValid = true;
			}else {
				System.out.println("please enter the correct value (0-12) ");
				
			}
		}while(!isValid);

		return inches;
	}


}