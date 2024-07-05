import java.util.Scanner;

class Helper{
	public static int getI(){
		Scanner sc =new Scanner(System.in);
		int value = 0;
		boolean isOK = true;

		do{
			try{
				value =sc.nextInt();
				isOK = false;
			}catch(Exception e){
				System.out.println("Wrong input, please eneter a valid integer");
				System.out.println(e.getMessage());
				sc.nextLine();
			}


		}while(isOK);

		return value;
	}

	public static String getS(){
		Scanner sc =new Scanner(System.in);
		String value =sc.nextLine();
		
		return value;
	}
	public static float getF(){
		Scanner sc =new Scanner(System.in);
		float value =sc.nextFloat();

		return value;
	}

	

}