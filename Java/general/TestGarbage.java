public class TestGarbage{ 

     public void finalize(){
        System.out.println("object is garbage collected");
    }  

     public static void main(String args[]){  
          TestGarbage s1=new TestGarbage();  
          TestGarbage s2=new TestGarbage();

          java.util.Scanner scanner; // fully qualified name


          //s1 = null;  
          //s2 = null;  

          s2 = s1;
          
          System.gc();  
     }  

}  

/*

class System{
    
    static OutputStream out;
}

claas OutputStream{
    public static void println(String msg){
    
    }
}




*/