class TablePrint{
	
static String[][] details ={    {"1","Java","rahul"},
                                {"2","html","raj"},
                                {"3","css","rony"}
                            } ;


    public static void main(String args[]){
        
         System.out.println(createLine(55));
         System.out.println("| " + alignContent("Book id",8) + alignContent("Book Name",20) + alignContent("Browwer Name",20));
        System.out.println(createLine(55));
    
            for(int i=0;i<details.length;i++){

                //System.out.println(" | " + alignContent((details[i][0], 10) + (details[i][1], 25) +  (details[i][0], 25) );

                System.out.println("| " + alignContent(details[i][0],8) + alignContent(details[i][1],20) + alignContent(details[i][2],20));
               // System.out.print("\n");
                System.out.println(createLine(55));
                 
            }
            //lineInput(57);




           

    }
    public static String alignContent(String content, int tableWidth){
        
        int noBlankSpace = tableWidth - content.length();
        String blankString = " ";
        String alignedString = "";

        for(int i=1; i<= noBlankSpace; i++){
            blankString = blankString + " ";
        }
        alignedString  = content + blankString + "|";

        return alignedString;
    }


    public static String createLine(int size){
        String line ="";
        for(int i=1;i<=size;i++){
            line = line + "_" ;  
           
        }
        return line;


    }


}
