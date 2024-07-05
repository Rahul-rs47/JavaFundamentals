class NestedForLoopNumber5{
	public static void main(String args[]){
		int n = 5;String space ="  ";
		for(int j=0;j<n;j++){

			for(int k=0;k<j;k++){
				System.out.print(space);	
			}
			

			for(int i=n;i>j;i--){

				System.out.print(i-j +" ");

				}


						

			
			System.out.print("\n");

		}

	}
}