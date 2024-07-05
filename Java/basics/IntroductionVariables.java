class IntroductionVariables{
	public static void main (String args[])
	{

		/* local variable
			variables declared with in a function is called local variables
			it can be accessed only with in that function
			it should be initalised before using that
	
		*/

		int num1 = 10;
		long num2;
		byte num3;
		short num6;
		float num4;
		double num5;

		num2 = 20l;
		num3 = 127;
		num4 = 1000F;
		num5 = 2400D;

		System.out.println("num 1 :" + num1 );
		System.out.println("num 2 :" + num2 );
		System.out.println("num 3 :" + num3 );
		System.out.println("num 4 :" + num4 );
		System.out.println("num 5 :" + num5 );


		char c = 'A';

		System.out.println("char :" + c );


		boolean isOK = true;

		System.out.println("boolean isOK :" + isOK );		


	}
}