class Test{
	public static void main(String args[]){

		int rows = 9;

	

			for (int i = 1; i <= rows; i++) {

                for (int j = 1; j <= i; j++) {
                    System.out.print(j + " ");
                }
                for (int j = 1; j <= (rows - i)*2 ; j++) {
                    System.out.print("  ");
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print(j + " ");
                }
              
            System.out.print("\n");

            }
        
    


		//	}

			

		}

	}
