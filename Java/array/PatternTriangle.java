class PatternTriangle{
	public static void main(String args[]){
        int size = 5;
        for(int i=1;i<=size;i++){
            /*i=0
                j=5
                */
           for(int j=1;j<=size - i;j++){
                System.out.print(" ");
            }
        
            for(int k=1;k<=i;k++){
                System.out.print("* ");
            }


            System.out.print("\n");

        }

    }
}
