class MultipleCatchDemo{


	public static void main(String args[]){

		int values[]; // declaration
		values = new int[10]; // creation

		values[0] = 10; values[1] = 20; values[2] = 30; values[3] = 40;
		values[4] = 50; values[5] = 60; values[6] = 70; values[7] = 80;
		values[8] = 90; values[9] = 100; // initialization

		double sum = 0;
		try{

			for(int i=1; i<=values.length; i++){

				//sum += values[i]/(values[i]-20);
				System.out.println(values[i]);
			}

		}

		catch(ArithmeticException e){
			System.out.println("catch 1 " + e.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("catch 2 " + e.getMessage());
		}
		catch(Exception e){
			System.out.println("catch 3 " + e.getMessage());
		}
		
		/*
		catch(){

		}
		catch(){

		}*/



	}
	
}