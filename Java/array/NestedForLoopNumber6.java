class NestedForLoopNumber6{
	public static void main(String args[]){
		int n =7;String space = "  ";
		for(int i=1;i<n;i++){

			/*for(int k=1;k<(i-k);k++){
				
				System.out.print(k);
			

			}*/


			for(int j=1;j<i;j++){
				
				System.out.print(j + " ");
			
			} 

			System.out.print("\n");
		}
	}
}