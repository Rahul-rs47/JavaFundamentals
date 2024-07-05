class BreakContinueDemo1{
	public static void main(String args[]){
		int row =10;

		System.out.println("Break Demo");
label:	for(int i=1;i<=row;i++){
			for(int j=1;j<=row;j++){
				if(j==5){
					break label;
				}
				System.out.print(j + " ");
			}

			System.out.println();
			
		}

		
		

	}
}