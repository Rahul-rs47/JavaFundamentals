class BreakContinueDemo{
	public static void main(String args[]){
		int row =10;

		System.out.println("Break Demo");
		for(int i=1;i<=row;i++){
			if(i==5){
				break;
			}
			System.out.print(i + " ");
			
		}

		System.out.println("\nContinue Demo");

		for(int i=1;i<=row;i++){
			if(i==5 || i==7){
				continue;
			}
			System.out.print(i + " ");
			/*if(i==5){
				continue;
			}*/
		}


	}
}