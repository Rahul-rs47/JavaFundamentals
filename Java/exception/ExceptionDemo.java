class ExceptionDemo{

	public static  void main(String args[]){
		int i1 = 0,i2 = 0,i3;

		try{

			i1 = 10;
			i2 = 20;

			i3 = i2/(i1-10);

			System.out.println("I am after calculation");
		}
		catch(Exception e){

			System.out.println("Some error occurs " + e.getMessage());

			i3 = i2/(i1-5);

		}
		finally{
			System.out.println("I am with in finally");
		}

		System.out.println(" i1 : " + i1);
		System.out.println(" i2 : " + i2);
		System.out.println(" i3 : " + i3);


	}
	
}